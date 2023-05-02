package characterstream2;

import java.util.Scanner;

public class LAB5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Hello " + name);
        System.out.print("Enter your weight: ");
        double w = sc.nextDouble();
        System.out.print("Enter your height: ");
        double h = sc.nextDouble();
        System.out.println(h * w);
    }
}
