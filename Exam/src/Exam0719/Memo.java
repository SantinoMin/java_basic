package Exam.src.Exam0719;

public class Memo {

  public static void main(String[] args) {

    Parent[] pList = new Parent[5];

    pList[0] = new Parent();


    int childCnt = 0;
    for(int i=0; i<pList.length; i++){
      if(pList[i] instanceof Child) childCnt++;
    }
    System.out.println(childCnt);

    int parentCnt = 0;
    for(int i=0; i<pList.length; i++){
      if(pList[i] instanceof Child == false) parentCnt++;
    }
    System.out.println(parentCnt);


  }
}
