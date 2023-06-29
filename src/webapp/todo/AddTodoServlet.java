package webapp.todo;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/add-todo.do")
public class AddTodoServlet extends HttpServlet {
	
	private TodoService todoService = new TodoService();
	
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("WEB-INF/views/add-todo.jsp").forward(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String todo = request.getParameter("todo");
		String category = request.getParameter("category");
		if(todo.isBlank()) {
			request.setAttribute("error", "할일을 입력해주세요!");
		} else if(todoService.sameTodo(todo, category)) {
			request.setAttribute("error", "똑같은 할일이 있어요!");
		} else {
			todoService.addTodo(todo, category);
		}
		response.sendRedirect("list-todos.do");
	}
}
