public class Discount
{
    public static void main (String[] args)
    {
        discount("Monday", 5.00);
        discount("Tuesday", 20.01);
        discount("Wednesday", 47.65);
        discount("Friday", 3.00);

        discount("Tuesday", 20.00);
        discount("Wednesday", 36.22);
        discount("Thursday", 100.00);
        discount("Friday", 30.00);
    }//end main method

    public static void discount(String weekDay,double purchase)
    {

        if(weekDay == "Tuesday" && purchase > 20.00)
        {
            System.out.println("YOu are eligible");
        }
        else if (weekDay == "Wednesday" || purchase > 40.00)
        {
            System.out.println("YOu are eligible");
        }
        else if(weekDay == "Friday" && purchase % 5 == 0)
        {
            System.out.println("Eligible for thing");
        }
        else
        {
            System.out.println("Nope brother");
        }
    }
}