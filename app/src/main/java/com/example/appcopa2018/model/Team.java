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
        players.put("Alisson", new Player("Alisson", 1, "Goleiro"));
        players.put("Thiago Silva", new Player("Thiago Silva", 2, "Zagueiro"));
        players.put("Miranda", new Player("Miranda", 3, "Zagueiro"));
        players.put("Geromel", new Player("Geromel", 4, "Zagueiro"));
        players.put("Casemiro", new Player("Casemiro", 5, "Meia"));
        players.put("Filipe Luís", new Player("Filipe Luís", 6, "Lateral"));
        players.put("Douglas Costa", new Player("Douglas Costa", 7, "Atacante"));
        players.put("Renato Augusto", new Player("Renato Augusto", 8, "Meia"));
        players.put("Gabriel Jesus", new Player("Gabriel Jesus", 9, "Atacante"));
        players.put("Neymar", new Player("Neymar", 10, "Atacante"));
        players.put("Coutinho", new Player("Coutinho", 11, "Meia"));
        players.put("Marcelo", new Player("Marcelo", 12, "Lateral"));
        players.put("Marquinhos", new Player("Marquinhos", 13, "Zagueiro"));
        players.put("Danilo", new Player("Danilo", 14, "Lateral"));
        players.put("Paulinho", new Player("Paulinho", 15, "Meia"));
        players.put("Cássio", new Player("Cássio", 16, "Goleiro"));
        players.put("Fernandinho", new Player("Fernandinho", 17, "Meia"));
        players.put("Fred", new Player("Fred", 18, "Meia"));
        players.put("Willian", new Player("Willian", 19, "Meia"));
        players.put("Firmino", new Player("Firmino", 20, "Atacante"));
        players.put("Taison", new Player("Taison", 21, "Atacante"));
        players.put("Fagner", new Player("Fagner", 22, "Lateral"));
        players.put("Ederson", new Player("Ederson", 23, "Goleiro"));
    }
}
