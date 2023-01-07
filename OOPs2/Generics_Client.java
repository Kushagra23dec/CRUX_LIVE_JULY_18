package OOPs2;

public class Generics_Client {

	public static void main(String[] args) {
		Genrics_Demo<String,Integer> g = new Genrics_Demo();
		g.x = "Kushagra";
		g.z = 22;
		
		System.out.println(g.x+" "+g.z);
		
	}

}
