package method.example;

public class example1 {
    public static void main(String[] args) {
        //方法使用
        //1.方法写好后，不去调用，不会输出语句
        //2.先创建一个对象，然后调用其方法

        Person person = new Person();
        person.speak();
        person.cal01();
        person.cal02(1000);
        person.cal02(100);

        int result = person.getSum(5,6);
        System.out.println("result="+result);
    }
}
class Person{
    String name;
    int age;

    //方法（成员方法）
    //public 表示方法公开
    // void表示没有返回值
    //speak 方法名 （）形参列表
    //{}方法体用来写要执行的代码
    public void speak(){
        System.out.println("我是一个好人");
    }
    public void cal01(){
        //循环完成
        int res = 0;
        for(int i = 1;i <= 1000; i++){
            res += i;
        }
        System.out.println("计算结果=" + res);
    }
    //(int n)形参列表
    public void cal02(int n){
        //循环完成
        int res = 0;
        for(int i = 1;i <= n; i++){
            res += i;
        }
        System.out.println("计算结果=" + res);
    }


    //方法是公开的
    //方法执行后返回一个int数据
    //return res;表示把 res的值返回

    public int getSum(int number1, int number2){
        int res = number1 + number2;
        return res;
    }
}