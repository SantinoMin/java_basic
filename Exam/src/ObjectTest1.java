package Exam.src;

class Person implements Cloneable{

  int age;
  String name;

  Person(int age, String name) {
    this.age = age;
    this.name = name;
  }

  @Override
  public boolean equals(Object obj) {
    if(!(obj instanceof  Person)) return false;
    Person p = (Person)obj;
//    return super.equals(obj);
    return age==p.age && name.equals(p.name);
  }

  @Override
  public int hashCode(){
    return age+name.hashCode();
  }

  @Override
  public String toString(){
    return "나이: " + age + " 이름: "+name;
  }

  @Override
  public Object clone(){
    try{
      return super.clone();
    } catch (CloneNotSupportedException e){
      return null;
    }
  }
}

//1.1 Object클래스의 메서드
public class ObjectTest1 {
  public static void main(String[] args) {
//    Person p1 = new Person();
//    p1.name = "hong";
//    p1.age = 20;
//    Person p2 = p1.clone();
    //protected 되어있어서, 사용하려면 overriding해서 가져와서 사용해야 함.
    //p1을 복제한게 아님.
//    Person p2 = p1;
//    System.out.println(p2.age);

    Person p1 = new Person(20, "홍길동");
    Person p2 = new Person(20, "홍길동");
    Person p3 = new Person(20,"고길동");
    Person p4 = new Person(22,"고길동");
    System.out.println(p1 == p2); // 2개의 주소가 다르기 때문에, false임

    System.out.println(p1.equals(p2));  // true가 출력되어야 하는데? --> 위에 equals 메서드
    System.out.println(p1.equals(p3));
    System.out.println(p1.equals(p4));

    System.out.println(p1.hashCode());
    System.out.println(p2.hashCode());
    System.out.println(p3.hashCode());
    System.out.println(p4.hashCode());

    //toString 메서드 생성을 안하면, 주소가 출력이 됨.
    System.out.println(p1.toString()); // 이름: 홍길동, 나이: 20

    //toString호출하지 않아도 p2.toString()과 같은 값 출력함
    System.out.println(p2);

    Person p5 = (Person)p1.clone();
    System.out.println(p5);


  }
}
