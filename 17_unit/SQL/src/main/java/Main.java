import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {


        String url = "jdbc:mysql://localhost:3306/skillbox";
        String user = "root";
        String pass = "Lord653358";

        try {
            //Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url, user, pass);

            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery("SELECT * FROM Courses");
            while (resultSet.next()){
                String courseName = resultSet.getNString("name");
                System.out.println(courseName);
            }
        }
        catch(Exception ex){
            ex.printStackTrace();
        }

    }
}
