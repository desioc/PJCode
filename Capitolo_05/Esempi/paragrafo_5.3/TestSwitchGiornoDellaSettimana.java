public class TestSwitchGiornoDellaSettimana {

    public String getTipoGiornoSettimana(String giornoDellaSettimana) {
        String typeOfDay;
        switch (giornoDellaSettimana) {
            case "Monday" :
                typeOfDay = "Inizio settimana lavorativa" ;
            break;
            case "Tuesday" :
                case "Wednesday" :
                case "Thursday" :
                typeOfDay = "Parte centrale della settimana lavorativa" ;
            break;
            case "Friday" :
                typeOfDay = "Fine settimana lavorativa" ;
            break;
            case "Saturday" :
                case "Sunday" :
                typeOfDay = "Weekend" ;
            break;
            default:
                typeOfDay = "Indefinito!" ;
            break;
        }
        return typeOfDay;
    }
    
    public static void main(String args[]) {
        String tipo = new TestSwitchGiornoDellaSettimana().getTipoGiornoSettimana("Wednesday");
        System.out.println(tipo);
    }
}