package SingletonDemo;

public class Database {

    static Database object;

    private Database() {
    }

    static Database getInstance() {
        if (object == null)
            object = new Database();

        return object;
    }

    void print() {
        System.out.println("Connection Established");
    }
}
