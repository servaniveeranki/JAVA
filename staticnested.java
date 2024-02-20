class OuterClass {

    static int outer_x = 10;
    
    int outer_y = 20;
    
    private static int outer_private = 30;
    
    static class Staticnested {
    
    void display()
    
    {
    
    System.out.println("outer_x = " + outer_x);
    
    System.out.println("outer_private = "+ outer_private);
    
    //System.out.println("outer_y = " + outer_y); //Compilation error
    
    OuterClass out = new OuterClass();
    
    System.out.println("outer_y = " + out.outer_y);
    
    }
    
    }}
    
    public class staticnested {
    
    public static void main(String[] args)
    
    {
    
    OuterClass.Staticnested nestedObject
    
    = new OuterClass.Staticnested();
    
    nestedObject.display();
    
    }
    
    }