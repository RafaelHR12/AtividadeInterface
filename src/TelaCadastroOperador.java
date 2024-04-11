import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class TelaCadastroOperador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Criar os componentes:
		JLabel nomeOperador = new JLabel("NOME");
		JTextField txNome = new JTextField();
		
		JLabel idOperador = new JLabel("ID");
		JTextField txId = new JTextField();
		
		JLabel cpf = new JLabel("CPF");
		JTextField txCpf = new JTextField();
		
		JLabel endereco = new JLabel("ENDEREÇO");
		
		JLabel rua = new JLabel("RUA");
		JTextField txRua = new JTextField();
		
		JLabel cep = new JLabel("CEP");
		JTextField txCep = new JTextField();
		
		JLabel bairro = new JLabel("BAIRRO");
		JTextField txBairro = new JTextField();
		
		JLabel numero = new JLabel("NÚMERO");
		JTextField txNumero = new JTextField();
		
		JLabel complemento = new JLabel("COMPLEMENTO");
		JTextField txComplemento = new JTextField();
		
		// Caixa de texto flutuante (explica o que o usuário deve preencher em determinado campo)
		txNome.setToolTipText("Informe o NOME do operador");
		txId.setToolTipText("Informe o ID do operador");
		txCpf.setToolTipText("Informe o CPF do operador");
		txRua.setToolTipText("Informe o nome da RUA");
		txCep.setToolTipText("Informe o CEP");
		txBairro.setToolTipText("Informe o BAIRRO");
		txNumero.setToolTipText("Informe o NÚMERO da casa");
		txComplemento.setToolTipText("Informe COMPLEMENTO (opicional)");
		
		// Cores de fundo e letra
		txNome.setBackground(Color.cyan);
		txNome.setForeground(Color.magenta);
		
		txId.setBackground(Color.black);
		txId.setForeground(Color.white);
		
		txCpf.setBackground(Color.cyan);
		txCpf.setForeground(Color.magenta);
		
		txRua.setBackground(Color.black);
		txRua.setForeground(Color.white);
		
		txCep.setBackground(Color.cyan);
		txCep.setForeground(Color.magenta);
		
		txBairro.setBackground(Color.black);
		txBairro.setForeground(Color.white);
		
		txNumero.setBackground(Color.cyan);
		txNumero.setForeground(Color.magenta);
		
		txComplemento.setBackground(Color.black);
		txComplemento.setForeground(Color.white);
		
		
		// Agrupar componentes:
		Object[] componentes = {nomeOperador, txNome, idOperador, txId, cpf, txCpf, endereco, rua, txRua, cep, txCep, bairro, txBairro, numero, txNumero, complemento, txComplemento};
		
		// Criar a janela:
		JOptionPane.showMessageDialog(null, componentes);
		
		Operador operador = new Operador();
		Endereco endereco1 = new Endereco();

		if (operador.verificarCadastro(txNome.getText(), txId.getText(), txCpf.getText()) && endereco1.verificarEndereco(txRua.getText(), txCep.getText(), txBairro.getText(), txNumero.getText())) {
			JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!");
		} else {
			JOptionPane.showMessageDialog(null, "Cadastro Incorreto!");
		}
		
	}

}
