package Tree;

public class subTree {
    public static void main(String[] args) {
        Node root = new Node (1) ;
        root. left = new Node (2);
        root. right = new Node (3) ;
        root. left. left = new Node (4);
        root. left.right = new Node (5);
        root. right.left = new Node (6) ;
        root. right. right = new Node (7);


        // Sub Root
        Node subRoot = new Node(2);
        subRoot.left = new Node(4);
        subRoot.right = new Node(5);
        boolean ans = BinaryTree.isSubtree(root, subRoot);
        System.out.println(ans);

    }
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree{
        static int idx = -1;
        public static Node buildTree(int nodes[]){
            idx++;
            if(nodes[idx] == -1){
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }
        // Check Subtree
        public static boolean isSubtree(Node root, Node subRoot){
            if(root == null){
                return false;
            }
            if(root.data == subRoot.data){
                if(isIdentical(root, subRoot)){
                    return true;
                }
            }

            boolean left = isSubtree(root.left, subRoot);
            boolean right = isSubtree(root.right, subRoot);

            return left || right;
        }

        public static boolean isIdentical(Node node, Node subRoot) {
            if(node == null && subRoot == null){
                return true;
            }
            else if(node == null || subRoot == null || node.data != subRoot.data){
                return false;
            }

            if(!isIdentical(node.left, subRoot.left)){
                return false;
            }
            if (!isIdentical(node.right, subRoot.right)) {
                return false;
            }

            return true;
        }
    }
}
