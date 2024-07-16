package Exam.src.chapter06;

public class Student {

  String name;
  int ban;
  int no;
  int kor;
  int eng;
  int math;

  int getTotal() {
    return kor + eng + math;
  }

  float getAverage() {
    float avg = getTotal() / 3f;
    return Math.round(avg * 10) / 10f;
  }

  public Student(String name, int ban, int no, int kor, int eng, int math){

  }

  String info() {
    return String.format("%s,%d,%d,%d,%d,%d,%d,%.1f", name,ban,no,kor,eng,math);

  }
};