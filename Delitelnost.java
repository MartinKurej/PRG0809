import java.util.Scanner;
public class Delitelnost
{
    public static void main(String[] args) 
    {
        int cis;
        Scanner b = new Scanner(System.in);
        System.out.print("Zadejte cislo:");
        cis = b.nextInt();
        if(cis % 7 == 0)
        {
            System.out.println(cis+" Je delitelne 7");
        }
        else
        {
            System.out.println(cis+" Neni delitelne 7");
        }
    }
}