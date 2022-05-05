import java.io.FileWriter;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");


        FileWriter objArchivo= new FileWriter("clientes.txt");

        String nombre=JOptionPane.showInputDialog(null, "Por forvor ingrese el nombre. ");
        
        objArchivo.write("Nombre: "+nombre+" \n");

        objArchivo.write("Edad: "+JOptionPane.showInputDialog("Por favor ingrese la edad.")+"\n");


        objArchivo.write("Telefono: "+JOptionPane.showInputDialog("Por favor ingrese el numero de telefono. ")+"\n");

        objArchivo.close();


    }
}
