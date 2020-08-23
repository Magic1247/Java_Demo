package cn.zyh.StudyDemo;

public class DemoHours {
    public static void main(String[] args) {
        for (int hour = 0; hour < 24; hour++) {
            for (int minute = 0; minute < 60; minute++) {
                for(int s = 0; s<60; s++){
                    System.out.println(hour + "c" + minute + "m"+s+"s");
                }
            }
        }
    }
}
