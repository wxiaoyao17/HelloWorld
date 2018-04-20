package basis;

public class array_2_init {
    public static void main(String[] args) {
        int[] a = new int[5];   // 分配了长度为5的数组，但是没有赋值

        // 1. 如果不赋值，就会使用默认值
        // int类型的数组，默认值是0
        //System.out.println(a[0]);

        // 2. 分配空间，同时赋值
        // 写法1： 分配空间同时赋值
        int[] a1 = new int[]{100, 102, 444, 836, 3236};

        // 写法2： 省略了new int[]，效果一样
        int[] b = {100, 102, 444, 836, 3236};

        // 写法3： 同时分配空间，和指定内容
        // 在这个例子里，长度是3，内容是5个，产生矛盾了
        // 所以如果指定了数组的内容，就不能同时设置数组的长度
//        int[] c = new int[3]{100, 102, 444, 836, 3236};


        // ex1: 数组反转
        // 首先创建一个长度是5的数组,并填充随机数
        // 使用for循环或者while循环，对这个数组实现反转效果
        int[] array = new int[5];
        for (int i = 0; i < 5; i++) {
            array[i] = (int) (Math.random() * 100);
            System.out.println(array[i]);
        }

        System.out.println("reverse the array!");
        int[] array_verse = new int[5];
        for (int i = 0; i < 5; i++) {
            array_verse[i] = array[4 - i];
            System.out.println(array_verse[i]);
        }

    }
}
