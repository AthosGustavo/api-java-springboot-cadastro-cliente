package spring.api.cadastro.Cliente;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="clientes")
public class Cliente {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long idCliente;
    private String nomeCliente;
    private String emailCliente;
    private String telCliente;
    private String enderecoCliente;

    public Cliente(CadastroClienteDTO dadosCadastro) {
        this.nomeCliente = dadosCadastro.nomeCliente();
        this.emailCliente = dadosCadastro.emailCliente();
        this.telCliente = dadosCadastro.telCliente();
        this.enderecoCliente = dadosCadastro.enderecoCliente();
    }

    public Cliente(getClienteDTO getCliente){
        this.nomeCliente = getCliente.nomeCliente();
        this.emailCliente = getCliente.emailCliente();
        this.telCliente = getCliente.telCliente();
        this.enderecoCliente = getCliente.enderecoCliente();
    }
}
