package Tree.BST;

import java.util.ArrayList;

public class ConvertBSTtoBalancedBST {
    public static void main(String[] args) {
        Node root = new Node (8);
        root. left = new Node ( 6);
        root. left. left = new Node ( 5);
        root. left. left. left = new Node( 3);
        root. right = new Node ( 10);
        root. right. right = new Node ( 11);
        root. right. right. right = new Node( 12);

        ArrayList<Integer> l = new ArrayList<>();
        inOrder(root, l);
        int arr[] = new int[l.size()];
        for(int i = 0; i<arr.length; i++){
            arr[i] = l.get(i);
        }
        Node r2 = createBST(arr, 0, l.size()-1);
        preOrder(r2);
    }
    static class Node{
        int data;
        Node left;
        Node right;
        Node (int data){
            this.data = data;
        }
    }
    private static void inOrder(Node root, ArrayList<Integer> l) {
        if(root == null)
            return;
        inOrder(root.left, l);
        l.add(root.data);
        inOrder(root.right, l);
    }

    private static void preOrder(Node root) {
        if(root == null)
            return;
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static Node createBST(int arr[], int st, int end){
        if(st > end){
            return null;
        }

        int mid = (st + end) / 2;
        Node root = new Node(arr[mid]);
        root.left = createBST(arr, st, mid-1);
        root.right = createBST(arr, mid+1, end);

        return root;
    }
    
}
