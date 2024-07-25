import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entites.Contract;
import entites.Installment;
import services.ContractService;
import services.PaypalService;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Entre os dados do contrato: ");
        System.out.print("Número: ");
        int number = sc.nextInt();
        sc.nextLine();

        System.out.print("Data (DD/MM/YYYY): ");
        Date date = sdf.parse(sc.nextLine());

        System.out.print("Valor do contrato: ");
        Double totalValue = sc.nextDouble();

        System.out.print("Entre com o número de parcelas: ");
        Integer installment = sc.nextInt();

        Contract contract = new Contract(number, date, totalValue);
        ContractService cs = new ContractService(new PaypalService());
        cs.processContract(contract, installment);
        System.out.println("Parcelas: ");
        
        for (Installment p : contract.getInstallments()) {
            System.out.println(sdf.format(p.getDueDate()) + " - " + String.format("%.2f", p.getAmount()));
        }

        sc.close();

    }
}
