package locadora;

import Dao.FilmeDAO;
import Bean.Aluguel;
import Bean.Cliente;
import Bean.Filme;
import Factory.FactoryDAO;
import Factory.IClienteDAO;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Danilo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException, SQLException, ClassNotFoundException
    {

        Boolean add = true;
        int type;

        while(add)
        {
            type = Integer.parseInt(JOptionPane.showInputDialog("O que voc� deseja adicionar?\n1 - Cliente\n2 - Filme\n3 - Aluguel"));

            switch(type)
            {
                default:
                {
                    Cliente c = new Cliente();
                    c.setNome(JOptionPane.showInputDialog("Nome do usu�rio:"));
                    c.setEmail(JOptionPane.showInputDialog("Email do usu�rio:"));

                    IClienteDAO cd = FactoryDAO.getClienteDAO();
                    cd.save(c);

                    JOptionPane.showMessageDialog(null, "O ID do novo cliente �:" + c.getCodigo());

                    break;
                }

                case 2:
                {
                    Filme f = new Filme();
                    f.setTitulo(JOptionPane.showInputDialog("T�tulo do filme:"));
                    f.setValor(JOptionPane.showInputDialog("Valor do filme:"));

                    FilmeDAO fd = new FilmeDAO();
                    fd.save(f);

                    JOptionPane.showMessageDialog(null, "O ID do novo filme �:" + f.getId());

                    break;
                }

                case 3:
                {
                    Aluguel a = new Aluguel();
                    a.setCliente(JOptionPane.showInputDialog("Cliente:"));
                    a.setFilme(JOptionPane.showInputDialog("Filme:"));
                    a.setData(JOptionPane.showInputDialog("Data:"));

                    JOptionPane.showMessageDialog(null, "O ID do aluguel �:" + a.getId());

                    break;
                }
            }

            add = JOptionPane.showInputDialog("Quer adicionar mais um?").equals("s") ? true : false;

        }

        JOptionPane.showMessageDialog(null, "Fim");
    }

}
