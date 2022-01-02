package demo;

public class Test {
	int a;
	int b;
	
	public int add(int a, int b){
		this.a=a;
		this.b=b;
		return (a+b);
	}
	public static void main(String[] args) {
		
		Test t = new Test();
		int add = t.add(10,20);
		System.out.println(add);
		System.out.println(t.a+t.b);
		
	}
}
