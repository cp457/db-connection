import java.sql.*;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args)  {


        ArrayList<String> surnameOutput = new ArrayList<>();

        try{
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/newdb", "developer", "developer");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from student");

            while(resultSet.next()){

                System.out.println(resultSet.getString("name"));
                surnameOutput.add(resultSet.getString("surname"));
            }
            System.out.println(surnameOutput);


        }catch (Exception e){
            e.printStackTrace();

        }
        //System.out.println(surnameOutput);

    }
}
