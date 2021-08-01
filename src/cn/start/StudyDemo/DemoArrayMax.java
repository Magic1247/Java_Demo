package cn.start.StudyDemo;

public class DemoArrayMax {
    public static void main(String[] args) {
        int[] player={10,400,600,100};
        int max = player[0];
        for (int i = 1; i < player.length; i++) {
            if(player[i]>max){
                max = player[i];
            }
        }
        System.out.println("玩家中战斗力最强的是"+max);
    }
}
