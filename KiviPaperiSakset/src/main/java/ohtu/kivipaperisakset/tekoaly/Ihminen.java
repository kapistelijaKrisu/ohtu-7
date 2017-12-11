
package ohtu.kivipaperisakset.tekoaly;

import java.util.Scanner;

public class Ihminen extends Pelaaja {
    private Scanner scanner;

    public Ihminen(Scanner scanner) {
        this.scanner = scanner;
    }
    
    

    @Override
    public String annaSiirto() {
        return scanner.nextLine();
    }

    @Override
    public void asetaSiirto(String ekanSiirto) {
    }
    
}
