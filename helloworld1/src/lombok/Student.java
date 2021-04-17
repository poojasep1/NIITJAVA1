package lombok;

public class Student {
String name;
int age;
public String getName() {
	return name;
	
}
public void setName() {
	this.name=name;
}
public int getAge() {
	return age;
}
public void setAge() {
	this.age=age;
}
public Student(String name, int age)
{
	super();
	this.name=name;
	this.age=age;
}
}
