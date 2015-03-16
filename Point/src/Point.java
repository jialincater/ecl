import java.util.*;


public class Point {

	int x;
	int y;
	
//	first that has no arg.
	public Point(){
		x=0;
		y=0;
	}
	
//	second has 1 arg.
	public Point(int value){
		x=value;
		y=0;
	}
	
//	third has 2 args.
	public Point(int v1, int v2){
		x=v1;
		y=v2;
	}
	
	
	public static void main(String[] args) {
		Point p0 = new Point();
		Point p1 = new Point(0,0);
//		Q1: HERE p0 & p1 are pointed to a same memory. 
//		And lead to 2 elements in HASHset!!!
		Point p2 = new Point(2,3);
		System.out.println("dot p0:("+p0.x+','+p0.y+')');
		System.out.println("dot p1:("+p1.x+','+p1.y+')');
		System.out.println("dot p2:("+p2.x+','+p2.y+')');
		System.out.println("EQU p0p1:"+ (p0==p1));		
		System.out.println("EQU p2p1:"+ (p2==p1));
		System.out.println("EQU p0p2:"+ (p0==p2));	
		
		System.out.println();
		System.out.println("Now is the Override method TOSTRING");
		System.out.println(p0);
		System.out.println(p1);
		System.out.println(p2);
		
		System.out.println();
		System.out.println("Now is the Override method EQUALS");
		System.out.println("EQU p0p1:"+ p0.equals(p1));		
		System.out.println("EQU p2p1:"+ p1.equals(p2));
		System.out.println("EQU p0p2:"+ p2.equals(p0));	
		
		System.out.println();
		System.out.println("Now is time for HASH");
		HashSet<Point> Phash = new HashSet<Point>();
		Phash.add(p0);
		Phash.add(p1);
		Phash.add(p2);
//		This is a way to print out the item in hash
		Iterator it = Phash.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
//		If you can using JAVA8, you can use something like this.
		System.out.println("This is another way to print out ");
		Phash.forEach(System.out::println);
		
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Point other = (Point) obj;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "(" + x + "," + y + ")";
	}
//	I don't know what is this function doing.
//	@Override
//	protected void finalize() throws Throwable {
//		// TODO Auto-generated method stub
//		super.finalize();
//	}
	
}
