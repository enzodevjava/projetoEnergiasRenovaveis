package br.com.energiarenovavel.projetoEnergiasRenovaveis.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.energiarenovavel.projetoEnergiasRenovaveis.Entity.GeracaoEnergia;

public interface EnergiaRepository extends JpaRepository<GeracaoEnergia, Long> {
}
