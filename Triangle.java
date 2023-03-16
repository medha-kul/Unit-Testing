// -*- Java++ -*-
// Triangle.java
// $Id: Triangle.java 827 2011-02-07 14:20:53Z medkulk $
// I pledge that I have neither given nor received any help
// on this assignment.

//psuedoCode implemented from textbook

import java.util.Scanner;
public class Triangle {

    public Triangle () {
        //empty constructor
    } // end constructor
/**
  Similar methods: first, second and third implementions laid out in the book

  * variable a  side a of triangle
  * variable b  side b of triangle
  * variable c  side c of triangle
  @return checker  checks for type of the triangle - Equilateral, Scalene, Iso, NotTriangle
*/
    public String checkTriangle1 (int a, int b, int c) {
        int match;
        String checker;

        match = 0;
        if (a == b) {
            match = match + 1;
        }
        if (a == c) {
            match = match + 2;
        }
        if (b == c) {
            match = match + 3;
        }
        if (match == 0) {

            if ( (a + b) <= c ) {
                checker = "NotTriangle";
            } else if ( (b + c) <= a ) {
                checker = "NotTriangle";
            } else if ( (a + c) <= b ) {
                checker = "NotTriangle";
            } else {
                checker = "Scalene";
            }
//check for scalene
        } else if (match == 1) {

            if ( (a + c) <= b ) {
                checker = "NotTriangle";
            } else {
                checker = "Scalene";
            }
//check for isosceles
        } else if (match == 2) {

            if ( (a + c) <= b ) {
                checker = "NotTriangle";
            } else {
                checker = "Isosceles";
            }
        } else if (match == 3) {
            if ( (b + c) <= a) {
                checker = "NotTriangle";
            } else {
                checker = "Isosceles";
            }
        } else {
            checker = "Equilateral";
        }

        return checker;
    } //end checkTriangle1

//second implementation
    public String checkTriangle2 (int a, int b, int c) {
        String checker = "";

        //set boolean check triangle
        boolean checkATriangle = false;

        //check for triangle
        if ( (a < (b + c)) && (b < (a + c)) && (c < (a + b)) ) {
            checkATriangle = true;
        } else {
            checkATriangle = false;
        }
        if (checkATriangle) {

            if ( (a == b) && (b == c) ) {
                checker = "Equilateral";
            } else if ( (a != b) && (a != c) && (b != c) ) {
                checker = "Scalene";
            } else {
                checker = "Isosceles";
            }

        } else {
            checker = "NotTriangle";
        }

        return checker;
    }

//third implementation
    public String checkTriangle3 (int a, int b, int c) {

      // check for input
      Scanner input = new Scanner (System.in);
      String checker = "";
        boolean c1 = false ;
        boolean c2 = false ;
        boolean c3 = false ;
        boolean checkATriangle;
        //check for conditions
        c1 = (1 <= a) && (a <= 300);
        c2 = (1 <= b) && (b <= 300);
        c3 = (1 <= c) && (c <= 300);

        if (!c1) {
            System.out.println ("value of a not in the range if permitted values");
            checker = "InvalidRange";
        }

        if (!c2) {
            System.out.println ("Value of b is not in the range of permitted values.");
            checker = "InvalidRange";
        }

        if (!c3) {
            System.out.println ("Value of b is not in the range of permitted values.");
            checker = "InvalidRange";
        }
        if (c1 && c2 && c3) {
        //second step
            checkATriangle = (a < (b + c)) && (b < (a + c)) && (c < (a + b));
            //third step
            if (checkATriangle) if ((a == b) && (b == c)) {
                checker = "Equilateral";
            } else if ((a != b) && (a != c) && (b != c)) {
                checker = "Scalene";
            } else checker = "Isosceles";
            else {
                checker = "NotTriangle";
            }
        }
        return checker;
    }
}
