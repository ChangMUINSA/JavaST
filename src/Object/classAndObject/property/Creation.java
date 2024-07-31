package Object.classAndObject.property;

public class Creation {
    /**
     * 创建对象的两种方式
     *
     */
    public static void main(String[] args) {
        //先声明，再创建
        Cat cat;//声明对象cat
        cat = new Cat();//创建

        //直接创建
        Cat cat1 = new Cat();

        /**
         * 如何访问属性
         * 对象名.属性名；
         */
        int age = cat.age;
    }


}
class Cat{
    //属性
    String name;
    int age;
    String color;

    //行为

}