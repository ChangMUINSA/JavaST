package method.example;

public class example02 {
    public static void main(String[] args) {
        int [][] map = {{0,0,1},{1,1,1,},{1,1,3}};

        //遍历map数组

        //传统的解决方法
        for(int i = 0; i < map.length; i++){
            for(int j=0; j<map[i].length; j++){
                System.out.print(map[i][j] + " ");
            }
            System.out.println(" ");
        }
        //要求再次遍历map数组
        //成员方法的好处
        //提高代码的复用性
        //可以将实现的细节封装起来，然后供其他用户调用即可

        MyTools myTools = new MyTools();
        myTools.printArr(map);
    }
}
//把输出的功能，写到一个类的方法中，然后调用该方法即可
class MyTools{
    //方法，接收一个二维数组

    public void printArr(int[][] map){
        System.out.println("=====================================");
        for(int i = 0; i < map.length; i++){
            for(int j = 0; j < map[i].length; j++){
                System.out.print(map[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}
