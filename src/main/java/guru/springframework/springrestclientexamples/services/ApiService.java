package guru.springframework.springrestclientexamples.services;

import guru.springframework.springrestclientexamples.models.Pokemon;

import java.util.List;

public interface ApiService {

    List<Pokemon> getPokemonList(Integer limit);

    Pokemon getPokemonByName(String name);

}
