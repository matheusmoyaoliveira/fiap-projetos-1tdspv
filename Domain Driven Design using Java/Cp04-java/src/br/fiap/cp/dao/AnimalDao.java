package br.fiap.cp.dao;
import br.fiap.cp.model.Animal;

import java.util.*;

public class AnimalDao {

    private Map<Integer, Animal> banco = new HashMap<>();
    private int sequence = 1;

    public List<Animal> listar() {
        List<Animal> lista = new ArrayList<>(banco.values());
        lista.sort(Comparator.comparingInt(Animal::getId));
        return lista;
    }

    public Animal cadastrar(Animal a) {

        if (a == null) {
            throw new IllegalArgumentException("Animal nulo");
        }

        int id = sequence++;
        a.setId(id);
        banco.put(id, a);
        return a;
    }

    public Animal buscarPorCodigo(int id) {

        if (id <= 0) {
            throw new IllegalArgumentException("ID inválido");
        }
        return banco.get(id);
    }

    public boolean remover(int id) {
        if (id <= 0) {
            throw new IllegalArgumentException("ID inválido");
        }
        Animal removido = banco.remove(id);
        return removido != null;
    }

    public boolean editar(Animal a) {
        if (a == null) {
            throw new IllegalArgumentException("Animal nulo");
        }

        int id = a.getId();

        if (id <= 0) {
            throw new IllegalArgumentException("ID inválido");
        }
        if (!banco.containsKey(id)) {
            return false;
        }

        banco.put(id, a);
        return true;
    }

    public List<Animal> buscarPorEspecie(String especie) {
        if (especie == null || especie.trim().isEmpty()) {
            throw new IllegalArgumentException("Espécie inválida");
        }

        especie = especie.trim();

        List<Animal> resultado = new ArrayList<>();

        for (Animal a : banco.values()) {
            String especieAnimal = a.getEspecie();

            if (especieAnimal != null && especieAnimal.equalsIgnoreCase(especie)) {
                resultado.add(a);
            }
        }

        resultado.sort(Comparator.comparingInt(Animal::getId));

        return resultado;
    }

    public List<Animal> buscarPorHabitat(String habitat) {
        if (habitat == null || habitat.trim().isEmpty()) {
            throw new IllegalArgumentException("Habitat inválida");
        }

        habitat = habitat.trim();

        List<Animal> resultado = new ArrayList<>();

        for (Animal a : banco.values()) {
            String habitatAnimal = a.getHabitat();

            if (habitatAnimal != null && habitatAnimal.equalsIgnoreCase(habitat)) {
                resultado.add(a);
            }
        }

        resultado.sort(Comparator.comparingInt(Animal::getId));

        return resultado;
    }

}
