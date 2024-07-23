//package Exam.src.chapter9;
//
//import java.util.ArrayList;
//import java.util.Iterator;
//
//class Person {
//  Integer age;
//  String name;
//
//  Person(Integer age, String name) {
//    this.age = age;
//    this.name = name;
//  }
//
//  void info(){
//    System.out.println("["+name+","+age+"]");
//  }
//
//  @Override
//  public String toString() {
//    return super.toString();
//  }
//}
//
//
//public class ArrayListTest2 {
//
//  public static void main(String[] args) {
//      ArrayList<Person> alist1 = new ArrayList<Person>();
//      alist1.add(new Person(20,"홍길동"));
//      alist1.add(new Person(30,"김길동"));
//      alist1.add(new Person(40,"하길동"));
//      alist1.add(new Person(50,"허길동"));
//      alist1.add(new Person(60,"송길동"));
//
//      //(Person)다운 캐스팅 해야함..29번 라인
////      for(int i=0; i<alist1.size(); i++){
//////        Person p = (Person)alist1.get(i);
////        Person p = alist1.get(i);
////        p.info();
////      }
//
//    for(Person p : alist1){
//      p.info();
//    }
//
//    Iterator<Person> it = alist1.iterator();
//    while(it.hasNext()){
//      it.next().info();
//
//      System.out.println(it.next());
//    }
//
//    //
//    System.out.println(alist1);
//  }
//}
