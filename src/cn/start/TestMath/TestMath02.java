package cn.start.TestMath;
/*
计算-10.8到5.9之间，绝对值大于6或者小于2.1的整数有多少个
 */
public class TestMath02 {
    public static void main(String[] args) {
        int countresult = 0;
        for (int i = (int) -10.8; i < 5.9; i++){
            System.out.println(Math.abs(i));
            if(Math.abs(i)>6 || Math.abs(i)<2.1){
                countresult++;
            }
        }
        System.out.println("-10.8到5.9之间绝对值大于6的整数有"+countresult+"个");
    }
}
