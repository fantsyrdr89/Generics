package armstrong.alexandra;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class MyMapTest {
    MyMap<String, Integer> test;

    @Before
    public void SetUp(){
        test = new MyMap<>();
        test.add("One", 1);
        test.add("Two", 2);
        test.add("Three", 3);
    }

    @Test
    public void addTest1(){
        test.add("Four", 4);
        test.add("Five", 5);
        test.add("Six", 5);
        test.add("Seven", 5);
        test.add("Eight", 5);
        test.add("Nine", 5);
        test.add("Ten", 5);
        test.add("Eleven", 11);
        Integer expected = 11;
        Integer actual = test.getValue("Eleven");
        assertEquals(expected, actual);
    }

    @Test
    public void addTest4(){
        test.add("Four", 4);
        test.add("Five", 5);
        test.add("Six", 5);
        test.add("Seven", 5);
        test.add("Eight", 5);
        test.add("Nine", 5);
        test.add("Ten", 5);
        test.add("Eleven", 11);
        Integer expected = 11;
        Integer actual = test.length();
        assertEquals(expected, actual);
    }

    @Test
    public void addTest2(){
        test.add("Four", 4);
        int expected = 4;
        int actual = test.length();
        assertEquals(expected, actual);
    }

    @Test
    public void addTest3() {
        test.add("Three", 3);
        int expected = 3;
        int actual = test.length();
        assertEquals(expected, actual);
    }

    @Test
    public void getValueTest(){
        Integer expected = null;
        Integer actual = test.getValue("Thore");
        assertEquals(expected, actual);
    }

    @Test
    public void removeTest1(){
        test.remove("Three");
        int expected = 2;
        int actual = test.length();
        assertEquals(expected, actual);
    }

    @Test
    public void removeTest3(){
        test.add("Three",3);
        test.add("Four",4);
        test.add("Five", 5);
        test.remove("Two");
        Integer[] expected = {1, 3, 4, 5};
        Object[] temp = test.valueList();
        Integer[] actual = new Integer[temp.length];
        for(int i = 0; i < temp.length; i++){
            actual[i] = (Integer) temp[i];
        }
        assertArrayEquals(expected, actual);
    }

    @Test
    public void removeTest2(){
        test.remove("Two");
        int expected = 2;
        int actual = test.length();
        assertEquals(expected, actual);
    }

    @Test
    public void setTest(){
        test.setValue("Three", 4);
        int expected = 4;
        int actual = test.getValue("Three");
        assertEquals(expected, actual);
    }

    @Test
    public void clearTest(){
        test.clear();
        Integer expected = null;
        Integer actual = test.getValue("One");
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
    public void containsKeyTestFalse(){
        assertFalse(test.containsKey("Four"));
    }

    @Test
    public void containsKeyTestTrue(){
        assertTrue(test.containsKey("Three"));
    }

    @Test
    public void containsValueTestFalse(){
        assertFalse(test.containsValue(4));
    }

    @Test
    public void containsValueTestTrue(){
        assertTrue(test.containsValue(3));
    }

    @Test
    public void keySetTest(){
        String[] expected = {"One", "Two", "Three"};
        //String[] actual = test.keySet();
        Object[] temp = test.keySet();
        String[] actual = new String[temp.length];
        for(int i = 0; i < temp.length; i++){
            actual[i] = (String) temp[i];
        }
        assertArrayEquals(expected, actual);
    }

    @Test
    public void valueListTest(){
        Integer[] expected = {1, 2, 3};
        Object[] temp = test.valueList();
        Integer[] actual = new Integer[temp.length];
        for(int i = 0; i < temp.length; i++){
            actual[i] = (Integer) temp[i];
        }
        assertArrayEquals(expected, actual);
    }

}


