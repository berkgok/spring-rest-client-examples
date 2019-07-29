package guru.springframework.springrestclientexamples.controllers;

import guru.springframework.springrestclientexamples.models.Pokemon;
import guru.springframework.springrestclientexamples.services.ApiService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Slf4j
@Controller
public class PokemonDataController {

    private ApiService apiService;

    public PokemonDataController(ApiService apiService) {
        this.apiService = apiService;
    }

    @PostMapping("/show_pokemon")
    public String postName(@RequestParam String name, Model model){

        System.out.println("I'M IN CONTROLLER REQUESTED NAME IS " + name);

        Pokemon pokemon = apiService.getPokemonByName(name);

        System.out.println("I'M IN CONTROLLER POKEMON NAME IS " + pokemon.getName());

        model.addAttribute("pokemonObj", pokemon);

        return "pokemon_page";
    }
}
