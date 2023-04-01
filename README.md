# LinkedOverHashSet

LinkedOverHashSet is a Kotlin implementation of the LinkedHashSet class with an added property of
maintaining the order of insertion of elements. In addition, when an element is re-inserted, it is
stored at the last position of the set instead of its original position.

## Usage

To use LinkedOverHashSet, you can simply create an instance of the LinkedOverHashSet class:

```bash
val linkedOverHashSet = LinkedOverHashSet<Int>()
```

You can then add elements to the set using the add function:

```bash
linkedOverHashSet.add(4)
linkedOverHashSet.add(3)
linkedOverHashSet.add(1)
linkedOverHashSet.add(2)
```

If an element is re-inserted, it will be removed from its original position and added to the last
position of the set:

```bash
linkedOverHashSet.add(3) // returns false
linkedOverHashSet.add(1) // returns false
linkedOverHashSet.add(4) // returns false
linkedOverHashSet.add(2) // returns false
```

You can iterate over the elements in the set using a for loop:

```bash
for (x in linkedOverHashSet){
println(x)
}
```

You can also use the popLastElement function to get and remove the last element of the set:

```bash
val lastElement = linkedOverHashSet.popLastElement()
```

## Contributions

Contributions to this library are welcome. If you find a bug or have a feature request,
please open an issue on the [GitHub repository](https://github.com/thesarangal/LinkedOverHashSet).

## License

This library is released under the [MIT License](https://opensource.org/licenses/MIT).