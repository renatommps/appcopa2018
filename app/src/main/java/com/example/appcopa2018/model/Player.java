package com.example.appcopa2018.model;

public class Player {

    protected String name;
    protected int number;
    protected String position;
    protected String img;

    public Player(String _name, int _number, String _position, String _img) {
        name = _name;
        number = _number;
        position = _position;
        img = _img;
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
    public void setImg(String _imgUrl) {
        img = _imgUrl;
    }
    public String getImg() {
        return img;
    }

    public String toString() {
        return name + ", " + position + ", camisa nº " + number;
    }
}
