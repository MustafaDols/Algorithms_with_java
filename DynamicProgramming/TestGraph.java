package DynamicProgramming;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class TestGraph {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter NoOf Vertices:");
        int v = in.nextInt();
        System.out.println("Enter NoOf Edges:");
        int e = in.nextInt();
        Graph MyGraph=new Graph(v,e);
//Take Directed Graph
// if we have 4 vertices and 4 edges     the two edges between two vertices in diff direction is computed = 1
//        1 2 yes 1 no
//        1 3 yes 1 no
//        2 3 yes 3 yes 2
//        2 4 yes 4 no
        int c,d;
        while (e-- >0){
            int a=in.nextInt();
            int b=in.nextInt();
            String ans1=in.next();
            if(ans1.equals("yes")){
                c=in.nextInt();//from a to b what is the weight?
                MyGraph.adj_matrix[a][b]=c;
                MyGraph.dist_matrix[a][b]=c;
            }
            String ans2=in.next();
            if(ans2.equals("yes")){
                d=in.nextInt();//from b to a what is the weight?
                MyGraph.adj_matrix[b][a]=d;
                MyGraph.dist_matrix[b][a]=d;
            }

        }
        MyGraph.print_adjMatrix();
        System.out.println();
        System.out.println();
        MyGraph.print_DistanceMatrix();
        System.out.println();
        System.out.println();
        MyGraph.print_Distance();
        MyGraph.floyd();
        System.out.println();
        System.out.println();
        MyGraph.print_DistanceMatrix();


    }
}
