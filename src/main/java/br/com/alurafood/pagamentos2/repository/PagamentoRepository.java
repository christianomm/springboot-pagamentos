package br.com.alurafood.pagamentos2.repository;


import br.com.alurafood.pagamentos2.model.Pagamento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PagamentoRepository extends JpaRepository<Pagamento,Long> {

}
