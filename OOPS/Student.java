package OOPS;

public class Student {
	private String name;
	private int age;
	private char gender;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		try {
			if (age <= 0) {
				throw new Exception("Age cannot be negative");
			}
			this.age = age;
		} catch (Exception e) {

			e.printStackTrace();

		}

	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public void DisplayAll() {
		System.out.println("Name: " + this.name + "\n" + "Age: " + this.age + "\n" + "Gender: " + this.gender);
	}

}
