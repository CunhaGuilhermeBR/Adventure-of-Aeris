import javax.swing.JOptionPane;

public class Personagem extends Jogo {
  public String nome, escolha;
  private String classe;
  private int HPtotal, HPatual, CA, iniciativa;
  private boolean vivo;

  
  Personagem(){
	   
   }
   
public int iniciativa() {
	return iniciativa;
}
public void setIniciativa(int iniciativa) {
	this.iniciativa = iniciativa;
}

public void escolheClasse() {
	this.escolha = JOptionPane.showInputDialog("Escolha uma classe:1-Guerreiro ou 2-Ladino");
	this.setClasse(this.escolha);
	
}


public void criar() {
	this.nome = JOptionPane.showInputDialog("Qual é o seu nome?");
	this.escolheClasse();
}

public String getClasse() {
	return classe;
}

public void setClasse(String escolha) {
	 if (escolha.intern() == "Guerreiro") {
		JOptionPane.showMessageDialog(null,"Você é um poderoso Guerreiro");
		HPtotal=14;
		HPatual= HPtotal;
		CA=18;
		 setIniciativa(2);
	}
	else {
		JOptionPane.showMessageDialog(null,"Você é um ágil Ladino");
		HPtotal=10;
		HPatual= HPtotal;
		CA=15;
		 setIniciativa(4);
	}
}
}
