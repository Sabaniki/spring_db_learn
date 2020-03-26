package jp.keio.k_sawada.spring_db_learn.service

import jp.keio.k_sawada.spring_db_learn.domain.Pokemon
import jp.keio.k_sawada.spring_db_learn.repository.PokemonRepository
import org.springframework.stereotype.Service

@Service
class PokemonService(private val pokemonRepository: PokemonRepository) {
    fun findAll() = pokemonRepository.findAll()
    fun findOne(id: Long) = pokemonRepository.findById(id).orElse(null)
    fun save(pokemon: Pokemon) = pokemonRepository.save(pokemon)
    fun delete(id: Long) = pokemonRepository.deleteById(id)
}