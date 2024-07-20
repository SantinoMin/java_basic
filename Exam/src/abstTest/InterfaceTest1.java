package Exam.src.abstTest;

interface ITest{
  void ifunc();
}

class CTest{
  void cfunc(){}
}

class DTest extends CTest implements ITest{
  void dfunc(){}

  //ifunc는 왜 override 해야함?
  @Override
  public void ifunc() {}
}


public class InterfaceTest1 {

  public static void main(String[] args) {
    DTest obj1 = new DTest();
    obj1.cfunc();
    obj1.dfunc();
    obj1.ifunc();

    CTest obj2 = new DTest();
    obj2.cfunc();

    ITest obj3 = new DTest();
    obj3.ifunc();
  }

}
