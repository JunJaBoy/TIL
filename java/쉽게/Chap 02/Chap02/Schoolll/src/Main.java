import java.util.Scanner;

public class Main {
    /*static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int a = sc.nextInt();
        String[] str = new String[a];
        int[] cnt = new int[a];

        for (int i = 0; i < a; i++) {
            str[i] = sc.nextLine();
            for (int )
        }
    }*/

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int a = sc.nextInt();
        int b = sc.nextInt();
        int cnt = a + 1;
        int rst = 1;
        int[] arr= new int[a];
        for (int i = 0; i < a; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = a; i > 0; i--) {
            if (arr[i] < b) {
                cnt--;
            }
            else {
                break;
            }
        }
        for (int i = 0; ; i++) {
            rst *= cnt;
            cnt--;
            if (cnt == 0) {break;}
        }
    }

}
