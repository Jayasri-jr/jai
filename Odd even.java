class Oddeven 
{
  public static void main(String[] args)
    {

       int number = 3;
        System.out.println("Input:");
        
        if (number < 0)
            System.out.print(number + " \nOutput:\nInvalid");

      
        else if (number % 2==0 )  
            System.out.print(number + "\nOutput:\nEven");
        else 
            System.out.print(number + "\nOutput:\nOdd");

    }
 }
