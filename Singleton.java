class Database{

    static Database object;
    
    private Database(){}

    static Database getInstance()
    {
        if(object == null)
            object = new Database();

        return object;
    }

    void print()
    {
        System.out.println("Connection Established");
    }
}

class Main{
    public static void main(String[] args) {
        
        Database db = Database.getInstance().print();
    }
}