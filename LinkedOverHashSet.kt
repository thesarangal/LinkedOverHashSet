package sarangal.packagemanager.utils

/**
 * Implementation of [LinkedHashSet] class with following property:
 *
 * This class maintain the order of insertion of element like [LinkedHashSet] but
 * the element will store at the last if it was already exists when requested to re-insert.
 *
 * For example:
 * val linkedOverHashSet = LinkedOverHashSet<Int>()
 * println(linkedOverHashSet.add(4))
 * println(linkedOverHashSet.add(3))
 * println(linkedOverHashSet.add(1))
 * println(linkedOverHashSet.add(2))
 * println(linkedOverHashSet.add(3))
 * println(linkedOverHashSet.add(1))
 * println(linkedOverHashSet.add(4))
 * println(linkedOverHashSet.add(2))
 * println()
 * println("Elements are:")
 * for (x in linkedOverHashSet){
 *     println(x)
 * }
 *
 * RESULT:
 * true
 * true
 * true
 * true
 * false
 * false
 * false
 * false
 *
 * Elements are:
 * 3
 * 1
 * 4
 * 2
 *
 * @author Rajat Sarangal
 * @since January 22, 2022
 * @link https://github.com/thesarangal/LinkedOverHashSet
 * */
class LinkedOverHashSet<E> : LinkedHashSet<E>() {

    /**
     * Adds the specified element to this set if it is not already present.
     * If it already exists in set then it will be removed from it's last position
     * and will be added at the last position of the set.
     *
     * More formally, adds the specified element <tt>e</tt> to this set if
     * this set contains no element <tt>e2</tt> such that
     * <tt>(e==null&nbsp;?&nbsp;e2==null&nbsp;:&nbsp;e.equals(e2))</tt>.
     * If this set already contains the element, the call remove it from old position,
     * add at last position of the set and returns <tt>false</tt>.
     *
     * @param element element to be added to this set
     * @return <tt>true</tt> if this set did not already contain the specified
     * element
     */
    override fun add(element: E): Boolean {

        var isUnique = true

        // Remove the element if already exists
        if(contains(element)){
            remove(element)
            isUnique = false
        }

        // Add element
        super.add(element)

        return isUnique
    }

    /**
     * @return Last element as well as remove from set if available, otherwise NULL
     * */
    fun popLastElement(): E? {

        if(isEmpty()) return null

        // Get Last Element
        val lastElement = elementAt(size - 1)

        // Remove Element
        remove(lastElement)

        // Return Removed Element
        return lastElement
    }
}
