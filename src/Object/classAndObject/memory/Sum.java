package Object.classAndObject.memory;

public class Sum {
    /**
     * Java 内存的结构分析
     *
     * 桟：一般存放基本数据类型（局部变量）
     * 堆：存放对象（Cat cat,数组等）
     * 方法区：常量池（常量，比如字符串），类加载信息
     */
    public static void main(String[] args) {
        People p = new People();
        p.name = "jack";
        p.age = 10;
        //先加载People类信息（属性和方法信息只会加载一次）
        //在堆中分配空间，进行默认初始化,把地址赋值给p，p就指向了堆中的对象
        //进行指定初始化 p.name = "jack";  p.age = 10;
    }

}
class People{
    //四个属性
    int age;
    String name;
    double sal;
    boolean isPasse;
}
