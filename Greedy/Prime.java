package Greedy;
import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] graph = {
                {0,1,3},
                {1,0,2},
                {3,2,0}
        };

        prim(graph.length, graph);
    }
    public static void prim(int n, int[][] W) {
        int[] nearest = new int[n];
        int[] distance = new int[n];
        boolean[] visited = new boolean[n];
        visited[0] = true;

        int maxV =1000;
        for (int i = 1; i < n; i++) {
            nearest[i] = 0;
            if (W[0][i]==0)distance[i] = maxV;
            else distance[i]=W[0][i];

        }

        for (int k = 0; k < n - 1; k++) {
            int min = maxV;
            int vnear = -1;

            for (int i = 1; i < n; i++) {
                if (!visited[i] && distance[i] < min) {
                    min = distance[i];
                    vnear = i;
                }
            }
            System.out.println( + nearest[vnear] + " " + vnear +" weighted "+ distance[vnear]);


            visited[vnear] = true;


            for (int i = 1; i < n; i++) {
                if (!visited[i] && W[vnear][i] != 0 && W[vnear][i] < distance[i]) {
                    distance[i] = W[vnear][i];
                    nearest[i] = vnear;
                }
            }
        }
    }
}

