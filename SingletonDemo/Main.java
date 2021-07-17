package SingletonDemo;

public class Main{
    public static void main(String[] args) {
        
        Database db = Database.getInstance();
        db.print();

        Database db1 = Database.getInstance();
        db.print();

        if(db == db1)
            System.out.println("Same instances are being used");

        else
            System.out.println("Different instances have been created");
    }
}