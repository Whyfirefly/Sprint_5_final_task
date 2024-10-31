import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    ArrayList<String> farm = new ArrayList<>(Arrays.asList(
            "DOG Гоша", "DOG Каштанка",
            "CAT Тоша", "CAT Пельмень", "CAT Капуста", "CAT Снежок", "CAT Молния",
            "HORSE Star",
            "COW Milka"
    ));
    AnimalFarm farmInit = new AnimalFarm(farm); // создали и наполнили ферму

    //  AnimalFarm farmInit = new AnimalFarm(List.of(
    //          "DOG Мухтар", "DOG Мухтарыч", "DOG Мухтарище",
    //
    // Если создать список через List.of() или Arrays.asList(), в них уже нельзя добавить или удалить элемент.

    System.out.println("Ферма в первоначальном виде: ");
    System.out.println(farmInit);

    // метод добавления животных в ферму
    farmInit.addFarmAnimal(Animal.CAT);
    farmInit.addFarmAnimal(Animal.COW);
    farmInit.addFarmAnimal(Animal.DOG, "Майло");
    farmInit.addFarmAnimal(Animal.CAT, "Туман");
    farmInit.addFarmAnimal(Animal.DOG, "Туман");
    farmInit.addFarmAnimal(Animal.HORSE, "Звёздочка");
    farmInit.addFarmAnimal(Animal.COW, "Юля");
    farmInit.addFarmAnimal("Непонятный");
    farmInit.addFarmAnimal("Плюс-минус");

    System.out.println("Наша ферма с новыми питомцами: ");                   // Выводим на печать
    System.out.println(farmInit.toString());                    // проверяем как переопределяется вывод на печать
    System.out.println("Всего на ферме живут " + farmInit.countedAnimals());  // выводим на печать количество животных каждого типа
    System.out.println("Уникальные клички " + farmInit.uniqueNames());      // выводим на печать уникальные клички


  }
}