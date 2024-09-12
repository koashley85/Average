import java.util.Scanner;
//written by Kavion Ashley

public class Main {
    public static void main(String[] args) {
        // This program will display the average of 3 numbers
        double num1=0, num2=0, num3=0, average=0;

        //allows for user input
        Scanner data = new Scanner(System.in);

        System.out.print("Please input first number ");
        num1 = data.nextDouble();
        System.out.print("Please input second number ");
        num2 = data.nextDouble();
        System.out.print("Please input third number ");
        num3 = data.nextDouble();

        average=(num1+num2+num3)/3;

        System.out.print("The average of the three numbers is ");
        System.out.println(average);
        // Press Shift+F10 or click the green arrow button in the gutter to run the code.

    }
}