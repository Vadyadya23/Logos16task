package Homework16_Advanced;

public class Student {
    private int id;
    private String name;
    private int age;
    
	public Student(int i, String string, int j) {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
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
		this.age = age;
	}
	
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
    
}

