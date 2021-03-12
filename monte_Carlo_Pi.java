import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the number of needles: ");
        int needles = scanner.nextInt();
        double needlesInCirle = 0;
        for(int i = 0; i < needles; i++){
            double x = Math.random();
            double y = Math.random();
            if(x * x + y * y <= 1)
                needlesInCirle++;
        }
        double myPI = 4 * needlesInCirle / needles;
        System.out.println("My PI: " + myPI);
        System.out.println("Java's PI: " + Math.PI);
    }
}
