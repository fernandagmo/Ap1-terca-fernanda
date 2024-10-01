package api.com.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import api.com.api.model.Endereco;

public interface EnderecoRepository extends JpaRepository<Endereco, Long> {
}
