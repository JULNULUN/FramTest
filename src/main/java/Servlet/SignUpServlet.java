package Servlet;

import Ennity.Users;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author 12076
 */
@WebServlet ("/SignUp")
public class SignUpServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String userName = req.getParameter("userName");
        String email = req.getParameter("email");
        String passWord = req.getParameter("passWord");

        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/mydb01";
            String user = "root";
            String SqlPassword = "root";
            connection = DriverManager.getConnection(url, user, SqlPassword);
            System.out.println(connection);

            String sql = "insert into users (userName, email, passWord)values (?, ?, ?)";

            PreparedStatement prepareStatement = connection.prepareStatement(sql);
            prepareStatement.setString(1, userName);
            prepareStatement.setString(2, email);
            prepareStatement.setString(3, passWord);

            prepareStatement.execute();
            System.out.println("success signUp!!!");

        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
