import checkers.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.List;


public class MyServlet extends HttpServlet {
    public List<NumChecker> list = new LinkedList();

    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        int num= Integer.parseInt(req.getParameter("number"));
        list.add(new IsEvenChecker());
        list.add(new IsDivisibleBySevenChecker());
        list.add(new IsMyFavChecker());
        list.add(new IsBoringChecker());
        IsEvenChecker e=new IsEvenChecker();
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.print("<HEAD><TITLE>");
        out.print("Servlets Till I Die");
        out.print("</TITLE></HEAD><BODY>");
        out.print("<h1>"+"Some facts about your number  "+ num+"</h1>"+"<br>");
        for (int i = 0; i < list.size(); i++) {
            out.print("Number " + num + " is ");
            out.print("" + list.get(i).check(num)+"<br>");
        }
        out.print("</BODY>");
        out.close();
    }
}