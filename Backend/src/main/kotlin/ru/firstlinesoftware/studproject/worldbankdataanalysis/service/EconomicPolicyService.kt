package ru.firstlinesoftware.studproject.worldbankdataanalysis.service

import ru.firstlinesoftware.studproject.worldbankdataanalysis.entity.EconomicPolicy

interface EconomicPolicyService {
    fun findById(id: Long): EconomicPolicy?
}