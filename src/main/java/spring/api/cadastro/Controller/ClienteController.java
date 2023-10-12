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

//    @GetMapping
//    public List<Cliente> getCliente(){
//        List<Cliente> modelCliente = new ArrayList<>();
//        List<getClienteDTO> clienteDTO = new ArrayList<>();
//        for(Cliente dado : modelCliente){
//            clienteDTO.add(new getClienteDTO());
//
//        }
//
//
//
//        return null;
//    }
}
