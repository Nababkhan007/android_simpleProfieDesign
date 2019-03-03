package com.example.practicewithrecyclerview;

public class PlayerListPojo {
    private String playerName;
    private int age;
    private String role;
    private String countryName;

    public PlayerListPojo() {

    }

    public PlayerListPojo(String playerName, int age, String role, String countryName) {
        this.playerName = playerName;
        this.age = age;
        this.role = role;
        this.countryName = countryName;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }
}
