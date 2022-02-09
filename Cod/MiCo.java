package Cod;

public class MiCo {
	public MiCo() {}
	public static String ColorTexto(String c) {
		if (c == "CT_NEGRO")
			return "\033[0;30";
		else if (c == "CT_ROJO")
			return "\033[0;31";
		else if (c == "CT_VERDE")
			return "\033[0;32";
		else if (c == "CT_MARRON")
			return "\033[0;33";
		else if (c == "CT_AZUL")
			return "\033[0;34";
		else if (c == "CT_PURPURA")
			return "\033[0;35";
		else if (c == "CT_CYAN")
			return "\033[0;36";
		else if (c == "CT_GRIS")
			return "\033[0;37";
		else if (c == "CT_GRIS_OSCURO")
			return "\033[1;30";
		else if (c == "CT_ROJO_CLARO")
			return "\033[1;31";
		else if (c == "CT_VERDE_CLARO")
			return "\033[1;32";
		else if (c == "CT_MARRON_CLARO")
			return "\033[1;33";
		else if (c == "CT_AZUL_CLARO")
			return "\033[1;34";
		else if (c == "CT_PURPURA_CLARO")
			return "\033[1;35";
		else if (c == "CT_CYAN_CLARO")
			return "\033[1;36";
		else if (c == "CT_BLANCO")
			return "\033[1;37";
		else
			return null;
	}

	public static String ColorFondo(String c) {
		if (c == "CF_NEGRO")
			return ";40m";
		else if (c == "CF_ROJO")
			return ";41m";
		else if (c == "CF_VERDE")
			return ";42m";
		else if (c == "CF_MARRON")
			return ";43m";
		else if (c == "CF_AZUL")
			return ";44m";
		else if (c == "CF_PURPURA")
			return ";45m";
		else if (c == "CF_CYAN")
			return ";46m";
		else if (c == "CF_GRIS")
			return ";47m";
		else
			return null;
	}
	public static void cls() {
		System.out.print("\033[2J");
	}
	public static void setColor(String ct, String cf) {
		System.out.print(ColorTexto(ct) + ColorFondo(cf));
	}
	public static void setCursor(int x, int y) {
		System.out.print("\033[" + y + ";" + x + "H");
	}
}
