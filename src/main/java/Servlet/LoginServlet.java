package Servlet;

import Ennity.Users;
import Repository.UsersRepository;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @author 12076
 */
@WebServlet ("/Login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String id = req.getParameter("id");
        String passWord = req.getParameter("passWord");

        System.out.println(id);
        System.out.println(passWord);

        //JDBC 验证
        UsersRepository usersRepository = new UsersRepository();
        List <Users> users = usersRepository.findAll();


        //成功
        for (Users User : users){
            if ((User.getEmail().equals(id) || User.getUserName().equals(id)) && User.getPassword().equals(passWord)){
                System.out.println("login success!");
                req.setAttribute("users", users);
                req.getRequestDispatcher("index.jsp").forward(req, resp);
            }
        }
        //失败

        resp.sendRedirect("login.html");
    }
}
