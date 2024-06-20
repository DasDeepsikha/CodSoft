import java.util.Scanner;

public class Studentreport
{
    public static void main(String args[])throws Exception
    {
        Scanner in = new Scanner(System.in);
        int math, phy, chem, bio, eng;
        System.out.println("Enter the marks obtained in Mathematics: ");
        math = in.nextInt();
        System.out.println("Enter the marks obtained in Physics: ");
        phy = in.nextInt();

        System.out.println("Enter the marks obtained in Chemistry: ");
        chem = in.nextInt();

        System.out.println("Enter the marks obtained in Biology: ");
        bio = in.nextInt();


        System.out.println("Enter the marks obtained in English: ");
        eng = in.nextInt();

        int total = math+phy+chem+bio+eng;
        System.out.println("Total mark obtained: "+total);

        double per =total * 0.2;
        System.out.println("Percentage: "+per+"%");

        if(per>90 && per<=100)
        {
            System.out.println("Grade 'O'");
        }

        else if(per>80 && per<=90)
        {
            System.out.println("Grade 'A'");
        }

        else if(per>70 && per<=80)
        {
            System.out.println("Grade 'B");
        }

        else if(per>60 && per<=70)
        {
            System.out.println("Grade 'C'");
        }

        else if(per>50 && per<=60)
        {
            System.out.println("Grade 'D'");
        }

        else
        {
            System.out.println("Grade F");
        }
        
    }


}