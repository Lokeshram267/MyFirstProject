package creation;

public class DifMethds 
{
    void m1()                           //Method without any Parameter and no Return type
    {
    	 System.out.println("Hello world");
    }
    
    String m2()                        //Method without any Parameter but with Return type
    {
    	  return("Hey");
    }
    
    void m3(int a)
    {
    	 System.out.println(a);          //Method with Parameter but no return type
    }
    
    String m4(String name)          //Method with Parameter & with Return type
    {
    	  return("Hey" + name);
    }
    
}
