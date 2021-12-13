package ru.mirea.task5;

public abstract class Furniture{
    private String color;
    private String material;
    private int amount;

    public String getColor(){return color;}
    public String getMaterial(){return material;}
    public int getAmount(){return amount;}

    public Furniture(String color, String material, int amount){
        this.color = color;
        this.material = material;
        this.amount = amount;
    }

    public abstract String toString();
}

class Chairs extends Furniture{
    public Chairs(String color, String material, int amount){
        super(color, material, amount);
    }
    @Override
    public String toString(){
        return "Цвет стула: " +super.getColor()+ "; Материал стула: " +super.getMaterial()+ "; Количество стульев: " +super.getAmount();
    }
}

class Tables extends Furniture{
    public Tables(String color, String material, int amount){
        super(color, material, amount);
    }
    @Override
    public String toString(){
        return "Цвет стола: " +getColor()+ "; Материал стола: " +getMaterial()+ "; Количество столов: " +getAmount();
    }
}

class Divans extends Furniture{
    public Divans(String color, String material, int amount){
        super(color, material, amount);
    }
    @Override
    public String toString(){
        return "Цвет дивана: " +getColor()+ "; Материал дивана: " +getMaterial()+ "; Количество диванов: " +getAmount();
    }
}
