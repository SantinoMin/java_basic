package Exam.src;

public class StringTest1 {
//07/23 화요일 강의
  public static void main(String[] args) {

    String animals = "cat#dog#bear";
    String[] animalList = animals.split(",");
//    for (int i = 0; i < animalList.length; i++) {
//      System.out.println(animalList[i]);
//    }

    //regex에 나눌 구간, limit에 나눌 숫자
    String[] animalList2 = animals.split("#",2);
    for(int i=0; i<animalList2.length; i++){
      System.out.println(animalList2[i]);
    }

    //substring사용하면 입력한 숫자 다음부터 보여줌
    String fullname2 = "honggildong";
    System.out.println(fullname2.substring(4));

//    System.out.println(fullname2.startsWith(4,7));

    String name = "gildong";
    String name1 = "GILDONG";
    System.out.println(name.toUpperCase());
    System.out.println(name1.toLowerCase());

    //데이터 비교할 때 trim()을 사용하여 비교하는 경우 많음
    //데이터 사이의 스페이스를 제거하는 건 아니고, 제일 앞 + 제일 뒤의 스페이스만 제거
    String str7 = " sdfsd ";
    System.out.println(str7);
    System.out.println(str7.length());
    System.out.println(str7.trim().length());

    //각 타입을 문자열로 바꾸는 경우.
    boolean b = true;
    System.out.println(b+"");
    //위처럼 쓰기보다는 사용할 수 있는 함수가 있음
    //클래스에 붙이는 메서드는 static 메서드임
    System.out.println(String.valueOf(b));

    //위의 b와 아래의 n은 Overloading.
    int n = 10;
    System.out.println(n + "");
    System.out.println(String.valueOf(n));

  }
}
