package Sesion_5;

public class Prueba_Tienda {

	public static void main(String[]args) {
		
		Tienda tienda = new Tienda(7);
		tienda.AgregarProducto(new Producto("Chocolate", 500, "Chocolate amargo, 500 gr"));
		tienda.AgregarProducto(new Producto("Leche", 800, "Leche entera, 1 litro"));
		tienda.AgregarProducto(new Producto("Arroz", 900, "Grado 2, 1 kilo"));	
		tienda.Menu();

	}

}
