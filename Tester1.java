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
				
				return 1+countA(btree.getLeft())+btree.getRoot()+countA(btree.getRight());
				
			}

			else
				return countA(btree.getLeft())+btree.getRoot()+countA(btree.getRight());
		}

	}

	public int countLeaves(BinaryTree btree){
		if (btree.emptyTree())
		{
			return 0;
		}
		else 
		{
			return 1+countLeaves(btree.getLeft())+btree.getRoot()+countLeaves(btree.getRight());
		}
	}

		
	public static String postOrder(BinaryTree btree){
		
		if (btree.emptyTree())
		{
			
			return"";
		}
		if(btree.getLeft()==null||btree.getLeft()==null)
		{
			System.out.println(btree.getRoot());
			return ""+btree.getRoot();
		}
		
		else{
			System.out.println(postOrder(btree.getLeft())+postOrder(btree.getRight())+btree.getRoot());
			return "";
		}
	}

	public static String inOrder(BinaryTree btree){
		
		if (btree.emptyTree())
		{
			return "";
		}
		else if(btree.getLeft()==null||btree.getRight()==null)
		{
			System.out.println(btree.getRoot());
			return "";
		}
		else{
			System.out.println(inOrder(btree.getLeft())+btree.getRoot()+ inOrder(btree.getRight()));
			return "";
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
		inOrder(symbolTree);

		

	}
}