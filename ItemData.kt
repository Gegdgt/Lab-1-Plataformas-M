//Nombre del programador : Gabriel García
//Nombre del programa:ItemData
//Fecha de ultima modificación: 14/07/2023

class ItemData (val originalValue: Any) {

    fun getType():String? {
        return when (originalValue) {
            is String -> return "cadena"
            is Int -> return "entero"
            is Boolean -> return "booleano"
            else -> return null
        }
    }

    fun getInfo(): String? {
        return when(originalValue) {
            is String -> "L${originalValue.length}"
            is Int -> {
                when {
                    originalValue % 10 == 0 -> return "M10"
                    originalValue % 5 == 0 -> return "M5"
                    originalValue % 2 == 0 -> return "M2"
                    else -> return null
                }
            }
            is Boolean -> if (originalValue) {
                return "Verdadero"
            } else {
                return "Falso"
            }
            else -> return null
        }
    }
}