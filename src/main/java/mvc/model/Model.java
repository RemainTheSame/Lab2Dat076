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

    public TodoList getList() {
        return list;
    }

    public UserRegistry getUserRegistry() {
        return reg;
    }

    public User login(String email, String passwd) {

        User loginUser = new User(null, email, passwd);

        if (getUserRegistry().lookup(loginUser) != null){
            return loginUser;
        }
        return null;
    }

    public User register(String name, String password, String email) {
        // TODO
        return null;
    }

    //Add new note using input String
    public void addToDo(String text){

        getList().add(new TodoNote(text));
    }

    // TODO Other methods called by new actions
}
