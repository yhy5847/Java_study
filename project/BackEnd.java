package project;

public class BackEnd implements Team{


    @Override
    public String role(){
        String name = BackEnd.class.getName();
        return name;
    }

}
