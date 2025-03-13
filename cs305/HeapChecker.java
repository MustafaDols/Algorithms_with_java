package cs305;
import java.util.Queue;
import java.util.LinkedList;
public class HeapChecker {
    public static boolean isHeap(Node root) {
        boolean isHeap = true;
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            Node node = queue.poll();
            if (node.left != null && node.right != null) {
                if (node.value > node.left.value || node.value > node.right.value) {
                    isHeap = false;
                    break;
                }
                queue.add(node.left);
                queue.add(node.right);
            } else if (node.left != null) {
                if (node.value > node.left.value) {
                    isHeap = false;
                    break;
                }
                queue.add(node.left);
            }
        }

        return isHeap;
    }

    public static class Node {
        int value;
        Node left;
        Node right;

        public Node(int value) {
            this.value = value;
        }
    }

    public static void main(String[] args) {
        Node root = new Node(5);
        root.left = new Node(3);
        root.right = new Node(7);
        root.left.left = new Node(2);
        root.left.right = new Node(4);
        root.right.left = new Node(6);
        root.right.right = new Node(8);

        System.out.println(isHeap(root));
    }
}
