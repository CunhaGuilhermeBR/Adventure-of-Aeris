import javax. swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		Personagem pj = new Personagem();
		pj.criar();
	    JOptionPane.showMessageDialog(null,pj.nome + " seja bem-vindo(a) a Luskan, a cidade dos piratas");
	    JOptionPane.showMessageDialog(null,"Você está saindo de casa quando avista um grupo de baderneiros tentando roubar um velho, eles correm quando eles olham pra você, mas um deles saca a espada para te enfrentar");
	    pj.combate(pj.iniciativa());
}
}
