package login.sumit.registration;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoginRegister")
public class LoginRegister extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String type=request.getParameter("submit");
		String user=request.getParameter("user");
		String pass=request.getParameter("password");
		StudentDao d=new StudentDaoImpl();
		Student student = d.getStudent(user, pass);
		if(type.equals("login")&& student!=null && student.getUsername()!=null)
		{
			request.setAttribute("message",student.getUsername());
			request.getRequestDispatcher("welcome.jsp").forward(request,response);
		}
		else if(type.equals("register"))
		{
			student.setId(Integer.parseInt(request.getParameter("id")));
			student.setUsername(request.getParameter("user"));
			student.setPassword(request.getParameter("password1"));
			student.setEmail(request.getParameter("email"));
			d.insertStudent(student);
			request.setAttribute("success","registerd successfully");
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}
		else
		{
			request.setAttribute("message","Data Not Found,Click On Sign Up !!!");
			request.getRequestDispatcher("login.jsp").forward(request,response);
		}
	}

}
