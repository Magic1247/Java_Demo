package cn.zyh.TestinterFace;

public interface MyinterFaceA{
    public abstract void methoda();
    public default void methodDefault(){
        System.out.println("接口的默认方法！！！");
    }
}
