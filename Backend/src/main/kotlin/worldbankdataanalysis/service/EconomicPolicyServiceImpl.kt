package worldbankdataanalysis.service

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import worldbankdataanalysis.entity.EconomicPolicy
import worldbankdataanalysis.repository.EconomicPolicyRepository

@Service
class EconomicPolicyServiceImpl @Autowired constructor(
    private val economicPolicyRepository: EconomicPolicyRepository
) : EconomicPolicyService {

    override fun findById(id: Long): EconomicPolicy? {
        val optionalVal = economicPolicyRepository.findById(id)
        return if (optionalVal.isPresent) optionalVal.get() else null
    }
}