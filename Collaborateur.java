public class Collaborateur {

protected String matricule ;
protected String nom ;
protected String prenom ;

public Collaborateur(String matricule, String nom, String prenom){
this.matricule = matricule ;
this.nom = nom ;
this.prenom = prenom;	
}	


public String toHTML(){
	return "HTML Collaborateur: " + matricule + " + " + prenom + " + " + nom;
}

public String toJson(){
	return "JSON Collaborateur: " + matricule + " + " + prenom + " + " + nom;
}

public String toString(){
return "COLABORATOR =>  " + matricule + " + " + nom + " + "+ prenom ;
}

}
