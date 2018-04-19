package basis;

public class control_8_ex {
    public static void main(String[] args) {
        // ex1: 黄金分割
        //寻找某两个数相除，其结果 离黄金分割点 0.618最近
        //
        //分母和分子不能同时为偶数
        //分母和分子 取值范围在[1-20]
//        float result;
//        float diff;
//        float absolute;
//        float compare = 20;
//
//        for (int i = 1; i < 20; i++) {
//            for (int j = 1; j < 20; j++) {
//                if (((0 == i%2) && (0 == j%2)) || (i>j))
//                    continue;
//                result = (float) i/j;
//                diff = result - 0.618F;
//                absolute = diff < 0 ? -diff : diff;
//                if (absolute < compare) {
//                    compare = absolute;
//                    System.out.println("i:" + i + ":" + "j:" + j);
//                    System.out.println(result);
//                }
//
//            }
//        }


        // ex2: 水仙花数
        // 水仙花数定义：
        //1. 一定是3位数
        //2. 每一位的立方，加起来恰好是这个数本身，比如153=1*1*1+5*5*5+3*3*3
        //
        //寻找所有的水仙花数
//        int hundred;
//        int ten;
//        int one;
//        for (int i = 100; i < 1000; i++) {
//            hundred = i/100;
//            ten = i%100/10;
//            one = i%10;
//            if (i == hundred*hundred*hundred + ten*ten*ten + one*one*one) {
//                System.out.println(i);
//                continue;
//            }
//        }


        // ex3: 小学算术题
        /**
         * 一个数字小迷阵,使用程序暴力破解求出ABCD各数的值
         *
         * | A  | + | B | = | 8 |
         * | +  |   | + |   |   |
         * | C  | - | D | = | 6 |
         * | =  |   | = |   |   |
         * | 14 |   | 10|   |   |
         *
         */

        for (int a = 0; a < 15; a++) {
            for (int b = 0; b < 15; b++) {
                for (int c = 0; c < 15; c++) {
                    for (int d = 0; d < 15; d++) {
                        if (((a+b)==8) && ((a+c)==14) &&((b+d)==10) && ((c-d)==6)) {
                            System.out.println(a);
                            System.out.println(b);
                            System.out.println(c);
                            System.out.println(d);
                        }
                    }

                }

            }
        }

    }
}
