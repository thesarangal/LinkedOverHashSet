# LinkedOverHashSet
Implementation of [LinkedHashSet] class maintain the order of insertion of element like [LinkedHashSet] but the element will store at the last if it was already exists when requested to re-insert.

## Functions

### add(element: E): Boolean
Adds the specified element to this set if it is not already present. If it already exists in set then it will be removed from it's last position and will be added at the last position of the set.

### popLastElement(): E?
@return Last element as well as remove from set if available, otherwise NULL

#### For example:

```
val linkedOverHashSet = LinkedOverHashSet<Int>()
println(linkedOverHashSet.add(4))
println(linkedOverHashSet.add(3))
println(linkedOverHashSet.add(1))
println(linkedOverHashSet.add(2))
println(linkedOverHashSet.add(3))
println(linkedOverHashSet.add(1))
println(linkedOverHashSet.add(4))
println(linkedOverHashSet.add(2))
println()
println("Elements are:")
for (x in linkedOverHashSet){
    println(x)
}
```

Output:
```
true
true
true
true
false
false
false
false

Elements are:
3
1
4
2
 ```
