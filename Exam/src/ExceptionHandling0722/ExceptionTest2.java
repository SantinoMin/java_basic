package Exam.src.ExceptionHandling0722;

public class ExceptionTest2 {

  public static void main(String[] args) {

    int[] arr1 = new int[]{10, 20, 30, 40};
    int[] arr2 = new int[]{5, 0, 6, 8, 2};


    int divsum = 0;
      for (int i = 0; i < arr2.length; i++) {
//        try {
//        divsum = arr1[i] / arr2[i];
//      }
//      //2,0,5,5,0
//      //성립하지 않으면, 건너뛰고
//     catch (ArithmeticException e) {
//      System.out.println(e.getMessage());
//
//    } catch(ArrayIndexOutOfBoundsException e){
////          System.out.println(i.getMessage());
//          divsum += 1;

        try{
          divsum += arr1[i] / arr2[i];
        } catch( MyException e ){
          divsum += 1;
        }
  }
    System.out.println(divsum);


}};

