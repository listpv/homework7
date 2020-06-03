package ru.geekbrains.homework7;

public class Plate
{
    private int food;

    public Plate(int food)
    {
        this.food = food;
    }

    public boolean decreaseFood(int n)
    {
        if((food - n) >=0)
        {
            food -= n;
            return true;
        }
        else
            {
                System.out.print("В тарелке недостаточно еды. ");
                info();
                return false;
            }
    }

//    Добавить в тарелку метод, с помощью которого можно было бы добавлять еду в тарелку.
    public void setFood(int f)
    {
        food += f;
        System.out.println("Количество еды в тарелке увелимилось на " + f);
    }

    public void info()
    {
        System.out.println("Количество еды " + food);
    }
}
