package app;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {
    public static void main (String[] args){
        String[] vet = new String[] {"João", "Maria", "Ana"}; // cria o vetor de 3 possições ja preenchido

        //Listas não aceitam tipos primitivos
        //Classe List é uma intrface e não pode ser instanciada, uma classe que implementa o List é o ArrayList
        List<String> names = new ArrayList<>();

        // adição
        names.add("Maria");
        names.add("João");
        names.add("Ana");
        names.add("Carlos");
        names.add("Alex");
        names.add("Amanda");
        names.add(2, "Matheus");

        System.out.println(names.size());

        for (String name : names){
            System.out.println(name);
        }

        //remoção
        System.out.println("--------------------------------");
        //names.remove("Matheus");
        //names.remove(1);
        //predicado func lambda
        names.removeIf(x -> x.charAt(0) == 'M');
        for (String name : names){
            System.out.println(name);
        }

        //filtros
        System.out.println("--------------------------------");
        System.out.println("index of Ana " + names.indexOf("Ana"));
        System.out.println("index of Jose " + names.indexOf("Jose")); // quando não encontra o elemento retorna -1

        // filtrar todos que comecem com a letra A
        // list é um tipo antigo e não funciona lambda nele, por isso é necessario converter para stram fazer o filter e depois retornar para list
        List<String> result = names.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
        for (String name : result){
            System.out.println(name);
        }
        // filtrar o primeiro elemento que começa com a letra A
        String name = names.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
        System.out.println("first name with A "+name);
        name = names.stream().filter(x -> x.charAt(0) == 'Z').findFirst().orElse(null);
        System.out.println("first name with Z "+name);


    }
}
