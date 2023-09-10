
public class Employee {
	static int noe;
	int id;
	String name;
	String department;
	int salary;
	int birthYear;
	
//	Default Constructor
	public Employee() {
		super();
		noe++;
	}
	
//	Parameterized Constructor
	public Employee(int id, String name, String department, int salary, int birthYear) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
		this.salary = salary;
		this.birthYear = birthYear;
		noe++;
	}
	
	
//	Getter Methods
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public String getDepartment() {
		return department;
	}
	
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}
	
	
//	Setter Methods
	public void setId(int id) {
		this.id = id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setDepartment(String department) {
		this.department = department;
	}
	
	public int getSalary() {
		return salary;
	}
	
	public int getBirthYear() {
		return birthYear;
	}
	
	public int getAge() {
		int age = 0;
		age = 2023 - this.birthYear;
		return age;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", department=" + department + ", salary=" + salary + "]";
	}
	
	
	
	
}
