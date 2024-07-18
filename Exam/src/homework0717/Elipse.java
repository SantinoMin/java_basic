//package Exam.src.homework0717;
//
//  public class Elipse extends Shape {
//
//    String color;
//    Point center1;
//    Point center2;
//    int distanceSum;
//
//    public Elipse(String color, Point center1, Point center2, int distanceSum) {
//
//      super(color);
////      this.color = color; //super 사용해야 함  -- 왜지?
//      this.center1 = center1;
//      this.center2 = center2;
//      this.distanceSum = distanceSum;
//    }
//
//
//    public Elipse(String color, int cx1, int cx2, int cy1, int cy2, int distanceSum) {
//      //(1)
//      this(color, new Point(cx1, cy1), new Point(cx2, cy2), distanceSum);
//
//      //(1) 또는 (2)로 적용 가능
//      //(2)
////      super(color);
////      this.center1 = new Point(x1, y1);
////      this.center2 = new Point(x2, y2);
////        this.distanceSum = distanceSum;
//    }
//
//    @Override
//    public void draw(){
//      System.out.println(String.format("[타원:색-%s, 점1-%s, 점2-%s]", color, center1.x, center1.y));
//    }
//  }
