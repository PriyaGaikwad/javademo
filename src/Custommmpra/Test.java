package Custommmpra;

import java.time.LocalDate;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;






public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Set<Employee>s=null;
Scanner sc=new Scanner(System.in);
System.out.println("enter ur choice");

int ch=sc.nextInt();
switch(ch)
{
case 1: s=new TreeSet<Employee>(new IdSort());
break;

case 2: s=new TreeSet<Employee>(new NameSort());
break;

case 3: s=new TreeSet<Employee>(new DateSort());
break;
}

Employee e1=new Employee();
e1.setId(102);
e1.setName("abc");
e1.setDate(LocalDate.of(2000, 2, 5));

Employee e2=new Employee();
e2.setId(103);
e2.setName("bbb");
e2.setDate(LocalDate.of(2017, 4, 8));

Employee e3=new Employee();
e3.setId(101);
e3.setName("ccc");
e3.setDate(LocalDate.of(2018, 3, 2));

s.add(e1);
s.add(e2);
s.add(e3);
for(Employee e:s)
{
	System.out.println(e.getName()+"  "+e.getId()+" "+e.getDate());
	
}

}


			
		
		

}
