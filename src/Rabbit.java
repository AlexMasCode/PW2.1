import java.util.Scanner;

public class Rabbit {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rabbitsNum = 1;
        int n;
        int k;

        do {
            System.out.print("Кількість місяців: ");
            n = scanner.nextInt();
        }while (n < 0 || n > 100);

        do {
            System.out.print("Кількість, яких з'їдав монстр: ");
            k = scanner.nextInt();
        }while (k < 0 || k > 10000);

        for(int i = 0; i < n; i++){
            if(rabbitsNum > k){
                rabbitsNum -= k;
            }
            rabbitsNum *= 2;
        }

        System.out.println(rabbitsNum);
    }
}
