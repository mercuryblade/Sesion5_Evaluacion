package Sesion_5;

import java.util.Scanner;

public class Tienda {

	private Producto[] productos;
	private int contador;
	static Scanner input = new Scanner(System.in);

	public Tienda(int capacidad) {

		productos = new Producto[capacidad];
		contador = 0;
	}

	public void AgregarProducto(Producto producto) {

		if (contador < productos.length) {

			productos[contador] = producto;
			contador++;

		} else {
			System.out.println("No se puede agregar más productos");
		}

	}

	public void MostrarProducto() {

		for (int i = 0; i < productos.length; i++) {
			if (productos[i] != null) {
				System.out.println("Producto " + productos[i].getNombre() + " - Valor: " + productos[i].getValor()
						+ " - Descripción: " + productos[i].getDescripcion());
			} else {
				System.out.println("Producto " + (i + 1) + " esta vacío\n");
			}
		}

	}

	public void AgregarProductoManual() {

		String nombre;
		int valor;
		String descripcion;
		System.out.println("Ingrese el nombre del producto: ");
		nombre = input.nextLine();
		System.out.println("Ingrese el valor del producto: ");
		valor = input.nextInt();
		input.nextLine();
		System.out.println("Ingrese la descripcion del producto: ");
		descripcion = input.nextLine();
		AgregarProducto(new Producto(nombre, valor, descripcion));

	}

	public void ModificarProducto() {

		System.out.println("Ingrese que Producto desea modificar : ");
		for (int i = 0; i < productos.length; i++) {
			if (productos[i] != null){
				System.out.println(i+1+") Producto " + productos[i].getNombre() + " - Valor: " + productos[i].getValor()+ " - Descripción: " + productos[i].getDescripcion());

			}
		}
		int opcion = input.nextInt();
		input.nextLine();
		if(opcion > 0 && opcion < productos.length && productos[opcion-1]!= null) {
			
			String modificarNombre;
			int modificarValor;
			String modificarDescripcion;
			System.out.println("Ingrese el nuevo nombre : ");
			modificarNombre = input.nextLine();
			System.out.println("Ingrese el nuevo valor : ");
			modificarValor = input.nextInt();
			input.nextLine();
			System.out.println("Ingrese la nueva descripcion : ");
			modificarDescripcion = input.nextLine();
			productos[opcion -1].SetNombre(modificarNombre);
			productos[opcion -1].SetValor(modificarValor);
			productos[opcion -1].SetDescripcion(modificarDescripcion);
			System.out.println("Producto modificado con exito\n");
			
		}
		else {
			System.out.println("Opción inválida o no hay producto en la posición seleccionada\n");
		}
		
	}

	public void Menu() {

		boolean salir = false;

		while (!salir) {

			System.out.println("Elija una opcion");
			System.out.println("1- Ver productos\n2- Agregar producto\n3- Modificar producto\n4- Salir");
			int opcion = input.nextInt();
			input.nextLine();
			switch (opcion) {

			case 1:
				MostrarProducto();

				break;
			case 2:
				AgregarProductoManual();

				break;
			case 3:
				ModificarProducto();
				break;
			case 4:
				salir = true;
				break;

			default:
				System.out.println("Elija una opción válida");
			}
		}
	}
}
