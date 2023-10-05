public class prime {
    public static void main(String[] args) {
        int num = 100, i, j, flag = 0;
        int arr[] = new int[8];
        arr[0] = 9;

        for (i = 1; i <= num; i++) {
            if (i != 1 && i != 2) {
                for (j = 2; j <= i / 2; j++) {
                    if (i % j == 0) {
                        flag = 1;
                    }
                }
            }
            if (flag == 0) {
                System.out.print(i + " ");
            }
            flag = 0;
        }

        System.out.println(arr[0]);
    }
}