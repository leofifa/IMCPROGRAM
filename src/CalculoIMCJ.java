import javax.swing.JOptionPane;

public class CalculoIMCJ {

    public static void main(String[] args) {

        float peso = 0;
        float altura = 0;
        float imc;
        String classifica = null;

        while (peso <= 0) {
            peso = Float.parseFloat(JOptionPane.showInputDialog("Seu peso(com ponto):"));
        }

        while (altura <= 0) {
            altura = Float.parseFloat(JOptionPane.showInputDialog("Sua altura (com ponto):"));
        }

        imc = (float) (peso / Math.pow(altura, 2));

            if (imc <= 19) {
                classifica = "Abaixo do Peso";
            } else if (imc <= 25) {
                classifica = "Peso ideal";
            } else if (imc <= 30) {
                classifica = "Acima do Peso";
            } else if (imc <= 35) {
                classifica = "Obesidade Leve";
            } else {
                classifica = "Obesidade";
            }

        JOptionPane.showMessageDialog(null, "Seu IMC= " + imc + " - " + classifica);
    }
}


 


