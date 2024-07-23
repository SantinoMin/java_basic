package Exam.src;

public class CloneTest2 {

  public static void printArr(int[] arr){
    for(int i=0; i<arr.length; i++){
      System.out.println(arr[i]+" ");
    }
    System.out.println();
  }

  public static void main(String[] args) {
   int[] arr = new int[]{1,2,3};

//   int[] cpy = new int[arr.length];
//   System.arraycopy(arr,0,cpy,0,arr.length);
//위 2라인 대신에 (1)
    int[] cpy = arr.clone(); // << (1) 대신에

   arr[0] = 100;
   printArr(arr);
   printArr(cpy);
//    System.arraycopy(cpy);

  }
}
