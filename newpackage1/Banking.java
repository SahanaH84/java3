package newpackage1;
public class Banking
{ 
    public static void main(String[] args) 
    {
        bank obj=new bank();
        obj.getBalance();
        bankA objA=new bankA();
        System.out.println(objA.getBalance());
        bankB objB=new bankB();
        System.out.println(objB.getBalance());
        bankC objC=new bankC();
        System.out.println(objC.getBalance());
                
    }   
}
class bank
{
int getBalance()
{
    return 0;
}
}
class bankA extends bank
{ 
    int a=1000;
    @Override
    int getBalance()
    {
      System.out.println("DEPOSITED IN BANK A");
      return a;
    }
}

class bankB extends bank
{
    int b=1500;
    @Override
    int getBalance()
    {
        System.out.println("DEPOSITED IN BANK B");
        return b;
    }
}

class bankC extends bank
{   
    int c=2000;
    @Override
    int getBalance()
    {
        System.out.println("DEPOSITED IN BANK C");
        return c;
    }
  
}

