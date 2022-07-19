package project;

public class main {
    public static void main(String[] args) {
        Team frontend = new FrontEnd();
        Team backend = new BackEnd();
        Team database = new DataBase();
        Team manager = new PJmanager();


        try {
            String[] frontList = frontend.teamMember();
            String[] backList = backend.teamMember();
            String[] dbList = database.teamMember();
            String[] managerList = manager.teamMember();
        }catch() {

        }

    }
}
