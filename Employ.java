import java.util.*;
public class Employ
{
    private int age;
    int level;
    String name;
    static int count;
    void input()
    {
        Scanner scr=new Scanner (System.in);
        System.out.println("age");
        age=scr.nextInt();
        System.out.println("level");
        level=scr.nextInt();
        scr.nextLine();
        System.out.println("name");
        name=scr.nextLine();
        count++;
    }
    void display()
    {
        System.out.println(age);
        System.out.println(level);
        System.out.println(name);
        System.out.println(count);
    }
    public static void main()
    {
        Employ e1=new Employ();
        e1.input();
        e1.display();
    }
}