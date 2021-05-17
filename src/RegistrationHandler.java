

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegistrationHandler
 */
@WebServlet("/RegistrationHandler")
public class RegistrationHandler extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistrationHandler() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		doGet(request, response);
		String username=request.getParameter("username");
//		request.getRequestDispatcher("/confirmation").forward(request, response);
		response.sendRedirect("/MyWebProject/confirmation");
		
		
		
		
		
//		UserInfo userinfo= new UserInfo();
//		
//		String username=request.getParameter("username");
//		userinfo.setUserName(username);
//		
//		String pass=request.getParameter("password");
//		userinfo.setPassword(pass);
//		String sex=request.getParameter("sex");
//		userinfo.setSex(sex);
//		
//		String[] foods= request.getParameterValues("food");
//		userinfo.setFoods(foods);
//		
//		String nationality= request.getParameter("nationality");
//		userinfo.setNationality(nationality);
//		//
//		//save to db
//		//
//		request.getSession().setAttribute("myuserinfo", userinfo);
//		response.sendRedirect("/MyWebProject/confirmation");
		
//		System.out.println("User name is:"+username);
//		System.out.println("Password is:"+pass);
//		System.out.println("Sex is:"+sex);
//		
//		for(String food:foods) {
//			System.out.println("Food selected:"+food);
//			
//		}
//		System.out.println("Nationality:"+nationality);
	}

}
