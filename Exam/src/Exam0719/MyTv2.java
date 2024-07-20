//package Exam.src.Exam0719;
//
////MyTv2클래스의 멤버변수 isPowerOn, channel, volume을 클래스 외부에서 접근할 수 없도록
//// 제어자를 붙이고 대신 이 멤버변수들의
//// 값을 어디서나 읽고 변경할 수 있도록 getter와 setter메서드를 추가하라.
//class MyTv2 {
//
//  //처음에는 null이나 0이 들어가 있음
//  private boolean isPowerOn;
//  private int channel;
//  private int volume;
//
//  private int preChannel;
//
//  final int MAX_VOLUME = 100;
//  final int MIN_VOLUME = 0;
//  final int MAX_CHANNEL = 100;
//  final int MIN_CHANNEL = 1;
//
////  public void setChannel(this channel, int channel) { // 원래 this chanell 이런식으로 되어있음.
//
//  //체널을 이동할 때 마다 이전체널을 저장하는 것 필요.
//
//  //set,get 사용되는 순서 다시 이해 해보기.
//  public void setChannel(int channel) {
//    this.channel = channel;
//  }
//
//  public int getChannel() {
//    return channel;
//  }
//
//  public void setVolume(int volume) {
//  }
//
//  public int getVolume() {
//    return volume;
//  }
//
//  // ?? 잘 모르겠는데
//  //매개변수를 안 받고 값만 업데이트 해주는듯?
//  public void setChannel() {
//    this.tempChannel = this.channel;
//    this.channel = this.preChannel;
//    this.preChannel = this.tempChannel;
//  }
//
//  public void gotoPrevChannel() {
//
//  }
//
//
//};
