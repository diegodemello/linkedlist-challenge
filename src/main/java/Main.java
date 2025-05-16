import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Ninja> ninjaList = new LinkedList<>();

        // 1. Adicionar ninjas na LinkedList
        ninjaList.add(new Ninja("Naruto", 21, "Aldeia da Folha"));
        ninjaList.add(new Ninja("Sasuke", 23, "Aldeia da Folha"));
        ninjaList.add(new Ninja("Sakura", 23, "Aldeia da Folha"));

        // 2. Listar os ninjas
        System.out.println("Lista de ninjas: ");
        for(Ninja ninja : ninjaList){
            System.out.println(ninja.getName());
        }
        System.out.println("--------------");

        // 3. Adicionar o ninja no inicio da lista
        ninjaList.addFirst(new Ninja("Boruto", 14, "Aldeia da Folha"));

        // 4. Remover o ninja no inicio da lista
        ninjaList.remove(1);

        // 5. Listar os ninjas
        System.out.println("Lista de ninjas: ");
        for (Ninja ninja : ninjaList){
            System.out.println(ninja.getName());
        }
        System.out.println("--------------");

        // 6. Procurar ninja
        Ninja segundoNinja = ninjaList.get(2);
        System.out.println(segundoNinja.getName());
    }
}
