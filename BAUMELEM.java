//Oberklasse von Baumknoten und Baumabschluss
abstract class BAUMELEM {

    abstract BAUMELEM LinksGeben();
    abstract BAUMELEM RechtsGeben();
    abstract DATENELEM InhaltGeben();
    abstract int AnzahlKnotenBerechnen();
}
