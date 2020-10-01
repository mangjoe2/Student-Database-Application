package StudentDatabase;

public class DemoApplication {
   public class TestOverriding 

    public static void main(String[] tblArgs)
    {
        Test t = new Fest();
        t.tests();
    }
// }

class Test
{
    void tests()
    {
        System.out.println(“Test class : tests”);
    }
}

class Fest extends Test
{
    static void tests()
    {
        System.out.println(“Fest class : tests”);
    }
}
    
}
