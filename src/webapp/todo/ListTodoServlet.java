package webapp.todo;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/list-todos.do")
public class ListTodoServlet extends HttpServlet {
	
	private TodoService todoService = new TodoService();
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("todos", todoService.getTodos());
		request.getRequestDispatcher("/WEB-INF/views/list-todos.jsp").forward(request, response);
	}
	
	
}
