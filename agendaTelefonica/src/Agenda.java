import java.util.ArrayList;
import java.util.Scanner;

public class Agenda extends Contatos
{
    ArrayList<Contatos> contatos = new ArrayList<Contatos>();

    public Agenda()
    {

    }

    public void inserir(Contatos cont)
    {
        contatos.add(cont);
    }

    public void remover(Contatos cont)
    {
        if(contatos.size() == 0)
        {
            System.out.println("Não contém contatos");
        }
        else
        {
            contatos.remove(cont);
        }


    }

    public void editar(Contatos contato)
    {
        if(contatos.size() == 0)
        {
            System.out.println("Não contém contatos");
        }
        else
        {
            Scanner input = new Scanner(System.in);

            System.out.println("Insira o nome: ");
            contato.setNome(input.nextLine());
            System.out.println("Insira o Número: ");
            contato.setNum_telefone(input.nextLine());
            System.out.println("Insira o Endereco: ");
            contato.setEndereco(input.nextLine());

        }


    }


    public void exibir()
    {
        int i;

        if (contatos.size() == 0)
        {
            System.out.println("A lista de contatos está vazia");
        }
        else
        {
            for (i = 0; i < contatos.size(); i ++)
            {
                System.out.println("ID: " +contatos.get(i).getId());
                System.out.println("Nome:" +contatos.get(i).getNome());
                System.out.println("Número: " +contatos.get(i).getNum_telefone());
                System.out.println("Endereço: " +contatos.get(i).getEndereco());


            }
        }
    }
}







