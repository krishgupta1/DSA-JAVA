package Tree.BST;
import java.util.*;


public class implement {
    public static void main(String[] args) {
        int values[] = {8, 5, 3, 1, 4, 6, 10, 11, 14};
        Node root = null;
        for(int i = 0; i<values.length; i++){
            root = insert(root, values[i]);
        }
        ArrayList<Integer> l = new ArrayList<>();
        inOrder(root,l);
        
        for(int i = 0; i <l.size();){
            if(l.get(i) < l.get(i+1)){
                System.out.println("True");
                break;
            }
            else{
                System.out.println(false);
                break;
            }
        }
        System.out.println();
        root = delete(root, 10);
        System.out.println();
        inOrder(root,l);
        System.out.println();

        printInRange(root, 5, 12);
        System.out.println();

        printRoot2Leaf(root, new ArrayList<>());

        int arr[] = {3,5,6,8,10,11,12};
        Node root2 = createBST(arr, 0, arr.length-1);
        preOrder(root2);
    }
    static class Node{
        int data;
        Node left;
        Node right;
        Node (int data){
            this.data = data;
        }
    }
    public static Node insert(Node root, int val){
        if(root == null){
            root = new Node(val);
            return root;
        }
        if(root.data > val){
            root.left = insert(root.left, val);
        }
        else{
            root.right = insert(root.right, val);
        }
        return root;
    }
    public static void inOrder(Node root, ArrayList<Integer> list){
        if(root == null){
            return;
        }
        inOrder(root.left, list);
        System.out.print(root.data + " ");
        list.add(root.data);
        inOrder(root.right, list);
    }

    // Searching in BST
    public static boolean search(Node root, int key){
        if(root == null){
            return false;
        }

        if(root.data == key){
            return true;
        }
        if(root.data > key){
            return search(root.left, key);
        }
        else{
            return search(root.right, key);
        }
    }

    // Delete node from BST

    public static Node delete (Node root, int val){
        if(root.data < val){
            root.right = delete(root.right, val);
        }
        else if(root.data > val){
            root.left = delete(root.left, val);
        }
        else{
            // Case 1 : leaf node
            if(root.left == null && root.right == null){
                return null;
            }

            // Case 2 : Single Child
            if(root.left == null){
                return root.right;
            }
            else if(root.right == null){
                return root.left;
            }

            // Case 3 : both children
            Node InorderSucc = findInorderSucc(root.right);
            root.data = InorderSucc.data;
            root.right = delete(root.right, InorderSucc.data);
        }
        return root;  
    }
    public static Node findInorderSucc(Node root) {
        while(root.left != null){
            root = root.left;
        }
        return root;
    }

    // Print in range

    public static void printInRange(Node root, int k1, int k2){
        if(root == null){
            return;
        }
        if(root.data >= k1 && root.data <=12){
            printInRange(root.left, k1, k2);
            System.out.print(root.data + " ");
            printInRange(root.right, k1, k2);
        }
        else if(root.data < k1){
            printInRange(root.left, k1, k2);
        }
        else{
            printInRange(root.right, k1, k2);
        }
    }

    // Print path of BST

    public static void printPath (ArrayList<Integer> path){
        for(int i=0; i<path.size(); i++){
            System.out.print(path.get(i) + "->");
        }
        System.out.println("Null");
    }

    // Print Root to Leaf

    public static void printRoot2Leaf(Node root, ArrayList<Integer> path){
        if(root == null){
            return;
        }
        path.add(root.data);
        if(root.left == null && root.right == null){
            printPath(path);
        }
        printRoot2Leaf(root.left, path);
        printRoot2Leaf(root.right, path);
        path.remove(path.size()-1);
    }

    // Mirror of BST

    public static Node createMirror(Node root){
        if(root == null){
            return null;
        }
        Node leftMirror = createMirror(root.left);
        Node rightMirror = createMirror(root.right);

        root.left = rightMirror;
        root.right = leftMirror;
        return root;
    }

    public static void preOrder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data + "->");
        preOrder(root.left);
        preOrder(root.right);
    }

        // Shortest Arrray to Balanced BST
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