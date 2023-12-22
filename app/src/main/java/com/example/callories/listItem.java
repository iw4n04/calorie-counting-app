package com.example.myapplication.db;

import java.io.Serializable;

public class listItem implements Serializable{
    private String name;
    private String time;
    private int counting;
    private int id = 0;
    public int getId()
    {
        return id;
    }
    public void setId(int id)
    {
        this.id = id;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public String getTime()
    {
        return time;
    }
    public void setTime(String time)
    {
        this.time = time;
    }
    public int getCounting()
    {
        return counting;
    }
    public void setCounting(int counting)
    {
        this.counting = counting;
    }
}
