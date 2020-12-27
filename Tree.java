import java.util.*;

class Tree{
    Node root;

     class Node{
          int data;
          Node left,right;

          Node(int d){
          data=d;
          left=right=null;
          }
     }
public static void main(String args[]){

   Tree t = new Tree();
   t.insert(100);
   t.insert(99);
   t.insert(98);
   t.insert(97);
   t.insert(98);
  
 System.out.println("tree created");
 System.out.println("________________________");
 System.out.println("preorder");

 t.preorder(t.root);
 System.out.println("________________________");
 System.out.println("inorder");

 t.inorder(t.root);
 System.out.println("________________________");
 System.out.println("postorder");

 t.postorder(t.root);
}

public void insert(int key){
	root=insert_node(root,key);
}

public Node insert_node(Node root,int item){
	if(root==null){
		root=new Node(item);
		return root;
	}
		if(item<root.data){
			root.left=insert_node(root.left,item);
		}
		else if(item>=root.data){
			root.right=insert_node(root.right,item);
		}
        return root;
}

public void preorder(Node root){
	if(root==null){
		return;
	}
     System.out.println(root.data);
     preorder(root.left);
     preorder(root.right);
}

public void postorder(Node root){
	if(root==null){
		return;
	}
     postorder(root.left);
     postorder(root.right);
     System.out.println(root.data);
}

public void inorder(Node root){
	if(root==null){
		return;
	}
    
     inorder(root.left);
     System.out.println(root.data);
     inorder(root.right);
     }
}