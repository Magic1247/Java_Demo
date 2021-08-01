package cn.start.StudyDemo;

public class Plus{
	public static void main (String[] args){
		int a,b;
		a=1;
		b=1;
		String str = "����ǣ�";
		System.out.println(str + ++a);
		System.out.println(str + a++);
		System.out.println(str + a);
		System.out.println(str + b--);
		System.out.println(str + b);
		System.out.println(str + --b);
		if (b != 0){
			System.out.println("=========================");
			System.out.println(str + b);
			b += 10;
			System.out.println(str + b);
			b -= 1;
			System.out.println(str + b);
			
		
		}

	}
}