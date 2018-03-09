//Abschlussklasse vom Binärbaum
class BAUMABSCHLUSS extends BAUMELEM {

    BAUMELEM LinksGeben(){
        return this;
    }
    
    BAUMELEM RechtsGeben(){
        return this;
    }
    
    DATENELEM InhaltGeben(){
        return null;
    }
    
    int AnzahlKnotenBerechnen(){
        return 0;
    }
}
