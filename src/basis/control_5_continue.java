package basis;

public class control_5_continue {
    public static void main(String[] args) {
        // 如果是双数，后面的代码不执行，直接进入下一次循环
//        for (int i = 0; i < 10; i++) {
//            if(i%2 == 0){
//                continue;
//            }
//            System.out.println(i);
//        }

        // 打印 1-100之前的数，如果这个数，要么是3，要么5的倍数，就忽略掉
        for (int j = 1; j < 100; j++) {
            if ((j % 3 == 0) || (j % 5 == 0)) {
                continue;
            }
            System.out.println(j);
        }
    }
}
