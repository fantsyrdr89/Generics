package armstrong.alexandra;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class MySetTest {
    MySet<Integer> test;

    @Before
    public void SetUp(){
        test = new MySet<>();
        test.add(1);
        test.add(2);
        test.add(3);
    }

    @Test
    public void addTest(){
        test.add(3);
        int expected = 3;
        int actual = test.length();
        assertEquals(expected, actual);
    }

    @Test
    public void addTest2(){
        test.add(3);
        Integer expected = null;
        Integer actual = test.get(3);
        assertEquals(expected, actual);
    }

    @Test
    public void addTest3(){
        test.add(3, 0);
        int expected = 3;
        int actual = test.length();
        assertEquals(expected, actual);
    }

    @Test
    public void addTest4(){
        test.add(4, 0);
        int expected = 4;
        int actual = test.get(0);
        assertEquals(expected, actual);
    }

    @Test
    public void addTest5(){
        test.add(4, 0);
        Integer[] expected = {4, 1, 2, 3};
        Object[] temp = test.toArray();
        Integer[] actual = new Integer[temp.length];
        for(int i = 0; i < temp.length; i++){
            actual[i] = (Integer) temp[i];
        }
        assertArrayEquals(expected, actual);
    }

    @Test
    public void setTest(){
        test.set(3, 0);
        int expected = 1;
        int actual = test.get(0);
        assertEquals(expected, actual);
    }

}
