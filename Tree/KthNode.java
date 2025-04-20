package Tree;

public class KthNode {
    public static void main(String[] args) {
        Node root = new Node (1) ;
        root. left = new Node (2);
        root. right = new Node (3) ;
        root. left. left = new Node (4);
        root. left.right = new Node (5);
        root. right.left = new Node (6) ;
        root. right. right = new Node (7);
        int k = 3 ;
        KLevel(root, 1, k);

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
    }

    public static void KLevel(Node root, int level, int k){
        if(root == null){
            return;
        }
        if(level == k){
            System.out.println(root.data + " ");
        }
        KLevel(root.left, level+1, k);
        KLevel(root.right, level+1, k);
    }
}
