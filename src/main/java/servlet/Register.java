package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Register
 */
//@WebServlet("/servlet/register")
@WebServlet("/jsp/register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Register() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		request.setCharacterEncoding("UTF-8");

		Bean b = new Bean();
		String[] infoType = request.getParameterValues("infoType");

		b.setName(request.getParameter("name"));
		b.setCompany(request.getParameter("company"));
		b.setAddress(request.getParameter("address"));
		b.setInfo(request.getParameter("info"));
		b.setInfoType(infoType);
		b.setYesNo(request.getParameter("yesNo"));

		System.out.println(b.getName() + b.getCompany() + b.getAddress());
		System.out.println(b.getInfo() + b.getInfoType() + b.getYesNo());

		request.setAttribute("bean", b);
		request.getRequestDispatcher("output.jsp").forward(request, response);

	}

}
