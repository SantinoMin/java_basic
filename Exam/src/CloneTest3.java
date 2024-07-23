package Exam.src;

class Circle implements Cloneable {

  Point center;
  int radius;

  Circle(Point center, int radius) {
    this.center = center;
    this.radius = radius;
  }

  Circle(int x, int y, int radius) {
    //new Point(x,y) ??
    this.center = new Point(x, y);
    this.radius = radius;
  }

  @Override
  public String toString() {
    return String.format("원[중심점:%s, 반지름:%d]", center, radius);
  }

  @Override
  protected Object clone() {
    try {
      Circle c =(Circle)super.clone();

      //수동으로 메모리 분리를 해줘야 됨.
      c.center = new Point(center.x, center.y);
      return c;
    } catch (CloneNotSupportedException e) {
      return null;
    }
  }
}

  public class CloneTest3 {

    public static void main(String[] args) {
      Circle c1 = new Circle(10, 10, 20);
      Circle c2 = (Circle) c1.clone();
      c1.center.x = 100;
      c1.radius = 200;
      //2개가 달리 나와야 함 => 복제
      System.out.println(c1);
      System.out.println(c2);
    }
  };