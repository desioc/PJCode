public class TestOuterStatic {
    public static void main(String args[]) {
        System.out.println(OuterStatic.InnerStatic.staticField); //output: Static variable
        OuterStatic.InnerStatic innerStatic = new OuterStatic.InnerStatic();
        System.out.println(innerStatic.field); 			//output: Instance Variable
    }
}