package armstrong.alexandra;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;

public class MyArrayListTest {
    MyArrayList<Integer> test;

    @Before
    public void SetUp(){
        test = new MyArrayList<>();
        test.add(1);
        test.add(2);
    }

    @Test
    public void addTest1(){
        test.add(3);
        int expected = 3;
        int actual = test.length();
        assertEquals(expected, actual);
    }

    @Test
    public void addTest2(){
        test.add(3);
        int expected = 3;
        int actual = test.get(2);
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
        test.add(3, 0);
        int expected = 3;
        int actual = test.get(0);
        assertEquals(expected, actual);
    }

    @Test
    public void getTest(){
        int expected = 1;
        int actual = test.get(0);
        assertEquals(expected, actual);
    }

    @Test
    public void removeTest1(){
        test.add(3);
        test.add(4);
        test.add(5);
        test.remove(2);
        int expected = 4;
        int actual = test.get(2);
        assertEquals(expected, actual);
    }

    @Test
    public void removeTest2(){
        test.add(3);
        test.add(4);
        test.add(5);
        test.remove(4);
        Integer expected = null;
        Integer actual = test.get(4);
        assertEquals(expected, actual);
    }

    @Test
    public void setTest(){
        test.set(3, 0);
        int expected = 3;
        int actual = test.get(0);
        assertEquals(expected, actual);
    }

    @Test
    public void clearTest(){
        test.clear();
        Integer expected = null;
        Integer actual = test.get(1);
        assertEquals(expected, actual);
    }

    @Test
    public void clearTest2(){
        test.clear();
        int expected = 0;
        int actual = test.length();
        assertEquals(expected, actual);
    }

    @Test
    public void isEmptyTestFalse(){
        assertFalse(test.isEmpty());
    }

    @Test
    public void isEmptyTestTrue(){
        test.clear();
        assertTrue(test.isEmpty());
    }

    @Test
    public void isFullTestFalse(){
        test.clear();
        assertFalse(test.isFull());
    }

    @Test
    public void isFullTestTrue(){
        test.add(3);
        test.add(4);
        test.add(5);
        test.add(6);
        test.add(7);
        test.add(8);
        test.add(9);
        test.add(10);
        assertTrue(test.isFull());
    }

    @Test
    public void containsTestFalse(){
        assertFalse(test.contains(5));
    }

    @Test
    public void containsTestTrue(){
        assertTrue(test.contains(1));
    }

}