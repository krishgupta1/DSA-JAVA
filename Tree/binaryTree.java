package Tree;
import java.util.LinkedList;
import java.util.Queue;

public class binaryTree {
    public static void main(String[] args) {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        System.out.println(root.data);
        tree.preOrder(root);
        System.out.println();
        tree.inOrder(root);
        System.out.println();
        tree.postOrder(root);
        System.out.println();
        tree.levelOrder(root);
        System.out.println();
        System.out.println(tree.height(root));
        // System.out.println(tree.idx);
        System.out.println(tree.countNode(root));
        System.out.println(tree.sumOfNodes(root));
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
        public static void preOrder(Node root){
            if(root == null){
                System.out.print("-1" + " ");
                return;
            }
            System.out.print(root.data + " ");
            preOrder(root.left);
            preOrder(root.right);
        }
        public static void inOrder(Node root){
            if(root == null){
                System.out.print("-1" + " ");
                return;
            }
            
            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);
        }
        public static void postOrder(Node root){
            if(root == null){
                System.out.print("-1" + " ");
                return;
            }
            
            postOrder(root.right);
            System.out.print(root.data + " ");
            postOrder(root.left);
        }
        //Level Order
        public static void levelOrder(Node root){
            if(root == null){
                return;
            }
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);
            while(!q.isEmpty()){
                Node currNode = q.remove();
                if(currNode == null){
                    System.out.println();
                    if(q.isEmpty()){
                        break;
                    }
                    else{
                        q.add(null);
                    }
                }
                else{
                    System.out.print(currNode.data + " ");
                    if(currNode.left != null){
                        q.add(currNode.left);
                    }
                    if(currNode.right != null){
                        q.add(currNode.right);
                    }
                }
            }
        }

        // Height of a tree
        public static int height(Node root){
            if(root == null){
                return 0;
            }
            int lh = height(root.left);
            int rh = height(root.right);
    
            return Math.max(lh, rh) + 1;
        }

        // Count of Nodes
        public static int countNode(Node root){
            if(root == null){
                return 0;
            }
            int Lcount = countNode(root.left);
            int Rcount = countNode(root.right);
            return Lcount + Rcount + 1;
        }

        // Sum of Nodes
        public static int sumOfNodes(Node root){
            if(root == null){
                return 0;
            }

            int leftSum  = sumOfNodes(root.left);
            int rightSum  = sumOfNodes(root.right);
            return leftSum + rightSum + root.data;
        }
    }
}