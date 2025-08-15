package josue.Actividades;
import javax.swing.JOptionPane;

/**
 * 1. Cierta universidad tiene muchos grupos de los cuales cada uno tiene muchos estudiantes. Elabore un algoritmo que encuentre el promedio de edad de los estudiantes mayores de 21 años de cada grupo y el promedio de edad de todos los grupos que tengan estudiantes mayores de 21 años. Por cada estudiante se tiene un registro que contiene su nombre y edad.
 */
import javax.swing.JOptionPane;

public class PromedioEdad {

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Bienvenido al portal Universitario IUB");
        int cantGrupos = Integer.parseInt(
                JOptionPane.showInputDialog(null, "¿Cuántos grupos hay en la universidad?")
        );

        double sumaPromediosGrupos = 0;
        int gruposConMayores = 0;

        for (int g = 1; g <= cantGrupos; g++) {
            int cantEstudiantes = Integer.parseInt(
                    JOptionPane.showInputDialog(null, "¿Cuántos estudiantes tiene el grupo " + g + "?")
            );

            int sumaEdadesMayores = 0;
            int cantidadMayores = 0;

            for (int e = 1; e <= cantEstudiantes; e++) {
                String nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre del estudiante " + e + " del grupo " + g);
                int edad = Integer.parseInt(
                        JOptionPane.showInputDialog(null, "Ingrese la edad de " + nombre)
                );

                if (edad > 21) {
                    sumaEdadesMayores += edad;
                    cantidadMayores++;
                }
            }

            if (cantidadMayores > 0) {
                double promedioGrupo = (double) sumaEdadesMayores / cantidadMayores;
                JOptionPane.showMessageDialog(null, "Promedio de edad de mayores de 21 en el grupo " + g + ": " + promedioGrupo);
                sumaPromediosGrupos += promedioGrupo;
                gruposConMayores++;
            } else {
                JOptionPane.showMessageDialog(null, "El grupo " + g + " no tiene estudiantes mayores de 21 años.");
            }
        }

        if (gruposConMayores > 0) {
            double promedioGeneral = sumaPromediosGrupos / gruposConMayores;
            JOptionPane.showMessageDialog(null, "Promedio total de los grupos con mayores de 21 años: " + promedioGeneral);
        } else {
            JOptionPane.showMessageDialog(null, "No hubo estudiantes mayores de 21 años en ningún grupo.");
        }
    }
}

