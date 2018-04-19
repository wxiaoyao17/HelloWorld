public class control_4_for {
    public static void main(String[] args){
        // 打印0~4
//        for (int i = 0; i < 5; i++) {
//            System.out.println(i);
//        }

        //天朝有一个乞丐姓洪，去天桥要钱
        //第一天要了1块钱
        //第二天要了2块钱
        //第三天要了4块钱
        //第四天要了8块钱
        //以此类推
        //
        //问题： 洪乞丐干10天，收入是多少？
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += 1<<(i-1);
        }
        System.out.println(sum);
    }
}
