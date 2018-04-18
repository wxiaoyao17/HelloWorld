public class array {
    public static void main(String[] args) {
//        // 声明一个数组，但是并不会创建数组
//        int[] a;    // int a[]; 是等价的
//        // 创建一个长度是5的数组，并且使用引用a指向该数组
//        a = new int[5];
//
//        // 声明的同时，指向一个数组
//        int[] b = new int[5];
//
//        for (int i = 0; i < 5; i++) {
//            a[i] = i+1;
//            System.out.println(a[i]);
//        }

//        a[5] = 100; // 数组下标越界

        // ex1: 数组的最小值
        // 首先创建一个长度是5的数组
        //然后给数组的每一位赋予随机整数
        //通过for循环，遍历数组，找出最小的一个值出来
        //
        //0-100的 随机整数的获取办法有多种，下面是参考办法之一:
        //
        //(int) (Math.random() * 100)
        //
        //
        //Math.random() 会得到一个0-1之间的随机浮点数，然后乘以100，并强转为整型即可。

        int[] a = new int[5];
        for (int i = 0; i < 5; i++) {
            a[i] = (int) (Math.random() * 100);
        }

        System.out.println("数组中各个随机数是：");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

        int min = 100;
        System.out.println("数组中最小值是：");
        for (int i = 0; i < a.length; i++) {
            if (a[i]<a[i+1]) {
                min = a[i];
            }
            System.out.println(min);
        }

    }
}
