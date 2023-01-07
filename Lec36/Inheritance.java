package Lec36;

public class Inheritance {

	public static void main(String[] args) {
		
//		P obj = new P();
//		
//		System.out.println(obj.d);
//		System.out.println(obj.d1);
	 
		System.out.println("Reference variable is of P, but instance is of C.");
		P obj1 = new C();
		System.out.println("d: "+obj1.d);
		System.out.println("d1: "+obj1.d1);
		
//		C obj2 = new P();
//		System.out.println(obj2.d);
//		System.out.println(obj2.d1);
//		System.out.println(obj2.d2);
		System.out.println("Reference variable is of C and instance is also of C");
		
		C obj3 = new C();
		System.out.println("d: "+obj3.d);
		System.out.println("d1: "+obj3.d1);
		System.out.println("d2: "+obj3.d2);
		
		
		
		
		
		
	}

}
