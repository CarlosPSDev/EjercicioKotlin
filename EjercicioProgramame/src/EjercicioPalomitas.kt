/*Diana quiere poder calcular cuánto tiempo le llevará cocinar todas las palomitas que
quiera comer antes de comenzar, y asi calcular a qué hora estará todo listo para disfrutar de su película
favorita. Tiene calculado que las palomitas tardan en saltar y estar listas 5 minutos pero también se ha dado
cuenta que cada vez sólo consigue que se cocinen la mitad de las que ha puesto en la olla. Es por eso
que retira las que están listas y vuelve a cocinar las que quedan, y asi repetidamente hasta que todas las
palomitas están listas (Tiene calculado que cuando queda un solo grano de maíz en la olla siempre acaba
saltando correctamente). Por eso, necesita idear un algoritmo que permita calcular, para una cantidad de granos de maíz para
palomitas, cuanto tiempo necesita pasar en la cocina para tener listas sus palomitas. Habrá que tener en cuenta que no existe el caso en que un grano se cocine a medias. En cada hornada
se tiene que obtener un número de granos completamente cocinados. Entrada: Se reciben como entradas diferentes cantidades
 de granos de maíz que se cocinarán. Salida: Como salida se debe mostrar la cantidad en minutos que costará cocinar cada
 una de las cantidades pasadas como entrada, teniendo en cuenta los cálculos de Diana. La ejecución termina al introducir 0 */

fun main(args: Array<String>) {
	var cantidad : Int
	var tiempo : Int
	
	do {
		cantidad = readLine()!!.toInt()
		if (cantidad != 0) {
			tiempo = calcularTiempo(cantidad)
			imprimirResultado(tiempo)	
		}			
	} while (cantidad != 0)
	
}
fun calcularTiempo( cantidad: Int) : Int {
	var tiempo = 0
	var resto = cantidad
	
	while (resto > 1) {
		resto = resto - resto / 2		
		tiempo++		
	}	
	return tiempo +1
}

fun imprimirResultado(tiempo: Int){	
	println("${tiempo * 5} minutos")
}