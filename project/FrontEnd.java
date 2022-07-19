package project;

public class FrontEnd implements Team{


    @Override
    public String role(){
        String name = FrontEnd.class.getName();
        return name;
    }
}
