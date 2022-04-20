# Enviando-Objetos-na-Rede

<h3>Descrição:</h3>
<p>O projeto possui a finalidade de transportar dados do objeto <strong>pedido</strong> pela rede</p>
<h4>O projeto possui 3 classes:</h4> 

<p>A classe <strong>Pedido</strong> que tem os atributos codigo, descricao, quantidade.</p>

<p>A classe <strong>Server</strong>, possui a classe <strong>ServerSocket</strong> onde criar uma nova port e
  a classe <strong>ServerSocket</strong> para fazer conexão entre "cliente" e "servidor",
  depois passa para a classe abstrata <strong>InputStream</strong> e a classe <strong>ObjectInputStream</strong> para a entrada e leitura dos atributos
  da classe <strong>Pedido</strong> e por fim a classe abstrata
  <strong>OutputStream</strong> e a classe <strong>DataOutput</strong>com o papel de saída dos dados.</p>
  
<p>A classe <strong>Client</strong> possui a classe <strong>Socket</strong> estabelecendo uma conexão com o host e a port,
  logo abaixo temos a classe abstrata <strong>OutputStream</strong> e <strong>ObjectOutput</strong> tem o papel de saida de dados e escrevem os dados do objeto da class <strong>Pedido</strong>, 
  logo após vem a classe <strong>InputStream</strong> e <strong>DataInputStream</strong> que tem o papel de receber os dados do objeto pedido.</p>
