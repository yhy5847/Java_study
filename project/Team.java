package project;


import java.util.Scanner;
import java.util.ArrayList;


public interface Team {

    String role();

    default String[] teamMember() {
        Scanner in = new Scanner(System.in);
        ArrayList<String> teamList = new ArrayList<String>();

        while(true) {


            for(int i = 0; i < teamList.size(); ++i) {


                if(i == teamList.size() - 1) {
                    System.out.print(teamList.get(i));
                }else {
                    System.out.print(teamList.get(i) + ", ");
                }

            }
            System.out.println();


            System.out.println(role() + "역할을 맡을 사람을 입력하세요.(입력을 끝내려면 end를 입력해주세요)");
            String name = in.nextLine();


            if(name.equals("end")) {
                String[] array = teamList.toArray(new String[teamList.size()]);
                return array;
            }


            teamList.add(name);



        }
    }


}
