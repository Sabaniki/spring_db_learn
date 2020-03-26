package jp.keio.k_sawada.spring_db_learn.domain

import jp.keio.k_sawada.spring_db_learn.share.nature.Nature
import javax.persistence.*


@Entity
data class Pokemon(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        var id: Long?,
        var name: String?,
        var nature: Nature?,
        @ElementCollection
        var skills: MutableList<String>?,
        var ability: String?
)

