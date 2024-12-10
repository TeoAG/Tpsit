
import java.io.IOException;

import java.net.ServerSocket;
//crea un server che ascolta

import java.net.Socket;
//connessione tra client e server

public class IntServer {
    public static void main(String[] args) {
        try (ServerSocket ss = new ServerSocket(9999)) {
            // creo il server socket che ascolta la connessione sulla porta 9999

            System.out.println("Server avviato è in attesa di connessioni");
            // in questo momento il server è ATTIVO

            while (true) {
                // ciclo infinito per accettare il client

                try (Socket s = ss.accept()) {
                    // Accetta una nuova connessione da un client

                    System.out.println("Connessione accettata da: " + s.getInetAddress());
                    // stampa l'indirizzo IP del client che si è connesso con successo

                    int numero = s.getInputStream().read();
                    // Legge un byte inviato dal client attraverso un flusso di input dei socket
                    // Se non arriva nulla, il valore restituito sarà -1.

                    if (numero == -1) {
                        System.out.println("Non ho ricevuto il numero corretto");
                    } else {
                        // Nel caso il numero fosse diverso da -1
                        System.out.println("Server ha ricevuto correttamente: " + numero);
                        // Stampa il numero ricevuto
                    }
                } catch (IOException e) {
                    // Gestione di eventuali errori durante la comunicazione con il client
                    System.err.println("Errore nella comunicazione con il client: " + e.getMessage());
                    // Stampa un messaggio di errore con la descrizione del problema
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
            // individuazione degli errori nel debugging
        }
    }
}
