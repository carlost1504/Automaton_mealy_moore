package model;

public class Mealy {
	
	private String [][] AF;
	private Node_mealy [] n_mealy;
	private String[] name;

	public Mealy(String[][] aF) {
		super();
		AF = aF;
		name =new String[AF.length];
		for (int i = 0; i < AF.length; i++) {
			name[i]=AF[0][i+1];
		}
	}
	
	
	public Trancitions[] node_Trancitions() {
		
		Trancitions[] trancitions=new Trancitions[name.length];
		
		
		//recorrido matriz enviada por ui
		for (int i = 0; i < AF.length; i++) {
			for (int j = 0; j < AF.length; j++) {
				
				String trancitions_set="";
				trancitions_set = AF[i+1][j+1];
				if(trancitions_set.equalsIgnoreCase("null")) {
					Trancitions t=new Trancitions("null", "null");
				}
				String[] transcit_=trancitions_set.split(",");
				Trancitions t=new Trancitions(transcit_[0], transcit_[1]);	
				trancitions[j]=t;
			}
			Node_mealy m=new Node_mealy(name[i], trancitions);
			
		}
		return null;
	}

}
