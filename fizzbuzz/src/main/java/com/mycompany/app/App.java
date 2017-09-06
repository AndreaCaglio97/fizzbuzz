package com.mycompany.app;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        int number;
        Scanner keyboard=new Scanner(System.in);
        System.out.println("Insert an integer: ");
        number=keyboard.nextInt();
        while(number>0)
        {
            System.out.println(print(number));
            number--;
        }
    }

    public static String print(int number)
    {
        String output = "";
        output += divisibleCheck(number,3,"fizz");

        output += divisibleCheck(number,5,"buzz");

        output += emptyStringCheck(number,output);

        return "number: " + number + " output: " + output;
    }

    public static String divisibleCheck(int number,int divider,String message)
    {
        return (number % divider == 0) ? message : "";
    }

    public static String emptyStringCheck(int number,String output)
    {
        return (output.equals("")) ? String.valueOf(number) : "";
    }
}
