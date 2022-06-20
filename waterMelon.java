public class waterMelon {
    public String solution(int n) {
        String answer = "";
        if(n%2 == 0) {
            answer = answer.replace("수박", n);
        }
        return answer;
    }
}
