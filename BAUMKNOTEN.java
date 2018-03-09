//Knoten Klasse
class BAUMKNOTEN extends BAUMELEM {
    private BAUMELEM links;
    private BAUMELEM rechts;
    private DATENELEM inhalt;

    BAUMKNOTEN(BAUMELEM l, BAUMELEM r, DATENELEM i) {
        links = l;
        rechts = r;
        inhalt = i;
    }

    BAUMELEM LinksGeben(){
        return links;
    }
    
    BAUMELEM RechtsGeben(){
        return rechts;}
        
    DATENELEM InhaltGeben(){
        return inhalt;
    }
    
    int AnzahlKnotenBerechnen(){
        return  1 + links.AnzahlKnotenBerechnen() +
                rechts.AnzahlKnotenBerechnen();
    }
        
    BAUMKNOTEN(LISTE l){
        
    }
}
