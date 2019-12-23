package clutter;

import java.util.Random;

public class EmpConTest {
    private static int nextId;

    private String name = "";
    private double salary;
    private int id;

    static {
        Random generator = new Random();
        nextId = generator.nextInt(10000);
    }

    {
        id = nextId;
        nextId++;
    }

    public EmpConTest(String n, double s) {
        name = n;
        salary = s;
    }

    public EmpConTest(double s){
        this("Enployee #"+nextId,s);
    }

    public EmpConTest(){
        
    }

    public String getName() {
        return name;

    }

    public double getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString(){
        return getClass()+"[name="+name+",salary="+salary+",id="+id+"]";
    }
}
