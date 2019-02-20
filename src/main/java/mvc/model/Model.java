package mvc.model;

/**
 * Singleton to access the model parts of application
 *
 * @author hajo
 */
public enum Model {
    INSTANCE;

    private final TodoList list = new TodoList();
    private final UserRegistry reg = new UserRegistry();
    private User current;

    public TodoList getList() {
        return list;
    }

    public UserRegistry getUserRegistry() {
        return reg;
    }

    public User login(String email, String passwd) {

        User loginUser = new User(null, email, passwd);

        if (getUserRegistry().lookup(loginUser) != null){
            current = loginUser;
            return loginUser;
        }
        return null;
    }

    public User register(String name, String password, String email) {

        User user = new User(name, password, email);

        if(getUserRegistry().register(user))
            return user;

        return null;
    }

    //Add new note using input String
    public void addToDo(String text){

        Long id = list.getNrNotes();
        getList().add(new TodoNote(id, text));
    }

    // TODO Other methods called by new actions

    //Edits with id
    public void edit(Long id, String text){
        getList().edit(id, text);
    }

    //Deletes with id
    public void delete(Long id){
        getList().delete(id);
    }
}
