

public class Parcelle {
	int numImage = 0;
	boolean traversable = false;
	String contenu = "";
	
	static boolean clePlacee = false;
	static boolean coffrePlacee = false;
	
	final static String ROCHER = "rocher";
	final static String EAU = "eau";
	final static String HERBE = "herbe";
	
	public Parcelle(String type){
		if(type.equals("herbe")){
			this.numImage = 2;
			this.traversable = true;
		}else if(type.equals("mer")){
			this.numImage = 1;
		}else if(type.equals("rocher")){
			this.numImage = 3;
		}else if(type.equals("bateauE1")){
			this.numImage = 4;
		}else if(type.equals("bateauE2")){
			this.numImage = 5;
		}
	}
	
	public Parcelle(int numImage){
		this.numImage = numImage;
	}
	
	public void changerParcelle(Parcelle parcelle){
		this.numImage = parcelle.numImage;
		this.traversable = parcelle.traversable;
		this.contenu = parcelle.contenu;
	}
	
	
	public int getNumImage(){
		return numImage;
	}
	
	public boolean getTraversable(){
		return traversable;
	}
}
