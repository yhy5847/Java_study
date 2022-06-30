public class Second extends Top{
    public static void main(String[] args) {
        First first = new First();
        first.say();

        Top top = new Top();
        top.say();

        Top fir = new First();
        fir.say(); 
    }

}
