import javax.swing.*;

// El gerente de Farmacia “La Baratera” desea un pseudocódigo que calcule el aumento de sueldo para su grupo de N empleados, teniendo en cuenta los siguientes criterios:
//* Si el sueldo es inferior a C$5000 el aumento será del 10%.
//* Si el sueldo es superior a C$5000 el aumento será del 8%.
//Calcule el nuevo sueldo del trabajador y el total de nómina de la empresa, considerando el aumento de cada trabajador.

public class SueldoEmpleados {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Bienvenido al portal de Farmacia La Baratera");
        int empleados = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de empleados"));
        double[] sueldo = new double[empleados];
        String[] names = new String[empleados];
        for (int i = 0; i < empleados; i++){
            names[i] = JOptionPane.showInputDialog("Ingrese el nombre del trabajador " + (i+1));
            sueldo[i] = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el sueldo de " + names[i]));
            if (sueldo[i] < 5000){
                sueldo[i] = sueldo[i] + sueldo[i]*0.10;
            }else {
                sueldo[i] = sueldo[i] + sueldo[i]*0.08;
            }
        }
        for (int i = 0; i < empleados; i++){
            JOptionPane.showMessageDialog(null, "El nuevo sueldo para el trabajador " + names[i] + " es de " + sueldo[i]);
        }
    }
}
