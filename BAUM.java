class BAUM {
    private BAUMELEM wurzel;

    BAUM() {
        wurzel = new BAUMABSCHLUSS();
    }

    BAUM(LISTE l){
        wurzel = new BAUMKNOTEN(l);
    }
    
    int AnzahlKnoten(){
        return wurzel.AnzahlKnotenBerechnen();
    }
    
    void InOrderAusgeben(){
        wurzel.InOrderAusgeben();
    }
}
