package project;

public class DataBase implements Team{


    @Override
    public String role(){
        String name = DataBase.class.getName();
        return name;
    }
}
