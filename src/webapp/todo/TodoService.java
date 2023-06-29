package webapp.todo;

import java.util.ArrayList;
import java.util.List;

public class TodoService {

	private static List<Todo> todos = new ArrayList<Todo>();
	// 스테틱 괄호는 초기값을 넣어주기
	static {
		todos.add(new Todo("JSP 배우기", "공부"));
		todos.add(new Todo("Spring 배우기", "공부"));
		todos.add(new Todo("점심식사하기", "먹기"));
	}
	// get만
	public List<Todo> getTodos() {
		return todos;
	}
	public void addTodo(String todo, String category) {
		todos.add(new Todo(todo, category));
	}
	public void deleteTodo(String todo, String category) {
		todos.remove(new Todo(todo, category));
		//이름이 같은 객체는 삭제 = todo
	}
	public boolean sameTodo(String todo, String category) {
		return todos.contains(new Todo(todo, category));
		//이름이 같으면 true가 리턴
	}
	
}
