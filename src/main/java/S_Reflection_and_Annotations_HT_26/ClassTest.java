package S_Reflection_and_Annotations_HT_26;

public class ClassTest {

    @Test(value = 3)
    @AfterSuite(value = 2)
    public void afterMethod() {
        System.out.println(" AfterSuite method ! ");
    }

    @Test(value = 2)
    public void test() {
        System.out.println(" TEST method ! ");
    }

    @Test(value = 1)
    @BeforeSuite(value = 5)
    public void beforeMethod() {
        System.out.println(" BeforeSuite method ! ");
    }

    public void noAnnotation() {
        System.out.println(" This method has no annotation ! ");
    }
}
