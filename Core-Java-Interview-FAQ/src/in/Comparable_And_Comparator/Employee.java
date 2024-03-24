package in.Comparable_And_Comparator;

public class Employee implements Comparable<Employee> {
	
	private Integer id;
	private String name;

	public Employee(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
//	
//	@Override
//	public int compareTo(Employee o) {
//	return this.id-o.id;
//	}
//	
	
	@Override
	public int compareTo(Employee em) {
		
		   if(id==em.id)  
	            return 0;  
	        else if(id>em.id)  
	            return 1;  
	        else  
	            return -1;  
		
	}
	
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
	

}
