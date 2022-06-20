import java.util.Scanner;
import pak01.cpu;

public class Cumputer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        cpu cpu = new cpu(input.nextLine());
        System.out.println(cpu.cpuName);
        
        

        
    }
}
