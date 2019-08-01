class Person{
	private int age;
	private String name;
	 public int  getAge(){
		return age;
	}
	public void setAge(int i){
		age = i;
	} 
}

class PersonDemo{
	Person p = new Person();
	p.setAge(15);
	System.out.println(p.getAge());
	
}