/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author krissia.araya
 */
import javax.swing.JOptionPane;

public class Lista {
    Nodo inicio;
    int tamaño;

    public Lista() {
        this.inicio = null;
        this.tamaño = 0;
    }

    public void Agregar(Producto producto) {
        Nodo nuevo = new Nodo(producto);
        if (inicio == null) {
            inicio = nuevo;
        } else {
            Nodo aux = inicio;
            while (aux.siguiente != null) {
                aux = aux.siguiente;
            }
            aux.siguiente = nuevo;
        }
        tamaño++;
    }

    public Producto RetornarProducto(int posicion) {
        if (inicio != null && posicion >= 0 && posicion < tamaño) {
            Nodo aux = inicio;
            for (int i = 0; i < posicion; i++) {
                aux = aux.siguiente;
            }
            return aux.producto;
        } else {
            JOptionPane.showMessageDialog(null, "Posición inválida.");
            return null;
        }
    }

    public void MostrarNodos() {
        if (inicio != null) {
            Nodo aux = inicio;
            int i = 1;
            do {
                System.out.println("Producto " + i + ":\n" + aux.producto.obtenerDetalles());
                aux = aux.siguiente;
                i++;
            } while (aux != null);
        } else {
            System.out.println("La lista está vacía.");
        }
    }

    Nodo getInicio() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}