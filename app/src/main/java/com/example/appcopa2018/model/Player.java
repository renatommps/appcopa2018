package com.example.appcopa2018.model;

public class Player {

    protected String name;
    protected int number;
    protected String position;

    public Player(String _name, int _number, String _position) {
        name = _name;
        number = _number;
        position = _position;
    }

    public void setName(String v) {
        name = v;
    }
    public String getName() {
        return name;
    }
    public void setNumber(int v) {
        number = v;
    }
    public int getNumber() {
        return number;
    }
    public void setPosition(String v) {
        position = v;
    }
    public String getPosition() {
        return position;
    }

    public String toString() {
        return name + ", " + position + ", camisa nº " + number;
    }
}
