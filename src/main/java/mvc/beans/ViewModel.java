package mvc.beans;

import lombok.Getter;
import lombok.Setter;
import mvc.model.Model;
import mvc.model.TodoList;
import mvc.model.TodoNote;

import javax.swing.text.View;
import java.util.List;

/**
 * Data for JSP pages (an instance of this class i used in the JSP page)
 *
 * ***  NOTHING TO DO HERE ***
 *
 * @author hajo
 */

public class ViewModel {

    @Getter
    @Setter
    private TodoList todoList;
    @Getter
    @Setter
    private List<TodoNote>todoNotes;

    public ViewModel(){
        updateViewList();
    }

    private void updateViewList(){
        setTodoList(Model.INSTANCE.getList());
        setTodoNotes(todoList.getNotes());
    }

    public TodoNote getById(long id){
        return todoList.getById(id);
    }


}
