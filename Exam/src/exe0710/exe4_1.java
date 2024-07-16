package Exam.src.exe0710;

public class exe4_1 {
  public static void main(String[] args) {

//    1. int형 변수 x가 10보다 크고 20보다 작을 때 true인 조건식
//    int x = 11;
//    boolean xResult = (x > 10) && (x < 20)  ? true : false;
//    System.out.println(xResult);

//   !! 2. char형 변수 ch가 공백이나 탭이 아닐 때 true인 조건식
//    char ch = '2';
//    if(ch != ' ' || ch != '|t'){
//       return true;
//    } else {
//      return false;
//    }

    //!!이거 공백이나 탭 둘 중 하나라도 true면 ||결과가 true라서 // 하나씩 설정해야 될듯?
//    boolean result = (ch != ' ' || ch != '\t') ? true : false;
//    System.out.println(result);

    //(이렇게 하면 될듯?) !! 하나씩 설정 해보기
//    char ch = '2';
//    boolean result = (ch == ' ' || ch == '\t') ? false : true;
//    System.out.println(result);
//    }

//    3. char형 변수 ch가 ‘x' 또는 ’X'일 때 true인 조건식

//    char ch = 'w';
//    if( ch == 'x' || ch == 'X'){
//      return true;
//    }

//    boolean result = ( ch == 'x') || (ch == 'X') ? true : false;
//    System.out.println(result);

//    4. char형 변수 ch가 숫자(‘0’~‘9’)일 때 true인 조건식
//    char ch = '4';
//    boolean result = (ch == '0' || ch == '1' || ch == '2' || ch == '3') ? true : false;
//    System.out.println(result);

//    5. char형 변수 ch가 영문자(대문자 또는 소문자)일 때 true인 조건식
    //!!(해결 못 함)영문자 일 때를 어떻게 구하지??
//    char ch = 'd';
//        boolean result = (ch )

//    6. int형 변수 year가 400으로 나눠떨어지거나 또는 4로 나눠떨어지고 100으로 나눠떨어지지
//    않을 때 true인 조건식
    //!! 근데 400으로 나눠떨어지면 무조건 100으로도 나눠떨어지는 거 아닌가?
//    int year = 800;
//    if(year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {
//      return true;
//    } else {
//      return false;
//    }

//    /    7. boolean형 변수 powerOn가 false일 때 true인 조건식
//  boolean powerOn = false;
    boolean powerOn = false;
    System.out.println(!powerOn);

//
//    8. 문자열 참조변수 str이 “yes”일 때 true인 조건식
    String str = "yes";
    System.out.println(str.equals("yes"));

  }}
  ;
//  }
//  }

    //1부터 20까지의 정수 중에서 2 또는 3의 배수가 아닌 수의 총합
//  int sum = 0;
//for(int i = 1; i<=20;i++)
//  {
//    if (!(i % 2 == 0 || i % 3 == 0)) {  //if(i%2!=0 && i%3!=0)
//      sum += i;
//    }
//  }
//}

    /**
    //1     // i=1, j=1
    //1+2  // i=2, j=2
    //1+2+3  //i=3, j=3
    int sum = 0;
    for (int i = 1; i <= 10; i++) {
      for (int j = 1; j <= i; j++) {
        sum += j;
      }
    }
    System.out.println(sum);
  }
} */
//  };

