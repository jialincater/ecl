package sList;

public class LinkedStrList {
	
	private sNode firstNode;
	private sNode lastNode;
	private int Length;
	
	@Override
	public String toString() {
		String S="{";
		sNode node = firstNode;
		for(int i=0; i!=Length;++i){
			if(i!=0) S+=",";
			S+=node.getData();
			if(i==(Length-1))	S+="}";
			node = node.getNext();
		}
		return S;
	}

	public LinkedStrList(){
		firstNode = null;
		lastNode = null;
		Length = 0;
	}
	
	public LinkedStrList(String s){
		sNode node = new sNode(s);
		firstNode = node;
		lastNode = node;
		Length = 1;
	}
	
	public sNode insert(String s){
		sNode node = new sNode(s);
		if(firstNode == null){
			firstNode = node;
			lastNode = node;
			++Length;
			return lastNode;
		}
		lastNode.setNext(node);
		lastNode = node;
		++Length;
		
		return lastNode;
	}
	
	public int remove(String s){
		int time = Length;
		sNode node = firstNode;
		sNode Xnode = firstNode.getNext();
		int cnt=0;
		
		for (int i=0; i!=time; ++i){
//			1
			if(firstNode.getData() == s){
				node = node.getNext();
				Xnode = Xnode.getNext();
				firstNode = node;
				++cnt;
				--Length;
//				System.out.println("remove #1");
				continue;
			}
//			2
			else if(s == Xnode.getData() && Xnode.getNext()!= null){
				System.out.printf("remove #2 %s \n", Xnode.getData());
				node.setNext(Xnode.getNext());
//				node = node.getNext();
				Xnode = Xnode.getNext();
				++cnt;
				--Length;
//				System.out.println("remove #2");
				continue;
			}
//			3
			else if(s == Xnode.getData() && Xnode.getNext() == null){
				node.setNext(null);
				lastNode = node;
				++cnt;
				--Length;
//				System.out.println("remove #3");
				break;
			}
//			4
			else if(s != Xnode.getData() && Xnode.getNext() != null){
//				System.out.printf("unremove #4 %s, %d \n", Xnode.getData(), i);
				node = node.getNext();
				Xnode = Xnode.getNext();
				continue;
			}
//			5 (This shall not happens, but remain here for safe...)
			else if(s != Xnode.getData() && Xnode.getNext() == null){
//				System.out.println("unremove #5");
				break;
			}
		}
		return cnt;
	}
	
	public int length(){
		return Length;
	}
	
	public void print(){
		System.out.printf("{");
		sNode node = firstNode;
		for(int i=0; i!=Length;++i){
			if(i!=0) System.out.printf(",");
			System.out.printf("\"%s\"",node.getData());
			if(i==(Length-1))	System.out.println("}");
			node = node.getNext();
		}
	}

	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Length;
		result = prime * result
				+ ((firstNode == null) ? 0 : firstNode.hashCode());
		result = prime * result
				+ ((lastNode == null) ? 0 : lastNode.hashCode());
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
		LinkedStrList other = (LinkedStrList) obj;
		if (Length != other.Length)
			return false;
		if (firstNode == null) {
			if (other.firstNode != null)
				return false;
		} else if (!firstNode.equals(other.firstNode))
			return false;
		if (lastNode == null) {
			if (other.lastNode != null)
				return false;
		} else if (!lastNode.equals(other.lastNode))
			return false;
		
		sNode node1 = this.firstNode;
		sNode node2 = other.firstNode;
		for(int i=0; i!=Length;++i){
			if(node1.getData() == node2.getData()){
				node2 = node2.getNext();
				node1 = node1.getNext();
			}
			else {
				System.out.println("elements ineuqel");
				return false;
			}
		}
		return true;
	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println(this);
		System.out.println("the finalize is called");
		super.finalize();
	}
	
}
