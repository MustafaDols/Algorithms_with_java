package DynamicProgramming;

public class Graph {
    int v,e;
    int[][] adj_matrix;
    int[][] dist_matrix;

    public Graph(int v,int e){
        this.v=v;
        this.e=e;
        adj_matrix=new int[v+1][v+1];
        dist_matrix=new int[v+1][v+1];
// تشكيل المصفوفه اذا كان يوجد path تكون القيمه inf اذا كان هي نفس الفيرتكس يكون 0 هعدل بقا علي القيم ال inf في الinput اللي هدهوله
        for (int i = 1; i <= v ; i++) {
            for (int j = 1; j <= v ; j++) {
                dist_matrix[i][j]=111; //represent a large number
            }
            dist_matrix[i][i]=0;
        }


    }
    public void print_adjMatrix(){
        for (int i = 1; i <=v; i++) {
            for (int j = 1; j <=v ; j++) {
                System.out.print(adj_matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    public void print_DistanceMatrix(){
        for (int i = 1; i <=v ; i++) {
            for (int j = 1; j <=v ; j++) {
                System.out.print(dist_matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    public void print_Distance(){
        for (int i = 1; i <=v ; i++) {
            for (int j = i+1; j <=v ; j++) {
                System.out.println(i+" to "+j+" = "+dist_matrix[i][j]);
                System.out.println(j+" to "+i+" = "+dist_matrix[j][i]);
            }
        }
    }
    public void floyd(){      //بعد هذه الميثود dist بتتغير و بتجيبلي اقصر path بين اي اتنين vertices
        for (int k = 1; k <=v ; k++) {
            for (int i = 1; i <=v ; i++) {
                for (int j = 1; j <=v ; j++) {
                    if(dist_matrix[i][j]>dist_matrix[i][k]+dist_matrix[k][j]){
                        dist_matrix[i][j] = dist_matrix[i][k]+dist_matrix[k][j];
                    }
                }
            }
        }
    }


}

