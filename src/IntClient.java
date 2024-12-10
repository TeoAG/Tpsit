import java.io.IOException;
import java.net.Socket;

public class IntClient {
    public static void main(String[] args) {
        try (Socket s = new Socket("localhost", 9999)){
            System.out.println("connessione al server stabilita");
            int numero = (int) (Math.random()*10);
            s.getOutputStream().write(numero);

            System.out.println("il client ha inviato" + numero);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
