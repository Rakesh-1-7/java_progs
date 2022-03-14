import java.util.Scanner;
class multiple<T,V>
{
    T obj1;
    V obj2;

    multiple(T o1, V o2)
    {
        obj1 = o1;
        obj2 = o2;
    }
    void showTypes()
    {
        System.out.println("Type of first : "+ obj1.getClass().getName());
        System.out.println("Type of second : "+ obj2.getClass().getName());
    }

    T getob1()
    {
        return obj1;
    }

    V getob2()
    {
        return obj2;
    }

}

class start
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any String : ");
        String s = sc.nextLine();
        System.out.println("Enter any integer : ");
        int i = sc.nextInt();
        System.out.println();

        System.out.println("Enter any Strings : ");
        String st = sc.next();
        System.out.println("Enter any Double : ");
        double d = sc.nextDouble();

        multiple<String,Integer> tgobj = new multiple<String,Integer>(s,i);

        String str = tgobj.getob1();
        System.out.println("Value of set 1 : "+str);
        int v  = tgobj.getob2();

        System.out.println("Value of set 1 : "+v);
        System.out.println();

        multiple<String,Double> tobj = new multiple<String,Double>(st,d);

        String strn = tobj.getob1();
        System.out.println("Value of set 2 : "+strn);
        Double vd  = tobj.getob2();

        System.out.println("Value of set 2 : "+vd);

    }
}

