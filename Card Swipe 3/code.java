import java.util.Scanner;

public class Solutions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();

        for (int i = 0; i < n1; i++)
        {
            int n2 = sc.nextInt();
            int a[] = new int[n2];

            for (int j = 0; j < n2; j++)
            {
                a[j] = sc.nextInt();
            }

            int m = a[0];
            for (int j = 0; j < n2; j++)
            {
                if (a[j] > m) {
                    m = a[j];
                }
            }

            System.out.println(m);
        }
    }
}
