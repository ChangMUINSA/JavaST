package method.details.detail1;
//一个方法最多有一个返回值(返回多个结果则需要返回数组)
public class Test {
    public static void main(String[] args) {
        AA a = new AA();
        int[] res = a.getSumAndSub(5,6);
        System.out.println("sum =" + res[0]);
        System.out.println("sub =" + res[1]);
    }
}
class AA {
    public int[] getSumAndSub(int n1, int n2){
        int[] resArr = new int[2];
        resArr[0] = n1 + n2;
        resArr[1] = n1 - n2;

        return resArr;
    }
}
