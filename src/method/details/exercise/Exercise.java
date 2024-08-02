package method.details.exercise;

public class Exercise {
    public static void main(String[] args) {
        AA aa = new AA();
        aa.evenOrOdd(5);
        System.out.println(aa.isOdd(6));

        System.out.println(aa.isOddOrOdd(10));

        System.out.println("===================================");
        aa.printChar(6,6,'#');
    }

}
class  AA{
    public void evenOrOdd(int n) {
        if(n%2==0){
            System.out.println("even");
        }else {
            System.out.println("odd");
        }
    }

    public boolean isOdd(int n) {
        if(n%2 != 0){
            return true;
        }else {
            return false;
        }
        //return n%2 !=0 ? true : false;
        //return n%2 != 0;
    }
    public boolean isOddOrOdd(int n) {
        return n%2 != 0;
    }

    public void printChar(int row, int col,char a){
        for(int i = 0; i < row; i++){
            for (int j = 0; j < col; j++) {
                System.out.print(a);
            }
            System.out.println();
        }
    }

        }