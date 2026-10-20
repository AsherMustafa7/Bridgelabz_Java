package JavaCollectorClass;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class MyCollectors
{
    // Collect elements into a List
    public static <T> Collector<T, ?, List<T>> toList()
    {
        return Collector.of(
            () -> new ArrayList<T>(),

            (list, element) -> {
                list.add(element);
            },

            (list1, list2) -> {
                list1.addAll(list2);
                return list1;
            }
        );
    }

    // Collect elements into a Set
    public static <T> Collector<T, ?, Set<T>> toSet()
    {
        return Collector.of(
            () -> new HashSet<T>(),

            (set, element) -> {
                set.add(element);
            },

            (set1, set2) -> {
                set1.addAll(set2);
                return set1;
            }
        );
    }

    // Collect elements into a specific collection
    public static <T, C extends Collection<T>>
    Collector<T, ?, C> toCollection(Supplier<C> supplier)
    {
        return Collector.of(
            supplier,

            (collection, element) -> {
                collection.add(element);
            },

            (collection1, collection2) -> {
                collection1.addAll(collection2);
                return collection1;
            }
        );
    }

    // Join strings without a delimiter
    public static Collector<CharSequence, ?, String> joining()
    {
        return Collector.of(
            () -> new StringBuilder(),

            (builder, text) -> {
                builder.append(text);
            },

            (builder1, builder2) -> {
                builder1.append(builder2);
                return builder1;
            },

            builder -> builder.toString()
        );
    }

    // Join strings using a delimiter
    public static Collector<CharSequence, ?, String>
    joining(CharSequence delimiter)
    {
        return Collector.of(
            () -> new StringJoiner(delimiter),

            (joiner, text) -> {
                joiner.add(text);
            },

            (joiner1, joiner2) -> {
                joiner1.merge(joiner2);
                return joiner1;
            },

            joiner -> joiner.toString()
        );
    }

    // Join strings using a delimiter, prefix and suffix
    public static Collector<CharSequence, ?, String>
    joining(CharSequence delimiter,
            CharSequence prefix,
            CharSequence suffix)
    {
        return Collector.of(
            () -> new StringJoiner(delimiter, prefix, suffix),

            (joiner, text) -> {
                joiner.add(text);
            },

            (joiner1, joiner2) -> {
                joiner1.merge(joiner2);
                return joiner1;
            },

            joiner -> joiner.toString()
        );
    }

    // Count the elements
    public static <T> Collector<T, ?, Long> counting()
    {
        return Collector.of(
            () -> new long[1],

            (count, element) -> {
                count[0]++;
            },

            (count1, count2) -> {
                count1[0] += count2[0];
                return count1;
            },

            count -> count[0]
        );
    }

    // Find the minimum element
    public static <T> Collector<T, ?, Optional<T>>
    minBy(Comparator<? super T> comparator)
    {
        return Collector.of(
            () -> new Object[1],

            (result, element) -> {
                if (result[0] == null)
                {
                    result[0] = element;
                }
                else if (comparator.compare(
                    element, (T) result[0]) < 0)
                {
                    result[0] = element;
                }
            },

            (result1, result2) -> {
                if (result1[0] == null)
                {
                    return result2;
                }

                if (result2[0] == null)
                {
                    return result1;
                }

                if (comparator.compare(
                    (T) result1[0], (T) result2[0]) <= 0)
                {
                    return result1;
                }

                return result2;
            },

            result -> Optional.ofNullable((T) result[0])
        );
    }

    // Find the maximum element
    public static <T> Collector<T, ?, Optional<T>>
    maxBy(Comparator<? super T> comparator)
    {
        return Collector.of(
            () -> new Object[1],

            (result, element) -> {
                if (result[0] == null)
                {
                    result[0] = element;
                }
                else if (comparator.compare(
                    element, (T) result[0]) > 0)
                {
                    result[0] = element;
                }
            },

            (result1, result2) -> {
                if (result1[0] == null)
                {
                    return result2;
                }

                if (result2[0] == null)
                {
                    return result1;
                }

                if (comparator.compare(
                    (T) result1[0], (T) result2[0]) >= 0)
                {
                    return result1;
                }

                return result2;
            },

            result -> Optional.ofNullable((T) result[0])
        );
    }

    // Sum integer values
    public static <T> Collector<T, ?, Integer>
    summingInt(ToIntFunction<? super T> mapper)
    {
        return Collector.of(
            () -> new int[1],

            (sum, element) -> {
                sum[0] += mapper.applyAsInt(element);
            },

            (sum1, sum2) -> {
                sum1[0] += sum2[0];
                return sum1;
            },

            sum -> sum[0]
        );
    }

    // Sum long values
    public static <T> Collector<T, ?, Long>
    summingLong(ToLongFunction<? super T> mapper)
    {
        return Collector.of(
            () -> new long[1],

            (sum, element) -> {
                sum[0] += mapper.applyAsLong(element);
            },

            (sum1, sum2) -> {
                sum1[0] += sum2[0];
                return sum1;
            },

            sum -> sum[0]
        );
    }

    // Sum double values
    public static <T> Collector<T, ?, Double>
    summingDouble(ToDoubleFunction<? super T> mapper)
    {
        return Collector.of(
            () -> new double[1],

            (sum, element) -> {
                sum[0] += mapper.applyAsDouble(element);
            },

            (sum1, sum2) -> {
                sum1[0] += sum2[0];
                return sum1;
            },

            sum -> sum[0]
        );
    }

    // Calculate the average of integer values
    public static <T> Collector<T, ?, Double>
    averagingInt(ToIntFunction<? super T> mapper)
    {
        return Collector.of(
            () -> new long[2],

            (result, element) -> {
                result[0] += mapper.applyAsInt(element);
                result[1]++;
            },

            (result1, result2) -> {
                result1[0] += result2[0];
                result1[1] += result2[1];
                return result1;
            },

            result -> result[1] == 0
                ? 0.0
                : (double) result[0] / result[1]
        );
    }

    // Calculate the average of double values
    public static <T> Collector<T, ?, Double>
    averagingDouble(ToDoubleFunction<? super T> mapper)
    {
        return Collector.of(
            () -> new double[2],

            (result, element) -> {
                result[0] += mapper.applyAsDouble(element);
                result[1]++;
            },

            (result1, result2) -> {
                result1[0] += result2[0];
                result1[1] += result2[1];
                return result1;
            },

            result -> result[1] == 0
                ? 0.0
                : result[0] / result[1]
        );
    }

    // Reduce elements using an identity value
    public static <T> Collector<T, ?, T>
    reducing(T identity, BinaryOperator<T> operator)
    {
        return Collector.of(
            () -> new Object[] { identity },

            (result, element) -> {
                result[0] = operator.apply((T) result[0], element);
            },

            (result1, result2) -> {
                result1[0] = operator.apply(
                    (T) result1[0], (T) result2[0]);
                return result1;
            },

            result -> (T) result[0]
        );
    }

    // Group elements by a classification function
    public static <T, K>
    Collector<T, ?, Map<K, List<T>>> groupingBy(
        Function<? super T, ? extends K> classifier)
    {
        return Collector.of(
            () -> new HashMap<K, List<T>>(),

            (map, element) -> {
                K key = classifier.apply(element);

                map.computeIfAbsent(
                    key, k -> new ArrayList<T>()
                ).add(element);
            },

            (map1, map2) -> {
                map2.forEach((key, list) -> {
                    map1.computeIfAbsent(
                        key, k -> new ArrayList<T>()
                    ).addAll(list);
                });

                return map1;
            }
        );
    }

    // Group elements and apply another collector to each group
    public static <T, K, A, D>
    Collector<T, ?, Map<K, D>> groupingBy(
        Function<? super T, ? extends K> classifier,
        Collector<T, A, D> downstream)
    {
        return Collector.of(
            () -> new HashMap<K, A>(),

            (map, element) -> {
                K key = classifier.apply(element);

                A container = map.computeIfAbsent(
                    key, k -> downstream.supplier().get()
                );

                downstream.accumulator().accept(
                    container, element
                );
            },

            (map1, map2) -> {
                map2.forEach((key, container2) -> {
                    A container1 = map1.get(key);

                    if (container1 == null)
                    {
                        map1.put(key, container2);
                    }
                    else
                    {
                        map1.put(
                            key,
                            downstream.combiner().apply(
                                container1, container2
                            )
                        );
                    }
                });

                return map1;
            },

            map -> {
                Map<K, D> result = new HashMap<>();

                map.forEach((key, container) -> {
                    result.put(
                        key,
                        downstream.finisher().apply(container)
                    );
                });

                return result;
            }
        );
    }

    // Divide elements into true and false groups
    public static <T>
    Collector<T, ?, Map<Boolean, List<T>>> partitioningBy(
        Predicate<? super T> predicate)
    {
        return Collector.of(
            () -> {
                Map<Boolean, List<T>> map = new HashMap<>();
                map.put(true, new ArrayList<T>());
                map.put(false, new ArrayList<T>());
                return map;
            },

            (map, element) -> {
                boolean key = predicate.test(element);
                map.get(key).add(element);
            },

            (map1, map2) -> {
                map1.get(true).addAll(map2.get(true));
                map1.get(false).addAll(map2.get(false));
                return map1;
            }
        );
    }

    // Convert a collected result into another result
    public static <T, A, R, RR>
    Collector<T, ?, RR> collectingAndThen(
        Collector<T, A, R> collector,
        Function<R, RR> finisher)
    {
        return Collector.of(
            () -> collector.supplier().get(),

            (container, element) -> {
                collector.accumulator().accept(
                    container, element
                );
            },

            (container1, container2) -> {
                return collector.combiner().apply(
                    container1, container2
                );
            },

            container -> finisher.apply(
                collector.finisher().apply(container)
            )
        );
    }

    // Example usage
    public static void main(String[] args)
    {
        List<Integer> numbers = Arrays.asList(
            10, 20, 30, 40, 50
        );

        List<Integer> list = numbers.stream()
            .collect(MyCollectors.toList());

        Set<Integer> set = numbers.stream()
            .collect(MyCollectors.toSet());

        Long count = numbers.stream()
            .collect(MyCollectors.counting());

        Integer sum = numbers.stream()
            .collect(MyCollectors.summingInt(n -> n));

        Double average = numbers.stream()
            .collect(MyCollectors.averagingInt(n -> n));

        Optional<Integer> max = numbers.stream()
            .collect(MyCollectors.maxBy(
                (a, b) -> Integer.compare(a, b)
            ));

        Map<Integer, List<Integer>> grouped = numbers.stream()
            .collect(MyCollectors.groupingBy(
                n -> n % 2
            ));

        Map<Boolean, List<Integer>> partitioned = numbers.stream()
            .collect(MyCollectors.partitioningBy(
                n -> n >= 30
            ));

        String joined = numbers.stream()
            .map(n -> n.toString())
            .collect(MyCollectors.joining(", "));

        System.out.println("List: " + list);
        System.out.println("Set: " + set);
        System.out.println("Count: " + count);
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
        System.out.println("Maximum: " + max);
        System.out.println("Grouped: " + grouped);
        System.out.println("Partitioned: " + partitioned);
        System.out.println("Joined: " + joined);
    }
}