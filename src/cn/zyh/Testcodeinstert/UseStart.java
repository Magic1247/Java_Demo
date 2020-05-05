package cn.zyh.Testcodeinstert;

public class UseStart {
    public static void main(String[] args) {
        Star st = new Star();
        st.setAge(18);
        st.setName("古力娜扎");
        System.out.println("姓名"+st.getName()+"年龄"+st.getAge());
        Star st2 = new Star("迪丽热巴",18);
        System.out.println("姓名"+st2.getName()+"年龄"+st2.getAge());
    }

}
