package Object.classAndObject.memory;

public class Mechanism {
    /**
     * 对象分配机制
     */


    public static void main(String[] args) {
        Person p1 = new Person();
        p1.age = 10;
        p1.name = "小明";
        //核心：引用传递传递的是地址
        Person p2 = p1;//把p1赋给了p2，让p2指向p1
        System.out.println(p2.age);



        p1.age = 60;
        //p2.age = 200;*

        p2 = null;
        System.out.println(p2.age);

    }

}
class Person{
    //四个属性
    int age;
    String name;
    double sal;
    boolean isPasse;
}