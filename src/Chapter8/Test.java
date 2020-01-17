package Chapter8;

public class Test {
    public static void main(String[] args)
    {
        try {
            Class cl = Class.forName("Chapter8.pair3.PairTest3");
//            Class cl = Class.forName("java.lang.Object");
            System.out.println(cl.getTypeParameters().length);
            System.out.println(cl.getGenericInterfaces().length);
            System.out.println(cl.getGenericSuperclass());
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}
