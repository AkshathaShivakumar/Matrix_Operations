import java.util.Arrays;
import java.util.Scanner;
public class Matrix_operations {
        public static int[][] readMatrix(int rows, int cols, Scanner sc) {
            int[][] matrix = new int[rows][cols];
            System.out.println("Enter elements of matrix (" + rows + "x" + cols + "):");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    matrix[i][j] = sc.nextInt();
                }
            }
            return matrix;
        }
        public static void print_matrix(int [][]mat){
            int row= mat.length;
            int col=mat[0].length;
            for (int i = 0; i < row; i++) {
                for (int j = 0 ; j <col ; j++) {
                    System.out.print(mat[i][j]+" ");
                }
                System.out.println();
            }
        }
        public static int[][] Addition(int [][]mat1,int [][] mat2){
            int row=mat1.length;
            int col=mat1[0].length;
            int [][]sum=new int[row][col];
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    sum[i][j]=mat1[i][j]+mat2[i][j];
                }

            }
            return sum;
        }
        public  static int[][] transpose(int [][]mat){

            int row= mat.length;
            int col=mat[0].length;
            int [][] trans=new int[col][row];
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    trans[j][i]=mat[i][j];
                }
            }
            return trans;
        }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows and columns :");
        int row=sc.nextInt();
        int col=sc.nextInt();

        System.out.println("enter the elements of first matrix");
        int [][] mat1=readMatrix(row,col,sc);
        System.out.println("enter the elements of second matrix");
        int [][] mat2=readMatrix(row,col,sc);

        System.out.println("Matrix A");
        print_matrix(mat1);
        System.out.println("Matrix B");
        print_matrix(mat2);

        System.out.println("Sum of two matrix :");
        print_matrix(Addition(mat1,mat2));

        System.out.println("Transpose of matrix A :");
        print_matrix(transpose(mat1));

        System.out.println("Transpose of matrix B :");
        print_matrix(transpose(mat2));
    }

}
