package josue.Actividades;

import javax.swing.JOptionPane;

public class Bucles {

    public static void main(String[] args) {
        double sueldo, nuevoSueldo, nomina = 0;

        JOptionPane.showMessageDialog(null, "Bienvenido a la farmacia de la Baratera");

        int empleados = Integer.parseInt(
                JOptionPane.showInputDialog("Ingrese el número de empleados en la farmacia")
        );

        for (int i = 1; i <= empleados; i++) {
            sueldo = Double.parseDouble(
                    JOptionPane.showInputDialog("Ingrese el sueldo del trabajador " + i)
            );

            if (sueldo >= 5000) {
                nuevoSueldo = sueldo + sueldo * 0.08;
            } else {
                nuevoSueldo = sueldo + sueldo * 0.10;
            }

            JOptionPane.showMessageDialog(null, "El nuevo sueldo del trabajador " + i + " es: $" + nuevoSueldo);
            nomina += nuevoSueldo;
        }

        JOptionPane.showMessageDialog(null, "La nómina total de la empresa es: $" + nomina);
    }
}

