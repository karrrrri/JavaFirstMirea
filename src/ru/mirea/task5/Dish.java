package ru.mirea.task5;

public abstract class Dish {
    private String color;
    private String material;
    private int amount;

    public String getColor(){return color;}
    public String getMaterial(){return material;}
    public int getAmount(){return amount;}

    public Dish(String color, String material, int amount){
        this.color = color;
        this.material = material;
         this.amount = amount;
    }

    public abstract String toString();
}

class Mugs extends Dish{
    public Mugs(String color, String material, int amount){
        super(color, material, amount);
    }
    @Override
    public String toString(){
        return "Цвет кружки: " +super.getColor()+ "; Материал кружки: " +super.getMaterial()+ "; Количество кружек: " +super.getAmount();
    }
}

class Plates extends Dish{
    public Plates(String color, String material, int amount){
        super(color, material, amount);
    }
    @Override
    public String toString(){
        return "Цвет тарелки: " +getColor()+ "; Материал тарелки: " +getMaterial()+ "; Количество тарелок: " +getAmount();
    }
}

class Spoons extends Dish{
    public Spoons(String color, String material, int amount){
        super(color, material, amount);
    }
    @Override
    public String toString(){
        return "Цвет ложки: " +getColor()+ "; Материал ложки: " +getMaterial()+ "; Количество ложек: " +getAmount();
    }
}