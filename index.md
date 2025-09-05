**Indiana University, Fall 2025**

This course studies the fundamental ideas for **correctly** and
**efficiently** analyzing large amounts of data, such as DNA sequence
databases and geographic information. These fundamental ideas come in
two kinds: algorithms and data structures. Algorithms are instructions
for solving problems and data structures are strategies for organizing
information on computers. To implement algorithms and data structures
correctly relies on software engineering skills such as testing,
debugging, and reasoning logically about the code, which we practice
in this course. Efficient algorithms require appropriate data
structures, and vice versa, so the study of algorithms and data
structures is tightly linked. In this course we learn about the
algorithms and data structures that form the building blocks for many
of Today's large-scale computer systems. We apply these ideas to solve
challenging problems in bioinformatics and geographic information
systems. Warning: a possible side-effect of taking this course is
doing better on job interview questions.

**Lecture**

* Mondays and Wednesdays 9:35am-10:50am, Sycamore Hall (SY) Room 137.

**Labs**

* Friday 10:20am-12:15pm, Ballantine Hall (BH) Room 229

    - Calvin Josenhans
    - Matei Cloteaux

Expect at least one quiz per month during lab time.
* 15 minutes, at the end of a lab session
* The scope of each quiz is everything turned in prior to the quiz, including homework and lab assignments

**Instructors**

* Jeremy Siek (jsiek), office hours Mondays 4-5pm, Wednesdays 11am-noon, in Luddy Room 3014.

**Teaching Assistants**

* Cloteaux, Matei (mcloteau)
* Josenhans, Calvin (cjosenha)

**Office Hours**

Office hours with TAs are in Luddy Hall Room 0121.

| Time    | Monday            | Tuesday    | Wednesday      | Thursday    | Friday |
|---------|-------------------|------------|----------------|-------------|--------|
| 10am    |                   |            |                |             |        |
| 11am    |                   |            | Jeremy         |             |        |
| 12pm    |                   |            |                |             |        |
| 1pm     |                   |            |                |             |        |
| 2pm     |                   | Calvin     |                |             |        |
| 3pm     |                   |            |                |             | Calvin |
| 4pm     | Jeremy            |            |                |             |        |
| 5pm     |                   |            |                |             |        |



**Textbook**

*Data Structures and Algorithm Analysis in Java*, 3rd Ed. by Mark A. Weiss

**Slack (communicating with instructors and other students)**

