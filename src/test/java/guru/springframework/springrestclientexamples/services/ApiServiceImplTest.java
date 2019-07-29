package guru.springframework.springrestclientexamples.services;

import guru.springframework.springrestclientexamples.models.Pokemon;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApiServiceImplTest {

    @Autowired
    ApiService apiService;

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void testGetPokemonList() throws Exception {

        List<Pokemon> pokemonList = apiService.getPokemonList(3);

        assertEquals(3, pokemonList.size());

    }

    @Test
    public void testGetPokemonByName() throws Exception{

        Pokemon pokemon = apiService.getPokemonByName("ditto");

        assertEquals("ditto", pokemon.getName());

    }
}