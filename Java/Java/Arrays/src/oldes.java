import javax.swing.*;


public class oldes {
    public static void main(String[] args){
        int age;
        String name;
        name = JOptionPane.showInputDialog("What is ur name?");
        age = Integer.parseInt(JOptionPane.showInputDialog("How old are u?"));
        if(age >= 18){
            JOptionPane.showMessageDialog(null, "You are the GOAT " + name);
        }else{
            JOptionPane.showMessageDialog(null, "eres un menorsito " + name);
        }
    }
}
