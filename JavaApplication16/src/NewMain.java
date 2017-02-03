
public class NewMain {

    

        public class Jugadores {
	
	private int idjugador;
	private String nombre;
	private int partidos;
	private int idEquipo;
	private int goles;
	
	public Jugadores(){
		
		idjugador = 1;
		nombre = "Mustafa";
		partidos = 8;
		idEquipo = 1;
		goles = 6;
	}
	
	public Jugadores(int idjugador, String nombre,int partidos,int idEquipo,int goles){
		
		this.idjugador = idjugador;
		this.nombre = nombre;
		this.partidos = partidos;
		this.idEquipo = idEquipo;
		this.goles = goles;
		

	}
	
	public String MostarDatos(){
		
		return "Datos de jugador idJugador "+ idjugador + " Nombre: "+  nombre + " partodos: " +
		partidos + " idEquipos: " + idEquipo + " Goles: " + goles;
	}
	
	public double MediaGolesPartido(double MediaGolesPorpartido){
		
		this.MediaGolesPartido = partidos/goles;
	}

}

        
        
        
       
   
    
}
