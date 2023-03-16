// -*- Java++ -*-
// Triangle.java
// $Id: Triangle.java 827 2011-02-07 14:20:53Z medkulk $
// I pledge that I have neither given nor received any help
// on this assignment.

//psuedoCode implemented from textbook
import org.junit.Test;
import static org.junit.Assert.*;

public class Triangle_Test {
    private final Triangle test_triangle = new Triangle();

    //constructor
    public Triangle_Test() {
    }

    //testing first implementation
    @Test
    public void testCheckTriangle1() {
        assertEquals("Equilateral", test_triangle.checkTriangle1(50, 50, 50));//50	50 	50
        assertEquals("NotTriangle", test_triangle.checkTriangle1(1, 25, 50)); //1 	25 	50
        assertEquals("NotTriangle", test_triangle.checkTriangle1(2, 25, 50)); //2 	25 	50
        assertEquals("NotTriangle", test_triangle.checkTriangle1(98, 25, 50)); //98 	25 	50
        assertEquals("NotTriangle", test_triangle.checkTriangle1(99, 25, 50));//99 	25 	50
        assertEquals("NotTriangle", test_triangle.checkTriangle1(50, 25, 98));//50	25	98
        assertEquals("NotTriangle", test_triangle.checkTriangle1(50, 25, 99));//50	25	99
        assertEquals("NotTriangle", test_triangle.checkTriangle1(50, 25, 1));//50	25	1
        assertEquals("NotTriangle", test_triangle.checkTriangle1(50, 25, 2));//50	25	2
        assertEquals("Isosceles", test_triangle.checkTriangle1(50, 25, 50));//50 	25 	50
        assertEquals("Isosceles", test_triangle.checkTriangle1(50, 49, 50));//50	49 	50
        assertEquals("Isosceles", test_triangle.checkTriangle1(50, 2, 50)); //50	2 	50
        assertEquals("Isosceles", test_triangle.checkTriangle1(50, 1, 50));//50	1 	50

    }

    @Test
    public void testCheckTriangle2() {
        assertEquals("Equilateral", test_triangle.checkTriangle2(50, 50, 50));//50	50 	50
        assertEquals("NotTriangle", test_triangle.checkTriangle2(1, 25, 50)); //1 	25 	50
        assertEquals("NotTriangle", test_triangle.checkTriangle2(2, 25, 50)); //2 	25 	50
        assertEquals("NotTriangle", test_triangle.checkTriangle2(98, 25, 50)); //98 	25 	50
        assertEquals("NotTriangle", test_triangle.checkTriangle2(99, 25, 50));//99 	25 	50
        assertEquals("NotTriangle", test_triangle.checkTriangle2(50, 25, 98));//50	25	98
        assertEquals("NotTriangle", test_triangle.checkTriangle2(50, 25, 99));//50	25	99
        assertEquals("NotTriangle", test_triangle.checkTriangle2(50, 25, 1));//50	25	1
        assertEquals("NotTriangle", test_triangle.checkTriangle2(50, 25, 2));//50	25	2
        assertEquals("Isosceles", test_triangle.checkTriangle2(50, 25, 50));//50 	25 	50
        assertEquals("Isosceles", test_triangle.checkTriangle2(50, 49, 50));//50	49 	50
        assertEquals("Isosceles", test_triangle.checkTriangle2(50, 2, 50)); //50	2 	50
        assertEquals("Isosceles", test_triangle.checkTriangle2(50, 1, 50));//50	1 	50
    }

    @Test
    public void testCheckTriangle3() {
        assertEquals("Equilateral", test_triangle.checkTriangle3(50, 50, 50));//50	50 	50
        assertEquals("NotTriangle", test_triangle.checkTriangle3(1, 25, 50)); //1 	25 	50
        assertEquals("NotTriangle", test_triangle.checkTriangle3(2, 25, 50)); //2 	25 	50
        assertEquals("NotTriangle", test_triangle.checkTriangle3(98, 25, 50)); //98 	25 	50
        assertEquals("NotTriangle", test_triangle.checkTriangle3(99, 25, 50));//99 	25 	50
        assertEquals("NotTriangle", test_triangle.checkTriangle3(50, 25, 98));//50	25	98
        assertEquals("NotTriangle", test_triangle.checkTriangle3(50, 25, 99));//50	25	99
        assertEquals("NotTriangle", test_triangle.checkTriangle3(50, 25, 1));//50	25	1
        assertEquals("NotTriangle", test_triangle.checkTriangle3(50, 25, 2));//50	25	2
        assertEquals("Isosceles", test_triangle.checkTriangle3(50, 25, 50));//50 	25 	50
        assertEquals("Isosceles", test_triangle.checkTriangle3(50, 49, 50));//50	49 	50
        assertEquals("Isosceles", test_triangle.checkTriangle3(50, 2, 50)); //50	2 	50
        assertEquals("Isosceles", test_triangle.checkTriangle3(50, 1, 50));//50	1 	50
    }
}
