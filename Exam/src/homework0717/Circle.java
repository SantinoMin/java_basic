package Exam.src.homework0717;

public class Circle extends Shape {

  Point center;
  int radius;
  int z;

//  Circle(){};
//  Circle(String color, Point center, int radius) {
//    this(new Point(0, 0), 100);
//
//  }
//  Circle(Point d, int r) {
//    this.center = center;
//    this.r = r;
//  }

  Circle(String color, Point center, int radius) {
    super(color);
    this.center = center;
    this.radius = radius;
  }

  //일단 사용하지 않고 있음.
  Circle(String color, Point center, int radius, int z) {
    super(color);
    this.center = center;
    this.radius = radius;
  }

  Circle(String color, int x, int y, int radius) {
    super(color);
    this.center = new Point(x, y);
    this.radius = radius;
  }

//  @Override
//  public void draw() {
//    String.format("색상:%s, 중심점:%s, 원:%s,", color, center, radius);
//  }
}

