class Student
{
    int ids;
    double n_id;
    String strs;
    void input(int id,String str)
    {
        ids=id;
        strs=str;
    }
    void input(double id)
    {
        n_id=id;
    }
    void display()
    {
        System.out.println(ids);
        System.out.println(n_id);
        System.out.println(strs);
    }
    public static void main()
    {
        Student s1=new Student();
        s1.input(10.0);
        s1.display();
    }
}