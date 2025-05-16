import entities.Comment;
import entities.Post;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws ParseException{

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");


        Post post1 = new Post(sdf.parse("21/10/2025 10:13:25"), "Travelling to New Zealand", 10, "It's been awesome travelling around New Zealand");
        Comment c1 = new Comment("I'm so grateful for having money");
        Comment c2 = new Comment("This trip will be wonderful");

        Post post2 = new Post(sdf.parse("31/12/2025 20:10:31"), "Good Night for all you", 10000, "Feliz cumpleaños");
        Comment c3 = new Comment("Me gusta mucho esta data del año");
        Comment c4 = new Comment("Felicitaciones para mis companeros de trabajo y obviamente, mi familia");

        post1.addComments(c1);
        post1.addComments(c2);

        post2.addComments(c3);
        post2.addComments(c4);

        System.out.println(post1);
        System.out.println(post2);
    }
}