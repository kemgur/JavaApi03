package pojo;
public class Data {
	private int id;
	private int age;
	private int salary;
	private String name;
	private String department;
	
	
	public Data(int id, int age, int salary, String name, String department) {
		super();
		this.id = id;
		this.age = age;
		this.salary = salary;
		this.name = name;
		this.department = department;
	}
	public Data() {
		
	}
	int getId() {
		return id;
	}
	void setId(int id) {
		this.id = id;
	}
	int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	@Override
	public String toString() {
		return "Data [id=" + id + ", age=" + age + ", salary=" + salary + ", name=" + name + ", department="
				+ department + "]";
	}
	
	
	
	
	
	
	
	
	
}
