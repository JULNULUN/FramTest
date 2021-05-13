package Repository;

import Ennity.Users;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 * @author 12076
 */
public class UsersRepository {
    public List <Users> findAll()
    {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        List <Users> UsersList = new ArrayList<>();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/mydb01";
            String user = "root";
            String SqlPassword = "root";
            connection = DriverManager.getConnection(url, user, SqlPassword);
            System.out.println(connection);

            String sql = "select * from users";
            preparedStatement = connection.prepareStatement(sql);
            resultSet =  preparedStatement.executeQuery();
            Users users = null ;
            while (resultSet.next()){
                String userName = resultSet.getString("userName");
                String email = resultSet.getString("email");
                String password = resultSet.getString("password");
                users = new Users(userName, email, password);
                UsersList.add(users);
            }

        }
        catch (Exception e) {
            e.printStackTrace();
        }finally {
            System.out.println(resultSet.toString());
            try {
                connection.close();
                preparedStatement.close();
                resultSet.close();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        return UsersList;
    }


    public static void main(String[] args) {
        UsersRepository usersRepository = new UsersRepository();
        System.out.println(usersRepository.findAll());
    }
}
