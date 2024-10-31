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
      } catch (Exception exception) {
        System.out.printf("Please correct string %s. Incorrect input data. %n", farmAnimal);
      }
    }
    return animalMap; // Метод возвращает сформированную хеш-таблицу.
  }
  // Задание 2. В классе AnimalFarm реализуй метод uniqueNames.
  // Он должен возвращать коллекцию всех уникальных имён животных на ферме.
  // Подходящий тип коллекции подбери самостоятельно.
  public Set<String> uniqueNames () {
    Set<String> uniqueNames = new HashSet<>();

    // Если в какой-то строке списка нет второго слова,
    // метод должен вывести в консоль фразу:
    // Please correct string [Здесь вывести полностью ошибочную строку].
    // Incorrect input data.
    for (String farmAnimal : farmAnimals) {
      String name;
      try {
        name = farmAnimal.split(" ")[1];
        uniqueNames.add(name);
      } catch (Exception exception) {
        System.out.printf("Please correct string %s. Incorrect input data. %n", farmAnimal);
      }
    }
    return uniqueNames;
  }
  // Задание 3. В классе AnimalFarm реализуй три метода
  // для разных вариантов добавления нового животного на ферму:
  public void addFarmAnimal (Animal animal, String name){
    farmAnimals.add(animal.name() + " " + name); // по переданному виду животного и имени;
  }

  public void addFarmAnimal (Animal animal){
    farmAnimals.add(animal.name() + " N "); // по переданному виду животного. В этом случае имя животного равно N
  }

  public void addFarmAnimal (String name){
    farmAnimals.add(Animal.NOT_DEFINED + " " + name); // по переданному имени животного. В этом случае вид животного равен NOT_DEFINED
  }

  // Задание 4. В классе AnimalFarm переопредели метод toString так,
  // чтобы он выводил информацию по животным на ферме в виде:
  // Вид_животного Имя_животного
  // Вид_животного Имя_животного
  // Вид_животного Имя_животного
  @Override
  public String toString () {
    StringBuilder stringBuilder = new StringBuilder();
    for (String farmAnimal : farmAnimals) {
      String printFarmAnimal = farmAnimal.replace(":", " ");
      stringBuilder.append(" ^.^ ").append(printFarmAnimal).append(" ^.^ ").append("\n");
    }
    return stringBuilder.toString();
  }
}
