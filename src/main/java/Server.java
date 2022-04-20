import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args){
        try(ServerSocket server = new ServerSocket(3333)){

            System.out.println("Aguardando conexão...");
            //Esperando o cliente conectar e o socket é o transportador.
            Socket socket = server.accept();
            System.out.println("Conectado a: " + socket.getRemoteSocketAddress());

            //Entrando
            InputStream entrada = socket.getInputStream();
            ObjectInputStream objectStream = new ObjectInputStream(entrada);

            //Lendo o pedido
            Pedido pedido = (Pedido) objectStream.readObject();
            System.out.printf("Código: %d \nDescrição: %s \nQuantidade: %d",
                    pedido.getCodigo(),
                    pedido.getDescricao(),
                    pedido.getQuantidade());

            //Saindo
            OutputStream saida = socket.getOutputStream();
            DataOutput dataOutput = new DataOutputStream(saida);
            dataOutput.writeUTF("Recebido com sucesso!");

        } catch (IOException | ClassNotFoundException ex) {
            System.err.println("Erro ao enviar dados. " + ex.getMessage());
            ex.printStackTrace();
        }
    }
}
