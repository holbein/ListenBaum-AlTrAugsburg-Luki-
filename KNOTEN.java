//Knoten Klasse der Liste
class KNOTEN extends LISTENELEM {
    private LISTENELEM nächster;
    private DATENELEM inhalt;
    
    KNOTEN(LISTENELEM le, DATENELEM i) {
        nächster = le;
        inhalt = i;
    }

    LISTENELEM NächsterGeben(){
        return nächster;
    }
    
    void NächsterSetzen(LISTENELEM le) {
        nächster = le;
    }
    
    DATENELEM InhaltGeben(){
        return inhalt;
    }
    
    boolean IstListeLeer(){
        return false;
    }
    
    int AnzahlGeben(){
        return 1 + nächster.AnzahlGeben();   
    }
    
    KNOTEN HintenEinfügen(DATENELEM i) {
        nächster = nächster.HintenEinfügen(i);
        return this;
    }
        
    LISTENELEM LetztenKnotenLöschen(LISTENELEM le){
       
    }
    
    LISTENELEM LetztenKnotenGeben(LISTENELEM le){
 
    }
    
}
