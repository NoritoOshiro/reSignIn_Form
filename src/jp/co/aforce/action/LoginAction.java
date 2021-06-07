package jp.co.aforce.action;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jp.co.aforce.beans.Customer;
import jp.co.aforce.dao.CustomerDAO;
import jp.co.aforce.tool.Action;

public class LoginAction extends Action {

	public String execute(

			HttpServletRequest request, HttpServletResponse response

	) throws Exception {

		HttpSession session = request.getSession();

		String login = request.getParameter("login");
		String password = request.getParameter("password");
		CustomerDAO dao = new CustomerDAO();
		Customer customer = dao.search(login, password);

		if (customer != null) {

			session.setAttribute("customer", customer);
			return "../jsp/login-out.jsp";

		}

		return "../jsp/login-error.jsp";

	}

}

//public class LoginAction extends HttpServlet {
//
//	public void doPost(
//			
//			HttpServletRequest request, HttpServletResponse response
//				
//		)throws ServletException, IOException{ 
//
//		HttpSession session = request.getSession();
//		response.setContentType("text/html; charset=UTF-8");	
//		request.setCharacterEncoding("UTF-8");
//
//		String login = request.getParameter("login");
//		String password = request.getParameter("password");
//		CustomerDAO dao = new CustomerDAO();
//		Customer customer = dao.search(login, password);
//
//		if (customer != null) {
//
//			session.setAttribute("customer", customer);
//			request.getRequestDispatcher("../jsp/login-out.jsp");
//
//		}else {
//		
//		request.getRequestDispatcher("../jsp/login-error.jsp\"")
//		.include(request, response);
//		 
//
//		}
//	}
//
//}