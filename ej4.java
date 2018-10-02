/*Escribe un programa que muestre tu horario de clase.*/
public class ej4 {
	public static void main(String[] args) {
		System.out.println("Lunes Martes Miércoles Jueves Viernes");
		System.out.printf("%-5s %-6s %-9s %-6s %-7s\n", "SINF", "PRO", "EED", "EED", "SINF");
		System.out.printf("%-5s %-6s %-9s %-6s %-7s\n", "SINF", "PRO", "LM", "PRO", "SINF");
		System.out.printf("%-5s %-6s %-9s %-6s %-7s\n", "SINF", "PRO", "LM", "PRO", "SINF");
		System.out.printf("%-5s %-6s %-9s %-6s %-7s\n", "FOL", "BBDD", "PRO", "BBDD", "EED");
		System.out.printf("%-5s %-6s %-9s %-6s %-7s\n", "FOL", "BBDD", "PRO", "BBDD", "LM");
		System.out.printf("%-5s %-6s %-9s %-6s %-7s\n", "FOL", "BBDD", "PRO", "BBDD", "LM");
	}
}