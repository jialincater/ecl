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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((data == null) ? 0 : data.hashCode());
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
		sNode other = (sNode) obj;
		if (data == null) {
			if (other.data != null)
				return false;
		} else if (!data.equals(other.data))
			return false;
		return true;
	}
}
