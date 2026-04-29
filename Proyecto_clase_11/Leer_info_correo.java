package Proyecto_clase_11;
import jakarta.mail.*;
import jakarta.mail.internet.MimeMessage;
import java.util.Properties;

public class Leer_info_correo {

    public static void main(String[] args) {
        // Datos de conexión
        final String host = "imap.gmail.com";  // Servidor IMAP
        final String user = "ejercicios.pruebasfs@gmail.com";
        final String password = "swwf ndla eepn ymtj";

        // Configuración de propiedades IMAP
        Properties props = new Properties();
        props.put("mail.store.protocol", "imaps");
        
        try {
            // Sesión
            Session session = Session.getInstance(props);
            // Almacén IMAP
            Store store = session.getStore("imaps");
            store.connect(host, user, password);

            // Carpeta de entrada (Inbox)
            Folder inbox = store.getFolder("INBOX");
            inbox.open(Folder.READ_ONLY);


            // Leer mensajes
            Message[] messages = inbox.getMessages();
            System.out.println("📩 Total de correos: " + messages.length);

            // Imprime los 5 últimos
            int start = Math.max(0, messages.length - 5);
            for (int i = start; i < messages.length; i++) {
                Message msg = messages[i];
                System.out.println("---------------------------------");
                System.out.println("De: " + msg.getFrom()[0]);
                System.out.println("Asunto: " + msg.getSubject());
                System.out.println("Contenido: " + msg.getContent().toString());
            }

            inbox.close(false);
            store.close();
        }   catch (Exception e) {
            e.printStackTrace();
        }


    
    
    
    
    
    
    
    
    }

}
