# findNoOfTimesNumbreRepeated

## Examples
1. [example1](#example1)
2. [example2](#example2)
 
### example1
```
List<Integer>integers = Arrays.asList(2, 3, 4, 2, 9, 2, 3, 7, 3, 8, 9, 4, 6, 2, 4, 5, 7, 9, 7, 8, 4, 1, 5, 3, 9, 8, 6, 7, 5, 4, 2, 5, 4, 6, 1);
        Map<Integer, Long> collect = integers.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        collect.forEach((key,value)->{
            System.out.println(key +" : "+value);
        });

```
the code finds the number of times each number is repeated in the list.

The Arrays.asList() method is used to create a List<Integer> containing some integer values.

The stream() method is then called on the List<Integer>, which returns a stream of integer values.

The Collectors.groupingBy() method is called on this stream with Function.identity() as the grouping function and Collectors.counting() as the downstream collector. This groups the integer values by their identity (i.e., the integer value itself), and counts the number of occurrences of each value.

Function.identity() is used as the grouping function for the Collectors.groupingBy() method. This means that the elements of the stream are grouped according to their identity, which in this case is their integer value.

Using Function.identity() as the grouping function is a common idiom in Java streams when you want to group elements by their natural key rather than applying a custom grouping function.
  
  
The result of the Collectors.groupingBy() method is a Map<Integer, Long> where the keys are the distinct integer values in the list, and the values are the number of occurrences of each value.

Finally, the forEach() method is called on the Map<Integer, Long>, which prints each key-value pair to the console.
