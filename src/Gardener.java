import java.util.Scanner;

public class Gardener {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int counterL = 0;
        int n;
        int leafNum = 1;

        do{
            System.out.print("Кількість ярусів: ");
            n = scanner.nextInt();
        }while(n < 0 || n > 1000);

        counterL = (2 * 2 + 2 * (n - 1)) * n / 2;

        System.out.println(counterL + leafNum);
    }
}
