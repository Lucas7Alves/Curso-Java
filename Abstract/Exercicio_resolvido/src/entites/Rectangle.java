package entites;

import entites_enum.Color;

public class Rectangle extends Shape {

  private Double width;
  private Double height;

  //constructors
  public Rectangle() {
    super();
  }
  public Rectangle(Color color, Double width, Double height) {
    super(color);
    this.width = width;
    this.height = height;
  }
  
  //metodos
  @Override
  public Double area() {
    return width * height;
  }

  //getters and setters
  public Double getWidth() {
    return width;
  }

  public void setWidth(Double width) {
    this.width = width;
  }

  public Double getHeight() {
    return height;
  }

  public void setHeight(Double height) {
    this.height = height;
  }
}
