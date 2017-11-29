package sample;

public class ParentClass {
	static int a=90;
	static int b=80;
	static int c;

	public static void add() {
		/*a = 90;
		b = 80;*/

		c = a + b;
		System.out.println("Addition of :"+c);
	}

	public static void main(String[] args) {

		add();
	}

}
