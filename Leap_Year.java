class Leap_Year
{
     public boolean leapyear(int x)
    {
        if(x%400 == 0 || (x%4 == 0 && x%100 != 0))
        {
            return true;
        }
        return false;
    }
}
