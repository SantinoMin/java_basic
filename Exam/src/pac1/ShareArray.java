package Exam.src.pac1;

public class ShareArray {

  int[] array = new int[100];
  int cnt;
  static ShareArray shareArray;

  //생정자가 private이라서 ShareArrayMain의 8번줄의 뒷 부분 에러 뜸.
  private ShareArray() {}

  public static ShareArray getRefshareArray(){
    if(shareArray==null){
      shareArray = new ShareArray();
    }
    return shareArray;
  };

  public void addData(int data){
    array[cnt++] = data;
  }

  public int getData(int idx){
    return array[idx];
  }

}
