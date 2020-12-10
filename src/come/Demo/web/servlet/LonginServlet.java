package come.Demo.web.servlet;

import come.Demo.web.Dao.LonginDao;
import come.Demo.web.entity.Loginentity;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(value = "/LonginServlet")
public class LonginServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //登录请求处理
        //1.接收页面传递的信息（用户名密码）
        request.setCharacterEncoding("utf-8");
        String name = request.getParameter("uname");
        String pwd = request.getParameter("pwd");
        //创建实体类对象，存入用户名和密码给实体类
        Loginentity loginentity = new Loginentity(name, pwd);
        int res = LonginDao.login(loginentity);
        if (res >0)response.sendRedirect("Welcome.jsp");
        else response.sendRedirect("index.jsp");
    }
}
