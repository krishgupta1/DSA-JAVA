package Tree;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class TopViewOfaTree {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        BinaryTree tv = new BinaryTree();
        tv.topView(root);

    }

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree {
        static int idx = -1;

        public static Node buildTree(int nodes[]) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }

        static class info {
            Node node;
            int hd;

            public info(Node node, int hd) {
                this.node = node;
                this.hd = hd;
            }
        }

        public static void topView(Node root) {
            // Level Order
            Queue<info> q = new LinkedList<>();
            HashMap<Integer, Node> map = new HashMap<>();

            int min = 0, max = 0;

            q.add(new info(root, 0));
            q.add(null);

            while (!q.isEmpty()) {
                info curr = q.remove();
                if (curr == null) {
                    if (q.isEmpty()) {
                        break;
                    } else {
                        q.add(null);
                    }
                }
                else{
                    // update min/max
                    min = Math.min(min, curr.hd);
                    max = Math.max(max, curr.hd);
                    if (!map.containsKey(curr.hd)) { // first time HD occuring
                        map.put(curr.hd, curr.node);
                    }
    
                    if (curr.node.left != null) {
                        q.add(new info(curr.node.left, curr.hd - 1));
                    }
                    if (curr.node.right != null) {
                        q.add(new info(curr.node.right, curr.hd + 1));
                    }
                }
                
            }

            for (int i = min; i <= max; i++) {
                System.out.print(map.get(i).data + " ");
            }
        }
    }
}