public class TestSquadra {
    public static void main(String args[]) {
        Squadra fcSantaClaus = new Squadra("FC Santa Claus");
        fcSantaClaus.calciatori[0] = new Calciatore("Ojaniemi", RuoloCalciatore.PORTIERE);
        fcSantaClaus.calciatori[1] = new Calciatore("Salminen", RuoloCalciatore.DIFENSORE);
        fcSantaClaus.calciatori[2] = new Calciatore("Maisonvaara", RuoloCalciatore.CENTROCAMPISTA);
        fcSantaClaus.calciatori[3] = new Calciatore("Tauriainen", RuoloCalciatore.ATTACCANTE);
        fcSantaClaus.gioca();
    }
}