import DbConnection.ConnectionToDb;
import WebConnection.WebConnection;

public class Main {

    private static WebConnection webConnection;

    public static void main(String[] args) throws Exception{
       /* webConnection = new WebConnection();
        webConnection.connnectToSite();*/

        ConnectionToDb connectionToDb =  new ConnectionToDb();
        connectionToDb.getData();
    }

}
