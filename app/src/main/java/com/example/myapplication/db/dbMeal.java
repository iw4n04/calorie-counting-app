package com.example.myapplication.db;
public class dbMeal {
    private int id;
    private String name;
    private String time;
    private int calories;
    private String date;
    public dbMeal() {
    }
    public dbMeal(int id, String name, String time, int calories, String date) {
        this.id = id;
        this.name = name;
        this.time = time;
        this.calories = calories;
        this.date = date;
    }
    public dbMeal(String name, String time, int calories, String date) {
        this.name = name;
        this.time = time;
        this.calories = calories;
        this.date = date;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getTime() {
        return time;
    }
    public void setTime(String time) {
        this.time = time;
    }
    public int getCalories() {
        return calories;
    }
    public void setCalories(int calories) {
        this.calories = calories;
    }
    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }
}
