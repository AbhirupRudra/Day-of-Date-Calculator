import java.util.Scanner;
class Day_of_the_Date
{
    public static void main()
    {
        Scanner xx = new Scanner(System.in);
        
        System.out.print("Enter the date (dd/mm/yyyy): ");
        String id = xx.nextLine();
        id = id.trim();
        
        int y = Integer.parseInt(id.substring(6));
        int m = Integer.parseInt(id.substring(3,5));
        int dy = Integer.parseInt(id.substring(0,2));
        
        int c_month[] = {0,1,4,4,0,2,5,0,3,6,1,4,6};
        String c_day[] = {"Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
        int c_cen[] = {6,4,2,0};
        
        if(y%400 == 0 || (y%4 == 0 && y%100 != 0))
        {
            c_month[1] = 0;
            c_month[2] = 3;
        }
        
        int c = c_cen[(((y-y%100)%400)/100)];
        
        int day = (dy + c_month[m] + c + (y%100) + ((y%100)/4)) % 7;
        System.out.println("The Day for the date " + id + " is : " + c_day[day]);
    }
}
        
