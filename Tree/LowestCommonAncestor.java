package Tree;

import java.util.ArrayList;

import Math.reverseInteger;

public class LowestCommonAncestor {
    public static void main(String[] args) {
        Node root = new Node (1) ;
        root. left = new Node (2);
        root. right = new Node (3) ;
        root. left. left = new Node (4);
        root. left.right = new Node (5);
        root. right.left = new Node (6) ;
        root. right. right = new Node (7);
        int n1 =  4, n2 = 6;
        System.out.println(lca(root, n1, n2).data);
        System.out.println(lca2(root, n1, n2).data);
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

    public static Node lca2(Node root, int n1, int n2){
        if(root == null || root.data == n1 ||  root.data == n2){
            return root;
        }

        Node leftLca = lca2(root.left, n1, n2);
        Node rightLca = lca2(root.right, n1, n2);

        if(rightLca == null){
            return leftLca;
        }
        if(leftLca == null){
            return rightLca;
        }
        return root;
    }

    public static Node lca(Node root, int n1, int n2){
        ArrayList<Node> path1 = new ArrayList<>();
        ArrayList<Node> path2 = new ArrayList<>();

        getPath(root, n1, path1);
        getPath(root, n2, path2);

        // Last common ancestor
        int i= 0;
        for(; i<path1.size() && i< path2.size(); i++){
            if(path1.get(i) != path2.get(i)){
                break;
            }
        }
        // last equal node -> i-1th
        Node lca = path1.get(i-1);
        return lca;
    }

    private static boolean getPath(Node root, int n, ArrayList<Node> path) { 
        if(root == null){
            return false;
        }
        path.add(root);
        if(root.data == n){
            return true;
        }

        boolean foundLeft = getPath(root.left, n, path);
        boolean foundRight = getPath(root.right, n, path);
        if(foundLeft || foundRight){
            return true;
        }

        path.remove(path.size()-1);
        return false;
    } 

    private static int lcaDist(Node root, int n) {
        if(root == null){
            return -1;
        }
        if(root.data == n){
            return 0;
        }

        int leftD = lcaDist(root.left, n);
        int rightD = lcaDist(root.right, n);

        if(leftD == -1 && rightD == -1){
            return -1;
        }
        else if(leftD == -1){
            return rightD + 1;
        }
        else{
            return leftD + 1;
        }

    }
}
