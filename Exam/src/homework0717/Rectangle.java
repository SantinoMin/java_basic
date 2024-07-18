package Exam.src.homework0717;

public class Rectangle extends Shape {

  Point center;
  int x;
  int y;
  int width;
  int height;

  public Rectangle(String color, Point center, int x, int y) {
    super(color);
    this.center = center;
    this.x = x;
    this.y = y;
  }

  public Rectangle(String color, int x, int y, int width, int height) {
    super(color);
    this.x = x;
    this.y = y;
    this.width = width;
    this.height = height;

  }


}
