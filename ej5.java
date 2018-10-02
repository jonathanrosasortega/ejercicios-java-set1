/*Modifica el programa anterior añadiendo colores. Puedes mostrar cada asignatura de un color diferente.*/
public class ej5 {
	public static void main(String[] args) {
		String rojo = "\033[31m";
		String verde = "\033[32m";
		String blanco = "\033[37m";
		String azul = "\033[34m";
		String morado = "\033[35m";
		String naranja = "\033[33m";

		System.out.println("Lunes Martes Miércoles Jueves Viernes");
		System.out.printf(rojo + "%-6s" + blanco + "%-7s" + naranja + "%-10s" + naranja + "%-7s" + rojo + "%-8s\n", "SINF", "PRO", "EED", "EED", "SINF");
		System.out.printf(rojo + "%-6s" + blanco + "%-7s" + morado + "%-10s" + blanco + "%-7s" + rojo + "%-8s\n", "SINF", "PRO", "LM", "PRO", "SINF");
		System.out.printf(rojo + "%-6s" + blanco + "%-7s" + morado + "%-10s" + blanco + "%-7s" + rojo + "%-8s\n", "SINF", "PRO", "LM", "PRO", "SINF");
		System.out.printf(verde + "%-6s" + azul + "%-7s" + blanco + "%-10s" + azul + "%-7s" + naranja + "%-8s\n", "FOL", "BBDD", "PRO", "BBDD", "EED");
		System.out.printf(verde + "%-6s" + azul + "%-7s" + blanco + "%-10s" + azul + "%-7s" + morado + "%-8s\n", "FOL", "BBDD", "PRO", "BBDD", "LM");
		System.out.printf(verde + "%-6s" + azul + "%-7s" + blanco + "%-10s" + azul + "%-7s" + morado + "%-8s\n", "FOL", "BBDD", "PRO", "BBDD", "LM");
	}
}
