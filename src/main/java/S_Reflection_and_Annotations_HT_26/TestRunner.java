package S_Reflection_and_Annotations_HT_26;


import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.PriorityQueue;
import java.util.Queue;


public class TestRunner {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException,
            NoSuchMethodException, InstantiationException, TestException {
        ClassTest classTest = new ClassTest();
        Class clazz = classTest.getClass();
        start(clazz);
    }

    public static void start(Class c) throws InvocationTargetException, IllegalAccessException,
            NoSuchMethodException, InstantiationException, TestException {
        Object o = c.getConstructor().newInstance();
        Method[] methods = c.getDeclaredMethods();
        Queue<Method> queueBefore = new PriorityQueue<>((m1, m2) -> Integer.compare(m2.getDeclaredAnnotation(BeforeSuite.class).value(),
                m1.getDeclaredAnnotation(BeforeSuite.class).value()));
        Queue<Method> queueTest = new PriorityQueue<>((m1, m2) -> Integer.compare(m2.getDeclaredAnnotation(Test.class).value(),
                m1.getDeclaredAnnotation(Test.class).value()));
        Queue<Method> queueAfter = new PriorityQueue<>((m1, m2) -> Integer.compare(m2.getDeclaredAnnotation(AfterSuite.class).value(),
                m1.getDeclaredAnnotation(AfterSuite.class).value()));
        for (Method m : methods) {
            if (m.getDeclaredAnnotation(Test.class) != null) {
                if (m.getDeclaredAnnotation(BeforeSuite.class) != null) {
                    queueBefore.add(m);
                } else if (m.getDeclaredAnnotation(AfterSuite.class) != null) {
                    queueAfter.add(m);
                } else {
                    queueTest.add(m);
                }
            }
        }
        if (queueBefore.size() > 1 || queueAfter.size() > 1) {
            throw new TestException("There can be only one method with @BeforeSuite and @AfterSuite");
        }
        Method m;
        while ((m = queueBefore.poll()) != null) {
            m.invoke(o);
        }
        while ((m = queueTest.poll()) != null) {
            m.invoke(o);
        }
        while ((m = queueAfter.poll()) != null) {
            m.invoke(o);
        }
    }
}
