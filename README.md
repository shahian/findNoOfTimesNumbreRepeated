# findNoOfTimesNumbreRepeated
the code finds the number of times each number is repeated in the list.

the code uses the Collectors.groupingBy() method to group the integers in the list by their identity (i.e., the integer value itself), and then applies the Collectors.counting() downstream collector to count the number of occurrences of each integer value.

The resulting Map<Integer, Long> contains the distinct integer values in the list as keys, and the number of occurrences of each integer value as values.

The forEach() method is then called on the resulting map to print each key-value pair to the console, which displays the number of times each number is repeated in the list.

