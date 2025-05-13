import java.util.ArrayList;

public class TestRawTypes {
    public static void main(String args[]) {
        ArrayList list = getListOfStrings();
        int size = list.size();
        String stringa = (String)list.get(0);

    }
    
    public static ArrayList getListOfStrings() {
        ArrayList al = new ArrayList();
        al.add("???");
        return al;
    }
}