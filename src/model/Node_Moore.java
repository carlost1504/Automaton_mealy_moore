package model;

public class Node_Moore {
	
	private String name;
	private char exit_Node;
	private String[] trancitions;
	
	
	public Node_Moore(String name, char exit_Node, String[] trancitions) {
		super();
		this.name = name;
		this.exit_Node = exit_Node;
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


	public String[] getTrancitions() {
		return trancitions;
	}


	public void setTrancitions(String[] trancitions) {
		this.trancitions = trancitions;
	}
	
	
	
	
	

}
