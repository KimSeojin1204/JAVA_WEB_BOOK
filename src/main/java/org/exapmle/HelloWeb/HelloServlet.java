package org.exapmle.HelloWeb;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/hello")
public class HelloServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)throws IOException, ServletException{
            DateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd HH:MM:SS");
            String currentTime=dateFormat.format(new Date());
            req.setAttribute("currentTime",currentTime);
            req.getRequestDispatcher("/WEB-INF/jsp/hello.jsp").forward(req,resp);
    }
}
