package Chapter5;

import java.util.Objects;

public class Manager extends Employee{
    private double bouns;

    public Manager(String name, double salary, int year, int month, int day) {
        super(name, salary, year, month, day);
        bouns = 0;
    }

    @Override
    public double getSalary(){
        double baseSalary = super.getSalary();
        return baseSalary + bouns;
    }

    public void setBouns(double bouns){
        this.bouns = bouns;
    }

    @Override
    public boolean equals(Object otherObject){
       if(!super.equals(otherObject)){
           return false;
       }
       Manager other = (Manager)otherObject;
       return bouns == other.bouns;
    }

    @Override
    public int hashCode(){
        return super.hashCode() + 17 * new Double(bouns).hashCode();
    }

    @Override
    public String toString(){
        return super.toString() + "[bouns="+bouns+"]";
    }
}
