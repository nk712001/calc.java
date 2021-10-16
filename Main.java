package com.company;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        char op;
        double n1, n2;

        Scanner input = new Scanner(System.in);

        System.out.println("select one operation (+,-,*,/)");
        op = input.next().charAt(0);

        System.out.println("enter the numbers to be calculated:");
        n1 = input.nextDouble();
        n2 = input.nextDouble();

        input.close();

        switch(op){
            case'+':
                System.out.printf("%.2f + %.2f = %.2f",n1,n2,(n1+n2));
                break;
            case'-':
                System.out.printf("%.2f - %.2f= %.2f",n1,n2,(n1-n2));
                break;
            case'*':
                System.out.printf("%.2f * %.2f = %.2f", n1, n2,(n1 * n2));
                break;
            case'/':
                if (n2!=0)
                System.out.printf("%.2f / %.2f = %.2f",n1,n2,(n1/n2));
            else
                System.out.println(n1+" and 0 can't be divided.");
                break;

            default:
                System.out.println("%c enter a valid operation.");

        }
    }
}
