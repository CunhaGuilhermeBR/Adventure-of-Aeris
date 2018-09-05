import java.util.Random;
import javax.swing.JOptionPane;

public class Jogo {

	Random roll = new Random();
	
	public int rollD4(int modificador){
		int i= roll.nextInt(4);
		return i;
	}
	public int rollD6(int modificador){
		int i= roll.nextInt(6);
		return i;
	}
	public int rollD8(int modificador){
		int i= roll.nextInt(8);
		return i;
	}
	public int rollD10(int modificador){
		int i= roll.nextInt(10);
		return i;
	}
	public int rollD12(int modificador){
		int i= roll.nextInt(12);
		return i;
	}
	public int rollD20(int modificador){
		int i= roll.nextInt(20)+ modificador;
		return i;
	}
	public void combate(int inPJ) {
		int iniciativaPJ, iniciativaMob;
		iniciativaPJ = rollD20(inPJ);
		iniciativaMob = rollD20(1);	
        if (iniciativaPJ >= iniciativaMob) {
        	JOptionPane.showMessageDialog(null,"Você vai começar o combate");
        }
        else {
        	JOptionPane.showMessageDialog(null,"Seu inimigo vai começar o combate");
        }
	
	}
}
