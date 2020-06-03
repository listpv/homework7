package ru.geekbrains.homework7;

public class Practice7
{
/*    1. Расширить задачу про котов и тарелки с едой
2. Сделать так, чтобы в тарелке с едой не могло получиться отрицательного количества еды
(например, в миске 10 еды, а кот пытается покушать 15-20)
3. Каждому коту нужно добавить поле сытость (когда создаем котов, они голодны).
Если коту удалось покушать (хватило еды), сытость = true
        4. Считаем, что если коту мало еды в тарелке, то он ее просто не трогает,
        то есть не может быть наполовину сыт (это сделано для упрощения логики программы)
5. Создать массив котов и тарелку с едой, попросить всех котов покушать из этой тарелки
и потом вывести информацию о сытости котов в консоль
6. Добавить в тарелку метод, с помощью которого можно было бы добавлять еду в тарелку. */

    public static void main(String[] args)
    {
        Cat cat = new Cat("Barsik", 5);
        Plate plate = new Plate(10);
        plate.info();
        cat.eatFrom(plate);
        plate.info();
        plate.setFood(10);
        plate.info();

//        5. Создать массив котов и тарелку с едой, попросить всех котов покушать из этой тарелки
//        и потом вывести информацию о сытости котов в консоль

        Cat cat1 = new Cat("Murzik", 5);
        Cat cat2 = new Cat("Pushok", 5);
        Cat cat3 = new Cat("Ryzhik", 5);
        Cat cat4 = new Cat("Vas'ka", 5);
        Cat[] catFamily = {cat, cat1, cat2, cat3, cat4};

        for(int i = 0; i < catFamily.length; i++)
        {
            catFamily[i].eatFrom(plate);
            if(catFamily[i].getSatiety())
            {
                System.out.println(catFamily[i].getName() + " сыт.");
            }
            else
                {
                    System.out.println(catFamily[i].getName() + " голоден.");
                }
        }
        System.out.println();
        plate.info();
        System.out.println();

// *     Чтобы коты всегда были сытые.

        System.out.println("Все кошки сытые.");
        Cat cat5 = new Cat("Barsik", 6);
        Cat cat6 = new Cat("Murzik", 5);
        Cat cat7 = new Cat("Pushok", 4);
        Cat cat8 = new Cat("Ryzhik", 7);
        Cat cat9 = new Cat("Vas'ka", 5);
        Cat[] catHappyFamily = {cat5, cat6, cat7, cat8, cat9};
        Plate plateFull = new Plate(12);
        plateFull.info();

        for(int i = 0; i < catHappyFamily.length; i++)
        {
            do
                {
                    catHappyFamily[i].eatFrom(plateFull);
                    if(catHappyFamily[i].getSatiety())
                    {
                        System.out.println(catHappyFamily[i].getName() + " сыт.");
                    }
                    else
                        {
                            plateFull.setFood(catHappyFamily[i].getAppetite());
                        }
                }
            while (!catHappyFamily[i].getSatiety());
        }

        System.out.println();
        plateFull.info();
    }
}
