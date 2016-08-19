class A{
    protected void msg(){System.out.println("Hello java");}
}

public class Test extends A{
    msg(){System.out.println("Hello java");}//C.T.Error
    public static void main(String args[]){
        Test obj=new Test();
        obj.msg();
    }
}