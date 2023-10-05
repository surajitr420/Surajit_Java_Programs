import java.util.*;

public class arrSearch {
    static int search(int arr[], int find, int size) {
        int i;
        for (i = 0; i < size; i++) {
            if (arr[i] == find) {
                return i;
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        int arr[] = new int[100] ;
        int find, n, pos;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements");
        n = sc.nextInt();
        System.out.println("Enter Array Elements");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
// printing array elements
        System.out.println("Array Elements are");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");

        }

        System.out.println("\nEnter a element for searching");
        find = sc.nextInt();

        pos = search(arr, find, n);
        sc.close();
        if(pos<0)
            System.out.println("Array element is not found");
        else
            System.out.println("position of the element is "+(pos+1));
    }

}
