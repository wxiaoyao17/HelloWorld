package basis;

public class begin_3_final {
    public void method1(){
        final int i = 5;    // 只有一次赋值机会
        // i = 10;
    }

    public void method2(final int j){   // 不可以修饰形参，否则无法设置形参
//        j = 5;
    }

    public static void main(String[] args){
    }
}
