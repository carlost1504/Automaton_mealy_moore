package model;

public class Node_Moore {
	
	private String name;
	private char exit_Node;
	private Trancitions trancitions;
	
	
	public Node_Moore(String name, char exit_Node, String[] trancitions_1) {
		super();
		this.name = name;
		this.exit_Node = exit_Node;
		Trancitions trancitions=new Trancitions(trancitions_1[0]);
		this.trancitions = trancitions;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public char getExit_Node() {
		return exit_Node;
	}


	public void setExit_Node(char exit_Node) {
		this.exit_Node = exit_Node;
	}


	public Trancitions getTrancitions() {
		return trancitions;
	}


	public void setTrancitions(Trancitions trancitions) {
		this.trancitions = trancitions;
	}


	
	
	
	
	
	

}
