package Exam.src.chapter06;

class Person {
  int age;
  String name;

  String info(Person this){
    return String.format("Age: %d, Name: %s", age,name);
  }
}

public class ConstructorExam1 {

  public static void main(String[] args) {
       Person person = new Person();
       person.age = 20;
       person.name = "david";

    System.out.println(person.info());
  }
}