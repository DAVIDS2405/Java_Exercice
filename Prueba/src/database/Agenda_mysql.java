package database;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Agenda_mysql {
    private Connection conn = null;
    private PreparedStatement ps = null;
    private ResultSet rs = null;
    String qry = "";

    public List<String> Buscar_Persona(String DNI) {
        List<String> Lista_usuario = new ArrayList();
        conn = connector.connection_java();
        qry = "Select * FROM Personas where cedula = ?";
        try {
            ps = conn.prepareStatement(qry);
            ps.setString(1, DNI);
            rs = ps.executeQuery();
            if (rs.next() == true) {
                String dni = rs.getString("cedula");
                String nombre = rs.getString("Nombre");
                String apellido = rs.getString("Apellido");
                String telefono = Integer.toString(rs.getInt("Celular"));
                String descripcion = rs.getString("Descripcion");
                String direccion = rs.getString("Dirreccion");

                Lista_usuario.add(dni);
                Lista_usuario.add(nombre);
                Lista_usuario.add(apellido);
                Lista_usuario.add(telefono);
                Lista_usuario.add(descripcion);
                Lista_usuario.add(direccion);

            } else {
                JOptionPane.showMessageDialog(null, "Persona no encontrado");
            }

            ps.close();
            rs.close();
            conn.close();
        } catch ( SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
        return Lista_usuario;
    }

    public void Actualizar_Persona(String cedula, String nombre, String apellido, int telefono, String direccion, String descripcion){
        qry = "UPDATE Personas SET Nombre = ? , Apellido = ? ,Celular = ? , Dirreccion = ?, Descripcion=?  WHERE cedula = ? ";
        try {
            conn = connector.connection_java();
            ps = conn.prepareStatement(qry);

            ps.setString(1, nombre);
            ps.setString(2, apellido);
            ps.setInt(3, telefono);
            ps.setString(4, direccion);
            ps.setString(5, descripcion);
            ps.setString(6, cedula);

            int res = ps.executeUpdate();
            if (res > 0) {
                JOptionPane.showMessageDialog(null, "Persona Actualizado Exitosamente");
            } else {
                JOptionPane.showMessageDialog(null, "Error al Actualizar la Persona");
            }

        } catch ( SQLException e) {
            JOptionPane.showMessageDialog(null, "Persona -> " + e.toString());
            e.printStackTrace();

        } 
    }
    public void crear_persona(String cedula, String nombre, String apellido, int telefono, String direccion, String descripcion){
        qry = "INSERT INTO Personas (cedula, Nombre, Apellido, Celular,Dirreccion, Descripcion) VALUES (?,?,?,?,?,?)";
        try {
            conn = connector.connection_java();
            ps = conn.prepareStatement(qry);
            ps.setString(1, cedula);
            ps.setString(2, nombre);
            ps.setString(3, apellido);
            ps.setInt(4, telefono);
            ps.setString(5, direccion);
            ps.setString(6, descripcion);

            int res = ps.executeUpdate();
            if (res > 0) {
                JOptionPane.showMessageDialog(null, "Persona Registrado Exitosamente");
            } else {
                JOptionPane.showMessageDialog(null, "Error al Registrar la Persona");
            }

        } catch ( SQLException e) {
            JOptionPane.showMessageDialog(null, "Persona -> " + e.toString());
            e.printStackTrace();

        }
    }

    public void eliminar_persona (String cedula){
        qry = "DELETE FROM Personas WHERE cedula= ?";
        try {
            conn = connector.connection_java();
            ps = conn.prepareStatement(qry);
            ps.setString(1, cedula);

            int res = ps.executeUpdate();
            if (res > 0) {
                JOptionPane.showMessageDialog(null, "Persona Eliminado Exitosamente");
            } else {
                JOptionPane.showMessageDialog(null, "Error al Eliminar al Persona");
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());

        }
    }
}
