package clutter;

public class ConstructorTest {
    public static void main(String[] args) {
        //fill the staff array with three Employee objects
        EmpConTest[] staff = new EmpConTest[3];

        staff[0] = new EmpConTest("Tom", 40000);
        staff[1] = new EmpConTest( 60000);
        staff[2] = new EmpConTest();

        for (EmpConTest e : staff) {
            System.out.println(e);
        }
    }

}
