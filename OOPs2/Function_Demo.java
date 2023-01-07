package OOPs2;

public class Function_Demo {

	public static void main(String[] args) {
		Integer[] arr = {10,20,30,40,50};
		display(arr);
		String[] arr1 = {"Ram","Raj","Riya"};
		display(arr1);
	}
	
	// this function is generic...
	public static <T> void display(T[] arr) {
		for(int i = 0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	 

}
