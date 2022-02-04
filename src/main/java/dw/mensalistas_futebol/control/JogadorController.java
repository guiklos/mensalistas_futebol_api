package dw.mensalistas_futebol.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import dw.mensalistas_futebol.repository.*;
import java.util.ArrayList;
import java.util.List;
import dw.mensalistas_futebol.model.*;


@RestController
@RequestMapping("/api")
public class JogadorController {
  @Autowired
  JogadorRepository rep;

  //Listar todos os jogadores

  @GetMapping("/jogadores")
  public ResponseEntity<List<Jogador>> getAllJogadores(@RequestParam(required=false) String nome)
  {
      try {
        List<Jogador> la = new ArrayList<Jogador>();
          if (nome==null)
            rep.findAll().forEach(la::add);
          else
            rep.findByNome(nome).forEach(la::add);
          if(la.isEmpty())
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            
          return new ResponseEntity<>(HttpStatus.OK);



      } catch (Exception e) {
        return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
      }
  }
}
