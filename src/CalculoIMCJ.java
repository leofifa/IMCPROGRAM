import javax.swing.JOptionPane;

public class CalculoIMCJ {

    public static void main(String[] args) {

        float peso = 0;
        float altura = 0;
        float imc;
        String classifica = null;

        String sexo = null;

        while (!"f".equalsIgnoreCase(sexo) && !"m".equalsIgnoreCase(sexo)) {
            sexo = JOptionPane.showInputDialog("Qual seu sexo? (F ou M):");
        }

        while (peso <= 0) {
            peso = Float.parseFloat(JOptionPane.showInputDialog("Seu peso(com ponto):"));
        }

        while (altura <= 0) {
            altura = Float.parseFloat(JOptionPane.showInputDialog("Sua altura (com ponto):"));
        }

        imc = (float) (peso / Math.pow(altura, 2));

        if ("m".equalsIgnoreCase(sexo)) {
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
        }

        if ("f".equalsIgnoreCase(sexo)) {
            if (imc <= 19.10) {
                classifica = "Abaixo do Peso";
            } else if (imc > 19.10 && imc <= 25.89) {
                classifica = "Peso ideal";
            } else if (imc >= 25.90 && imc <= 27.39) {
                classifica = "Pouco acima do Peso";
            } else if (imc >= 27.40 && imc <= 32.39) {
                classifica = "Acima do Peso";
            } else {
                classifica = "Obesidade";
            }
        }
        JOptionPane.showMessageDialog(null, "Seu IMC= " + imc + " - " + classifica);
    }
}


 


