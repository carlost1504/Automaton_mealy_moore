package model;

public class Trancitions {
	
	private String input_trancitions;
	private String output_trancitions;
	
	public Trancitions(String input_trancitions) {
		super();
		this.input_trancitions = input_trancitions;
	}

	public Trancitions(String input_trancitions, String output_trancitions) {
		super();
		this.input_trancitions = input_trancitions;
		this.output_trancitions = output_trancitions;
	}

	public String getInput_trancitions() {
		return input_trancitions;
	}

	public void setInput_trancitions(String input_trancitions) {
		this.input_trancitions = input_trancitions;
	}

	public String getOutput_trancitions() {
		return output_trancitions;
	}

	public void setOutput_trancitions(String output_trancitions) {
		this.output_trancitions = output_trancitions;
	}
	
	
	
	

}
