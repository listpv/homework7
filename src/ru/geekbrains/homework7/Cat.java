package ru.geekbrains.homework7;

public class Cat
{

    private String name;
    private int appetite;
    private boolean satiety;

    public Cat(String name, int appetite)
    {
        this.name = name;
        this.appetite = appetite;
        satiety = false;
    }

    public void eatFrom(Plate p)
    {
        satiety = p.decreaseFood(appetite);
    }

    public boolean getSatiety()
    {
        return satiety;
    }

    public String getName()
    {
        return name;
    }

    public int getAppetite()
    {
        return appetite;
    }

}
