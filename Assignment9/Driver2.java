package Assignment9;

public class Driver2 {
    public static void main(String[] args) {
        SetADT set = new SetADT(10);
        
        set.add(1);
        set.add(2);
        System.out.println(set.toString());
        set.remove(1);
        System.out.println(set.toString());
    }
}
