import java.text.SimpleDateFormat;

import entites.Comment;
import entites.Post;

public class App {
    public static void main(String[] args) throws Exception {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Comment c1 = new Comment("Have a nice trip!");
        Comment c2 = new Comment("Wow that's awesome");

        Post p1 = new Post(sdf.parse("21/06/2018 13:05:44"), "Treveling to New Zeland", "I'm going to visit my mother", 12);

        p1.addComment(c1);
        p1.addComment(c2);

        System.out.println(p1);
    }
}
