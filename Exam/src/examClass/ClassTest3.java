package Exam.src.examClass;

class MyMath{
    int val1;
    int val2;

    int add(){
      return val1 + val2;
    }
  int sub(){
    return val1 - val2;
  }
  int mul(){
    return val1 * val2;
  }
  int div(){
    return val1 / val2;
  }
}

public class ClassTest3 {
  public static void main(String[] args) {

   MyMath mm = new MyMath();
   mm.val1 = 20;
   mm.val2 = 5;

    System.out.println(mm.add());
    System.out.println(mm.sub());
    System.out.println(mm.mul());
    System.out.println(mm.div());
  }
}

//25
//15
//100
//4

