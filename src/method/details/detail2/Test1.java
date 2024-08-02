package method.details.detail2;

public class Test1 {
    public static void main(String[] args) {
        AA a = new AA();
        byte b1 = 1;
        byte b2 = 2;
        a.getSumAndSub(b1,b2);// byte -> int
        //a.getSumAndSub(1.1,1.8);//报错 double ->int

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