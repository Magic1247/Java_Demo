package cn.zyh.StudyDemo;

public class DemoArraymin {
    public static void main(String[] args) {
        int[] mintiest = {10,20,30,40,50,1};
        int min = mintiest[0];
        for (int i = 1; i < mintiest.length; i++) {
            if(mintiest[i]< min){
                min = mintiest[i];
            }
        }
        System.out.println("玩家中战斗力最蔡的是"+min);
    }
}
