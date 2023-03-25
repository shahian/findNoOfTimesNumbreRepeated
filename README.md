# findNoOfTimesNumbreRepeated
the code finds the number of times each number is repeated in the list.

The Arrays.asList() method is used to create a List<Integer> containing some integer values.

The stream() method is then called on the List<Integer>, which returns a stream of integer values.

The Collectors.groupingBy() method is called on this stream with Function.identity() as the grouping function and Collectors.counting() as the downstream collector. This groups the integer values by their identity (i.e., the integer value itself), and counts the number of occurrences of each value.

The result of the Collectors.groupingBy() method is a Map<Integer, Long> where the keys are the distinct integer values in the list, and the values are the number of occurrences of each value.

Finally, the forEach() method is called on the Map<Integer, Long>, which prints each key-value pair to the console.