[Signup](https://join.slack.com/t/h343datastruc-b0m7918/shared_invite/zt-3aoe8uf3l-Xa8ik1RyD~1SIMi4Z56Afw)

**Schedule**


| Day        | Lecture Topic                                                | Reading Due                                                  | Assignments and Due Dates                                 | Link |
|------------|--------------------------------------------------------------|--------------------------------------------------------------|-----------------------------------------------------------|------|
| Aug. 25    | [Introduction](./lectures/introduction.md)                   |                                                              |                                                           |      |
| Aug. 27    | [Arrays, Rotation, Testing](./lectures/array-rotation.md)    | Ch.1                                                         |                                                           |      |
| Aug. 29    | —                                                            |                                                              | [Lab: Array Search and Testing](./Search)                 | [code](https://autograder.luddy.indiana.edu/web/project/1815), [test](https://autograder.luddy.indiana.edu/web/project/1810)     |
| Sep. 1     | **Labor Day** (no class)                                     |                                                              |                                                           |      |
| Sep. 3     | [Algorithm Analysis](./lectures/algo-analysis.md)            | Ch.2                                                         |                                                           |      |
| Sep. 5     | —                                                            |                                                              | [Project: FloodIt!](./flood-it)                           | [code](https://autograder.luddy.indiana.edu/web/project/1778)     |
| Sep. 8     | [Algorithm Analysis, Merge Sort](./lectures/more-algo-analysis.md) | Ch.7 Sec.6                                             | Project: FloodIt! Due                                     |      |
| Sep. 10    | [Linked Lists and Abstract Data Types](./lectures/linked-lists.md) | Ch. 3 sec. 1-5                                         | Homework: about big-O                                     |      |
| Sep. 12    | —                                                            |                                                              | Lab: [Merge Sort](./MergeSort.md)                         | [submit](https://autograder.luddy.indiana.edu/web/project_admin/1786)     |
| Sep. 15    | [Programming in Deduce with Linked Lists](./lectures/deduce-programming.md) | [Programming in Deduce](https://jsiek.github.io/deduce/pages/deduce-programming.html) | Lab: Merge Sort Due |      |
| Sep. 17    | [Sorting: Insertion, Quick](./lectures/sorting.md)           | Ch.7 Sec.2,7                                                 | Homework: about algo. analysis                            |      |
| Sep. 19    | —                                                            |                                                              | Lab: [Linked Lists in Deduce](./LabDeduceProg)            |      |
| Sep. 22    | [Writing Proofs in Deduce](./lectures/deduce-intro-proof.md) | [Proofs in Deduce](https://jsiek.github.io/deduce/pages/deduce-proofs.html) |                                                           |      |
| Sep. 24    | [Binary Trees](./lectures/binary-trees.md) and [Binary Search Trees (BST)](./lectures/binary-search-trees.md) | Ch.4 Sec.1,2,3 | Homework: [Deduce Proof Exercise 1](./ProofExercise1.md)  |      |
| Sep. 26    | —                                                            |                                                              | Project: Segment Intersection (BST)                       |      |
| Sep. 29    | [More Proofs and Induction](./lectures/deduce-more-proof.md) |                                                              |                                                           |      |
| Oct. 1     | [Balanced Search Trees (AVL)](./lectures/balanced-search-trees.md) | Ch. 4 Sec. 4                                                 | Homework: [Quick Reverse Correct](./QuickReverse.md)<br>  |      |
| Oct. 3     | —                                                            |                                                              | Project: Segment Intersection (AVL)                       |      |
| Oct. 6     | Review for Midterm Exam                                      |                                                              |                                                           |      |
| Oct. 8     | **Midterm Exam**                                             |                                                              |                                                           |      |
| Oct. 10    | **Fall Break**                                               |                                                              |                                                           |      |
| Oct. 13    | [Discovering and Generalizing Lemmas](./lectures/RevRev.md)  |                                                              |                                                           |      |
| Oct. 15    | [Hash Tables](./lectures/hash-tables.md)                     | Ch. 5 sec. 1,2,3,5,6                                         | Homework: [Deduce Proof Exercise 2](./ProofExercise2.md)                         |      |
| Oct. 17    | —                                                            |                                                              | Lab: [Hash Table](./LabHashTable.md)                      |      |
| Oct. 20    | [Heaps and Priority Queues](./lectures/heaps.md)             | Ch. 6 sec. 1-4,9                                             |                                                           |      |
| Oct. 22    | [Binomial Heaps and Queues](./lectures/binomial-queues.md)   | Ch.6 Sec.8                                                   | Homework: [List Search Correct](./ListSearch.md)          |      |
| Oct. 24    | —                                                            |                                                              | Lab: [Heap](./Heap.md)                                    |      |
| Oct. 27    |                                                              |                                                              |                                                           |      |
| Oct. 29    | [Graphs and Breadth-first Search](./lectures/graphs-bfs.md)  | Ch. 9 sec. 1,3                                               | Homework: Search is O(n) in Deduce                        |      |
| Oct. 31    | —                                                            |                                                              | Lab: Binomial Heaps                                       |      |
| Nov. 3     | [Depth-first Search](./lectures/dfs.md)                      | Ch. 9 sec. 6                                                 |                                                           |      |
| Nov. 5     | [Shortest Paths](./lectures/shortest-paths.md)               | Ch. 9 sec. 3                                                 | Homework: [Insertion Sort Correct](./LabInsertionSort.md) |      |
| Nov. 7     | —                                                            |                                                              | Lab: [Connected Components](./ConnectedComponents.md)     |      |
| Nov. 10    | [Union Find](./lectures/union-find.md)                       | Ch. 8                                                        |                                                           |      |
| Nov. 12    | [Minimum Spanning Tree](./lectures/minimum-spanning-tree.md) | Ch. 9 sec. 5                                                 | Homework: Insertion Sort is O(n^2) in Deduce              |      |
| Nov. 14    | —                                                            |                                                              | Project: [Routing Wires](./RoutingWires)                  |      |
| Nov. 17    | [Backtracking](./lectures/backtracking.md)                   | Ch. 10 sec. 5                                                |                                                           |      |
| Nov. 19    | [Dynamic Programming](./lectures/dynamic-programming.md)     | Ch. 10, sec. 3                                               | Homework: [BST Correct](./LabBinarySearchTree)            |      |
| Nov. 21    | —                                                            |                                                              | Lab: work on Routing Wires                                |      |
| Nov. 24-28 | **Thanksgiving**                                             |                                                              |                                                           |      |
| Dec. 1     | [DNA Alignment](./lectures/DNA-alignment.md)                 |                                                              |                                                           |      |
| Dec. 3     | [More Dynamic Programming](./lectures/more-dynamic-programming.md) |                                                              | Homework: TBD                                             |      |
| Dec. 5     | —                                                            |                                                              | Lab: [DNA Sequence Alignment](./DnaAlignment.md)          |      |
| Dec. 8     | Code Review                                                  |                                                              |                                                           |      |
| Dec. 10    | Review for Final Exam                                        |                                                              |                                                           |      |
| Dec. 12    | —                                                            |                                                              | Lab: Review for Final Exam                                |      |
| Dec. 15-19 | **Final Exam Week**                                          |                                                              |                                                           |      |


<!--
[Sorting in Linear Time](./lectures/sort-linear.md) | Ch. 7 Sec.11
[Binomial Queues](./lectures/binomial-queues.md) | Ch. 6 Sec. 8
[More Proof Techniques, Induction](./lectures/deduce-more-proof.md)      
-->


<!--
Jan. 14 | [Introduction](./lectures/introduction.md)                |              |         |
Jan. 16 | [Arrays, Rotation, Testing](./lectures/array-rotation.md) | Ch. 1        |         |
Jan. 16 or 17 |                                                     |              | [Lab: Array Search and Testing](./Search) | [code](https://autograder.luddy.indiana.edu/web/project/1531), [test](https://autograder.luddy.indiana.edu/web/project/1526)
Jan. 21 | [Algorithm Analysis](./lectures/algo-analysis.md)         | Ch. 2        | Lab Array Search due                      | [code](https://autograder.luddy.indiana.edu/web/project/1531), [test](https://autograder.luddy.indiana.edu/web/project/1526)
Jan. 23 | [Algorithm Analysis, continued](./lectures/more-algo-analysis.md) 
Jan. 23 or 24 |                                                     |              | [Project: FloodIt!](./flood-it) | [code](https://autograder.luddy.indiana.edu/web/project/1509)
Jan. 28 | [Programming in Deduce with Linked Lists](./lectures/deduce-programming.md) | [Programming in Deduce](https://jsiek.github.io/deduce/pages/deduce-programming.html) | Project FloodIt! due | [code](https://autograder.luddy.indiana.edu/web/project/1509)
Jan. 30 | [Writing Proofs in Deduce](./lectures/deduce-intro-proof.md)                                | [Proofs in Deduce](https://jsiek.github.io/deduce/pages/deduce-proofs.html)
Jan. 30 or 31 |                                                     |              | [Lab: Linked Lists in Deduce](./LabDeduceProg) | [code](https://autograder.luddy.indiana.edu/web/project/1614)
Feb. 4  | [More Proofs and Induction](./lectures/deduce-more-proof.md) | | Lab Linked Lists in Deduce due
Feb. 6  | [Logical And, Or, Not, and Sets](./lectures/LogicAndSets.md)                        |              |   | 
Feb. 6 or 7 |                                                       |              | [Lab: Proof Exercises](./ProofExercises.md) (Quiz)
Feb. 11 | [Discovering and Generalizing Lemmas](./lectures/RevRev.md)                                            |  | Lab Proof Exercises due | [submit](https://autograder.luddy.indiana.edu/web/project/1623)
Feb. 13 | [Insertion Sort, Merge Sort, Quick Sort](./lectures/sorting.md)                    | Ch.7 Sec. 2,6,7 | 
Feb. 13 or 14 |                                                     |              | [Lab: Quick Reverse Correct](./QuickReverse.md)
Feb. 14 |                                                           |              | 
Feb. 18 | [Interfaces](./lectures/interfaces.md) and [Binary Trees](./lectures/binary-trees.md)                | Ch. 4 Sec. 1-2 | [Lab: Quick Reverse Correct](./QuickReverse.md) due | [submit](https://autograder.luddy.indiana.edu/web/project/1632)
Feb. 20 | [Binary Search Trees](./lectures/binary-search-trees.md)  | Ch. 4 Sec. 3
Feb. 20 or 21 |                                                     |              |  [Lab: Merge Sort](./MergeSort.md) 
Feb. 25 | [Balanced Search Trees (AVL)](./lectures/balanced-search-trees.md) | Ch. 4 Sec. 4 | Lab MergeSort due | [submit](https://autograder.luddy.indiana.edu/web/project/1498)
Feb. 27 | [More AVL](./lectures/more-avl-trees.md)
Feb. 27 or 28 | | | Lab: work on [Project 2: Segment Intersection](./SegmentIntersection.md) | [code](https://autograder.luddy.indiana.edu/web/project/1530), [test](https://autograder.luddy.indiana.edu/web/project/1529)
Feb. 28 | | | [Extra Credit: List Search](./ListSearch.md) | [submit](https://autograder.luddy.indiana.edu/web/project/1635)
March 4 | Code Review: Merge Sort, [Hash Tables](./lectures/hash-tables.md) | Ch. 5 sec. 1,2,3,5,6 |
March 6 | More Hash Tables
March 6 or 7 | | | Lab: finish [Project 2: Segment Intersection](./SegmentIntersection.md) | [code](https://autograder.luddy.indiana.edu/web/project/1530), [test](https://autograder.luddy.indiana.edu/web/project/1529)
March 11 | [Review for Midterm Exam](./lectures/midterm-review.md) |  | Project Segment Intersection due
March 13 | **Midterm Exam** (in class)
March 13 or 14 | | | Lab: [Hash Table](./LabHashTable.md) | [code](https://autograder.luddy.indiana.edu/web/project/1500), [test](https://autograder.luddy.indiana.edu/web/project/1520)
March 17-21 | **Spring Break**
March 25 | [Heaps and Priority Queues](./lectures/heaps.md) | Ch. 6 sec. 1-4,9 | Lab Hash Table due
March 27 | Code Review (Segment Intersection) | 
March 27 or 28 | | | Lab: [Heap](./Heap.md) | [code](https://autograder.luddy.indiana.edu/web/project/1532), [test](https://autograder.luddy.indiana.edu/web/project/1533)
April 1 | [Graphs and Breadth-first Search](./lectures/graphs-bfs.md) | Ch. 9, sec. 1,3 | Lab Heap Due
April 3 | [Depth-first Search](./lectures/dfs.md)                  | Ch. 9 sec. 6
April 3 or 4 |                                                     |              | Lab: [Connected Components](./ConnectedComponents.md) | [code](https://autograder.luddy.indiana.edu/web/project/1516), [test](https://autograder.luddy.indiana.edu/web/project/1519)
April 8 | [Shortest Paths](./lectures/shortest-paths.md)           | Ch. 9 sec. 3 | Lab Connected Components due
April 10 | [Backtracking](./lectures/backtracking.md)                  | Ch. 10 sec. 5
April 10 or 11 | | | Project: [Routing Wires](./RoutingWires) | [code](https://autograder.luddy.indiana.edu/web/project/1518)
April 15 | [Union Find](./lectures/union-find.md) and [Minimum Spanning Tree](./lectures/minimum-spanning-tree.md) | Ch. 8, Ch. 9 sec. 5
April 17 | [Dynamic Programming](./lectures/dynamic-programming.md)     | Ch. 10, sec. 3
April 17 or 18 | | | Project: [Routing Wires](./RoutingWires), cont'd
April 22 | [DNA Alignment](./lectures/DNA-alignment.md) | | Routing Wires due 
April 24 | [More Dynamic Programming](./lectures/more-dynamic-programming.md)
April 24 or 25 | | | Lab: [DNA Sequence Alignment](./DnaAlignment.md) | [code](https://autograder.luddy.indiana.edu/web/project/1513), [test](https://autograder.luddy.indiana.edu/web/project/1525)
April 29 | Code Review (Routing Wires) | | Lab DNA Sequence Alignment due
May 1 | [Review for Final Exam](./lectures/final-review.md)
May 1 or 2 | | | Optional lab for exam review
May 8 | **Final Exam** (in class) 10:20am-12:20pm
-->

**Resources**

* [Algorithm Analysis Recipes](./lectures/analysis-recipes.md)

* Practice Midterm Exams 
  * 2024 [with solutions](./midterm-2024-solns.pdf)
     and [without solutions](./midterm-2024.pdf).
  * 2022 [with solutions](./midterm-a-2022.pdf)
     and [without solutions](./midterm-a-2022-questions.pdf).
  * 2021 [with solutions](./midterm-2021-solns.pdf)
     and [without solutions](./midterm-2021.pdf).

* Practice Final Exams
  * 2024 [with solutions](./final-2024-solns.pdf)
  * 2022 [with solutions](./final-2022-solns.pdf)
     and [without solutions](./final-2022.pdf).
  * 2021 [with solutions](./final-2021-solns.pdf)
     and [without solutions](./final-2021.pdf).

* [Autograder](https://autograder.luddy.indiana.edu/web/course/154) for submitting coding assignments.

* Code Editor and Debugger:
  [IntelliJ IDEA](https://www.jetbrains.com/idea/download) (Community Edition)

* Note: Autograder uses JUnit5.7.0, so please stick to this version for JUnit.

* [Deduce](https://jsiek.github.io/deduce/index.html) Proof Checker

<!--
* Extra [exercises](./Exercises.md) in writing proofs in Deduce.
-->

**Grade Weighting**

* Assignments (30%)
* Quizzes (10%)
* Midterm Exam (25%)
* Final Exam (35%)

**Late Policy**

This policy applies to labs, projects, textbook exercises, and
quizzes.  For quizzes, you can do a make-up quiz during office hours.
This policy does not apply to the midterm and final exam.  When you
complete something up to one week late, there is a 10% deduction to its grade.

100% | up to the due date
90%  | up to one week after due date
0%   | after one week past the due date 

