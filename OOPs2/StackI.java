package OOPs2;

public interface StackI extends DSAI,DynamicStackI {

	// by default methods in interface are public and abstract.
	public void push(); // by default it is public and abstract...
	public int pop();  // by default it is public and abstract...
	
	public int size();
	
	int val=8; // by default public static final
//	int v; // is wrong beacuse it is public static and final(final means constant, that's why it should be initialised, we cant left it empty.)
	// static means this variable can be accessed with the name of class.
	
	
	// after java 8, it is allowed to give body in interface.
	// default is mandatory, inorder to give body.. 
	// default can be accessed in the same package only.
	// default and public static body are allowed, in interface.
	default void Sayhey() {
	 System.out.println("Hello from sayHey");
	}
	public static void Sayhey1() {
		System.out.println("Hey");
	}
	
	private int fun1() {
		
		return 8;
	}


}
