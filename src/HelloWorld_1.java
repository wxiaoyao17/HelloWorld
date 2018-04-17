public class HelloWorld {
    static int i = 1;  // 字段、属性、成员变量、Field，作用域为整个类
    int j = i;  // 其他的成员变量也可以访问i

    public void method1(){
        System.out.println(i);  //方法里也可以访问i
    }
    public void method2(){
        System.out.println(j);
    }
    public void method3(int k){
        System.out.println(k);
    }
    public void method4(){
        int i = 5;  // 局部变量
        System.out.println(i);
        {   // 子块
            System.out.println(i);
            int j = 6; // 作用域为子块内
            System.out.println(j);
        }
        System.out.println(j);  // 不能访问j
    }
    public static void main(String[] args){
        System.out.println("Hello World!");
        new HelloWorld().method3(1); // ? 一定要是静态才可以访问吗
        // 实例化方法
        HelloWorld h = new HelloWorld();
        h.method3(4);
    }
}
