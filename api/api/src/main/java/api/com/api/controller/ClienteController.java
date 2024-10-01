package api.com.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import api.com.api.model.Cliente;
import api.com.api.service.ClienteService;
import jakarta.validation.Valid;


@RestController
@RequestMapping("/api/clientes")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @PostMapping
    public ResponseEntity<Cliente> createCliente(@Valid @RequestBody Cliente cliente) {
        return ResponseEntity.ok(clienteService.addCliente(cliente));
    }

    // Outros métodos para atualizar, buscar e remover clientes e endereços
}

