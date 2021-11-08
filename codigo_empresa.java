package Conta;

public class codigo_empresa {

	private String name;
	private Integer id;
	private Double salary;
	
	public codigo_empresa() {
	}

	public codigo_empresa(String name, double iD, double salary) {
		this.name = name;
		this.id = id;
		this.salary = salary;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public double getID() {
		return id;
	}
	public void setID(double iD) {
		id = id;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public void increaseSalary(Double percentage) {
		salary += salary * percentage / 100.0;
	}
	
	public String toString(){
		return name + ", " + id + ", " + String.format("%.2f", salary);
	}
}

