//package Exam.src.Sutda;
//
//
//public class SutdaDeck {
//
//  final int CARD_NUM = 20;
//  SutdaCard[] cards = new SutdaCard[CARD_NUM];
//
//  SutdaDeck() {
//    for (int i = 0; i < CARD_NUM / 2; i++) {
//      cards[i].num = i+1;
//      if(i==0) || i==2 || i==7){
//  cards[i].isKwang = true;
//
////    1. 메서드명 : shuffle
////    기 능 : 배열 cards에 담긴 카드의 위치를 뒤섞는다.(Math.random()사용) 반환타입 : 없음
////    매개변수 : 없음
////    2. 메서드명 : pick
////    기 능 : 배열 cards에서 지정된 위치의 SutdaCard를 반환한다. 반환타입 : SutdaCard
////    매개변수 : int index - 위치
////    3. 메서드명 : pick
////    기 능 : 배열 cards에서 임의의 위치의 SutdaCard를 반환한다.(Math.random()사용) 반환타입 : SutdaCard
////    매개변수 : 없음
//  }
//
//  void shuffle() {
//
//    for (int i = 0; i < 100; i++) {
//      int rand1 = (int) (Math.random() * 20);
//      int rand2 = (int) (Math.random() * 20);
//      SutdaCard temp = cards[rand1];
//      cards[rand1] = cards[rand2];
//      cards[rand2] = temp;
//    }
//  }
//
//  SutdaCard pick(int idx) {
//    return cards[idx];
//  }
//
//  SutdaCard pick(){
//    return cards[(int)(Math.random())];
//  };
//
//};