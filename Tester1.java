class Tester1 {

	public Tester1(){

	}


	public static int countA(BinaryTree btree){
		if (btree.emptyTree())
		{
			return 0;
		}
		else 
		{
			if (btree.getRoot()=='A') {
				
				return 1+countA(btree.getLeft())+countA(btree.getRight());
				
			}
			
			  return countA(btree.getLeft())+countA(btree.getRight());  
		}

	}

	public static int countLeaves(BinaryTree btree){
			if (btree.emptyTree())
		{
			return 0;
		}
		else 
		{
			return 1+countLeaves(btree.getLeft())+countLeaves(btree.getRight());
			    
		}
	}

		
	public static String postOrder(BinaryTree btree){
		
		if (btree.emptyTree())
		{
			
			return"";
		}
		
		else{
			return ""+postOrder(btree.getLeft())+postOrder(btree.getRight())+btree.getRoot();
	
		}
	}

	public static String inOrder(BinaryTree btree){
		
		if (btree.emptyTree())
		{
			return "";
		}
	
		else{
			return ""+inOrder(btree.getLeft())+btree.getRoot()+inOrder(btree.getRight());
		}
	}

	public static void main(String[] args) {
		BinaryTree symbolTree=new BinaryTree(new Node('+'));
		
		symbolTree.insertNode('/',0);
		symbolTree.insertNode('*',1);
		symbolTree.getLeft().insertNode('*',0);
		symbolTree.getLeft().insertNode('-',1);
		symbolTree.getLeft().getLeft().insertNode('2',0);
		symbolTree.getLeft().getLeft().insertNode('3',1);
		symbolTree.getLeft().getRight().insertNode('2',0);
		symbolTree.getLeft().getRight().insertNode('1',1);
		symbolTree.getRight().insertNode('5',0);
		symbolTree.getRight().insertNode('-',1);
		symbolTree.getRight().getRight().insertNode('4',0);
		symbolTree.getRight().getRight().insertNode('1',1);
		System.out.println(countA(symbolTree));
		System.out.println(countLeaves(symbolTree));
		System.out.println(postOrder(symbolTree));
		System.out.println(inOrder(symbolTree));

		

	}
}
