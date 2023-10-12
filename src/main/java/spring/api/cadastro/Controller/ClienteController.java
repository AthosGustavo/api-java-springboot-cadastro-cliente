package spring.api.cadastro.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import spring.api.cadastro.Cliente.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("cliente")
public class ClienteController {
    @Autowired
    private ClienteRepository clienteRepository;
    @PostMapping
    public void cadastra(@RequestBody CadastroClienteDTO dadosCadastro){
        Cliente cliente = new Cliente(dadosCadastro);
        clienteRepository.save(cliente);
    }

    @GetMapping
    public List<GetClienteDTO> getCliente(){
        //clienteRepository.findAll(); devolve todos os objetos cliente que são armazenados na lista
        List<Cliente> cliente = clienteRepository.findAll();
        List<GetClienteDTO> getClienteDTO = new ArrayList<>();

        for(Cliente x : cliente){
            getClienteDTO.add(new GetClienteDTO(x));
        }
        return getClienteDTO;
    }

    @PutMapping
    public void atualizaCliente(@RequestBody AtualizaClienteDTO atualizaClienteDTO){
        Cliente cliente = clienteRepository.getReferenceById(atualizaClienteDTO.idCliente());
        cliente.atualizaCliente(atualizaClienteDTO);
    }

    @DeleteMapping("/{id}")
    public void excluir(@PathVariable Long id){
        clienteRepository.deleteById(id);
    }

}
