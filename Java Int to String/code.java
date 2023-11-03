import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int A=sc.nextInt();

        if ( A >= -100 && A<=100){
            String str=Integer.toString(A);
            System.out.print("Good job");
        }
        else{
            System.out.print("Wrong answer");
        }
    
    }
}
