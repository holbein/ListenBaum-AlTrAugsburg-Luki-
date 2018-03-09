//Baum Klasse, welche den Binärbaum verwaltet
class BAUM {
    private BAUMELEM wurzel;

    BAUM() {
        wurzel = new BAUMABSCHLUSS();
    }

    BAUM(LISTE l){
        
    }
    
    int AnzahlKnoten(){
        return wurzel.AnzahlKnotenBerechnen();
    }
    
}
