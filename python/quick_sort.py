def quicksort(collection: list) -> list:
    """A pure Python implementation of quick sort algorithm

    :param collection: a mutable collection of comparable items
    :return: the same collection ordered by ascending

    Examples:
    >>> quick_sort([0, 5, 3, 2, 2])
    [0, 2, 2, 3, 5]
    >>> quick_sort([])
    []
    >>> quick_sort([-2, 5, 0, -45])
    [-45, -2, 0, 5]
    """
    if len(collection) < 2:
        return collection
    pivot = collection.pop()  # Use the last element as the first pivot
    greater: list[int] = []  # All elements greater than pivot
    lesser: list[int] = []  # All elements less than or equal to pivot
    for element in collection:
        (greater if element > pivot else lesser).append(element)
    return quicksort(lesser) + [pivot] + quicksort(greater)

test = [21, 4, 1, 3, 9, 20, 25, 6, 21, 14]
print (quicksort(test))