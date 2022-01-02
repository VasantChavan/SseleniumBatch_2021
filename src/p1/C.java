package p1;

public class C {

	static {
		System.out.println("class-C static block");
	}
	public static void main(String[] args) {

		try {
			Class.forName("p1.A");
			Class.forName("p1.B");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}

}
