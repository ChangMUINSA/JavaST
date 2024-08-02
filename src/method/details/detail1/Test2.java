package method.details.detail1;
//如果方法要求有返回数据类型，则方法体中最后的执行语句必须为 return值；而且要求返回值的类型必须和return值类型一致或兼容
public class Test2 {
    public static void main(String[] args) {

    }
    public double f1(){
        double d1 = 1.1 * 3;
        int n = 100;
        return n; //int -> double 兼容
        //return d1;//不行  public int f1()
    }
}
