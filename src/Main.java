import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {

        try{
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/newdb", "developer", "developer");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from student");
            while(resultSet.next()){
                System.out.println(resultSet.getString("name"));
                System.out.println(resultSet.getString("surname"));
            }

        }catch (Exception e){
            e.printStackTrace();

        }

    }
}
