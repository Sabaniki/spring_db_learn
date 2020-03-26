package jp.keio.k_sawada.spring_db_learn.repository

import jp.keio.k_sawada.spring_db_learn.domain.Pokemon
import org.springframework.data.jpa.repository.JpaRepository

interface PokemonRepository: JpaRepository<Pokemon, Long> {
}