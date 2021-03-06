import java.util.Scanner;

class fatherAgeException extends Exception
{
    public String toString()
    {
        return "Father's age is less than 0";
    }
}

class sonAgeException extends Exception
{
    int a;
    sonAgeException(int age)
    {
        a = age;
    }
    public String toString()
    {
        if(a<0)
            return "Son's age is less than 0";
        else
            return "Son's age is more than father's age" ;
    }
}

class Father
{
    public int age;
    Scanner sc = new Scanner(System.in);
    int age1;
    Father()
    {
        System.out.println("Enter Father's age : ");
        age1 = sc.nextInt();
    }

    void ex1() throws fatherAgeException
    {
        if(age1<0)
        throw new fatherAgeException();
    }
}

class Son extends Father
{
    public int age2;
    Son()
    {
        System.out.println("Enter Son's age : ");
        age2 = sc.nextInt();
    }

    void ex2() throws sonAgeException
    {
        if(age2<0 || age2 > super.age1)
        throw new sonAgeException(age2);
    }
}

class Main
{
    public static void main(String[] args) {
        Son s = new Son();
        try
        {
            s.ex1();
        }
        catch(fatherAgeException e)
        {
            System.out.println(e);
        }
        try
        {
            s.ex2();
        }
        catch(sonAgeException e)
        {
            System.out.println(e);
        }
    }
}



