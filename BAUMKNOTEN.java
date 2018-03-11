//Knoten Klasse des Binärbaumes
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
        return rechts;
    }
        
    DATENELEM InhaltGeben(){
        return inhalt;
    }
    
    int AnzahlKnotenBerechnen(){
        return  1 + links.AnzahlKnotenBerechnen() +
                rechts.AnzahlKnotenBerechnen();
    }
        
    BAUMKNOTEN(LISTE l){
        if(l.LängeGeben()==1){
            inhalt = l.ErsterGeben().InhaltGeben();
            links = new BAUMABSCHLUSS();
            rechts = new BAUMABSCHLUSS();
        }
        else{
            if(l.LängeGeben()==2){
                inhalt = l.LetztenKnotenGeben().InhaltGeben();
                LISTE liste = new LISTE();
                liste.HintenEinfügen(l.ErsterGeben().InhaltGeben());
                links = new BAUMKNOTEN(liste);
                rechts = new BAUMABSCHLUSS();
            }
            else{
                inhalt = l.MitteGeben().InhaltGeben();
                links = new BAUMKNOTEN(l.LinkeHälfteTrennen());
                rechts = new BAUMKNOTEN(l.RechteHälfteTrennen());
            }
        }
    }
    
    void InOrderAusgeben(){
        links.InOrderAusgeben();
        System.out.println("[");
        System.out.println(inhalt.BegriffGeben());
        System.out.println("]");
        rechts.InOrderAusgeben();
    }
}
