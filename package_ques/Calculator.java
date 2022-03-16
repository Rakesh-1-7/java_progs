import Nums.Numbers;
import operations.*;

public class Calculator 
{
    public static void main(String[] args) 
    {
        Numbers.i = 10;
        Numbers.j = 10;
        System.out.println("Sum is : " + operations.Sum.sum());
        System.out.println("Difference is : " +operations.Difference.difference());
        System.out.println("Product is : " +operations.Multipliaction.multipliaction());
        System.out.println("Quotient is : " +operations.Division.division());
    }
}