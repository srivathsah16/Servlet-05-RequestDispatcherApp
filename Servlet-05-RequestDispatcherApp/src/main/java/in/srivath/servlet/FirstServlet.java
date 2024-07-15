package in.srivath.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/FirstServlet")
public class FirstServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		PrintWriter pWriter = resp.getWriter();
		pWriter.append("<h1>This is first servlet</h1> <br>");
		RequestDispatcher reqDis = req.getRequestDispatcher("SecondServlet");
		//reqDis.forward(req, resp);
		reqDis.include(req, resp);
	}
}
