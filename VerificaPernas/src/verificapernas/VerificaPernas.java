package verificapernas;
import java.util.Scanner;
public class VerificaPernas {
    public static void main(String[] args) {
        //Condição de Múltipla Escolha
        Scanner t = new Scanner(System.in);
        System.out.println("Quantas Pernas ? ");
        int p = t.nextInt();
        String tipo;
        System.out.print("Isso eh um(a): ");
        switch(p){
            case 1:
                tipo = "Saci";
                break;
            case 2:
                tipo = "bípede";
                break;
            case 3:
                tipo = "Tripé";
                break;
            case 4:
                tipo = "Quadrúpede";
                break;
            case 6, 8:
                tipo = "Aranha";
                break;
            default:
                tipo = "ET";
        }
        System.out.println(tipo);
    }
    
}
