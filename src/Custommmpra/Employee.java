package Custommmpra;

import java.time.LocalDate;
import java.util.Date;

public class Employee {

	private int id;
	private String name;
	private  LocalDate date ;
	
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public void setId(int id)
	{
		this.id=id;
		
	}
	public int getId()
	{
		return id;
		
	}
	
	public void setName(String name)
	{
		this.name=name;
		
	}
	public String getName()
	{
		return name;
	}
	
	public String toString()
	{
		return "id="+this.id+"name="+this.name+"date"+this.date;
	}
}


