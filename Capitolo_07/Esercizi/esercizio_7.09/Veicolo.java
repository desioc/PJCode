public abstract class Veicolo {
    private String marca;
    private String modello;

    public Veicolo(String marca, String modello) {
        this.marca = marca;
        this.modello = modello;
    }

    public void avvia() {
        System.out.println("Veicolo avviato");
    }

    public void ferma() {
        System.out.println("Veicolo fermato");
    }

    public String getMarca() { 
        return marca; 
    }

    public void setMarca(String marca) { 
        this.marca = marca; 
    }

    public String getModello() { 
        return modello; 
    }

    public void setModello(String modello) { 
        this.modello = modello; 
    }
}

class Auto extends Veicolo {
    private String targa;
    private int cilindrata;

    public Auto(String marca, String modello, String targa, int cilindrata) {
        super(marca, modello);
        this.targa = targa;
        this.cilindrata = cilindrata;
    }

    public void accendiLuci() {
        System.out.println("Luci accese");
    }

    public String getTarga() { 
        return targa; 
    }

    public void setTarga(String targa) { 
        this.targa = targa; 
    }

    public int getCilindrata() { 
        return cilindrata; 
    }

    public void setCilindrata(int cilindrata) { 
        this.cilindrata = cilindrata; 
    }
}



class Bicicletta extends Veicolo {
    private String telaio;
    private int numeroMarce;

    public Bicicletta(String marca, String modello, String telaio, 
      int numeroMarce) {
        super(marca, modello);
        this.telaio = telaio;
        this.numeroMarce = numeroMarce;
    }

    public void parcheggia() {
        System.out.println("Bicicletta parcheggiata");
    }

    public String getTelaio() { 
        return telaio; 
    }

    public void setTelaio(String telaio) { 
        this.telaio = telaio; 
    }

    public int getNumeroMarce() { 
        return numeroMarce; 
    }

    public void setNumeroMarce(int numeroMarce) { 
        this.numeroMarce = numeroMarce; 
    }
}

class Berlina extends Auto {
    private boolean comfortElevato;

    public Berlina(String marca, String modello, String targa, 
      int cilindrata, boolean comfortElevato) {
        super(marca, modello, targa, cilindrata);
        this.comfortElevato = comfortElevato;
    }

    public boolean isComfortElevato() { 
        return comfortElevato; 
    }
    
    public void setComfortElevato(boolean comfortElevato) { 
        this.comfortElevato = comfortElevato; 
    }
}

class SUV extends Auto {
    private boolean trazioneIntegrale;

    public SUV(String marca, String modello, String targa, 
      int cilindrata, boolean trazioneIntegrale) {
        super(marca, modello, targa, cilindrata);
        this.trazioneIntegrale = trazioneIntegrale;
    }

    public boolean isTrazioneIntegrale() { 
        return trazioneIntegrale; 
    }

    public void setTrazioneIntegrale(boolean trazioneIntegrale) {   
        this.trazioneIntegrale = trazioneIntegrale; 
    }
}

class MountainBike extends Bicicletta {
    private boolean sospensioniAttive;

    public MountainBike(String marca, String modello, String telaio, 
      int numeroMarce, boolean sospensioniAttive) {
        super(marca, modello, telaio, numeroMarce);
        this.sospensioniAttive = sospensioniAttive;
    }

    public boolean isSospensioniAttive() { 
        return sospensioniAttive; 
    }

    public void setSospensioniAttive(boolean sospensioniAttive) {  
        this.sospensioniAttive = sospensioniAttive; 
    }
}

class BiciclettaDaCorsa extends Bicicletta {
    private boolean piegaBassa;

    public BiciclettaDaCorsa(String marca, String modello, String telaio, 
      int numeroMarce, boolean piegaBassa) {
        super(marca, modello, telaio, numeroMarce);
        this.piegaBassa = piegaBassa;
    }

    public boolean isPiegaBassa() { 
        return piegaBassa; 
    }

    public void setPiegaBassa(boolean piegaBassa) { 
        this.piegaBassa = piegaBassa; 
    }
}
