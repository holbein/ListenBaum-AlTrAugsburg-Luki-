//Verwaltungsklasse der Liste
class LISTE {
    private LISTENELEM erster;
    
    LISTE(){
        erster = new ABSCHLUSS();
    }
    //Zum Testen
    LISTE(int i){
        erster = new ABSCHLUSS();
        erster=erster.HintenEinfügen(new DATENELEM("Attribut"));
        erster=erster.HintenEinfügen(new DATENELEM("Binärbaum"));
        erster=erster.HintenEinfügen(new DATENELEM("Entwurfsmuster"));
        erster=erster.HintenEinfügen(new DATENELEM("Klasse"));
        erster=erster.HintenEinfügen(new DATENELEM("Knoten"));
        erster=erster.HintenEinfügen(new DATENELEM("Kompositum"));
        erster=erster.HintenEinfügen(new DATENELEM("LIFO"));
        erster=erster.HintenEinfügen(new DATENELEM("Liste"));
        erster=erster.HintenEinfügen(new DATENELEM("Objekt"));
        erster=erster.HintenEinfügen(new DATENELEM("Polymorphismus"));
        erster=erster.HintenEinfügen(new DATENELEM("Rekursion"));
        erster=erster.HintenEinfügen(new DATENELEM("Stapel"));
        erster=erster.HintenEinfügen(new DATENELEM("Suchbaum"));
        erster=erster.HintenEinfügen(new DATENELEM("Warteschlange"));
        erster=erster.HintenEinfügen(new DATENELEM("Zustandsautomat"));
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
        return erster.LetztenKnotenGeben(erster);
    }
    
    /*LISTE ListeDerLetztenAnzahlKnotenGeben(int n){
        
    }*/
    
    LISTE RechteHälfteTrennen(){
        Double mitteDouble = (LängeGeben()/2.0)+0.5;
        int mitte = mitteDouble.intValue();
        LISTE l = new LISTE();
        LISTENELEM elem = erster;
        for(int i=1; i<mitte; i++){
            elem = elem.NächsterGeben();
        }
        elem = elem.NächsterGeben();
        while(elem.InhaltGeben()!=null){
            l.HintenEinfügen(elem.InhaltGeben());
            elem = elem.NächsterGeben();
        }
        return l;
    }

    KNOTEN MitteGeben(){
        Double mitteDouble = (LängeGeben()/2.0)+0.5;
        int mitte = mitteDouble.intValue();
        KNOTEN elem = (KNOTEN)erster;
        for(int i=1; i<mitte; i++){
            elem = (KNOTEN)elem.NächsterGeben();
        }
        return new KNOTEN (null, elem.InhaltGeben());
    }
    
    LISTE LinkeHälfteTrennen(){
        Double mitteDouble = (LängeGeben()/2.0)+0.5;
        int mitte = mitteDouble.intValue();
        LISTENELEM elem = erster;
        LISTE l = new LISTE();
        for(int i=1; i<mitte; i++){
            l.HintenEinfügen(elem.InhaltGeben());
            elem = elem.NächsterGeben();
        }
        return l;
    }
}

