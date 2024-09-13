import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int resposta = 0;
        int sum = 0;
        do {
            System.out.println("Somar: ");
            resposta = sc.nextInt();
            sum += resposta;
        } while (resposta != 0);

        System.out.println(sum);
    }
}
