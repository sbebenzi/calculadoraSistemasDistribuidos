package api.example.Calculadora.Calculadora

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/calcula")
class CalculadoraController {

    @Autowired
    lateinit var calculadoraService:CalculadoraService

    @GetMapping("/{tipoCalculo}/{i}/{j}")
    fun calcula(@PathVariable tipoCalculo:String,@PathVariable i:Double,@PathVariable j:Double):ResponseEntity<Double>{
        return ResponseEntity.ok(calculadoraService.calcula(tipoCalculo,i,j))
    }
}