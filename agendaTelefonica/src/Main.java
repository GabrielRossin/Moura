import java.util.Scanner;
import java.io.IOException;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        Agenda agenda = new Agenda();


        Scanner input = new Scanner(System.in);
        int resp;
        int tam;
        int id;
        String nome;
        String num_tel;
        String endereco;
        Contatos c1 = new Contatos();
        Contatos c2 = new Contatos();
        Contatos c3 = new Contatos();
        Contatos c4 = new Contatos();
        Contatos c5 = new Contatos();
        Contatos c6 = new Contatos();
        Contatos c7 = new Contatos();
        Contatos c8 = new Contatos();
        Contatos c9 = new Contatos();
        Contatos c10 = new Contatos();
        do
        {

            System.out.println("\n---------MENU----------");
            System.out.println("1.Criar novo contato");
            System.out.println("2.Editar contato");
            System.out.println("3.Excluir contato");
            System.out.println("4.Mostrar todos contatos");
            System.out.println("5.Sair");
            System.out.println("\nSua Resposta:");
            resp = input.nextInt();

            switch(resp)
            {
                case 1:
                {

                    tam = agenda.contatos.size();
                    if (tam == 0)
                    {

                        input.nextLine();
                        System.out.println("Insira o nome: ");
                        nome = input.nextLine();
                        System.out.println("Insira o Número: ");
                        num_tel = input.nextLine();
                        System.out.println("Insira o Endereco: ");
                        endereco = input.nextLine();
                        c1.setNome(nome);
                        c1.setEndereco(endereco);
                        c1.setNum_telefone(num_tel);
                        c1.setId(tam+1);
                        agenda.inserir(c1);

                    }
                    else
                    {
                        if (tam == 1)
                        {

                            input.nextLine();
                            System.out.println("Insira o nome: ");
                            nome = input.nextLine();
                            System.out.println("Insira o Número: ");
                            num_tel = input.nextLine();
                            System.out.println("Insira o Endereco: ");
                            endereco = input.nextLine();
                            c2.setNome(nome);
                            c2.setEndereco(endereco);
                            c2.setNum_telefone(num_tel);
                            c2.setId(tam+1);
                            agenda.inserir(c2);
                        }
                        else
                        {
                            if (tam == 2)
                            {

                                input.nextLine();
                                System.out.println("Insira o nome: ");
                                nome = input.nextLine();
                                System.out.println("Insira o Número: ");
                                num_tel = input.nextLine();
                                System.out.println("Insira o Endereco: ");
                                endereco = input.nextLine();
                                c3.setNome(nome);
                                c3.setEndereco(endereco);
                                c3.setNum_telefone(num_tel);
                                c3.setId(tam+1);
                                agenda.inserir(c3);
                            }
                            else
                            {
                                if (tam == 3)
                                {

                                    input.nextLine();
                                    System.out.println("Insira o nome: ");
                                    nome = input.nextLine();
                                    System.out.println("Insira o Número: ");
                                    num_tel = input.nextLine();
                                    System.out.println("Insira o Endereco: ");
                                    endereco = input.nextLine();
                                    c4.setNome(nome);
                                    c4.setEndereco(endereco);
                                    c4.setNum_telefone(num_tel);
                                    c4.setId(tam+1);
                                    agenda.inserir(c4);
                                }
                                else
                                {
                                    if (tam == 4)
                                    {

                                        input.nextLine();
                                        System.out.println("Insira o nome: ");
                                        nome = input.nextLine();
                                        System.out.println("Insira o Número: ");
                                        num_tel = input.nextLine();
                                        System.out.println("Insira o Endereco: ");
                                        endereco = input.nextLine();
                                        c5.setNome(nome);
                                        c5.setEndereco(endereco);
                                        c5.setNum_telefone(num_tel);
                                        c5.setId(tam+1);
                                        agenda.inserir(c5);
                                    }
                                    else
                                    {
                                        if (tam == 5)
                                        {

                                            input.nextLine();
                                            System.out.println("Insira o nome: ");
                                            nome = input.nextLine();
                                            System.out.println("Insira o Número: ");
                                            num_tel = input.nextLine();
                                            System.out.println("Insira o Endereco: ");
                                            endereco = input.nextLine();
                                            c6.setNome(nome);
                                            c6.setEndereco(endereco);
                                            c6.setNum_telefone(num_tel);
                                            c6.setId(tam+1);
                                            agenda.inserir(c6);
                                        }
                                        else
                                        {
                                            if (tam == 6)
                                            {

                                                input.nextLine();
                                                System.out.println("Insira o nome: ");
                                                nome = input.nextLine();
                                                System.out.println("Insira o Número: ");
                                                num_tel = input.nextLine();
                                                System.out.println("Insira o Endereco: ");
                                                endereco = input.nextLine();
                                                c7.setNome(nome);
                                                c7.setEndereco(endereco);
                                                c7.setNum_telefone(num_tel);
                                                c7.setId(tam+1);
                                                agenda.inserir(c7);
                                            }
                                            else
                                            {
                                                if(tam == 7)
                                                {

                                                    input.nextLine();
                                                    System.out.println("Insira o nome: ");
                                                    nome = input.nextLine();
                                                    System.out.println("Insira o Número: ");
                                                    num_tel = input.nextLine();
                                                    System.out.println("Insira o Endereco: ");
                                                    endereco = input.nextLine();
                                                    c8.setNome(nome);
                                                    c8.setEndereco(endereco);
                                                    c8.setNum_telefone(num_tel);
                                                    c8.setId(tam+1);
                                                    agenda.inserir(c8);
                                                }
                                                else
                                                {
                                                    if (tam == 8)
                                                    {

                                                        input.nextLine();
                                                        System.out.println("Insira o nome: ");
                                                        nome = input.nextLine();
                                                        System.out.println("Insira o Número: ");
                                                        num_tel = input.nextLine();
                                                        System.out.println("Insira o Endereco: ");
                                                        endereco = input.nextLine();
                                                        c9.setNome(nome);
                                                        c9.setEndereco(endereco);
                                                        c9.setNum_telefone(num_tel);
                                                        c9.setId(tam+1);
                                                        agenda.inserir(c9);
                                                    }
                                                    else
                                                    {
                                                        if (tam == 9)
                                                        {

                                                            input.nextLine();
                                                            System.out.println("Insira o nome: ");
                                                            nome = input.nextLine();
                                                            System.out.println("Insira o Número: ");
                                                            num_tel = input.nextLine();
                                                            System.out.println("Insira o Endereco: ");
                                                            endereco = input.nextLine();
                                                            c10.setNome(nome);
                                                            c10.setEndereco(endereco);
                                                            c10.setNum_telefone(num_tel);
                                                            c10.setId(tam+1);
                                                            agenda.inserir(c10);
                                                        }
                                                    }
                                                }
                                            }
                                        }

                                    }
                                }
                            }
                        }
                    }
                    break;
                }
                case 2:
                {

                    input.nextLine();
                    System.out.println("Insira o id do contato que será editado: ");
                    id = input.nextInt();
                    if (id == 1)
                    {

                        agenda.editar(c1);
                    }
                    else
                    {
                        if (id == 2)
                        {
                            agenda.editar(c2);
                        }
                        else
                        {
                            if (id == 3)
                            {
                                agenda.editar(c3);
                            }
                            else
                            {

                                if(id == 4)
                                {
                                    agenda.editar(c4);
                                }
                                else
                                {
                                    if (id == 5)
                                    {
                                        agenda.editar(c5);
                                    }
                                    else
                                    {
                                        if (id == 6)
                                        {
                                            agenda.editar(c6);
                                        }
                                        else
                                        {
                                            if(id ==7)
                                            {
                                                agenda.editar(c7);
                                            }
                                            else
                                            {
                                                if (id == 8)
                                                {
                                                    agenda.editar(c8);
                                                }
                                                else
                                                {
                                                    if (id == 9)
                                                    {
                                                        agenda.editar(c9);
                                                    }
                                                    else
                                                    {
                                                        if (id == 10)
                                                        {
                                                            agenda.editar(c10);
                                                        }
                                                    }
                                                }
                                            }

                                        }
                                    }
                                }

                            }

                        }

                    }
                    System.out.println("Pressione Enter para continuar");
                    System.in.read();
                    break;
                }
                case 3:
                {
                    input.nextLine();
                    System.out.println("Insira o id do contato: ");
                    id = input.nextInt();
                    if (id == 1)
                    {
                        agenda.remover(c1);
                    }
                    else
                    {
                        if (id == 2)
                        {
                            agenda.remover(c2);
                        }
                        else
                        {
                            if (id == 3)
                            {
                                agenda.remover(c3);
                            }
                            else
                            {

                                if(id == 4)
                                {
                                    agenda.remover(c4);
                                }
                                else
                                {
                                    if (id == 5)
                                    {
                                        agenda.remover(c5);
                                    }
                                    else
                                    {
                                        if (id == 6)
                                        {
                                            agenda.remover(c6);
                                        }
                                        else
                                        {
                                            if(id ==7)
                                            {
                                                agenda.remover(c7);
                                            }
                                            else
                                            {
                                                if (id == 8)
                                                {
                                                    agenda.remover(c8);
                                                }
                                                else
                                                {
                                                    if (id == 9)
                                                    {
                                                        agenda.remover(c9);
                                                    }
                                                    else
                                                    {
                                                        if (id == 10)
                                                        {
                                                            agenda.remover(c10);
                                                        }
                                                    }
                                                }
                                            }

                                        }
                                    }
                                }

                            }

                        }

                    }

                    System.out.println("Pressione Enter para continuar");
                    System.in.read();


                    break;
                }
                case 4:
                {
                    System.out.println("Exibindo todos contatos");
                    agenda.exibir();
                    System.out.println("Pressione Enter para continuar");
                    System.in.read();
                    break;
                }
                case 5:
                {
                    System.out.println("\nSaindo...");
                    System.out.println("Pressione Enter para continuar");
                    System.in.read();
                    break;
                }
                default:
                {
                    System.out.println("Opção invalida");
                    System.out.println("Pressione Enter para continuar");
                    System.in.read();
                }

            }

        }while(resp != 5);
    }




}
