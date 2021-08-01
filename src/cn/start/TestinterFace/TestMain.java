package cn.start.TestinterFace;

public class TestMain {
    public static void main(String[] args) {
        MyinterFaceimpl my = new MyinterFaceimpl();
        my.methoda();
        my.methodDefault();
        System.out.println("================");
        MyinterFaceimpl2 my2 = new MyinterFaceimpl2();
        my2.methoda();
        my2.methodDefault();
    }
}
