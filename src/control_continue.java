public class control_continue {
    public static void main(String[] args) {
        // 如果是双数，后面的代码不执行，直接进入下一次循环
        for (int i = 0; i < 10; i++) {
            if(i%2 == 0){
                continue;
            }
            System.out.println(i);
        }
    }
}
