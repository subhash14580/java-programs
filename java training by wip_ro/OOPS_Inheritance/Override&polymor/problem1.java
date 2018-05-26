/*
Create  a base class Fruit which has name ,taste and size as its attributes.
 A method called eat() is created which describes the name of the fruit and its taste. 
 Inherit the same in 2 other class Apple and Orange and override the eat() method to represent each fruit taste.
*/
class Fruit{
	String name;
	String taste;
	int size;
	Fruit(String name,String taste,int size){
        this.name = name;
        this.taste = taste;
        this.size = size;
	}
	void eat(){
		System.out.println("IAM OVERRIDED BY "+"i eat "+name+"where taste is "+taste);
	}
}
class Apple extends Fruit{
	String name;
	String taste;
	int size;
	int color;
	Apple(String name,String taste,int size,int color){
		super(name,taste,size);
		this.name = name;
        this.taste = taste;
        this.size = size;
	}
	void eat(){
		System.out.println("i am eating apple of color"+color);
	}
}
class Orange extends Fruit{
	String name;
	String taste;
	int size;
	int color;
	Orange(String name,String taste,int size,int color){
		super(name,taste,size);
		this.name = name;
        this.taste = taste;
        this.size = size;
	}
	void eat(){
		System.out.println("i am eating Orange of color"+color);
	}
}
class problem1{
	public static void main(String args[]){
		Fruit ft = new Fruit("parent","99",999);
		ft.eat();
		Apple ap = new Apple("apple","1",999,1);
		ap.eat();
		Orange or = new Orange("orange","2",999,1);
		or.eat();	
	}
}