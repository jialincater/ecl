package sList;

public class test {

	public static void main(String[] args) {
		LinkedStrList myLst = new LinkedStrList("one");
//		LinkedStrList garb = new LinkedStrList("one");
//		garb = null;
		System.gc();
//		call the wield garbage collector
		
//		1. add one, two, three...
//		myLst.insert("one");
		myLst.insert("two");
		myLst.insert("three");
//		myLst.remove("one");
		System.out.println(myLst);
		System.out.println(myLst.length());
		
//		2. compare the object
		LinkedStrList a2 = new LinkedStrList("one");
		a2.insert("two");a2.insert("three");
		System.out.println(a2);
		if(myLst == a2)
			System.out.println("They are equal");
		else
			System.out.println("They are inequal");
		
//		3. compare with equel
		if(myLst.equals(a2))
			System.out.println("They are equal");
		else
			System.out.println("They are inequal");
		
		
	}

}
