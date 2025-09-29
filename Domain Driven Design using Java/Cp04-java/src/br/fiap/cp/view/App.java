package br.fiap.cp.view;

import br.fiap.cp.dao.AnimalDao;
import br.fiap.cp.model.Animal;
import br.fiap.cp.model.Mamifero;
import br.fiap.cp.model.Ave;
import br.fiap.cp.model.Reptil;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AnimalDao dao = new AnimalDao();

        while (true) {
            System.out.println("\n=== ZOOLÓGICO ===");
            System.out.println("[1] Cadastrar animal");
            System.out.println("[2] Listar todos");
            System.out.println("[3] Buscar por código");
            System.out.println("[4] Editar");
            System.out.println("[5] Remover");
            System.out.println("[6] Buscar por espécie");
            System.out.println("[7] Buscar por habitat");
            System.out.println("[0] Sair");
            System.out.print("Opção: ");

            int op;
            try {
                op = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Digite um número válido.");
                continue; // volta pro menu
            }

            switch (op) {
                case 1: {
                    try {
                        System.out.println("Tipo: [1] Mamífero  [2] Ave  [3] Réptil");
                        int tipo = Integer.parseInt(sc.nextLine());

                        System.out.print("Nome: ");
                        String nome = sc.nextLine();

                        System.out.print("Idade (anos): ");
                        int idade = Integer.parseInt(sc.nextLine());

                        System.out.print("Espécie (ex: Leão, Arara): ");
                        String especie = sc.nextLine();

                        System.out.print("Habitat (ex: Savanna, Aviário): ");
                        String habitat = sc.nextLine();

                        Animal novo;
                        if (tipo == 1) {
                            System.out.print("Tipo de alimentação (Carnívoro/Herbívoro/Onívoro): ");
                            String tipoAlim = sc.nextLine();
                            novo = new Mamifero(nome, idade, especie, habitat, tipoAlim);

                        } else if (tipo == 2) {
                            System.out.print("Cor das penas: ");
                            String cor = sc.nextLine();
                            novo = new Ave(nome, idade, especie, habitat, cor);

                        } else if (tipo == 3) {
                            System.out.print("Tipo de escamas: ");
                            String escamas = sc.nextLine();
                            System.out.print("É venenoso? (S/N): ");
                            String ven = sc.nextLine();
                            boolean venenoso = ven.equalsIgnoreCase("S");
                            novo = new Reptil(nome, idade, especie, habitat, escamas, venenoso);

                        } else {
                            System.out.println("Tipo inválido.");
                            break;
                        }

                        Animal cadastrado = dao.cadastrar(novo);
                        System.out.println("Cadastrado! ID = " + cadastrado.getId());

                    } catch (NumberFormatException e) {
                        System.err.println("Valor numérico inválido.");
                    } catch (IllegalArgumentException e) {
                        System.err.println("Erro de validação: " + e.getMessage());
                    }
                    break;
                }
                case 2: {
                    var lista = dao.listar();
                    if (lista.isEmpty()) {
                        System.out.println("Nenhum animal cadastrado.");
                    } else {
                        for (Animal a : lista) {
                            System.out.println(a);
                        }
                    }
                    break;
                }
                case 3: {
                    try {
                        System.out.print("Código (ID): ");
                        int id = Integer.parseInt(sc.nextLine());
                        Animal a = dao.buscarPorCodigo(id);
                        if (a == null) {
                            System.out.println("Não encontrado.");
                        } else {
                            System.out.println(a);
                            System.out.println("Som: " + a.emitirSom());
                        }
                    } catch (NumberFormatException e) {
                        System.err.println("ID inválido.");
                    } catch (IllegalArgumentException e) {
                        System.err.println(e.getMessage());
                    }
                    break;
                }
                case 4:
                    try {
                        System.out.println("ID para editar: ");
                        int id = Integer.parseInt(sc.nextLine());
                        Animal a = dao.buscarPorCodigo(id);
                        if (a == null) {
                            System.out.println("Não encontrado.");
                        } else {
                            System.out.println("Nome: " + a.getNome());
                            System.out.println("Idade: " + a.getIdade());
                            System.out.println("Espécie: " + a.getEspecie());
                            System.out.println("Habitat: " + a.getHabitat());
                            if (a instanceof Mamifero) {
                                Mamifero m = (Mamifero) a;
                                System.out.println("Alimentação: " + m.getTipoAlimentacao());
                            } else if (a instanceof Ave) {
                                Ave v = (Ave) a;
                                System.out.println("Cor das penas: " + v.getCorDasPenas());
                            } else if (a instanceof Reptil) {
                                Reptil r = (Reptil) a;
                                System.out.println("Escamas: " + r.getTipoEscamas());
                                System.out.println("Venenoso: " + (r.isVenenoso() ? "Sim" : "Não"));
                            }
                        }

                        System.out.println("Novo nome: ");
                        String novoNome = sc.nextLine();

                        try {
                            if (!novoNome.trim().isEmpty()) {
                                a.setNome(novoNome);
                            }
                        } catch (IllegalArgumentException e) {
                            System.err.println("Erro: " + e.getMessage());
                        }

                        System.out.println("Nova idade (Enter p/ manter): ");
                        String novaIdade = sc.nextLine();

                        try {
                            int idadeInt = Integer.parseInt(novaIdade);
                            try {
                                a.setIdade(idadeInt);
                            } catch (IllegalArgumentException e) {
                                System.err.println("Erro: " + e.getMessage());
                            }
                        } catch (NumberFormatException e) {
                            System.err.println("Idade inválida, mantendo a atual.");
                        }

                        System.out.println("Nova espécie (Enter p/ manter): ");
                        String novaEspecie = sc.nextLine();

                        try {
                            if (!novaEspecie.trim().isEmpty()) {
                                a.setEspecie(novaEspecie);
                            }
                        } catch (IllegalArgumentException e) {
                            System.err.println("Erro: " + e.getMessage());
                        }

                        System.out.println("Novo habitat (Enter p/ manter): ");
                        String novoHabitat = sc.nextLine();

                        try {
                            if (!novoHabitat.trim().isEmpty()) {
                                a.setHabitat(novoHabitat);
                            }
                        } catch (IllegalArgumentException e) {
                            System.err.println("Erro: " + e.getMessage());
                        }

                        if (a instanceof Mamifero) {

                            System.out.print("Nova alimentação (Enter p/ manter): ");
                            String novaAlim = sc.nextLine();

                            try {
                                if (!novaAlim.trim().isEmpty()) {
                                    Mamifero m = (Mamifero) a;
                                    m.setTipoAlimentacao(novaAlim);
                                }
                            } catch (IllegalArgumentException e) {
                                System.err.println("Erro: " + e.getMessage());
                            }
                        }

                        if (a instanceof Ave) {

                            System.out.print("Nova cor de penas (Enter p/ manter): ");
                            String novaCor = sc.nextLine();

                            try {
                                if (!novaCor.trim().isEmpty()) {
                                    Ave v = (Ave) a;
                                    v.setCorDasPenas(novaCor);
                                }
                            } catch (IllegalArgumentException e) {
                                System.err.println("Erro: " + e.getMessage());
                            }
                        }

                        if (a instanceof Reptil) {
                            System.out.print("Novo tipo de escama (Enter p/ maner): ");
                            String novaEscamas = sc.nextLine();

                            try {
                                if (!novaEscamas.trim().isEmpty()) {
                                    Reptil r = (Reptil) a;
                                    r.setTipoEscamas(novaEscamas);
                                }
                            } catch (IllegalArgumentException e) {
                                System.err.println("Erro: " + e.getMessage());
                            }

                            System.out.print("Venenoso (S/N) [Enter p/ manter]: ");
                            String ven = sc.nextLine();

                            if (!ven.trim().isEmpty()) {
                                boolean novoVenenoso = ven.equalsIgnoreCase("S");
                                ((Reptil) a).setVenenoso(novoVenenoso);
                            }

                            dao.editar(a);
                            System.out.println("Animal atualizado com sucesso!");

                        }

                    } catch (NumberFormatException e) {
                        System.err.println("ID inválido.");
                    }
                    break;
                case 5: {
                    try {
                        System.out.print("Código (ID) para remover: ");
                        int id = Integer.parseInt(sc.nextLine());
                        boolean ok = dao.remover(id);
                        System.out.println(ok ? "Removido." : "ID não encontrado.");
                    } catch (NumberFormatException e) {
                        System.err.println("ID inválido.");
                    } catch (IllegalArgumentException e) {
                        System.err.println(e.getMessage());
                    }
                    break;
                }
                case 6: {
                    try {
                        System.out.print("Espécie para buscar: ");
                        String especie = sc.nextLine();
                        var res = dao.buscarPorEspecie(especie);
                        if (res.isEmpty()) {
                            System.out.println("Nenhum animal dessa espécie.");
                        } else {
                            res.forEach(System.out::println);
                        }
                    } catch (IllegalArgumentException e) {
                        System.err.println("Erro: " + e.getMessage());
                    }
                    break;
                }
                case 7: {
                    try {
                        System.out.print("Habitat para buscar: ");
                        String habitat = sc.nextLine();
                        var res = dao.buscarPorHabitat(habitat);
                        if (res.isEmpty()) {
                            System.out.println("Nenhum animal nesse habitat.");
                        } else {
                            res.forEach(System.out::println);
                        }
                    } catch (IllegalArgumentException e) {
                        System.err.println("Erro: " + e.getMessage());
                    }
                    break;
                }
                case 0:
                    System.out.println("Falou!");
                    return;
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }
}