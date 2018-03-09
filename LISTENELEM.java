//Oberklasse KNOTEN und ABSCHLUSS
abstract class LISTENELEM {
    abstract LISTENELEM NächsterGeben();
    abstract DATENELEM InhaltGeben();
    abstract void NächsterSetzen(LISTENELEM le);
    abstract LISTENELEM LetztenKnotenLöschen(LISTENELEM vorvorgänger);
    abstract LISTENELEM LetztenKnotenGeben(LISTENELEM vorgänger);
    abstract int AnzahlGeben();
    abstract boolean IstListeLeer();
    abstract KNOTEN HintenEinfügen(DATENELEM i);
    
    KNOTEN VorneEinfügen(DATENELEM i){
        return new KNOTEN(this, i);   
    }
    
}
