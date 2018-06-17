package com.example.appcopa2018.model;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public class Team {

    protected static LinkedHashMap<String, Player> players;

    public static List<String> getPlayerNames() {
        List<String> names = new ArrayList<>();
        names.addAll(players.keySet());
        return names;
    }

    public static Player getPlayer(String name) {
        return players.get(name);
    }

    public static void fillList() {
        players = new LinkedHashMap<>();
        players.put("Alisson", new Player("Alisson", 1, "Goleiro", "alisson"));
        players.put("Thiago Silva", new Player("Thiago Silva", 2, "Zagueiro", "thiago_silva"));
        players.put("Miranda", new Player("Miranda", 3, "Zagueiro", "miranda"));
        players.put("Geromel", new Player("Geromel", 4, "Zagueiro", "geromel"));
        players.put("Casemiro", new Player("Casemiro", 5, "Meia", "casemiro"));
        players.put("Filipe Luís", new Player("Filipe Luís", 6, "Lateral", "filipe_luis"));
        players.put("Douglas Costa", new Player("Douglas Costa", 7, "Atacante", "douglas_costa"));
        players.put("Renato Augusto", new Player("Renato Augusto", 8, "Meia", "renato_augusto"));
        players.put("Gabriel Jesus", new Player("Gabriel Jesus", 9, "Atacante", "gabriel_jesus"));
        players.put("Neymar", new Player("Neymar", 10, "Atacante", "neymar"));
        players.put("Coutinho", new Player("Coutinho", 11, "Meia", "coutinho"));
        players.put("Marcelo", new Player("Marcelo", 12, "Lateral", "marcelo"));
        players.put("Marquinhos", new Player("Marquinhos", 13, "Zagueiro", "marquinhos"));
        players.put("Danilo", new Player("Danilo", 14, "Lateral", "danilo"));
        players.put("Paulinho", new Player("Paulinho", 15, "Meia", "paulinho"));
        players.put("Cássio", new Player("Cássio", 16, "Goleiro", "cassio"));
        players.put("Fernandinho", new Player("Fernandinho", 17, "Meia", "fernandinho"));
        players.put("Fred", new Player("Fred", 18, "Meia", "fred"));
        players.put("Willian", new Player("Willian", 19, "Meia", "willian"));
        players.put("Firmino", new Player("Firmino", 20, "Atacante", "firmino"));
        players.put("Taison", new Player("Taison", 21, "Atacante", "taison"));
        players.put("Fagner", new Player("Fagner", 22, "Lateral", "fagner"));
        players.put("Ederson", new Player("Ederson", 23, "Goleiro", "ederson"));
    }
}
