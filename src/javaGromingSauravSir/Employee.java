package javaGromingSauravSir;

import java.util.Comparator;

public class Employee implements Comparator<Employee>
{
	String name;
	public Employee(String name)
	{
		this.name=name;
	}
	@Override
	public Object compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return name;
	}
	public int compareTo(Employee 0)
	{
		return this.name.compareTo(0.name);
	}

}
