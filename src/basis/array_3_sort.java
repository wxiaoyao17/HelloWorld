package basis;

import java.util.Arrays;

public class array_3_sort {
    public void select_sort(){
        System.out.println("select_sort");
        int[] a = new int[]{18, 62, 68, 82, 65, 9};

        // 调用现有方法来排序
//        Arrays.sort(a);
//        System.out.println(Arrays.toString(a));

        // 打印数组
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

        // 分析，分解步骤
        // 先排第一个最小的数
//        for (int i = 1; i < a.length; i++) {
//            if (a[i]<a[0]){
//                int temp = a[i];
//                a[i] = a[0];
//                a[0] = temp;
//            }
//        }
//
//        // 排第二小的数
//        for (int i = 2; i < a.length; i++) {
//            if (a[i] < a[1]) {
//                int temp = a[i];
//                a[i] = a[1];
//                a[1] = temp;
//            }
//        }

        // 分析规律，可以使用循环嵌套来实现
        for (int i = 0; i < a.length-1; i++) {
            for (int j = i+1; j < a.length; j++) {
                if (a[j]<a[i]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }

        System.out.println("result of sort:");
        // 打印数组
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    public void bubble_sort(){
        System.out.println("bubble_sort");
    }

    public static void main(String[] args) {
        // 实例化
        array_3_sort h = new array_3_sort();
        h.select_sort();
        //h.bubble_sort();
    }
}
