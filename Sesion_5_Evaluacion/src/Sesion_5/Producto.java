package Sesion_5;

public class Producto {

	private String nombre;
	private int valor;
	private String descripcion;
	
	public Producto(String nombre, int valor, String descripcion) {
		
		this.nombre = nombre;
		this.valor = valor;
		this.descripcion = descripcion;
		
	}
	
	public void SetNombre(String nombre) {
		
		this.nombre = nombre;
	}
	public void SetValor(int valor) {
		
		this.valor = valor;
	}
	public void SetDescripcion(String descripcion) {
		
		this.descripcion = descripcion;
	}
	public String getNombre() {
		
		return this.nombre;
	}
	public int getValor() {
	
		return this.valor;
	}
	public String getDescripcion() {
		
		return this.descripcion;
	}
	
	
}
