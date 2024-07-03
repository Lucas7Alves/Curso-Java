import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class App {
    public static void main(String[] args) throws Exception {
        LocalDate d1 = LocalDate.parse("1945-04-30");
        LocalDateTime d2 = LocalDateTime.now();

        DateTimeFormatter format1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        Duration duracao = Duration.between(d1.atStartOfDay(), d2);

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.print("A duração em dias entre " + d1 + " e " + d2.format(format1) + " é de: " + duracao.toDays() + " dias");
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
    }
}
