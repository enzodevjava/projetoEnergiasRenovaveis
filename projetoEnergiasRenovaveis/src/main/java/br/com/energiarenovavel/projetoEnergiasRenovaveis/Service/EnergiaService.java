package br.com.energiarenovavel.projetoEnergiasRenovaveis.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.energiarenovavel.projetoEnergiasRenovaveis.dto.GeracaoEnergiaDTO;
import br.com.energiarenovavel.projetoEnergiasRenovaveis.Entity.GeracaoEnergia;
import br.com.energiarenovavel.projetoEnergiasRenovaveis.Repository.EnergiaRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EnergiaService {

    @Autowired
    private EnergiaRepository energiaRepository;

    public void salvarDados(GeracaoEnergiaDTO dadosDTO) {
        GeracaoEnergia dados = new GeracaoEnergia();
        dados.setEnergiaGerada(dadosDTO.getEnergiaGerada());
        dados.setEnergiaArmazenada(dadosDTO.getEnergiaArmazenada());
        dados.setDataHora(dadosDTO.getDataHora());
        energiaRepository.save(dados);
    }

    public List<GeracaoEnergiaDTO> obterTodosDados() {
        return energiaRepository.findAll().stream().map(dados -> {
            GeracaoEnergiaDTO dto = new GeracaoEnergiaDTO();
            dto.setEnergiaGerada(dados.getEnergiaGerada());
            dto.setEnergiaArmazenada(dados.getEnergiaArmazenada());
            dto.setDataHora(dados.getDataHora());
            return dto;
        }).collect(Collectors.toList());
    }


}
