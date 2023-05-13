package br.com.fatecararas.f290_dsm_tp2_suggestionbox_ct.api.v1.resources;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.fatecararas.f290_dsm_tp2_suggestionbox_ct.model.Suggestion;

@RestController
@RequestMapping("/")
public class FirstRestController {
    @GetMapping
    public ResponseEntity<?>HelloAPIGet(){
        System.out.println("passou por aqui");
        return ResponseEntity.ok().build();    
    }
    
    @PostMapping
    public ResponseEntity<?>HelloAPIPost(@RequestBody Suggestion suggestion){
        System.out.println("passou por aqui");

        System.out.println("recebido:\n");
        System.out.println(suggestion);
        return ResponseEntity.created(null).build();    
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?>HelloAPIDelete(@PathVariable("id") Integer id){
        System.out.println("passou por aqui");
        System.out.println("recebido id: "+id); 

        return ResponseEntity.ok().build();    
    }    

    @PutMapping("/{id}")
    public ResponseEntity<?>HelloAPIDPut(@PathVariable("id") Integer id, @RequestBody Suggestion suggestion){
        System.out.println("passou por aqui");
        System.out.println("recebido id: "+id); 
        System.out.println("Body : "+suggestion);   
        if (suggestion.getId().equals(100)){
        return ResponseEntity.ok().build(); 
        } 
    
        return ResponseEntity.notFound().build(); 
    }


    @GetMapping("/all")
    public ResponseEntity<List<Suggestion>> getAll(){
        List<Suggestion> all = Arrays.asList(
            new Suggestion(1, "primeira sugestao", LocalDate.of(2023, 10, 9)),
            new Suggestion(2, "segunda sugestao", LocalDate.of(2023, 02, 18)),  
            new Suggestion(3, "terceira sugestao", LocalDate.of(2023, 10, 8)),
            new Suggestion(4, "quarta sugestao", LocalDate.of(2023, 01, 9)),
            new Suggestion(5, "quinta sugestao", LocalDate.of(2023, 03, 19)));
        return ResponseEntity.ok().body(all);
    }    
}

