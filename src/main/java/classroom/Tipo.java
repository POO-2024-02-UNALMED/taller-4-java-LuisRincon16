package classroom;

public enum Tipo {
	DISCIPLINAR(10, "Disciplinar"),FUNDAMENTACION(20, "Fundamentacion"),ELECTIVA(30, "Electiva");
	
	private int codigo;
	private String nombre;

	public Tipo(int codigo,String nombre) {
		this.codigo = codigo;
		this.nombre = nombre;
	}
}
