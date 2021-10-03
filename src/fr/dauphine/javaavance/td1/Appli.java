package fr.dauphine.javaavance.td1;

public class Appli {
	
	int foo;
	String str;
	
	public void setFoo(int foo) {
		this.foo = foo;
	}
	
	public Appli() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		System.out.println();
//		Point p=new Point();
//		System.out.println(p.x+" "+p.y);
//		
//		Point p=new Point(1,2);
//		Circle c=new Circle(p,1);
//		Circle c2=new Circle(p,2);
//		c2.translate(1,1);
//		System.out.println(c+" "+c2);
		
		Ring r1 = new Ring(new Circle(new Point(1.0,0.0), 3.0),2.0);
		System.out.println(r1);
		
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

}
