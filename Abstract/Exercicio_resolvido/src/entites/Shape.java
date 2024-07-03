package entites;

import entites_enum.Color;

public abstract class Shape {

  private Color color;

  //constructors
  public Shape() { 
  }
  public Shape(Color color) {
    this.color = color;
  }


  //metodo
  public abstract Double area();

  //getters and setters
  public Color getColor() {
    return color;
  }


  public void setColor(Color color) {
    this.color = color;
  }
}
