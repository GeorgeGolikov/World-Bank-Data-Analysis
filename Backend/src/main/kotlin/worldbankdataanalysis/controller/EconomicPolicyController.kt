package worldbankdataanalysis.controller

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import worldbankdataanalysis.service.EconomicPolicyService

@RestController
@RequestMapping("/worldbank")
class EconomicPolicyController @Autowired constructor(
    private val economicPolicyService: EconomicPolicyService) {
}