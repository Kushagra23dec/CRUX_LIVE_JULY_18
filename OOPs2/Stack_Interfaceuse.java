package OOPs2;

public class Stack_Interfaceuse implements StackI{

	@Override
	public void display() {
		// TODO Auto-generated method stub
		
		System.out.println("Display says hi!!");
		
	}
	
	@Override
	public void Sayhey() {
		System.out.println("Say hey from override method");
	}

	@Override
	public boolean isFull() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void fun() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void push() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int pop() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	

}
