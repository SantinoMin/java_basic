package Exam.src.LinkedList;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Vector;

public class LinkedListTest1 {

  public static void main(String[] args) {
    LinkedList<Integer> list = new LinkedList<>();

    list.add(1);
    System.out.println(list);

    list.add(20);
    list.add(30);

    System.out.println(list);

    list.addLast(50);
    System.out.println(list);

    System.out.println((list.indexOf(20)));

    System.out.println(list.get(3));

    list.add(2,60);
    System.out.println(list);

    ArrayList<Integer> list2 = new ArrayList<>();

    Vector<Integer> v = new Vector<>();
    v.add(100);
    v.add(200);
    v.add(300);

    Enumeration<Integer> e =  v.elements();

    while(e.hasMoreElements()){
      System.out.println(e.nextElement());
    }
  }
}