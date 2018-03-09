//Klasse für Ende der Liste
class ABSCHLUSS extends LISTENELEM {

    LISTENELEM NächsterGeben() {
        return this;
    }
    
    DATENELEM InhaltGeben(){
        return null;
    }
    
    void NächsterSetzen(LISTENELEM le){
    }
    
    boolean IstListeLeer(){
        return true;
    }

    int AnzahlGeben(){
        return 0;
    }
    
    
    
    KNOTEN HintenEinfügen(DATENELEM i) {
        return new KNOTEN(this, i);
    }
        
    LISTENELEM LetztenKnotenLöschen(LISTENELEM le){
        
    }
        
    LISTENELEM LetztenKnotenGeben(LISTENELEM le){
       
    }
    
}
