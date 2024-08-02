package method.details.detail3;


public interface Test1 {
    public static void main(String[] args) {
      A a = new A();
      a.sayOk();
        System.out.println("===================================================");
      a.m1();

    }
}
class A {
    public void print(int n){
        System.out.println("print 方法被调用 n= "+n);
    }
    public void sayOk(){ //sayOk调用Print
        //同一个类中的方法调用：直接调用即可.
        print(10);
        System.out.println("继续执行sayOk");
    }

    public void m1(){
        //跨类中的方法A类调用B类方法： 需要通过对象名调用. 比如 对象名.方法名（参数）；
        System.out.println("m1方法被调用");
        //首先创建一个B的对象,然后再调用方法即可
        B b = new B();
        b.hi();
        System.out.println("m1方法继续执行");
    }
}
class B{
    public void hi(){
        System.out.println("B类中的hi（）方法被执行");
    }
}