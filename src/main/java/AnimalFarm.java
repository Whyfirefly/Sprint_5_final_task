import java.util.*;


public class AnimalFarm {
  private List<String> farmAnimals;  // параметр - список строк

  public AnimalFarm(List<String> farmAnimals) {   // конструктор с параметром
    this.farmAnimals = farmAnimals;
  }

  // Задание 1. В классе AnimalFarm реализуй метод countedAnimals.
  // Он должен по полю farmAnimals формировать хеш-таблицу,
  // в которой ключ — это вид животного (Animal),
  // а значение — количество животных этого вида на ферме.
  public Map<Animal, Integer> countedAnimals () {
    Map<Animal, Integer> animalMap = new HashMap<>();

    // Если какая-то строка в списке не содержит первым словом валидный вид животного,
    // метод должен вывести в консоль фразу:
    // Please correct string [Здесь вывести полностью ошибочную строку].
    // Incorrect input data.
    for (String farmAnimal : farmAnimals) {
      Animal animal;
      try {
        animal = Animal.valueOf(farmAnimal.split(" ")[0].toUpperCase());
        Integer currentNumber = animalMap.get(animal);
        animalMap.put(animal, currentNumber == null ? 1 : currentNumber + 1);
      } catch (Exception e) {
        System.out.printf("Please correct string %s. Incorrect input data. %n", farmAnimal);
      }
    }
    return animalMap; // Метод возвращает сформированную хеш-таблицу.
  }
}
