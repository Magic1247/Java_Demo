package cn.zyh.StudyDome;

public class TestA{
	public static void main(String[] args){
	int y = 0;
	for(int i = 1; i<=100; i++){
		if(i%2 == 0){
			y += i;
			
		}
	}
	System.out.println("100内偶数和"+ y);
	}
}