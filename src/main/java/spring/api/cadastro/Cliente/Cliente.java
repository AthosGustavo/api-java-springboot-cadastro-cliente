package spring.api.cadastro.Cliente;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="clientes")
@Getter
public class Cliente {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long idCliente;
    public String nomeCliente;
    private String emailCliente;
    private String telCliente;
    private String enderecoCliente;

    public Cliente(CadastroClienteDTO dadosCadastro) {
        this.nomeCliente = dadosCadastro.nomeCliente();
        this.emailCliente = dadosCadastro.emailCliente();
        this.telCliente = dadosCadastro.telCliente();
        this.enderecoCliente = dadosCadastro.enderecoCliente();
    }

    public Cliente(GetClienteDTO getCliente){
        this.nomeCliente = getCliente.nomeCliente();
        this.emailCliente = getCliente.emailCliente();
        this.telCliente = getCliente.telCliente();
        this.enderecoCliente = getCliente.enderecoCliente();
    }

    public void atualizaCliente(AtualizaClienteDTO atualizaClienteDTO) {
        if(atualizaClienteDTO.nomeCliente() != null){
            this.nomeCliente = atualizaClienteDTO.nomeCliente();
        }
        if(atualizaClienteDTO.emailCliente() != null){
            this.emailCliente = atualizaClienteDTO.emailCliente();
        }
        if(atualizaClienteDTO.telCliente() != null){
            this.telCliente = atualizaClienteDTO.telCliente();
        }
        if(atualizaClienteDTO.enderecoCliente() != null){
            this.enderecoCliente = atualizaClienteDTO.enderecoCliente();
        }
    }

    public Long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Long idCliente) {
        this.idCliente = idCliente;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getEmailCliente() {
        return emailCliente;
    }

    public void setEmailCliente(String emailCliente) {
        this.emailCliente = emailCliente;
    }

    public String getTelCliente() {
        return telCliente;
    }

    public void setTelCliente(String telCliente) {
        this.telCliente = telCliente;
    }

    public String getEnderecoCliente() {
        return enderecoCliente;
    }

    public void setEnderecoCliente(String enderecoCliente) {
        this.enderecoCliente = enderecoCliente;
    }

}
