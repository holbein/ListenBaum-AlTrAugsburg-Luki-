//Verwaltungsklasse der Liste
class LISTE {
    private LISTENELEM erster;
    
    LISTE(){
        erster = new ABSCHLUSS();
    }
    
    LISTENELEM ErsterGeben(){
        return erster;
    }
        
    int LängeGeben(){
        return erster.AnzahlGeben();
    }
    
    boolean IstListeLeer(){
        return erster.IstListeLeer();
    }
    
    void KnotenEinfügen(KNOTEN k){
        erster = k;
    }
    
    void HintenEinfügen(DATENELEM e){
        erster = erster.HintenEinfügen(e);
    }
    
    void VorneEinfügen(DATENELEM e) {
        erster = erster.VorneEinfügen(e);
    }

    void LetztenKnotenLöschen(){
       erster.LetztenKnotenLöschen();
    }
    
    LISTENELEM LetztenKnotenGeben(){
        return erster.LetztenKnotenGeben();
    }
    
    LISTE ListeDerLetztenAnzahlKnotenGeben(int n){
        
    }
    
    LISTE RechteHälfteTrennen(){
        int mitteDouble = (LängeGeben()/2.0)+0.5;
        int mitte = mitteDouble;
        LISTE l = new Liste();
        LISTENELEM elem = erster;
        for(int i=1; i<mitte; i++){
            elem = elem.nächsterGeben();
        }
        l.KnotenEinfügen(elem);
    }

    LISTE LinkeHälfteTrennen(){
        
    }
}
