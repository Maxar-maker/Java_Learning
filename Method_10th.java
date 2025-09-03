public class Method_10th
{
    private int hour=0;
    private String name;
    private double rate=0;
    private double wage=0;
    public void input(int hrs,String sec_name,int rate)
    {
     hour=hrs;
     name=sec_name;
     this.rate=rate;
    }
    public void get()
    {
        System.out.println(hour);
        System.out.println(name);
        System.out.println(rate);
        System.out.println(wage);
        
    }
    public void w_calculate()
    {
        if(hour<=40)
        {
            wage=hour*1;
        }
        else if(hour>40&&hour<=60)
        {
            wage=((hour-40)*1.5)+((hour-(hour-40))*1);
        }
        else
        {
            wage=((hour-60)*2)+(((hour-(hour-60))*1.5)+((hour-(hour-40))*1));
        }
        
    }
    public static void main()
    {
        Method_10th ob=new Method_10th();
        ob.input(100,"aaa",100);
        ob.w_calculate();
        ob.get();
    }
}