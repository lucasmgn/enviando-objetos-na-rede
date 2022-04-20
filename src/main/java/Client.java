import java.io.*;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        //conectando ao servidor com porta 3333 e IP do do computador
        //host:"169.168.0.119" fictício
        try (Socket socket = new Socket("169.168.0.119", 3333)) {

            //Retirando Dados
            OutputStream saida = socket.getOutputStream();
            ObjectOutput objectOutput = new ObjectOutputStream(saida);

            //Instanciando o objeto pedido e atribuindo valores aos seus atributos
            Pedido pedido = new Pedido();
            pedido.setCodigo(1L);
            pedido.setDescricao("Sabonete para as mãos");
            pedido.setQuantidade(4);

            //Escrevendo dados do objeto pedido
            objectOutput.writeObject(pedido);

            //Recebendo os dados do objeto pedido para mostrar no sout
            InputStream entrada = socket.getInputStream();
            DataInputStream dataInput = new DataInputStream(entrada);

            System.out.println("Recebendo do servidor: " + dataInput.readUTF());

        } catch (IOException ex) {
            System.err.println("Erro ao enviar dados. " + ex.getMessage());
            ex.printStackTrace();
        }
    }
}