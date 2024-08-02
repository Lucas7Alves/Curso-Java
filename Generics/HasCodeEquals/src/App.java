import entities.Client;

public class App {
    public static void main(String[] args) throws Exception {
        
        Client c1 = new Client("Maria", "maria@gmail.com");
        Client c2 = new Client("Alex", "alex@hotmail.com");

        //hasCode não é 100% seguro, mas é rápido
        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        //equals não é rápido, mas é 100% seguro
        System.out.println(c1.equals(c2)); 

    }
}
