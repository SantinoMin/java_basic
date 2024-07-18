package Exam.src.homework0717;


public class ShapeMain {

  public static void main(String[] args) {
    Circle circle1 = new Circle("빨강", new Point(10, 20), 5); // 색, 중심점, 반지름
    Circle circle2 = new Circle("주황", 35, 24, 15); // 색, 중심점x, 중심점y, 반지름

    Rectangle rectangle1 = new Rectangle("파랑", new Point(3, 5), 20, 10)); //색, 시작점, 가로, 세로
    Rectangle rectangle2 = new Rectangle("하늘", 50, 60, 10, 20)); //색, 시작점, 가로, 세로

    Triangle triangle1 = new Triangle("초록", new Point(10,1), new Point(1,20),new Point(10,20)); // 색, 점1, 점2, 점3
    Triangle triangle2 = new Triangle("연두", 10,1,1,20,10,20) ;   // 색, 점1x, 점1y, 점2x, 점2y, 점3x, 점3y

    System.out.println(circle1.draw());
    System.out.println(circle2.draw());
    System.out.println(rectangle1.draw());
    System.out.println(rectangle2.draw());
    System.out.println(triangle1.draw());
    System.out.println(triangle2.draw());
  }
}

//숙제 0717 수요일 --> 목요일에 제출
//[원: 색-빨강, 중심점: (10,20), 반지름: 5]
//[원: 색-주황, 중심점: (35,24), 반지름: 15]
//[사각형: 색-파랑, 시작점: (3,5), 가로:20, 세로:10];
//[사각형: 색-하늘, 시작점: (50,60), 가로:20, 세로:10];
//[삼각형: 색-초록, 점1: (10,1), 점2: (1,20), 점3: (10,20)];
//[삼각형: 색-연두, 점1: (20,1), 점2: (2,30), 점3: (20,30)];

//# 이해하고 있는 부분
//1) 생성자 = 초기화 용도
//    2) 가져올 값 Circle circle2 = new Circle("주황", 35, 24, 15); // 색, 중심점x, 중심점y, 반지름
//        타입에 맞는 생성자 설정 필요
//+ 클래스의 인스턴스 변수를 통해 값 설정
//    # 이해가 안되는 부분
//1) new Circle("빨강", new Point(10, 20), 5); 이런식의 인스턴스 객체의 파라미터로 new Point 가져오는 부분
//2) Triangle() 클래스 부분의 super(color); 이런 경우 가져오는 값은?