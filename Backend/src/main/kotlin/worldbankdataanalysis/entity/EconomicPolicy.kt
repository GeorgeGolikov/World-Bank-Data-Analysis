package worldbankdataanalysis.entity

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
class EconomicPolicy(
    @Id @GeneratedValue(strategy = GenerationType.AUTO) private var id: Long? = null
) {
}