
class Shape{
	void draw(){
		System.out.println("I am DRAW my childrens can override me");
	}
	void erase(){
		System.out.println("iam Erase and my childrens can override me");
	}
}
class Circle extends Shape{
	void draw(){
		System.out.println("Drawing circle");
	}
	void erase(){
		System.out.println("Erasing circle");
	}
}
class Triangle extends Shape{
	void draw(){
		System.out.println("Drawing Triangle");
	}
	void erase(){
		System.out.println("Erasing Triangle");
	}
}
class Square extends Shape{
	void draw(){
		System.out.println("Drawing Square");
	}
	void erase(){
		System.out.println("Erasing Square");
	}
}
class problem2{
	public static void main(String args[]){
		Shape sp = new Shape();
		sp.draw();
		sp = new Circle();
		sp.draw();
		sp = new Triangle();
		sp.draw();
		sp = new Square();
		sp.erase();
	}
}