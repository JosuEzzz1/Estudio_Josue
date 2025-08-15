import javax.swing.*;

public class Students {
    public static void main(String[] args) {
        int numEstudiantes = Integer.parseInt(JOptionPane.showInputDialog("Por favor ingrese el número de estudiantes"));

        String[] codigo = new String[numEstudiantes];
        Double[] notasFisica = new Double[numEstudiantes];
        Double[] notasAlgebra = new Double[numEstudiantes];

        // Recoleccion de datos de estudiantes
        for (int i = 0; i < numEstudiantes; i++) {
            codigo[i] = JOptionPane.showInputDialog("Por favor ingrese el código del estudiante " + (i + 1) + ":");
            notasFisica[i] = Double.parseDouble(JOptionPane.showInputDialog("Por favor ingrese la nota definitiva de física del estudiante " + codigo[i] + ":"));
            notasAlgebra[i] = Double.parseDouble(JOptionPane.showInputDialog("Por favor ingrese la nota definitiva de álgebra del estudiante " + codigo[i] + ":"));
        }

        // Mostrar estudiantes que perdieron física
        String fisicaPerdidos = "Estudiantes que perdieron física:\n";
        boolean hayPerdidosFisica = false;
        for (int i = 0; i < numEstudiantes; i++) {
            if(notasFisica[i] < 3.0){
                fisicaPerdidos = fisicaPerdidos + "- " + codigo[i] + "\n";
                hayPerdidosFisica = true;
            }
        }
        if(!hayPerdidosFisica){
            fisicaPerdidos = fisicaPerdidos + "Ninguno\n";
        }
        JOptionPane.showMessageDialog(null, fisicaPerdidos);

        // Mostrar estudiantes que ganaron física
        String fisicaGanados = "Estudiantes que ganaron física:\n";
        boolean hayGanadosFisica = false;
        for (int i = 0; i < numEstudiantes; i++) {
            if(notasFisica[i] >= 3.0){
                fisicaGanados = fisicaGanados + "- " + codigo[i] + "\n";
                hayGanadosFisica = true;
            }
        }
        if(!hayGanadosFisica){
            fisicaGanados = fisicaGanados + "Ninguno\n";
        }
        JOptionPane.showMessageDialog(null, fisicaGanados);

        // Mostrar estudiantes que perdieron álgebra
        String algebraPerdidos = "Estudiantes que perdieron álgebra:\n";
        boolean hayPerdidosAlgebra = false;
        for (int i = 0; i < numEstudiantes; i++) {
            if(notasAlgebra[i] < 3.0){
                algebraPerdidos = algebraPerdidos + "- " + codigo[i] + "\n";
                hayPerdidosAlgebra = true;
            }
        }
        if(!hayPerdidosAlgebra){
            algebraPerdidos = algebraPerdidos + "Ninguno\n";
        }
        JOptionPane.showMessageDialog(null, algebraPerdidos);

        // Mostrar estudiantes que ganaron álgebra
        String algebraGanados = "Estudiantes que ganaron álgebra:\n";
        boolean hayGanadosAlgebra = false;
        for (int i = 0; i < numEstudiantes; i++) {
            if(notasAlgebra[i] >= 3.0){
                algebraGanados = algebraGanados + "- " + codigo[i] + "\n";
                hayGanadosAlgebra = true;
            }
        }
        if(!hayGanadosAlgebra){
            algebraGanados = algebraGanados + "Ninguno\n";
        }
        JOptionPane.showMessageDialog(null, algebraGanados);

        // Mostrar estudiantes que ganaron ambas materias
        String ambasGanadas = "Estudiantes que ganaron ambas materias:\n";
        boolean hayAmbasGanadas = false;
        for (int i = 0; i < numEstudiantes; i++) {
            if(notasFisica[i] >= 3.0 && notasAlgebra[i] >= 3.0){
                ambasGanadas = ambasGanadas + "- " + codigo[i] + "\n";
                hayAmbasGanadas = true;
            }
        }
        if(!hayAmbasGanadas){
            ambasGanadas = ambasGanadas + "Ninguno\n";
        }
        JOptionPane.showMessageDialog(null, ambasGanadas);
    }
}
