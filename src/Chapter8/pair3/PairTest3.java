package Chapter8.pair3;

import Chapter5.Employee;
import Chapter5.Manager;
public class PairTest3 {
    public static void main(String[] args)
    {
        Manager ceo = new Manager("Gus Greedy",800000,2003,12,15);
        Manager cfo = new Manager("Sid Sneaky",600000,2003,12,15);
        Pair<Employee> buddies = new Pair<>(ceo,cfo);
        printBuddies (buddies);

        ceo.setBouns(1000000);
        cfo.setBouns(500000);

        Manager[] managers = {ceo,cfo};

        Pair<Manager> result = new Pair<>();
        minmaxBouns(managers,result);
        System.out.println("first:" + result.getFirst() + ",second:" + result.getSecond());
        maxminBouns(managers,result);
        System.out.println("first:" + result.getFirst() + ",second:" +result.getSecond());
    }
    public static void printBuddies(Pair<? extends Employee> p)
    {
        Employee first = p.getFirst();
        Employee second = p.getSecond();
        System.out.println(first.getName() + "and" + second.getName() + "are buddies.");
    }

    public static void minmaxBouns(Manager[] a,Pair<? super Manager> result)
    {
        if(a.length == 0){
            return;
        }

        Manager min = a[0];
        Manager max = a[0];
        for(int i = 1;i<a.length;i++){
            if(min.getBouns() > a[i].getBouns()){
                min = a[i];
            }
            if(max.getBouns() < a[i].getBouns()){
                max = a[i];
            }
        }
        result.setFirst(min);
        result.setSecond(max);
    }

    public static void maxminBouns(Manager[] a,Pair<? super Manager> result)
    {
        minmaxBouns(a,result);
        PairAlg.swapHelper(result);
    }
}

class PairAlg
{
    public static boolean hasNulls(Pair<?> p)
    {
        return p.getFirst() == null || p.getSecond() == null;
    }

    public static void swap(Pair<?> p)
    {
        swapHelper(p);
    }

    public static <T> void swapHelper(Pair<T> p)
    {
        T t = p.getFirst();
        p.setFirst(p.getSecond());
        p.setSecond(t);
    }
}


class Pair<T>
{
    private T first;
    private T second;

    public Pair()
    {
        first = null;
        second = null;
    }

    public Pair(T first,T second)
    {
        this.first = first;
        this.second = second;
    }

    public T getFirst()
    {
        return first;
    }

    public T getSecond()
    {
        return second;
    }

    public void setFirst(T newValue)
    {
        first = newValue;
    }

    public void setSecond(T newValue)
    {
        second = newValue;
    }
}
