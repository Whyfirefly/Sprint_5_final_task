import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    ArrayList<String> farm = new ArrayList<>(Arrays.asList(
            "DOG Гоша", "DOG Каштанка",
            "CAT Тоша", "CAT Пельмень", "CAT Капуста", "CAT Снежок", "CAT Молния",
            "HORSE Речка",
            "COW Вечер"
    ));
    AnimalFarm farmInit = new AnimalFarm(farm); // создали и наполнили ферму

    //  AnimalFarm farmInit = new AnimalFarm(List.of(
    //          "DOG Мухтар", "DOG Мухтарыч", "DOG Мухтарище",
    //
    // Если создать список через List.of() или Arrays.asList(), в них уже нельзя добавить или удалить элемент.

    System.out.println("Ферма представлена: ");
    System.out.println(farmInit);

  }
}