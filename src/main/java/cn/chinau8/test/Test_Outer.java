package cn.chinau8.test;

/**
 * @Author:zxf
 * @Description
 * @Date: 2020/04/28 10:17
 */
public class Test_Outer {
    public static void main(String[] args) {
        /*Outer.Inner oi = new Outer().new Inner();
        oi.show();*/
        Outer o = new Outer();
        o.print();
        Human human = new Man();
        ((Man)human).run(1);

    }
}
class Outer{
    public int num = 10;

    class Inner {
        public int num = 20;
        public void show() {
            int num = 30;

            System.out.println(num);//30
            System.out.println(this.num);//20
            System.out.println(Outer.this.num);//10
        }
    }

    public void print(){
        Inner i = new Inner();
        i.show();
    }

}

class Human{
    void run(){
    System.out.println("人在跑");
    }
}
class Man extends Human{
    void run(int i){
        System.out.println("男人再跑");
    }

    void eat(){
        System.out.println("男人在吃");
    }
}

