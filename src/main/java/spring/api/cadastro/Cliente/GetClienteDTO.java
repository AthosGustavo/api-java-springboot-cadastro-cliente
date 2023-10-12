package spring.api.cadastro.Cliente;

public record GetClienteDTO(String nomeCliente, String emailCliente, String telCliente, String enderecoCliente) {
    public GetClienteDTO(Cliente cliente) {
        //Estrategia:construtor de chamada
        this(cliente.getNomeCliente(),cliente.getEmailCliente(), cliente.getTelCliente(),cliente.getEnderecoCliente());



    }
}


