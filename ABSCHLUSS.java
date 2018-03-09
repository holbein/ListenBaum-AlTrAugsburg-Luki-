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
        
    LISTENELEM LetztenKnotenLöschen(){
        //Gibt null zurück um zu zeigen, dass er der letzte ist
        return null;
    }
        
    LISTENELEM LetztenKnotenGeben(LISTENELEM le){
       return le;
    }
    
}
