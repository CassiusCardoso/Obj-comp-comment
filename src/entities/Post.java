package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Post {
    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    private Date moment;
    private String title;
    private Integer likes;
    private String content;

    // Comment precisa ser uma lista porque uma postagem pode ter mais de um comentário
    // Mas lembrando, NÃO COLOCAR O List<Comment> comments no construtor
    // E os métodos getter and setter são diferentes
    // Ao invés de passar a lista como parâmetro, eu passo o Comment comment, porque a Lista ainda não tem nenhum valor
    private List<Comment> comments = new ArrayList<>();
    public Post(){}

    public Post(Date moment, String title, Integer likes, String content) {
        this.moment = moment;
        this.title = title;
        this.likes = likes;
        this.content = content;
    }
    public Date getMoment() {
        return moment;
    }
    public void setMoment(Date moment) {
        this.moment = moment;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public Integer getLikes() {
        return likes;
    }
    public void setLikes(Integer likes) {
        this.likes = likes;
    }
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }

    public List<Comment> getComments() {
        return comments;
    }
    public void addComments(Comment comment) {
        comments.add(comment);
    }

    public void removeComments(Comment comment){
        comments.remove(comment);
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(title + "\n");
        sb.append(likes);
        sb.append(" Likes - ");
        sb.append(sdf.format(moment) + "\n");
        sb.append(content + "\n");
        sb.append("Comments:\n");
        // Loop for para percorer a lista de comments e instanciar cada objeto comment com o identificador c
        // E adicionar o comentário ao StrinBuilder
        for(Comment c : comments){
            sb.append(c.getText());
        }
        return sb.toString();
    }
}
