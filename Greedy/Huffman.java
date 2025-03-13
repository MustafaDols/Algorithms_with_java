package Greedy;
import java.util.PriorityQueue;

// Class representing a node in the Huffman Tree
class HuffmanNode implements Comparable<HuffmanNode> {
    char symbol;        // Character (for a file or string)
    int frequency;      // Frequency of the character
    HuffmanNode left;   // Left child
    HuffmanNode right;  // Right child

    // Constructor
    HuffmanNode(char symbol, int frequency) {
        this.symbol = symbol;
        this.frequency = frequency;
        this.left = null;
        this.right = null;
    }

    // Compare nodes by frequency (min-heap)
    @Override
    public int compareTo(HuffmanNode node) {
        return this.frequency - node.frequency;
    }
}

 class HuffmanAlgorithm {

    // Huffman Tree construction
    public static HuffmanNode buildHuffmanTree(char[] symbols, int[] frequencies) {
        // Priority queue to store the Huffman nodes, sorted by frequency
        PriorityQueue<HuffmanNode> pq = new PriorityQueue<>();

        // Create a leaf node for each symbol and add it to the priority queue
        for (int i = 0; i < symbols.length; i++) {
            pq.add(new HuffmanNode(symbols[i], frequencies[i]));
        }

        // Iterate until only one node remains in the queue
        while (pq.size() > 1) {
            // Remove the two nodes of lowest frequency
            HuffmanNode left = pq.poll();
            HuffmanNode right = pq.poll();

            // Create a new internal node with frequency equal to the sum of the two nodes
            HuffmanNode newNode = new HuffmanNode('\0', left.frequency + right.frequency);
            newNode.left = left;
            newNode.right = right;

            // Add the new node to the priority queue
            pq.add(newNode);
        }

        // Return the root of the Huffman Tree
        return pq.poll();
    }

    // Print the Huffman Codes (recursively)
    public static void printHuffmanCodes(HuffmanNode root, String code) {
        if (root == null) {
            return;
        }

        // If this is a leaf node, print the symbol and its code
        if (root.left == null && root.right == null) {
            System.out.println(root.symbol + ": " + code);
            return;
        }

        // Traverse left and right with updated code
        printHuffmanCodes(root.left, code + "0");
        printHuffmanCodes(root.right, code + "1");
    }

    public static void main(String[] args) {
        // Input symbols and their frequencies
        char[] symbols = { 'a', 'b', 'c', 'd', 'e', 'f' };
        int[] frequencies = { 5, 9, 12, 13, 16, 45 };

        // Build the Huffman Tree
        HuffmanNode root = buildHuffmanTree(symbols, frequencies);

        // Print the Huffman Codes
        System.out.println("Huffman Codes:");
        printHuffmanCodes(root, "");
    }
}
