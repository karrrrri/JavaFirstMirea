package ru.mirea.task4;

public class Ball {
    private
    double x ;
    double y ;

    public Ball(double X, double Y){
        X = x;
        Y = y;
    }
    public Ball(){
        x = 2.5;
        y = 3.5;
    }
    public double getX(){return x;}
    public double getY(){return y;}

    public void setX(double x){
        this.x = x;
    }
    public void setY(double y){
        this.y = y;
    }
    public void setXY(double x, double y){
        this.x = x;
        this.y = y;
    }
    
    public double moveX(double xDisp){
        x += xDisp;
        return(x);
    }
    public double moveY(double yDisp){
        y += yDisp;
        return(y);
    }

    @Override
    public String toString(){
        return +this.x+this.y+"";
    }
}
