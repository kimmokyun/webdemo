package servletdemo.part03;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/loginPro")
public class LoginProController extends HttpServlet {
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	req.setCharacterEncoding("UTF-8"); // 한글을 입력해도 괜찮게 하는거
String fid = req.getParameter("fid"); //아이디
String fpass = req.getParameter("fpass"); // 비밀번호

MemberDTO dta = new MemberDTO();
dta.setFid(fid);
dta.setFpass(fpass);

req.setAttribute("dto", dta);
String path = "/servletview/part03/result.jsp";
RequestDispatcher dis = req.getRequestDispatcher(path);
dis.forward(req, resp);
}
	
}
