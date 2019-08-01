class Person{
	private int age;
	private String name;
	Person(String n,int a){
		name = n;
		age = a;
		System.out.println("name="+name+","+"age="+age);
	}
	Person(int a){
		age = a;
		System.out.println("name="+name+","+"age="+age);
	}
}

class PersonDemo{
	public static void main(String[] argv){
		System.out.println("First time:");
		Person p1 = new Person("NMSL",6324);
		System.out.println("Second time:");
		Person p2 = new Person(7);
	}
	
	
}