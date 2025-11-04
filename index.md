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

* Jeremy Siek (jsiek), office hours Tuesdays 4-5pm, Wednesdays 11am-noon, in Luddy Room 3014.

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
| 2pm     | Matei             | Calvin     | Matei          |             |        |
| 3pm     |                   |            |                |             | Calvin |
| 4pm     |                   | Jeremy     |                |             |        |
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
| Sep. 5     | —                                                            |                                                              | [Project: FloodIt!](./flood-it)                           | [code](https://autograder.luddy.indiana.edu/web/project/1778) |
| Sep. 8     | [Algorithm Analysis, Merge Sort](./lectures/more-algo-analysis.md) | Ch.7 Sec.6                                                   |                                                           |      |
| Sep. 10    | [Linked Lists and Abstract Data Types](./lectures/linked-lists.md) | Ch. 3 sec. 1-5                                               | [Homework 1](./HW1.md)                                     |      |
| Sep. 12    | —                                                            |                                                              | Lab: [Merge Sort](./MergeSort.md)                         | [submit](https://autograder.luddy.indiana.edu/web/project/1786)     |
| Sep. 15    | [Programming in Deduce with Linked Lists](./lectures/deduce-programming.md) | [Programming in Deduce](https://jsiek.github.io/deduce/pages/deduce-programming.html) |                                                           |      |
| Sep. 17    | [Sorting: Insertion, Quick](./lectures/sorting.md)           | Ch.7 Sec.2,7                                                 |                             |      |
| Sep. 19    | —                                                            |                                                              | Lab: [Linked Lists in Deduce](./LabDeduceProg)            | [submit](https://autograder.luddy.indiana.edu/web/project/1819)     |
| Sep. 22    | [Writing Proofs in Deduce](./lectures/deduce-intro-proof.md) | [Proofs in Deduce](https://jsiek.github.io/deduce/pages/deduce-proofs.html) |                                                           |      |
| Sep. 24    | [Binary Trees](./lectures/binary-trees.md) and [Binary Search Trees (BST)](./lectures/binary-search-trees.md) | Ch.4 Sec.1,2,3 | Homework: [Deduce Proof Exercise 1](./ProofExercise1.md)  | [submit](https://autograder.luddy.indiana.edu/web/project/2026)     |
| Sep. 26    | —                                                            |                                                              | Project: [Segment Intersection (BST)](./SegmentBST.md)    | [code](https://autograder.luddy.indiana.edu/web/project/2028), [test](https://autograder.luddy.indiana.edu/web/project/2029)     |
| Sep. 29    | [More Proofs and Induction](./lectures/deduce-more-proof.md) |                                                              |                                                           |      |
| Oct. 1     | [Balanced Search Trees (AVL)](./lectures/balanced-search-trees.md) | Ch. 4 Sec. 4                                                 | 
| Oct. 3     | —                                                            |                                                              | Project: [Segment Intersection (AVL)](./SegmentAVL.md)    | [code](https://autograder.luddy.indiana.edu/web/project/1814), [test](https://autograder.luddy.indiana.edu/web/project/1813)      |
| Oct. 6     | [Review for Midterm Exam](./lectures/midterm-review.md)                                      |                                                              |                                                           |      |
| Oct. 8     | **Midterm Exam**                                             |                                                              |                                                           |      |
| Oct. 9| | | Homework: [Quick Reverse Correct](./QuickReverse.md)<br>  | [code](https://autograder.luddy.indiana.edu/web/project/1820)    |
| Oct. 10    | **Fall Break**                                               |                                                              |                                                           |      |
| Oct. 13    | [Discovering and Generalizing Lemmas](./lectures/RevRev.md)  |                                                              |                                                           |      |
| Oct. 15    | [Hash Tables](./lectures/hash-tables.md)                     | Ch. 5 sec. 1,2,3,5,6                                         | Homework: [Deduce Proof Exercise 2](./ProofExercise2.md)                         | [code](https://autograder.luddy.indiana.edu/web/project/2051)     |
| Oct. 17    | —                                                            |                                                              | Lab: [Hash Table](./LabHashTable.md)                      |  [code](https://autograder.luddy.indiana.edu/web/project/1788), [test](https://autograder.luddy.indiana.edu/web/project/1804)    |
| Oct. 20    | [Heaps and Priority Queues](./lectures/heaps.md)             | Ch. 6 sec. 1-4,9                                             |                                                           |      |
| Oct. 22    | [Binomial Heaps and Queues](./lectures/binomial-queues.md)   | Ch.6 Sec.8                                                   | Homework: [List Search Correct](./ListSearch.md)          | [code](https://autograder.luddy.indiana.edu/web/project/1821)     |
| Oct. 24    | —                                                            |                                                              | Lab: [Heap](./Heap.md)                                    |      |
| Oct. 27    |                                                              |                                                              |                                                           |      |
| Oct. 27    | Review Solutions: Quick Rev, Proof Ex. 2      |                                                              |                                                           |      |
| Oct. 29    | [Graphs and Breadth-first Search](./lectures/graphs-bfs.md)  | Ch. 9 sec. 1,3                                               |                         |      |
| Oct. 31    | —                                                            |                                                              | Lab: [Binomial Heaps](./LabBinHeap.md)                    | [code](https://autograder.luddy.indiana.edu/web/project/1799), [test](https://autograder.luddy.indiana.edu/web/project/1806)      |
| Nov. 3     | [Depth-first Search](./lectures/dfs.md)                      | Ch. 9 sec. 6                                                 |                                                           |      |
| Nov. 5     | [Shortest Paths](./lectures/shortest-paths.md)               | Ch. 9 sec. 3                                                 |  |      |
| Nov. 7     | —                                                            |                                                              | Lab: [Connected Components](./ConnectedComponents.md), Homework: [Search is O(n) in Deduce](./SearchOn.md)     |  [Connected Components Submit Code](https://autograder.luddy.indiana.edu/web/project/1800), [Connected Components Submit Test](https://autograder.luddy.indiana.edu/web/project/1803), [Search is O(n) Submit](https://autograder.luddy.indiana.edu/web/project/2075)     |
| Nov. 10    | [Union Find](./lectures/union-find.md)                       | Ch. 8                                                        |                                                           |      |
| Nov. 12    | [Minimum Spanning Tree](./lectures/minimum-spanning-tree.md) | Ch. 9 sec. 5                                                 |                                                           |      |
| Nov. 14    | —                                                            |                                                              | Project: [Routing Wires](./RoutingWires), Homework: [Insertion Sort Correct](./LabInsertionSort.md) | [Insertion Sort Correct Submit](https://autograder.luddy.indiana.edu/web/project/2081)     |
| Nov. 17    | [Backtracking](./lectures/backtracking.md)                   | Ch. 10 sec. 5                                                |                                                           |      |
| Nov. 19    | [Dynamic Programming](./lectures/dynamic-programming.md)     | Ch. 10, sec. 3                                               |             |      |
| Nov. 21    | —                                                            |                                                              | Lab: work on Routing Wires, Homework: [BST Correct](./LabBinarySearchTree)                |      |
| Nov. 24-28 | **Thanksgiving**                                             |                                                              |                                                           |      |
| Dec. 1     | [DNA Alignment](./lectures/DNA-alignment.md)                 |                                                              |                                                           |      |
| Dec. 3     | [More Dynamic Programming](./lectures/more-dynamic-programming.md) |                                                              |                                              |      |
| Dec. 5     | —                                                            |                                                              | Lab: [DNA Sequence Alignment](./DnaAlignment.md)          |      |
| Dec. 8     | Code Review                                                  |                                                              |                                                           |      |
| Dec. 10    | Review for Final Exam                                        |                                                              |                                                           |      |
| Dec. 12    | —                                                            |                                                              | Lab: Review for Final Exam                                |      |
| Dec. 15 | **Final Exam: Monday, 8am-10am, in SY 137**                                          |                                                              |                                                           |      |


**Resources**

* [Algorithm Analysis Recipes](./lectures/analysis-recipes.md)

* Practice Midterm Exams
  * 2025 (Spring) [without solutions](./midterm-spring-2025.pdf)
     and [with solutions](./midterm-spring-2025-soln.pdf).
  * 2024 [without solutions](./midterm-2024.pdf)
     and [with solutions](./midterm-2024-solns.pdf).
  * 2022 [without solutions](./midterm-a-2022-questions.pdf)
     and [with solutions](./midterm-a-2022.pdf).
  * 2021 [without solutions](./midterm-2021.pdf)
     and [with solutions](./midterm-2021-solns.pdf).

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
    * Installing Deduce [video](https://youtu.be/BYNKPcXOQd4)
    * Introduction to Deduce [video](https://youtu.be/q0OMEPEOe-g).
    * Programming in Deduce [video](https://youtu.be/wH8nh1_1zZU).
    * Writing Proofs in Deduce (Part 1) [video](https://youtu.be/7sZInoabAp0).
    * Writing Proofs in Deduce (Part 2) [video](https://youtu.be/QLJCrCeB0Zo).      
	* Writing Proofs in Deduce (Part 3) [video](https://youtu.be/Qau-XLx8DA8).
    * Writing Proofs in Deduce (Part 4) [video](https://youtu.be/FjxaUbeW84o).
    * Proof by induction on linked lists in Deduce [video](https://youtu.be/iu20bLIRSOs).

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

