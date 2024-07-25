package Exam.src;

import java.util.Comparator;
import java.util.TreeSet;

class EmpCompare implements Comparator<Employee> {

  @Override
  public int compare(Employee o1, Employee o2) {
    return o1.getPay() - o2.getPay();
  }
}

public class TreeSetTest {
  public static void main(String[] args) {
    TreeSet<Person> ts = new TreeSet<>();
    ts.add(new Person(20, "홍길동"));
    ts.add(new Person(10, "김길동"));
    ts.add(new Person(50, "차길동"));
    ts.add(new Person(40, "장길동"));
    ts.add(new Person(30, "하길동"));

    System.out.println(ts);

    TreeSet<Employee> ets = new TreeSet<>(new EmpCompare());
    ets.add(new Employee("강길동", 100000));
    ets.add(new Employee("강길동", 200000));
    ets.add(new Employee("강길동", 100000));
    ets.add(new Employee("고길동", 500000));

  }
}
