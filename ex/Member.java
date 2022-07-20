package ex;

public class Member {
    private int groupNum;
    private String name;

    public Member(int groupNum, String name) {
        this.groupNum = groupNum;
        this.name = name;
    }


    public int getGroupNum() {
        return groupNum;
    }

    public String getName() {
        return name;
    }

    public void setGroupNum(int in_groupNum) {
        this.groupNum = in_groupNum;
    }

    public void setName(String in_name){
        this.name = in_name;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Member) {
            Member mem = (Member) obj;
            if(groupNum == mem.getGroupNum()) {

            }
        }
        return false;
    }
}
