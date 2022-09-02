package newpackage1;
public class classification 
{
    public static void main(String[] args) 
    {
      Cat obj=new Cat();
      obj.Animal("Cat");
      obj.Mammal("Felis catus");
      obj.greets();
      Dog obj1=new Dog();
      obj1.Animal("Dog");
      obj1.Mammal("Canis canidae");
      obj1.greets();
      obj1.greets("another dog");
    }
    
}
class Animal
{
  String name;
  void Animal(String name)
  {
      System.out.println(name);
  }
  public String tostring()
  {
    return name;  
  }
}
class Mammal extends Animal
{
 void Mammal(String name)
 {
     System.out.println(name);
 }
 @Override
  public String tostring()
  {
    return name;  
  }
}
class Dog extends Mammal
{
 void greets()
        {
          System.out.println("Woof");
        }
  void greets(String name)
        {
          System.out.println(name);
          System.out.println("Woof");
        }
 @Override
   public String tostring()
  {
    return name;  
  }
}
class Cat extends Mammal
{
     void greets()
        {
          System.out.println("Meow");
        }
     @Override
public String tostring()
  {
    return name;  
  }
    
}        