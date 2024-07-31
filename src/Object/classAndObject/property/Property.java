package Object.classAndObject.property;

public class Property {
    /**
     * 成员变量 = 属性 = field
     *
     * 属性是类的一个组成部分，一般是基本数据类型，也可能是引用类型（对象，数组）
     */
    public static void main(String[] args) {
        //p1是对象名（对象引用）
        //new Person(); 创建的对象空间（数据）才是真正的对象
        Person p1 = new Person();
        //对象属性的默认值，遵循数组规则：
        //int 0;short 0; byte 0; long 0; float 0.0;double 0.0;char \u0000; boolean false;String null
        System.out.println("当前这个人的信息：");
        System.out.println("age:"+ p1.age+" name:"+ p1.name+" sal"+p1.sal+" isPasse:"+p1.isPasse);
    }
}
class Car{
    String name;//属性，成员变量，字段 field
    double price;
    String color;
    String[] master;//属性可以是基本数据类型，也可以是引用类型（对象，数组）
}
/**
 * 属性的定义语法同变量，示例：访问修饰符 属性类型 属性名；
 * 属性的类型可以是任意类型，包括基本数据类型和引用类型.
 * 属性如果不赋值会有默认值，规则和数组一样
 */
class Person{
    //四个属性
    int age;
    String name;
    double sal;
    boolean isPasse;
}
