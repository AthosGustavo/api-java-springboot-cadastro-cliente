package spring.api.cadastro.Cliente;

public record AtualizaClienteDTO(Long idCliente, String nomeCliente, String emailCliente, String telCliente, String enderecoCliente) {
}
