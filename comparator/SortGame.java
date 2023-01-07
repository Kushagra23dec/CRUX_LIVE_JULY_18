package comparator;

import java.util.*;
public class SortGame {
	String name;
	int salary;
	public SortGame(String name, int salary){
		this.name = name;
		this.salary = salary;
	}

	 @Override
	 public String toString() {
		 return "nu";
	 }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int n = sc.nextInt();
		SortGame[] emp = new SortGame[n];
		
		for(int i = 0; i<n; i++){
			String name = sc.next();
			int salary = sc.nextInt();
			emp[i] = new SortGame(name,salary);
		}

//		Arrays.sort(emp, new Comparator<SortGame>(){
//			@Override
//			public int compare(SortGame o1, SortGame o2){
//				if(o1.salary == o2.salary){
//					return o1.name.compareTo(o2.name);
//				}else{
//					return o2.salary-o1.salary;
//				}
//			}
//		});

		for(int i = 0; i<n; i++){
			if(emp[i].salary > x){
				System.out.println(emp);
			}
		}
    }
}
