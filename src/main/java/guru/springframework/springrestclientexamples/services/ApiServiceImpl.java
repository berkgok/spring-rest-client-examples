package guru.springframework.springrestclientexamples.services;

import guru.springframework.springrestclientexamples.models.Pokemon;
import guru.springframework.springrestclientexamples.models.PokemonData;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class ApiServiceImpl implements ApiService {

     private RestTemplate restTemplate;

    public ApiServiceImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public List<Pokemon> getPokemonList(Integer limit) {

        PokemonData pokemonData = restTemplate.getForObject("https://pokeapi.co/api/v2/pokemon?limit=" + limit, PokemonData.class);

        //todo: Add Custom Exception for NPE
        return pokemonData.getPokemonList();
    }

    @Override
    public Pokemon getPokemonByName(String name) {

        Pokemon pokemon = restTemplate.getForObject("https://pokeapi.co/api/v2/pokemon/" + name, Pokemon.class);

        //todo: Add Custom Exception for NPE
        return pokemon;
    }
}
