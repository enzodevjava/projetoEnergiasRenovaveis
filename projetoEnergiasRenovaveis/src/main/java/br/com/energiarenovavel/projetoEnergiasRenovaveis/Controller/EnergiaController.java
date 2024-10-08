package br.com.energiarenovavel.projetoEnergiasRenovaveis.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import br.com.energiarenovavel.projetoEnergiasRenovaveis.dto.GeracaoEnergiaDTO;
import br.com.energiarenovavel.projetoEnergiasRenovaveis.Service.EnergiaService;

import java.util.List;

@RestController
@RequestMapping("/energia")
public class EnergiaController {

    @Autowired
    private EnergiaService energiaService;

    @PostMapping
    public ResponseEntity<String> adicionarDadosEnergia(@RequestBody GeracaoEnergiaDTO dados) {
        energiaService.salvarDados(dados);
        return ResponseEntity.ok("Dados recebidos com sucesso!");
    }

    @GetMapping("/historico")
    public List<GeracaoEnergiaDTO> obterHistorico() {
        return energiaService.obterTodosDados();
    }
}
