package sList;

public class sNode {
	private String data;
	private sNode nextNode;
	
	public sNode(String str){
		data = str;
		nextNode = null;
	}
	
	public sNode getNext(){
		return nextNode;
	}
	
	public String getData(){
		return data;
	}
	
	public void setNext(sNode node){
		this.nextNode = node;
	}
}
