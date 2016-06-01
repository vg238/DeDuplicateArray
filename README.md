# DeDuplicateArray
Java project with three ways to implement Java deduplication

Comments:

deDupByLoopingArray - 
 - Does sorting takes -> O(n)
 - then loops through array takes -> O(n)
 - finally does Arrays.Copy(*,length) -> takes O(length)

deDupsUsingArrayList
 - loops through Array takes -> O(n)
 - uses contains method on Arraylist -> which takes O(n), this runs O(arrayLength) times -> so takes O(n) * O(ArrayLength)
 - Adding N elements to ArrayList takes O(n) times
 - Ints.toArray(set) -> takes O(n) times

deDupUsingLinkedHashSet
 - Loops through Array -< takes O(n) times
 - Adds to set -> takes O(n) times
 - Ints.toArray(set) -> takes O(n) times

I think using Linked asset takes less time compared to other two options and also original order is preserved.
