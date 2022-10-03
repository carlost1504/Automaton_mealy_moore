package model;

public class Node_mealy {
	
	private String name;
	private Trancitions[] trancitions;
	
	

	public Node_mealy(String name, Trancitions[] trancitions) {
		super();
		this.name = name;
		this.trancitions = trancitions;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Trancitions[] getTrancitions() {
		return trancitions;
	}

	public void setTrancitions(Trancitions[] trancitions) {
		this.trancitions = trancitions;
	}

	
	
	
	

}
