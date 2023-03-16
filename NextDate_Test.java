// -*- Java++ -*-
// Triangle.java
// $Id: Triangle.java 827 2011-02-07 14:20:53Z medkulk $
// I pledge that I have neither given nor received any help
// on this assignment.
//psuedoCode implemented from textbook
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class NextDate_Test {
    private final NextDate test_date = new NextDate();

    //constructor
    public NextDate_Test() {
    }
    //testing first implementation
    @Test
    public void checkNextDate1() {
        assertEquals("2-6-1916", test_date.checkNextDate1(1, 6, 1916));//1-6-1916
        assertEquals("3-6-1916", test_date.checkNextDate1(2, 6, 1916));//2-6-1916
        assertEquals("29-6-1916", test_date.checkNextDate1(28, 6, 1916));//28 	6 	1916
        assertEquals("30-6-1916", test_date.checkNextDate1(29, 6, 1916));//29 	6 	1916
        assertEquals("16-1-1916", test_date.checkNextDate1(15, 1, 1916));//15	1 	1916
        assertEquals("16-2-1916", test_date.checkNextDate1(15, 2, 1916));//15 -2-1916
        assertEquals("16-11-1916", test_date.checkNextDate1(15, 11, 1916));//15 11 1916
        assertEquals("16-12-1916", test_date.checkNextDate1(15, 12, 1916));//15 12 1916
        assertEquals("16-6-1812", test_date.checkNextDate1(15, 6, 1812));//15	6	1812
        assertEquals("16-2-1813", test_date.checkNextDate1(15, 6, 1813));//15	6	1813
        assertEquals("16-11-2020", test_date.checkNextDate1(15, 6, 2020));//15	6	2020
        assertEquals("16-6-2021", test_date.checkNextDate1(15, 6, 2021));//15	6	2021
        assertEquals("16-6-1916", test_date.checkNextDate1(15, 6, 1916));//15 	6 	1916

    }

    @Test
    public void checkNextDate2(){
        assertEquals("2-6-1916", test_date.checkNextDate2(1, 6, 1916));//1-6-1916
        assertEquals("3-6-1916", test_date.checkNextDate2(2, 6, 1916));//2-6-1916
        assertEquals("29-6-1916", test_date.checkNextDate2(28, 6, 1916));//28 	6 	1916
        assertEquals("30-6-1916", test_date.checkNextDate2(29, 6, 1916));//29 	6 	1916
        assertEquals("16-1-1916", test_date.checkNextDate2(15, 1, 1916));//15	1 	1916
        assertEquals("16-2-1916", test_date.checkNextDate2(15, 2, 1916));//15 -2-1916
        assertEquals("16-11-1916", test_date.checkNextDate2(15, 11, 1916));//15 11 1916
        assertEquals("16-12-1916", test_date.checkNextDate2(15, 12, 1916));//15 12 1916
        assertEquals("16-6-1812", test_date.checkNextDate2(15, 6, 1812));//15	6	1812
        assertEquals("16-2-1813", test_date.checkNextDate2(15, 6, 1813));//15	6	1813
        assertEquals("16-11-2020", test_date.checkNextDate2(15, 6, 2020));//15	6	2020
        assertEquals("16-6-2021", test_date.checkNextDate2(15, 6, 2021));//15	6	2021
        assertEquals("16-6-1916", test_date.checkNextDate2(15, 6, 1916));//15 	6 	1916

    }
}
