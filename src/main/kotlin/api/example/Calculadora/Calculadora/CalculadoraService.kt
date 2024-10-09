package api.example.Calculadora.Calculadora

import org.springframework.stereotype.Service

@Service
class CalculadoraService {
    fun calcula(tipoCalculo: String, i: Double, j: Double): Double {
        return when (tipoCalculo) {
            "soma" -> soma(i,j)
            "subtracao" -> subtracao(i,j)
            "multiplicacao" -> multiplica(i,j)
            "divisao" -> divide(i,j)
            else -> throw Exception("Tipo de Calculo Inválido")
        }
    }

    private fun multiplica(i: Double, j: Double): Double {
        return  i * j
    }

    private fun subtracao(i: Double, j: Double): Double {
        return i - j
    }

    private fun soma(i: Double, j: Double):Double {
        return i + j
    }

    private fun divide(i:Double,j:Double):Double{
        if(j == 0.00){
            throw Exception("Denominador deve ser diferente de 0")
        }
        return i/j
    }
}