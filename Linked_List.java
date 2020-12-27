import java.util.*;


class Linked_List{
       Node head;
      class Node{
         int data;
         Node next;
       Node(int d){
       	 data=d;
       	 next=null;
       }
   }

public static void main(String args[]){
  

    Linked_List list=new Linked_List();
    Scanner in=new Scanner(System.in);
   
    while(true){
    	System.out.println("enter the choice:");
      int  option=in.nextInt();
    switch(option){
      case 1:{
      	System.out.println("enter the item:");
      	int item=in.nextInt();
      	list.insert_first(item);
      	break;
      }
       case 2:{
       	System.out.println("enter the item:");
       	int item=in.nextInt();
      	list.insert_end(item);
      	break;
      }
      case 3:{
      	System.out.println("enter the item after which insertion has to be done :");
       	int key=in.nextInt();
       	System.out.println("enter the item_to be inserted:");
       	int item=in.nextInt();
      	list.insert_after(key,item);
      	break;
      }
      case 4:{
      	
       	System.out.println("enter the item_to be deleted:");
       	int item=in.nextInt();
      	list.delete(item);
      	break;
      }
      case 5:{
      	
       	System.out.println("enter the pos to be deleted:");
        int key=in.nextInt();
      	list.delete_pos(key);
      	break;
      }
      case 6:{
      	list.display();
      	break;
      }
      case 7:{
      	break;
      }
      
    }
    
    if(option==7){
    	break;
    }
    in.close();
      }
}
    public void insert_first(int element){
    	
         Node newnode=new Node(element);
         newnode.next=null;
         if(head==null){
         	//System.out.println("abi");
         	head=newnode;
         }
         else{
         	newnode.next=head;
         	head=newnode;
         }
    }

    public void insert_end(int element){
       Node newnode=new Node(element);
       newnode.next=null;
       if(head==null){
       	 head=newnode;
       }
       else{
          Node temp=head;
          while(temp.next!=null){
              temp=temp.next;
    	      }
    	    temp.next=newnode;
          }
    }

     public void insert_after(int key,int element){
           Node newnode=new Node(element);
           newnode.next=null;
           Node temp=head;
           while(temp.next!=null && temp.data!=key){
           	temp=temp.next;
           }
           newnode.next=temp.next;
           temp.next=newnode;

     }
     public void delete(int element){
           
           Node pre=null;
           Node temp=head;
           while(temp!=null && temp.data!=element){
            pre=temp;
           	temp=temp.next;
           }   
          pre.next=temp.next;
     }
     public void delete_pos(int pos){
           
           Node pre=null;
           Node temp=head;
           int i=0;
           while(temp!=null && i!=pos){
           	pre=temp;
           	temp=temp.next;
           	i++;
           }
           if(i==0 && temp!=null){
           	System.out.println("abi");
           	head=null;
           	return;
           }
           if(temp==null && i!=0){
           	pre.next=null;
           }         
          pre.next=temp.next;
     }

    public  void display(){

    	System.out.println("those elements are :");
    	Node temp=head;
    	while(temp!=null){
    	   System.out.printf("%d ",temp.data);
           temp=temp.next;
    	}
    }    
}