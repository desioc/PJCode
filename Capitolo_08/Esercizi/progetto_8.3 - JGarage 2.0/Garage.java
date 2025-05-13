// classe Garage
package com.jgarage.business;

import com.jgarage.model.*;
import java.util.*;

public class Garage {

    private final Map<Dimensione, List<Auto>> parcheggiAuto;
    private final List<Moto> parcheggiMoto;
    private final Map<Dimensione, Integer> capacitaMassimaAuto;
    private final int capacitaMassimaMoto;

    public Garage() {
        parcheggiAuto = new EnumMap<>(Dimensione.class);
        parcheggiMoto = new ArrayList<>();
        capacitaMassimaAuto = new EnumMap<>(Dimensione.class);

        for (Dimensione d : Dimensione.values()) {
            parcheggiAuto.put(d, new ArrayList<>());
        }

        capacitaMassimaAuto.put(Dimensione.PICCOLA, 2);
        capacitaMassimaAuto.put(Dimensione.MEDIA, 2);
        capacitaMassimaAuto.put(Dimensione.GRANDE, 2);
        capacitaMassimaMoto = 2;
    }

    public void permettiAccesso(Motorizzato veicolo) {
        if (veicolo instanceof Auto auto) {
            List<Auto> lista = parcheggiAuto.get(auto.dimensione());
            if (lista.size() < capacitaMassimaAuto.get(auto.dimensione())) {
                lista.add(auto);
            }
        } else if (veicolo instanceof Moto moto) {
            if (!moto.accessori()) {
                if (parcheggiMoto.size() < capacitaMassimaMoto) {
                    parcheggiMoto.add(moto);
                } else {
                    List<Auto> postiPiccoli = parcheggiAuto.get(Dimensione.PICCOLA);
                    if (postiPiccoli.size() < capacitaMassimaAuto.get(Dimensione.PICCOLA)) {
                        postiPiccoli.add(new Auto(moto.targa(), Dimensione.PICCOLA));
                    }
                }
            } else {
                List<Auto> postiPiccoli = parcheggiAuto.get(Dimensione.PICCOLA);
                if (postiPiccoli.size() < capacitaMassimaAuto.get(Dimensione.PICCOLA)) {
                    postiPiccoli.add(new Auto(moto.targa(), Dimensione.PICCOLA));
                }
            }
        }
    }

    public void permettiUscita(Motorizzato veicolo) {
        if (veicolo instanceof Auto auto) {
            parcheggiAuto.get(auto.dimensione()).remove(auto);
        } else if (veicolo instanceof Moto moto) {
            parcheggiMoto.remove(moto);
            List<Auto> lista = parcheggiAuto.get(Dimensione.PICCOLA);
            for (Iterator<Auto> it = lista.iterator(); it.hasNext(); ) {
                Auto auto = it.next();
                if (auto.targa().equals(moto.targa())) {
                    it.remove();
                    break;
                }
            }
        }
    }

    public int numeroVeicoliParcheggiati() {
        int count = parcheggiMoto.size();
        for (Dimensione d : parcheggiAuto.keySet()) {
            count += parcheggiAuto.get(d).size();
        }
        return count;
    }

    public boolean cercaVeicolo(String targa) {
        for (Moto moto : parcheggiMoto) {
            if (targa != null && targa.equals(moto.targa())) {
                return true;
            }
        }
        for (Dimensione d : parcheggiAuto.keySet()) {
            for (Auto auto : parcheggiAuto.get(d)) {
                if (targa != null && targa.equals(auto.targa())) {
                    return true;
                }
            }
        }
        return false;
    }

    public Map<Dimensione, List<Auto>> getParcheggiAuto() {
        return Collections.unmodifiableMap(parcheggiAuto);
    }

    public List<Moto> getParcheggiMoto() {
        return Collections.unmodifiableList(parcheggiMoto);
    }
}