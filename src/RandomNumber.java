import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class RandomNumber {
    public static void main(String...args) {
        List<Integer> numbersList = new ArrayList<>();
        Random random = new Random();
        random.ints(100,1,100).forEach(numbersList::add);
        List<Integer> streamList=numbersList.stream().filter(number->IntStream.rangeClosed(2,number/2).noneMatch(i -> number%i==0)).collect(Collectors.toList());
        System.out.println(streamList);

    }
}
