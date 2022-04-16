public class ChefProjets extends Collaborateur {
	
private String matricule ;
private String nom ;
private String prenom ;
private int experience = 0 ;
private int nbProjet = 0 ;

public ChefProjets(String matricule, String nom, String prenom, int experience, int nbProjet){
	super(matricule, nom, prenom);
	this.experience = experience ;
	this.nbProjet = nbProjet ;
}
	
public String toHTML(){
	return "HTML ChefProjet: " + super.matricule + " + " + super.prenom + " + " + super.nom;
}

public String toJson(){
	return "JSON ChefProjet: " + super.matricule + " + " + super.prenom + " + " + super.nom;
}

public void enregisterProjet(){
	nbProjet = nbProjet + 1 ;
}

public String toString(){
return "Chef =>  " + super.matricule + " + " + super.nom + " + "+ super.prenom + " + " + experience + " + " + nbProjet ;
}

}
