# Segment Intersection (Part 2, AVL)

**[Note]** This is a group project. Students may work in groups of 3 ~ 4 people, or by themselves.
  After completion, every group member submits their solutions on Autograder <mark>individually</mark>.

## Before We Start (Optional)

+ Review [lecture notes](./lectures/balanced-search-trees.md) for balanced search trees.
  (**HINT:** this will make writing `BinarySearchTree` really easy)
+ Read Textbook Ch. 4.4 carefully, ***especially*** the code listings
  from Fig. 4.37 to Fig. 4.44.
+ Read [CLRS](http://mitpress.mit.edu/9780262046305/introduction-to-algorithms/)
  Ch. 33.1 and 33.2 for an introduction to segment intersection.


## Description

[Last week](./SegmentBST.md) you completed a Binary Search Tree class to execute 
the line sweep algorithm.

This week you will write an AVL tree class to achieve the desired $n \log n$ time
complexity, thanks to keeping the tree balanced.

Your task is to complete the implementation of the `AVLTree` class.
⚠️**You are NOT supposed to modify any code outside the class**
(marked as "read-only" in the project structure below).
Implement all of the methods marked `TODO` according to their descriptions
in the comments. **DO NOT** change their function signatures.



## Submission


As usual, this project contains a programming part and a testing part.
You are expected to test your code locally as you develop the program.

You will submit both the code you wrote last week and this week together to the 
autograder, so that you have access to any helper methods you may have written in 
`BinarySearchTree.java`


<!-- TODO: Link AG -->
+ Submit your code `AVLTree.java` and `BinarySearchTree.java` to the autograder SegmentIntersection project [here](https://autograder.luddy.indiana.edu/web/)
+ Submit your test cases `StudentTest.java` to the autograder SegmentIntersectionTest project [here](https://autograder.luddy.indiana.edu/web/)
  * We have included a small test case in the support code to get you started.



```
.
├── SegmentIntersection.iml
├── src
│   ├── AVLTree.java             // your code
│   ├── BinarySearchTree.java    // your code
│   ├── Constants.java
│   ├── Driver.java
│   ├── GUI.java
│   ├── LineSegment.java
│   ├── Node.java
│   ├── OrderedSet.java
│   └── Sweeper.java
└── test
    └── StudentTest.java         // your tests
```

* `AVLTree` **[YOUR TASK]** is a class representing a height-balanced tree. Since
  `AVLTree` is a subclass of `BinarySearchTree`, you will need a fully
  functioning implementation of `BinarySearchTree` before you can begin
  working on this class. However, this is the most interesting and
  important part of this entire project, so make sure you allow
  yourself enough time to work on it.


### Troubleshooting

Here are a few common issues and things to remember as you complete the project 🙂
- Remember that you need to update `parent` pointers for nodes, as well as `left` and `right` as you normally would
- Remember to call `updateHeight` on nodes whenever their children change.
- Both `BinarySearchTree` and `AVLTree` are responsible for maintaining the `numNodes` variable to track the size of the tree.

  -----------------

* You have finally reached the end of the project. Congratulations!
