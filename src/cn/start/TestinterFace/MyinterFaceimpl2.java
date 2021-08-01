package cn.start.TestinterFace;

public class MyinterFaceimpl2 implements MyinterFaceA{
    @Override
    public void methoda() {
        System.out.println("实现方法B");
    }

    @Override
    public void methodDefault() {
        System.out.println("覆盖重写接口默认方法");
    }
}
