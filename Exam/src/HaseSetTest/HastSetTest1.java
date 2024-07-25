package Exam.src.HaseSetTest;

//import Exam.src.chapter06.Person;
import java.util.HashSet;

//@Override
//public String toString(){
//  return "이름:"+name+",나이:"+age;
//}

public class HastSetTest1 {

  public static void main(String[] args) {

    HashSet<Integer> hs = new HashSet<>();
    hs.add(32);
    hs.add(17);
    hs.add(84);
    hs.add(17);

    System.out.println(hs);
//    for(Integer n : hs){
//      System.out.println(n);
//    }

  }
}
