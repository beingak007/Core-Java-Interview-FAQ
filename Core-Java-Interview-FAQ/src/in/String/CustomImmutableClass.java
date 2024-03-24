package in.String;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public final class CustomImmutableClass {
	
	private final String name;
	private final String DOB;
	private final Date bday;
	private final List<String> mob;
	public CustomImmutableClass(String name, Date bday,String dOB, List<String> mob) {
		super();
		this.name = name;
		this.DOB = dOB;
		this.bday = bday;
		this.mob = mob;
	}
	public String getName() {
		return name;
	}
	public String getDOB() {
		return DOB;
	}
	public Date getBday() {
		return bday;
	}
	public List<String> getMob() {
		return mob;
	}
	
	public static void main(String[] args) {
		
		Date date = new Date();
		
		CustomImmutableClass c = new CustomImmutableClass("Akash", date,"12", Arrays.stream(new  String[] {"123","13442"}).collect(Collectors.toList()));
	}
	
	
	

}
