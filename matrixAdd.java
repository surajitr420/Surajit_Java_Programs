import java.util.*;

public class matrixAdd {

    static void show_matrix(int a[][], int rows , int columns){
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        int a[][] = new int[100][100], b[][] = new int[100][100],sum[][] = new int[100][100];
        int rows1, columns1, rows2, columns2;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows of matrix 1 : ");
        rows1 = sc.nextInt();

        System.out.print("Enter the number of columns of matrix 1 : ");
        columns1 = sc.nextInt();

        System.out.print("Enter the number of rows of matrix 2 : ");
        rows2 = sc.nextInt();

        System.out.print("Enter the number of columns of matrix 2 : ");
        columns2 = sc.nextInt();

        // taking input

        System.out.println("Enter the elements of Matrix1");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < columns1; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("The Matrix is : \n");
        show_matrix(a,rows1,columns1);

        System.out.println("Enter the elements of Matrix2");
        for (int i = 0; i < rows2; i++) {
            for (int j = 0; j < columns2; j++) {
                b[i][j] = sc.nextInt();
            }
        }
        sc.close();
        System.out.println("The Matrix is : \n");
        show_matrix(b,rows2,columns2);
        // addition of matrix
        if(rows1==rows2 && columns1==columns2){
            for (int i = 0; i < rows2; i++) {
            for (int j = 0; j < columns2; j++) {
                sum[i][j] = (a[i][j]) + (b[i][j]);
            }
            System.out.println("The sum of the  Matrix is : \n");
            show_matrix(sum, rows2, columns2);
        }
        }
        else{
            System.out.println("Size of the Martices should be same");
        }
        

    }
}
