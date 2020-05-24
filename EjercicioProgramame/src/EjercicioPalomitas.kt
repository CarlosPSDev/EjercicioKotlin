/*Diana quiere poder calcular cu�nto tiempo le llevar� cocinar todas las palomitas que
quiera comer antes de comenzar, y asi calcular a qu� hora estar� todo listo para disfrutar de su pel�cula
favorita. Tiene calculado que las palomitas tardan en saltar y estar listas 5 minutos pero tambi�n se ha dado
cuenta que cada vez s�lo consigue que se cocinen la mitad de las que ha puesto en la olla. Es por eso
que retira las que est�n listas y vuelve a cocinar las que quedan, y asi repetidamente hasta que todas las
palomitas est�n listas (Tiene calculado que cuando queda un solo grano de ma�z en la olla siempre acaba
saltando correctamente). Por eso, necesita idear un algoritmo que permita calcular, para una cantidad de granos de ma�z para
palomitas, cuanto tiempo necesita pasar en la cocina para tener listas sus palomitas. Habr� que tener en cuenta que no existe el caso en que un grano se cocine a medias. En cada hornada
se tiene que obtener un n�mero de granos completamente cocinados. Entrada: Se reciben como entradas diferentes cantidades
 de granos de ma�z que se cocinar�n. Salida: Como salida se debe mostrar la cantidad en minutos que costar� cocinar cada
 una de las cantidades pasadas como entrada, teniendo en cuenta los c�lculos de Diana. La ejecuci�n termina al introducir 0 */

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