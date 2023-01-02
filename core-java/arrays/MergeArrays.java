package arrays;

import java.util.*;

public class MergeArrays {
	
	public static <T> List<Object> concatenate(T[] a, T[] b) {
		// Create an empty List of type Object
		List<Object> n = new ArrayList<>();
		
		// Add the array a into n
		Collections.addAll(n, a);
		
		// Add the array b into n
		Collections.addAll(n, b);
		
		return n;
	}

	public static void main(String[] args) {
		Integer[] a = new Integer[]{1, 2, 3};
		Integer[] b = new Integer[]{4, 5, 6};
		
		List<Object> c = concatenate(a, b);
		
		System.out.println("Merged object array: " + c);

	}

}

/////////////////////////////////////////////////////////////

/*
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MergeArrays {
    public static <T> List<T> concatenate(T[] a, T[] b, Comparator<? super T> comparator) {
        return Stream.concat(Arrays.stream(a), Arrays.stream(b))
                     .sorted(comparator)
                     .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        Integer[] a = new Integer[]{1, 2, 3};
        Integer[] b = new Integer[]{4, 5, 6};

        List<Integer> c = concatenate(a, b, (x, y) -> y - x);

        System.out.println("Merged and sorted array: " + c);
    }
}

*/
