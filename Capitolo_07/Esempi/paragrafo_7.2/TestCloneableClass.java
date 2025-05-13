public class TestCloneableClass {
    public static void main(String args[]) throws Exception {
        CloneableClass cloneableClass = new CloneableClass();
        cloneableClass.setCampo("TEST");
        System.out.println(cloneableClass);
        System.out.println(cloneableClass.clone());
    }
}