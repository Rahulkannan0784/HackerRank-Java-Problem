import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

import java.text.NumberFormat;
import java.util.Locale;

public class CurrencyFormatter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double n = sc.nextDouble();
        

        NumberFormat usFormat = NumberFormat.getCurrencyInstance(Locale.US);
        String usFormatted = usFormat.format(n);
        
      
        Locale indiaLocale = new Locale("en", "IN");
        NumberFormat indiaFormat = NumberFormat.getCurrencyInstance(indiaLocale);
        String indiaFormatted = indiaFormat.format(n);
        
       
        NumberFormat chinaFormat = NumberFormat.getCurrencyInstance(Locale.CHINA);
        String chinaFormatted = chinaFormat.format(n);
        
   
        NumberFormat franceFormat = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        String franceFormatted = franceFormat.format(n);
 
        System.out.println("US: " + usFormatted);
        System.out.println("India: " + indiaFormatted);
        System.out.println("China: " + chinaFormatted);
        System.out.println("France: " + franceFormatted);
    }
}
