package jp.keio.k_sawada.spring_db_learn.controller

import jp.keio.k_sawada.spring_db_learn.domain.Pokemon
import jp.keio.k_sawada.spring_db_learn.service.PokemonService
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.*

@Controller
@RequestMapping("pokemons")
class PokemonController(private val pokemonService: PokemonService) {
    @GetMapping
    fun index(model: Model): String {
        model.addAttribute("pokemons", pokemonService.findAll())
        return "pokemons/index"
    }

    @GetMapping("new")
    fun newPlayer() = "pokemons/new"

    @GetMapping("{id}/edit")
    fun edit(@PathVariable id: Long, model: Model): String {
        model.addAttribute("pokemon", pokemonService.findOne(id))
        return "pokemons/edit"
    }

    @GetMapping("{id}")
    fun show(@PathVariable id: Long, model: Model): String {
        model.addAttribute("pokemon", pokemonService.findOne(id))
        return "pokemons/show"
    }

    @PostMapping
    fun create(@ModelAttribute pokemon: Pokemon): String {
        pokemonService.save(pokemon)
        return "redirect:/pokemons"
    }

    @PutMapping("{id}")
    fun update(@PathVariable id: Long, @ModelAttribute pokemon: Pokemon): String {
        pokemonService.save(pokemon.copy(id = id))
        return "redirect:/pokemons"
    }

    @DeleteMapping("{id}")
    fun destroy(@PathVariable id: Long): String {
        pokemonService.delete(id)
        return "redirect:/pokemons"
    }
}