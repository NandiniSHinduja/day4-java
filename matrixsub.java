import java.util.*;
public class matrixsub {
    public static void main(String[] args) {
        System.out.println("Matrix Subtraction.");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows required:");
        int m=sc.nextInt();
        System.out.println("Enter the number of columns required:");
        int n=sc.nextInt();
        int A[][]=new int[m][n];
        int B[][]=new int[m][n];
        int C[][]=new int[m][n];
        System.out.println("Enter the elements for the first matrix.");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                A[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter the elements for the second matrix.");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                B[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                C[i][j]=A[i][j]-B[i][j];
            }
        }
        System.out.println("The subtraction of the given two matrices is:");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.println(C[i][j]);
            }
        }
        sc.close();
    }
    
}


