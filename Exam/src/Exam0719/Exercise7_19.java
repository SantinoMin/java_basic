//package Exam.src.Exam0719;
//
//// buyer 상품 - 돈, 카트 가지고 있음 -> 마지막에 계산
////카트에 넣으면서 잔액 확인 함.
//
////잔액이 부족하여 Computer을/를 살수 없습니다.
////구입한 물건:Tv,Computer,Tv,Audio,Computer,Computer, 사용한 금액:850
////남은 금액:150
//
//class Buyer {
//
//  int money = 1000;
//  Product[] cart = new Product[3];
//  // 구입한 제품을 저장하기 위한 배열 int i = 0;
//  // Product배열 cart에 사용될 index
//
//  int i;
//
//
//  void buy(Product p) {
//
//    //1. 가진 돈이 잔액보다 적은 경우
//    if (money < p.price) {
//      System.out.println("금액이 부족하여" + p.toString() + "을/를 살 수 없습니다.");
//      return;
//    }
//
//    //2. 가진 돈이 충분하면, 제품의 가격을 돈에서 빼고
//    money -= p.price;
//
//    //3. 장바구니에 구입한 물건을 담는다.(add메서드 호출)
//    add(p);
//
//  }
//
//  void add(Product p) {
///*
//(2) 아래의 로직에 맞게 코드를 작성하시오.
//1.1 i의 값이 장바구니의 크기보다 같거나 크면
//1.1.1 기존의 장바구니보다 2배 큰 새로운 배열을 생성한다.
//1.1.2 기존의 장바구니의 내용을 새로운 배열에 복사한다.
//1.1.3 새로운 장바구니와 기존의 장바구니를 바꾼다.
//*/
//    if (i >= cart.length) {
//      Product[] tcart = new Product[cart.length * 2];
//      System.arraycopy(cart, 0, tcart, 0, cart.length);
//      cart = tcart;
//    }
///*
//1.2 물건을 장바구니(cart)에 저장한다. 그리고 i의 값을 1 증가시킨다. */
//    cart[i++] = p;
//
//  }
//
//  void summary() {
//
//    int tot = 0;
//    /*
//    (3) 아래의 로직에 맞게 코드를 작성하시오.
//      1.1 장바구니에 담긴 물건들의 목록을 만들어 출력한다.
//      */
//    for (int k = 0; k < i; k++) {
//      tot += cart[i].price;
//      System.out.println(cart[k].toString() + ",");
//    }
//
////  1.2 장바구니에 담긴 물건들의 가격을 모두 더해서 출력한다. 1.3 물건을 사고 남은 금액(money)를 출력한다.
//
//    System.out.println("사용한 금액:" + tot);
//
////   1.3 물건을 사고 남은 금액(money)를 출력한다.
//    System.out.println("남은 금액:" + money);
//  } // summary() }
//
//  class Product {
//
//    int price;
//  }
//}
////(2) 아래의 로직에 맞게 코드를 작성하시오.
////1.1 i의 값이 장바구니의 크기보다 같거나 크면
////1.1.1 기존의 장바구니보다 2배 큰 새로운 배열을 생성한다.
////1.1.2 기존의 장바구니의 내용을 새로운 배열에 복사한다.
//// 1.1.3 새로운 장바구니와 기존의 장바구니를 바꾼다.
////    (3) 아래의 로직에 맞게 코드를 작성하시오.
////1.1 장바구니에 담긴 물건들의 목록을 만들어 출력한다.
////1.2 장바구니에 담긴 물건들의 가격을 모두 더해서 출력한다.
//// 1.3 물건을 사고 남은 금액(money)를 출력한다.
//// 제품의 가격 this.price = price;
//
//Product(int price) {
//  class Tv extends Product {
//
//    Tv() {
//      super(100);
//    }
//
//    public String toString() {
//      return "Tv";
//    }
//  }
//
//  class Computer extends Product {
//
//    Computer() {
//      super(200);
//    }
//
//    public String toString() {
//      return "Computer";
//    }
//  }
//
//  class Audio extends Product {
//
//    Audio() {
//      super(50);
//    }
//
//    public String toString() {
//      return "Audio";
//    }
//  }
//
//  class Exercise7_19 {
//
//    public static void main(String args[]) {
//      Buyer b = new Buyer();
//      b.buy(new Tv());
//      b.buy(new Computer());
//      b.buy(new Tv());
//      b.buy(new Audio());
//      b.buy(new Computer());
//      b.buy(new Computer());
//      b.buy(new Computer());
//      b.summary();
//    }
//  }
//}
//
//;
//