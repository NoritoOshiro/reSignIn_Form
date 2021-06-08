package jp.co.aforce.act;


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
		System.out.println("Login-Action1");
		Customer customer = dao.search(login, password);
		System.out.println("Login-Action2");

		if (customer != null) {

			session.setAttribute("customer", customer);
			return "/jsp/login-out.jsp";

		}

		return "/jsp/login-error.jsp";

	}

}
//@WebServlet(urlPatterns = { "/src/login-action" })
//public class LoginAction extends HttpServlet {
//
//	public void doPost(
//			
//			HttpServletRequest request, HttpServletResponse response
//				
//		)throws Exception{ 
//
//		HttpSession session = request.getSession();
//		response.setContentType("text/html; charset=UTF-8");	
//		request.setCharacterEncoding("UTF-8");
//
//		String login = request.getParameter("login");
//		String password = request.getParameter("password");
//		CustomerDAO dao = new CustomerDAO();
//		Customer customer = new Customer();
//		
//		customer = dao.search(login, password);
//			
//		
//		System.out.println(e.getMessage());
//			
//
//		if (customer != null) {
//
//			session.setAttribute("customer", customer);
//			request.getRequestDispatcher("../jsp/login-out.jsp");
//
//		}else {
//		
//		request.getRequestDispatcher("../jsp/login-error.jsp")
//		.include(request, response);
//		
//		}
//	}
//	
//}
//
//}