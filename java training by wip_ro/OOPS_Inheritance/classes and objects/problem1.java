import java.util.*;
class Box{
	int width,height,dep;
	public Box(int width,int height,int depth){
	this.width = width;
	this.height = height;
	this.dep = depth;
	}
	long volume(){
		return width*height*dep;
	}
}
class problem1{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		int l = in.nextInt();
		int b = in.nextInt();
		int h = in.nextInt();
		Box b1 = new Box(l,b,h);
		System.out.println(b1.volume());
	}
}