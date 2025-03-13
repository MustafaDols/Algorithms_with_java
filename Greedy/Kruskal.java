package Greedy;
import java.util.*;
class KruskalAlgorithm {
    public static void main(String[] args) {
        int n = 4; // Number of vertices
        Edge[] edges = new Edge[5];

        // Define edges (src, dest, weight)
        edges[0] = new Edge(0, 1, 10);
        edges[1] = new Edge(0, 2, 6);
        edges[2] = new Edge(0, 3, 5);
        edges[3] = new Edge(1, 3, 15);
        edges[4] = new Edge(2, 3, 4);

        kruskal(n, edges);
    }

    // Define a class for edges
    static class Edge implements Comparable<Edge> {
        int src, dest, weight;

        // Constructor
        public Edge(int src, int dest, int weight) {
            this.src = src;
            this.dest = dest;
            this.weight = weight;
        }

        // Sorting edges by weight
        public int compareTo(Edge compareEdge) {
            return this.weight - compareEdge.weight;
        }
    }

    // Subset class for union-find
    static class Subset {
        int parent, rank;
    }

    // Find set of an element i with path compression
    static int find(Subset[] subsets, int i) {
        if (subsets[i].parent != i) {
            subsets[i].parent = find(subsets, subsets[i].parent);
        }
        return subsets[i].parent;
    }

    // Union of two subsets
    static void union(Subset[] subsets, int x, int y) {
        int rootX = find(subsets, x);
        int rootY = find(subsets, y);

        // Attach smaller rank tree under root of higher rank tree
        if (subsets[rootX].rank < subsets[rootY].rank) {
            subsets[rootX].parent = rootY;
        } else if (subsets[rootX].rank > subsets[rootY].rank) {
            subsets[rootY].parent = rootX;
        } else {
            subsets[rootY].parent = rootX;
            subsets[rootX].rank++;
        }
    }

    // Kruskal's algorithm to find Minimum Spanning Tree
    static void kruskal(int n, Edge[] edges) {
        // Sort edges in non-decreasing order of weight
        Arrays.sort(edges);

        // Create subsets for union-find
        Subset[] subsets = new Subset[n];
        for (int i = 0; i < n; ++i) {
            subsets[i] = new Subset();
            subsets[i].parent = i;
            subsets[i].rank = 0;
        }

        // Resulting MST
        List<Edge> mst = new ArrayList<>();
        int edgeCount = 0;
        int i = 0; // Index for edges

        // Number of edges in MST will be n-1
        while (edgeCount < n - 1 && i < edges.length) {
            Edge nextEdge = edges[i++];

            int x = find(subsets, nextEdge.src);
            int y = find(subsets, nextEdge.dest);

            // If including this edge doesn't form a cycle
            if (x != y) {
                mst.add(nextEdge);
                edgeCount++;
                union(subsets, x, y);
            }
        }

        // Print MST
        System.out.println("Edges in the Minimum Spanning Tree:");
        for (Edge edge : mst) {
            System.out.println(edge.src + " -- " + edge.dest + " == " + edge.weight);
        }
    }


}
