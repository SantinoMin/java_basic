//package Exam.src;
//
//class Derived2 extends Base {
//
//}
//
//
//public class PolinopTest2 {
//
////  up-catsing이 없다면 배열이 2개가 필요
//  static Base[] baseList = new Base[100];
//  static int baseCnt;
////
////  static Derived[] derivedList = new Derived[100];
//  static int derivedCnt;
//
////  static Derived2[] derived2List = new Derived[100];
//  static int derive2cnt;
//
//  static void addBase(Base base) {
//    baseList[baseCnt++] = base;
//  };
//
////  static void addDerived(Derived derived) {
////    derivedList[derivedCnt++] = derived;
////  }
//
//  static void callAllMethod() {
//    for(int i = 0; i<baseCnt; i++){
//      baseList[i].baseMethod();
//    }
//  }
//
//
//  public static void main(String[] args) {
//
//    addBase(new Base());
//    addBase(new Derived());
//    addBase(new Derived2());
//    addBase(new Base());
//
//    callAllMethod();
//
//
//
//    Base base1 = new Base();
//    Derived der1 = new Derived();
//    Derived der2 = new Derived();
//    Base base2 = new Base();
//
//    Base base = new Derived();
//    Base[] blist = new Base[5];
//    blist[0] = new Derived();
//    blist[1] = new Derived();
//    blist[2] = new Derived();
//
//  }
//
//}
