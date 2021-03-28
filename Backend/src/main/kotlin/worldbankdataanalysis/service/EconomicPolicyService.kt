package worldbankdataanalysis.service

import worldbankdataanalysis.entity.EconomicPolicy

interface EconomicPolicyService {
    fun findById(id: Long): EconomicPolicy?
}