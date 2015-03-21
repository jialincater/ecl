package sList;

public class test {

	public static void main(String[] args) {
		LinkedStrList myLst = new LinkedStrList("one");
		myLst.insert("one");
		myLst.insert("two");
		myLst.insert("three");
		myLst.insert("one");
		myLst.insert("dois");
		myLst.insert("one");
		System.out.println(myLst);
		System.out.println(myLst.length());
		myLst.remove("one");
		System.out.println(myLst);
		System.out.println(myLst.length());
	}

}
