package cn.start.StudyDemo;

public class DemoIfElseExt {
	public static void main(String[] args){
		ext();
	}
	public static void ext(){
	int x = -10;
	int y;
	if (x >= 3){
		y = 2 * x + 1;
	}
	else if (-1 < x && x < 3){
		y = 2 * x - 1;
	}
	else{
		y = 2 * x - 1;

	System.out.println( y);
	}
}
}