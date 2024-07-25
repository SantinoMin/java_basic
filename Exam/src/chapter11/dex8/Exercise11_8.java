//package Exam.src.chapter11.dex8;
//
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Iterator;
//import java.util.List;
//
//class Student implements Comparable<Student> {
//  String name;
//  int ban;
//  int no;
//  int kor;
//  int eng;
//  int math;
//  int total;    // 총점
//  int schoolRank; // 전교등수
//
//  Student(String name, int ban, int no, int kor, int eng, int math) {
//    this.name = name;
//    this.ban = ban;
//    this.no = no;
//    this.kor = kor;
//    this.eng = eng;
//    this.math = math;
//    total = kor + eng + math;
//  }
//
//  int getTotal() {
//    return total;
//  }
//
//  float getAverage() {
//    return (int) ((getTotal() / 3f) * 10 + 0.5) / 10f;
//  }
//
//  public String toString() {
//    return name
//        + "," + ban
//        + "," + no
//        + "," + kor
//        + "," + eng
//        + "," + math + "," + getTotal() + "," + getAverage() + "," + schoolRank;
//  }
//
//  @Override
//  public int compareTo(Student o) {
//    return o.getTotal() - getTotal(); // 총점 기준 내림차순 정렬
//  }
//}
//
//public class Exercise11_8 {
//
//  public static void calculateSchoolRank(List<Student> list) {
//    Collections.sort(list); // 먼저 list를 총점 기준 내림차순으로 정렬한다.
//    int prevRank = -1; // 이전 전교등수
//    int prevTotal = -1; // 이전 총점
//
//    for (int i = 0; i < list.size(); i++) {
//      Student s = list.get(i);
//      if (s.getTotal() == prevTotal) {
//        s.schoolRank = prevRank; // 이전 총점과 같으면 이전 등수 유지
//      } else {
//        s.schoolRank = i + 1; // 총점이 다르면 현재 순위가 등수
//      }
//      prevRank = s.schoolRank; // 현재 등수를 이전 등수로 저장
//      prevTotal = s.getTotal(); // 현재 총점을 이전 총점으로 저장
//    }
//  }
//
//  public static void main(String[] args) {
//    ArrayList<Student> list = new ArrayList<>();
//    list.add(new Student("이자바", 2, 1, 70, 90, 70));
//    list.add(new Student("안자바", 2, 2, 60, 100, 80));
//    list.add(new Student("홍길동", 1, 3, 100, 100, 100));
//    list.add(new Student("남궁성", 1, 1, 90, 70, 80));
//    list.add(new Student("김자바", 1, 2, 80, 80, 90));
//    calculateSchoolRank(list);
//    Iterator<Student> it = list.iterator();
//    while (it.hasNext()) {
//      System.out.println(it.next());
//    }
//  }
//}