package basis;

import java.util.Arrays;

public class array_3_sort {
    // 选择法排序，从小到大
    public void select_sort() {
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
        // 选择法排序的思路：
        //把第一位和其他所有的进行比较，只要比第一位小的，就换到第一个位置来
        //比较完后，第一位就是最小的
        //然后再从第二位和剩余的其他所有进行比较，只要比第二位小，就换到第二个位置来
        //比较完后，第二位就是第二小的
        //以此类推

        // 第一步：将最小的数放在数组第一个
//        for (int i = 1; i < a.length; i++) {
//            if (a[i] < a[0]) {
//                int temp = a[i];
//                a[i] = a[0];
//                a[0] = temp;
//            }
//        }
//
//        // 第二步：将第二小的数排在数组第二个
//        for (int i = 2; i < a.length; i++) {
//            if (a[i] < a[1]) {
//                int temp = a[i];
//                a[i] = a[1];
//                a[1] = temp;
//            }
//        }

        // 分析规律，可以使用循环嵌套来实现
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[i]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }

        System.out.println("result of sort:");
        // 检查排序结果，打印数组
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }


    public void bubble_sort() {
        // 冒泡法排序，从小到大
        System.out.println("bubble_sort");
        // 冒泡法排序的思路：
        //第一步：从第一位开始，把相邻两位进行比较
        //如果发现前面的比后面的大，就把大的数据交换在后面，循环比较完毕后，最后一位就是最大的
        //第二步： 再来一次，只不过不用比较最后一位
        //以此类推

        int[] a = new int[]{18, 62, 68, 82, 65, 9};

        // 打印数组
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

        //第一步：从第一位开始，把相邻两位进行比较，较大的数放后面，结果最大的数会到数组最后一个
//        for (int i = 0; i < a.length - 1; i++) {
//            if (a[i] > a[i + 1]) {
//                int temp = a[i];
//                a[i] = a[i + 1];
//                a[i + 1] = temp;
//            }
//        }
//
//        //第二步：从第一位到(n-1)位，仍然是相邻两个数进行比较，较大的数放后面，结果第二大的数会排到数组倒数第二个
//        for (int i = 0; i < a.length - 2; i++) {
//            if (a[i] > a[i + 1]) {
//                int temp = a[i];
//                a[i] = a[i + 1];
//                a[i + 1] = temp;
//            }
//        }

        //分析，用循环嵌套实现
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }

        // 检查排序结果
        System.out.println("result of sort:");
        // 打印数组
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    public void sort_ex() {
        // 首先创建一个长度是5的数组,并填充随机数。
        //首先用选择法正排序，然后再对其使用冒泡法倒排序
        //注 所谓的正排序就是从小到大排序，倒排序就是从大到小排序
        System.out.println("sort ex");
        int[] a = new int[5];

        //赋值随机数
        for (int i = 0; i < 5; i++) {
            a[i] = (int) (Math.random() * 100);
        }

        // 打印数组
        System.out.println(Arrays.toString(a));

        //选择法正排序
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i]>a[i+1]){

                }
            }
        }

        //冒泡法倒排序


    }

    public static void main(String[] args) {
        // 实例化
        array_3_sort h = new array_3_sort();
        // 调用方法
        //h.select_sort();
        //h.bubble_sort();
        h.sort_ex();
    }
}
