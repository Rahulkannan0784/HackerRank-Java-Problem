import java.util.Scanner;

public class ChefChairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); 

        for (int i = 0; i < t; i++) {
            int x = sc.nextInt(); // Number of students
            int y = sc.nextInt(); // Number of chairs Chef already has
            if(x>y){
                System.out.println(x-y);
            }
            else{
                System.out.println("0");
            }
    }
}
}
