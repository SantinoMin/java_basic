package Exam.src.exe0710;

public class Exem4_12 {

  public static void main(String[] args) {

    //가장 바깥 = 전체
    //그 다음 중간 = 바뀌는 부분
    //마지막 =
    for(int sdan=2 ; sdan<9; sdan+=3){
      for(int idx=1; idx<=3; idx++){
        for(int dan=sdan; dan<=(sdan+2 <10? sdan+2:sdan+1); dan++){
          System.out.print(String.format("%d*%d=%d", dan,idx,dan*idx));
        }
        System.out.println();
      }
      System.out.println();
    }
  }

}

//미니 프로젝트 팀은 어떻게 꾸려지는지? 몇명, 랜덤?, 마음 맞는 사람들끼리?
//어떤걸 만드는 걸 목표로 하는지?
//수업 이해도가 낮아서, 질문을 하기 어렵다 -> 다들 이해를 하는 상황인지
//방향을 어떻게 잡아야 될지 조언 구해봐야될듯.
