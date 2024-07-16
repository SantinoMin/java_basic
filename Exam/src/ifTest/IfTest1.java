package Exam.src.ifTest;

public class IfTest1 {

  public static void main(String[] args) {
    int kor = 98, eng = 99, math = 100;
    int tot = kor+eng+math;
    double avg = tot/3.0;
    String grade;
    System.out.println(Math.round(avg));
//    System.out.println("avg = " + avg);
   //grade비교

    switch ((int)avg/10) {  // byte, short, int, long , char, String
      case 10:
      case 9:
        grade = "B";
        break;
      case 8:
        grade = "C";
        break;
      case 7:
        grade = "D";
        break;
      case 6:
        grade = "E";
        break;
      default: grade = "F";
    }
      System.out.println(grade);
    }



//    if(avg >= 90){
//      grade = "A";
//      if(avg >=98) {
//        grade += "+";
//      } else if(avg >= 94) {
//        grade += "0";
//      } else {
//      grade += "-";
//      }
//      System.out.println("grade");
//    } else if (avg >= 80){
//      System.out.println('B');
//    } else if (avg >= 70){
//      System.out.println('C');
//    } else if (avg >=60){
//      System.out.println('D');
//    } else {
//      System.out.println('F');
//    }
  }

