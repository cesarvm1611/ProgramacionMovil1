//Cesar Venancio Martinez


import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class UsuarioManager {

    private static final String ARCHIVO = "usuarios.txt";

    public static List<Usuario> cargarUsuarios() {
        List<Usuario> lista = new ArrayList<>();

        File file = new File(ARCHIVO);
        if (!file.exists()) return lista;

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                Usuario u = Usuario.fromString(linea);
                if (u != null) lista.add(u);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return lista;
    }

    public static void guardarUsuarios(List<Usuario> usuarios) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(ARCHIVO))) {
            for (Usuario u : usuarios) {
                bw.write(u.toString());
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
