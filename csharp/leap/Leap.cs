using System;

public static class Leap
{
    public static bool IsLeapYear(int year)
    {
        if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 ==0))
    {
        return true;
    }
    else
    {
        return false;
    }
    }
    /* Below is an easier and more efficient way to do this using The DateTime class in C#
    ** which provides a built-in IsLeapYear method.
    public static bool IsLeapYear (int year)
    {
        if (DateTime.IsLeapYear(year))
        {
            return true;
        }
        else
        {
            return false;
        }
    }*/
}