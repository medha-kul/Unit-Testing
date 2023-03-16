// -*- Java++ -*-
// Triangle.java
// $Id: Triangle.java 827 2011-02-07 14:20:53Z medkulk $
// I pledge that I have neither given nor received any help
// on this assignment.

//psuedoCode implemented from textbook

public class NextDate {

    //empty constructor
    public NextDate(){

    }

    /**
     * variable day   day of the month
     * variable month  month of the year '
     * variable year   present year
     * @return checker next date
     */
    //first implementation of the NextDate
    public String checkNextDate1 (int day, int month, int year) {

        int tomDay = 12;
        int tomMonth = 10;
        int tomYear = 2020;
        String checker;

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
                if (day < 31) {
                    tomDay = day + 1;
                } else {
                    tomDay = 1;
                    tomMonth = month + 1;
                }
                break;

            case 4:
            case 6:
            case 9:
            case 11:
                if (day < 30) {
                    tomDay = day + 1;
                } else {
                    tomDay = 1;
                    tomMonth = month + 1;
                }
                break;
            case 12:
                if (day < 31) {
                    tomDay = day + 1;
                } else {
                    tomDay = 1;
                    tomMonth = 1;
                    if (year == 2012) {
                        checker = "2012 is over.";
                    } else {
                        tomYear = year + 1;
                    }
                }
                break;
            case 2:
                if (day < 28) {
                    tomDay = day + 1;
                } else {
                    if (day == 28) {
                        if (year % 4 == 0) { //for leap year
                            tomDay = 29;
                        }
                        else {
                            tomDay = 1;
                            tomMonth = 3;
                        }
                    } else if (day == 29) {
                        if (year % 4 == 0) { //condition for leap year
                            tomDay = 1;
                            tomMonth = 3;
                        } else {
                            checker = "Cannot have Feb. " + day;
                        }
                    }
                }
                break;
        }

        checker = tomMonth + "-" + tomDay + "-" + tomYear;
        return checker;
    } // end checkNextDate1 ()
    //second implemention with similar parameters and returns like first (copied from textbook)
    public String checkNextDate2 (int day, int month, int year) {
        String checker;

        int tomDay = 12;
        int tomMonth = 10;
        int tomYear = 2020;
        boolean c1 = (1 <= day) && (day <= 31);
        boolean c2;
        c2 = (1 <= month) && (month <= 12);
        boolean c3;
        c3 = (1812 <= year) && (year <= 2012);

        if (!c1) {
            System.out.println ("Value of day not in the range 1......31");
            checker = "Invalid Input Date";
        }
        if (!c2) {
            System.out.println ("Value of month not in the range 1.....12");
            checker = "Invalid Input Date";
        }
        if (!c3) {
            System.out.println ("Value of year not in the range 1812..........2012");
            checker = "Invalid Input Date";
        }

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
                if (day < 31) {
                    tomDay = day + 1;
                } else {
                    tomDay = 1;
                    tomMonth = month + 1;
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                if (day < 30) {
                    tomDay = day + 1;
                } else {
                    if (day == 30) {
                        tomDay = 1;
                        tomMonth = month + 1;
                    } else {
                        checker = "Invalid Input Date";
                    }
                }
                break;
                case 12:
                if (day < 31) {
                    tomDay = day + 1;
                } else {
                    tomDay = 1;
                    tomMonth = 1;
                    if (year == 2012) {
                        checker = "Invalid Input Date";
                    } else {
                        tomYear = year + 1;
                    }
                }
                break;
            case 2:
                if (day < 28) {
                    tomDay = day + 1;
                } else {
                    if (day == 28) {
                        if (year % 4 == 0) {
                            tomDay = 29;
                        } else {
                            tomDay = 1;
                            tomMonth = 3;
                        }
                    } else if (day == 29) {
                        if (year % 4 == 0) { //condition for leap
                            tomDay = 1;
                            tomMonth = 3;
                        } else {
                            if (day > 29) {
                                checker = "Invalid Input Date";
                            }
                        }
                    }
                }
                break;
        }

        checker = tomMonth + "-" + tomDay + "-" + tomYear;
        return checker;
    } // end nextDate2 ()

} //end NextDate




