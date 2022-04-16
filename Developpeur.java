public class Developpeur extends Collaborateur {
	
private String matricule ;
private String nom ;
private String prenom ;
private int soldeRtt = 0 ;
private int competence = 0;

public Developpeur(String matricule, String nom, String prenom, int soldeRtt, int competence){
	super(matricule, nom, prenom);
	this.soldeRtt = soldeRtt ;
	this.competence = competence ;
}
	
public String toHTML(){
	return "HTML Devellopeur: " + super.matricule + " + " + super.prenom + " + " + super.nom;
}

public void crediterRTT(int nbJours){
	soldeRtt = soldeRtt + nbJours ;
}

public void debiterRTT(int nbJours){
	soldeRtt = soldeRtt - nbJours ;
}

public String toString(){
return "DEV =>  " + super.matricule + " + " + super.nom + " + "+ super.prenom + " + " + soldeRtt + " + " + competence ;
}

}
