import java.util.Random;

class Cheonan {
    int cheonanC;
    String season;
    Random rd = new Random();


    int weather() {
        this.cheonanC = rd.nextInt(61)-20;
        return this.cheonanC;
    }


    void whatSeason() {
        if(this.cheonanC < 0) {
            this.season = "winter";
        }else if(this.cheonanC >= 0 && this.cheonanC < 15) {
            this.season = "fall";
        }else if(this.cheonanC >= 15 && this.cheonanC < 25) {
            this.season = "spring";
        }else if(this.cheonanC >= 25 ) {
            this.season = "summer";
        }
    }
}