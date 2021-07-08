package scs;
public class Node
{
    @Override
	public String toString() {
		return "Node [data=" + data + ", next=" + next + "]";
	}

	int data;
    Node next;
 
    Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }
}
 
