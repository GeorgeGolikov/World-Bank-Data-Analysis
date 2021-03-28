package worldbankdataanalysis.repository

import org.springframework.data.jpa.repository.JpaRepository
import worldbankdataanalysis.entity.EconomicPolicy
import java.util.*

interface EconomicPolicyRepository : JpaRepository<EconomicPolicy, Long> {
    override fun findById(id: Long): Optional<EconomicPolicy>
}