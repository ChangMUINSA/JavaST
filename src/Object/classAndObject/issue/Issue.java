package Object.issue;

public class Issue {
    public static void main(String[] args) {
        //单独变量来解决  => 不利于数据的管理，效率低下（把一只猫的信息拆解了）
        //第一只猫信息如下
        String cat2Name = "小花";
        int cat1Age = 8;
        String cat1Color = "白色";

        //第二只猫信息如下
        String cat1Name = "小白";
        int cat2Age = 2;
        String cat2Color = "黑色";

        //数组 ===> 1.数据类型体现不出来
        // 2.只能通过【下标】获取信息，造成名字和内容对应关系不明确
        //3.不能体现猫的行为
        String[] cat1 = {"小花","3","白色"};
        String[] cat2 = {"小白","2","黑色"};

        //使用OOP面向对象解决
        //实例化一只猫
        //catOne是一个对象
        Cat catOne = new Cat();
        catOne.name = "大华";
        catOne.age = 9;
        catOne.color = "花色";
        //catRwo是一个对象
        Cat catTwo = new Cat();
        catTwo.name = "大摩奥";
        catTwo.age = 5;
        catTwo.color = "蓝丝绒";

        //如何访问对象的属性
        System.out.println("第一只猫信息："+catOne.name
                +" "+catOne.age+" "+catOne.color);
        System.out.println("第二只猫信息："+catTwo.name
                +" "+catTwo.age+" "+catTwo.color);
    }
}

//使用面向对象的方式来解决 养猫问题

//定义一个猫类 Cat -> 自定义一个数据类型
class Cat{
    //属性
    String name;
    int age;
    String color;

    //行为

}
