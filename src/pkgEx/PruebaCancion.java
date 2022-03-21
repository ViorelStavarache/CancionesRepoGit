package pkgEx;
/**
 * Esta clase sirve para hacer pruebas a la clase Cancion.java
 * y ver que todo funciona como deberia y en caso de que se modifique
 * la clase Cancion.java volver a ejecutar las prubeas y verificar que todo 
 * sigua funcionando como estaba planteado desde un inicio.
 * @author Florentin Viorel 
 * @version 02.2099
 */
public class PruebaCancion {
	/**
	 * Es el hilo de ejecucion de programa, donde se ejucatar las instrucciones.
	 * En el metodo main usaremos los constructores que tenemos y los metodos
	 * para testear la funcionalidad de Cancion.java pasadole los parametros
	 * correspondientes
	 * @param args
	 * @see Cancion#Cancion(), {@link Cancion#Cancion(String, int)},
	 * {@link Cancion#Cancion(String, String, int, boolean)},
	 * {@link Cancion#reproducirCancion()}, {@link Cancion#pararCancion()},
	 * {@link Cancion#MismaCancion(Cancion)}
	 * {@link PruebaCancion#mostrarCancionesyAutor(Cancion[])}
	 * {@link PruebaCancion#mostrarCancionMasLarga(Cancion[])},
	 * {@link PruebaCancion#mostrarSiguienteCancion(Cancion, Cancion[])
	 * 
	 */
	public static void main(String[] args) {
		Cancion cancionPrueba = new Cancion();
		System.out.println(cancionPrueba);
		Cancion cancionClasico = new Cancion("Sweet Home Alabama", 180);
		System.out.println(cancionClasico);
		
		Cancion primeraCancion = new Cancion("I Don't Like Mondays", "The Boomtown Rats", 390, true);
		Cancion segundaCancion = new Cancion("Don’t Stop Believin’", "Journey", 320, false);
		Cancion terceraCancion = new Cancion("Come Join The Murder", "The White Buffalo & The Forest Rangers", 420, false);

		if (primeraCancion.reproducirCancion()) {
			System.out.println(primeraCancion.getTitulo() + " está sonando");
		}
		if (primeraCancion.pararCancion()) {
			System.out.println(primeraCancion.getTitulo() + " stop");
		}
		if (primeraCancion.MismaCancion(cancionClasico)) {
			System.out.println("Parece que no son la misma canción");
		}
		
		Cancion nueva = new Cancion("Baba O'riley", "The Who", 310, false);
		Cancion[] canciones = { primeraCancion, segundaCancion, terceraCancion, nueva };
		
		mostrarCancionesyAutor(canciones);
		mostrarCancionMasLarga(canciones);

		mostrarSiguienteCancion(primeraCancion, canciones);
		mostrarSiguienteCancion(nueva, canciones);
	}

	/**
	 * Esto es un metodo del cual sacaremos la siquiente cancion en base a dos
	 * parametros los cuales vienen definidos por miCancion y canciones.
	 * @param miCancion
	 * @param canciones
	 * @see Cancion#SiguienteCancion(Cancion[], String),
	 * {@link Cancion#getTitulo()}
	 */
	private static void mostrarSiguienteCancion(Cancion miCancion, Cancion[] canciones) {
		System.out.println("La canción que sonará después de " + miCancion.getTitulo() + " será "
				+ Cancion.SiguienteCancion(canciones, miCancion.getTitulo()));
	}

	/**
	 * Este metodo sirve para imprimir la cancion mas larga que tengamos
	 * @param canciones
	 * @see Cancion#MayorDuracion(Cancion[])
	 */
	private static void mostrarCancionMasLarga(Cancion[] canciones) {
		System.out.println("La canción más larga es: " + Cancion.MayorDuracion(canciones));
	}

	/**
	 * Este metodo nos informas de todos los titulos y autores/grupo de las canciones que tenemos
	 * @param canciones
	 * @see Cancion#getTitulo(), {@link Cancion#getGrupo()}
	 */
	private static void mostrarCancionesyAutor(Cancion[] canciones) {
		for (int i = 0; i < canciones.length; i++) {
			System.out.println("La canción es " + canciones[i].getTitulo() + " de " + canciones[i].getGrupo());
		}
	}
	

}