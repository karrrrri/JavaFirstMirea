package ru.mirea.task5;

public abstract class Dog {
    private String name;
    private String breed;

    public String getName() { return name;}
    public String getBreed() { return breed;}

    public Dog(String name, String breed){
        this.name = name;
        this.breed = breed;
    }

    public abstract String toString();
}

class Give extends Dog{
    private String shelter;
    public Give(String name, String breed, String home){
        super(name, breed);
        this.shelter = home;
    }
    @Override
    public String toString(){
        return "Имя: " + super.getName() + "; Порода: " + super.getBreed() + "; Отдали в приют: " + shelter ;
    }
}

class Take extends Dog{
    private String shelter;
    public Take(String name, String breed, String home){
        super(name, breed);
        this.shelter = home;
    }
    @Override
    public String toString(){
        return "Имя: " +super.getName()+ "; Порода: " +super.getBreed()+ "; Забрали из приюта: " +shelter;
    }
}

