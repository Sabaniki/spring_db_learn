package jp.keio.k_sawada.spring_db_learn.domain

import jp.keio.k_sawada.spring_db_learn.share.nature.Nature
import javax.persistence.*


@Entity
data class Pokemon(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Long?,
        val name: String?,
        val nature: Nature?,
        @ElementCollection
        val skill: MutableList<String>?,
        val ability: String?
)

