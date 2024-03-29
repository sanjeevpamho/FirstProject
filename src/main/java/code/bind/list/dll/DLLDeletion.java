package code.bind.list.dll;


class Node{
	int data;
	Node prev,next;
	Node(int data){
		this.data=data;
		this.next=this.prev=null;
	}
}
public class DLLDeletion {
	static Node head=null;;

	public void push(int data){
		Node node=new Node(data);

		if(head==null){
			head=node;
		}
		else{
			node.next=head;head.prev=node;
			head=node;
		}

	}
	public void deleteNode(int data){
		if(head == null) return;
		
		if(head.data==data){
			head=head.next;
			return;
		}
		Node preNode=head;
		Node tmp=head.next;
		
		while(tmp!=null){
			if(tmp.data==data){
				preNode.next=tmp.next;
				if(tmp.next!=null)
				(tmp.next).prev=tmp.prev;
			}
			preNode=tmp;
			tmp=tmp.next;
		}
	}
	void printDLL(Node head){
		while(head!=null){
			System.out.print(head.data + " ");
			head=head.next;
		}
	}


	public static void main(String[] args) {
		DLLDeletion dLLDeletion=new DLLDeletion();

		dLLDeletion.push(25);dLLDeletion.push(20);dLLDeletion.push(15);dLLDeletion.push(10);dLLDeletion.push(5);dLLDeletion.push(2);
		dLLDeletion.printDLL(head);
		
		dLLDeletion.deleteNode(10);
		System.out.println();
		dLLDeletion.printDLL(head);
		dLLDeletion.deleteNode(25);
		System.out.println();
		dLLDeletion.printDLL(head);
	}
}
