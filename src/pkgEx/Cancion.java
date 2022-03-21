package pkgEx;

/**
 * Esto es el nucleo del programa ya que posee los atributos, los constructores
 * y los metodos correspondiente creados.
 * @author Florentin Viorel
 * @version 02.2022
 * @see Cancion#Cancion(), {@link Cancion#Cancion(String, int)},
 * {@link Cancion#Cancion(String, String, int, boolean)}, {@link Cancion#reproducirCancion()},
 * {@link Cancion#pararCancion()}, {@link Cancion#MismaCancion(Cancion)}, {@link Cancion#MayorDuracion(Cancion[])},
 * {@link Cancion#SiguienteCancion(Cancion[], String)}, {@link Cancion#toString()},
 * 
 */
public class Cancion {
	private String titulo;
	private String grupo;
	private int duracion;
	private boolean sonando;

	// Definimos los constructores
	/**
	 * Este contructor sirve para crear el objeto cancion con valores default del creador del 
	 * codigo
	 */
	Cancion() // Constructor sin parámetros
	{
		this.titulo = "";
		this.duracion = 0;
		this.sonando = false;
	}
	/**
	 * Este contructor sirve para crear un objeto con el nombre de la cancion y la duracion de la misma
	 * en segundos
	 * @param titulo
	 * @param duracion
	 */
	Cancion(String titulo, int duracion)// constructor con 2 parámetros
	{
		this.titulo = titulo;
		this.duracion = duracion;
		this.sonando = false;
	}
	/**
	 * Este constructor sirve para crear el objeto cancion con titulo, autor(grupo), duracion es segundos
	 * y si esta sonando o no
	 * @param titulo
	 * @param grupo
	 * @param duracion
	 * @param sonando
	 */
	Cancion(String titulo, String grupo, int duracion, boolean sonando) // constructor con 4 parámetros
	{
		this.titulo = titulo;
		this.duracion = duracion;
		this.sonando = sonando;
		this.grupo = grupo;
	}
	/**
	 * Este metodo sirve para reproduccir una cancion.
	 * @return Si se esta reproducciendo te devuelve false.
	 */
	boolean reproducirCancion() {
		if (this.sonando) {
			return false;
		} else {
			this.sonando = true;
			return true;
		}
	}
	/**
	 * Este metodo sirve para parar la cancion
	 * @return Si esta parada devuelve false 
	 */
	boolean pararCancion() {
		if (!this.sonando) {
			return false;
		} else {
			this.sonando = false;
			return true;
		}
	}

	// meter métodos get/set/toString()
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getGrupo() {
		return grupo;
	}

	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
	/**
	 * Es un getter de sonando
	 * @return devulve un valor booleado (true, false) para saber
	 * si esta sonando o no la cancion
	 */
	public boolean isSonando() {
		return sonando;
	}
	/*
	 * Es un setter sirve para setear un valor a si esta sonando
	 * o no  (true,false)
	 */
	public void setSonando(boolean sonando) {
		this.sonando = sonando;
	}
	/**
	 * Este metodo sirve para saber si la cancion pasada como parametro 
	 * una cancion.
	 * @param cancion
	 * @return devulve un (true,false) para saber si es la misma cancion o no
	 */
	boolean MismaCancion(Cancion cancion) {
		if (this.titulo == cancion.titulo && this.grupo == cancion.grupo)
			return true;
		else
			return false;
	}
	/**
	 * Este metodo sirve para recorer todas las canciones y saber cual es la mas larga
	 * @param canciones
	 * @return devulve el titulo de la cancion mas larga
	 */
	public static String MayorDuracion(Cancion[] canciones) {
		int posMax = 0;
		int max = 0;
		for (int i = 0; i < canciones.length; i++) {
			if (canciones[i].duracion > max) {
				posMax = i;
				max = canciones[i].duracion;
			}
		}
		return canciones[posMax].titulo;

	}
	/**
	 * Este metodo sirve para saber cual va ha ser la siguiente cancion en base al titulo
	 * introducido.
	 * @param canciones
	 * @param titulo
	 * @return de devulve el titulo de la siguiente cancion
	 */
	static String SiguienteCancion(Cancion[] canciones, String titulo) {
		int pos = 0;
		int siguiente = 0;
		for (int i = 0; i < canciones.length; i++) {
			if (titulo == canciones[i].titulo) {
				pos = i;
			}
		}
		if (pos == canciones.length - 1) {
			siguiente = 0;
		} else {
			siguiente = pos + 1;
		}
		return canciones[siguiente].titulo;
	}
	/**
	 * Este Override sirve para cambiar el resultado al usar la impresion
	 * puniendo el titulo, autor(grupo), duracion y si esta sonando
	 */
	@Override
	public String toString() {
		return "Cancion [titulo=" + titulo + ", autor=" + grupo + ", duracion=" + duracion + ", sonando=" + sonando
				+ "]";
	}
}
