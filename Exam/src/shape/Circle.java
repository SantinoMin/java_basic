package Exam.src.homework0717;

public class Circle extends Shape {

  Point center;
//  int radius;

  Circle(){};
  Circle(String color, Point ceenter, int Radius) {
    this(new Point(0, 0), 100);
  }

  Circle(Point d, int r) {
    this.center = center;
    this.r = r;
  }

  Circle(String color, Point center, int r) {
    this.color = color;
    this.center = center;
    this.r = r;
  }

  Circle(String color, Circle center, int r) {
    this.color = color;
//    this.center = center;
  }

  public void draw(){
    String.format("[원:%s, 중심점 null).draw()");
  }
}
