package entites;
public class Comment {
  public static Comment getText;
  private String text;

// contructor
  public Comment(String text) {
    this.text = text;
  }
//getters and setters
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }


  
}
