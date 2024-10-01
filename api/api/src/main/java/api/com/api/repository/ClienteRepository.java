package api.com.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import api.com.api.model.Cliente;

import java.util.Optional;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
    Optional<Cliente> findByEmail(String email);
    Optional<Cliente> findByCpf(String cpf);
}

