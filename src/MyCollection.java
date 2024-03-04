import java.util.List;
import java.util.Optional;

public class MyCollection {

    // Metod koleksiyon ve aranacak öğe alır
    public static <T> T findElement(List<T> collection, T element) {
        Optional<T> optionalElement = collection.stream()
                .filter(e -> e.equals(element))
                .findFirst();
        return optionalElement.orElse(null);
    }

    public static void main(String[] args) {
        // Örnek kullanım
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        int result = findElement(numbers, 3);
        if (result != -1) {
            System.out.println("Element found: " + result);
        } else {
            System.out.println("Element not found.");
        }
    }
}