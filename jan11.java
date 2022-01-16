package jan11;

class Node{
	
	int data;
	Node next;
	
	Node(int data){
		
		this.data=data;
		this.next=null;
		
		
	}
	
}

class Linkedlist{
	static int max=0;
	static void max(Node head) {
		
		while(head!=null) {
			
			if(max<head.data) {
				max=head.data;
			}else {
				head=head.next;
			}
		
			
		
	}
		System.out.println("maximum number is :"+max);
	
}
	
	static void min(Node node) {
		 int min=node.data;
		
		while(node!=null) {
			
			if(min>node.data) {
				
				min=node.data;
				
			}else {
				node=node.next;
			}
			
		}
		System.out.println("min number is :"+min);
	}
}

public class jan11 {
	public static void main(String[] args) {
		
		Node head=new Node(3);
		head.next=new Node(1);
		head.next.next=new Node(6);
		head.next.next.next=new Node(7);
		
		Linkedlist.max(head);
		Linkedlist.min(head);
		
		
		
		
		
	}

}
