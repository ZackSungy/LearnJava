package Chapter6.staticInnerClass;

public class StaticInnerClassTest {
    public static void main(String[] args) {
        double[] d = new double[20];
        for (int i = 0; i < d.length; i++) {
            d[i] = 100 * Math.random();
        }
    }

    class ArrayAlg
    {
        class Pair
        {
            private double first;
            private double second;

            public Pair(double f,double s)
            {
                first = f;
                second = s;
            }

            public double getFirst()
            {
                return first;
            }

            public double getSecond()
            {
                return second;
            }
        }
    }

}
