public class control_breakout {
    public static void main(String[] args) {
        // break只能结束当前循环，借助boolean结束外部循环
        boolean breakout = false; // 标记是否结束外部循环

        // j为双数时，跳出外部循环
//        for (int i = 0; i < 10; i++) {
//            for (int j = 1; j < 10; j++) {
//                System.out.println(i + ":" + j);
//                if (0 == j%2)
//                {
//                    breakout = true;
//                    break;
//                }
//            }
//            if (breakout) break; // 检查是否结束外部循环标志
//        }


        // 使用标签结束外部循环
        outloop:    // 标签名字随便定义
        for (int i = 0; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.println(i + ":" + j);
                if (0 == j%2)
                    break outloop;  // 如果是双数，就结束外部循环
            }

        }
    }
}
