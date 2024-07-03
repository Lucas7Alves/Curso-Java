package entites;

import entites_enum.Color;

public class Circle extends Shape{

  private Double radius;

  
  //constructors
  public Circle() {
    super();
  }
  public Circle(Color color, Double radius) {
    super(color);
    this.radius = radius;
  }

  //metodos
  @Override
  public Double area() {
   return Math.PI * radius * radius;
  }

  //getters and setters
  public Double getRadius() {
    return radius;
  }

  public void setRadius(Double radius) {
    this.radius = radius;
  }
  
}
