

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Confirmation
 */
@WebServlet("/Confirmation")
public class Confirmation extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Confirmation() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		response.getWriter().append(""
				+ "<html>"
				+ "<body>"
				+ "<div style=\"border:1px solid black;`	\">"
				+ "your user name is:"+request.getParameter("username")+""
				+ ""
				+ "</div>"
				+ "</body>"
				+ "</html");
		
		
		
//		UserInfo userinfo = (UserInfo) request.getSession().getAttribute("myuserinfo");
//		PrintWriter writer = response.getWriter().append("Confirmation: ")
//		.append("\nUsername:"+userinfo.getUserName())
//		.append("\npassword:"+userinfo.getPassword())
//		.append("\nSex:"+userinfo.getSex());
//		
//		for(String food:userinfo.getFoods()) {
//			writer.append("\nFood selected:"+food);
//		}
//		writer.append("\nNationality:"+userinfo.getNationality());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
