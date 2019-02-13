package mvc.beans;

import mvc.model.Model;
import mvc.model.TodoList;

import java.util.List;

/**
 * Data for JSP pages (an instance of this class i used in the JSP page)
 * 
 * ***  NOTHING TO DO HERE ***
 * 
 * @author hajo
 */

public class ViewModel {
    
    // TODO Supply data to JSP pages
    private TodoList todoList;

    private void updateViewList(){
        setTodo(Model.INSTANCE.getList());
    }

    public TodoList getTodoList() {
        updateViewList();
        return todoList;
    }

    public void setTodo(TodoList todoList ){
        this.todoList = todoList;
    }
}
