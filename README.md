# leetcode

用scala记录一下我这个菜鸟刷leetcode的过程，
希望同时能够加深这门语言的同时对数据结构和算法有进一步的掌握。
乱入了些java代码... 略显怪异

把题目分类方便查看和复习。

### 链表
* [2.两数相加](src/main/scala/com/test/leetcode/linkedlist/AddTwoNumber.scala)
* [19.删除链表的倒数第N个节点](src/main/scala/com/test/leetcode/linkedlist/RemoveNthFromEnd.scala)
* [23. 合并K个升序链表](src/main/scala/com/test/leetcode/linkedlist/MergeKLists.scala)
* [24. 两两交换链表中的节点](src/main/scala/com/test/leetcode/linkedlist/SwapPairs.scala)
* [83. 删除排序链表中的重复元素](src/main/scala/com/test/leetcode/linkedlist/DeleteDuplicates.scala)
* [160. 相交链表](src/main/scala/com/test/leetcode/linkedlist/GetIntersectionNode.scala)
* [146.LRU缓存](src/main/scala/com/test/leetcode/linkedlist/LRUCache.java)
* [206. 反转链表](src/main/scala/com/test/leetcode/linkedlist/ReverseList.scala)
* [707.设计链表](src/main/scala/com/test/leetcode/linkedlist/DesignLinkedList.scala)
* [1721. 交换链表中的节点](src/main/scala/com/test/leetcode/linkedlist/SwapNodes.scala)
* [剑指 Offer 06. 从尾到头打印链表](com/test/leetcode/linkedlist/ReverseLinkedList.scala)
### 栈
* [20.有效的括号](src/main/scala/com/test/leetcode/stack/ValidParentheses.scala)
* [155.最小栈](src/main/scala/com/test/leetcode/stack/MinStack.scala)
### 哈希
* [136.只出现一次的数字](src/main/scala/com/test/leetcode/hash/SingleNumber.scala)
* [349.两个数组的交集](src/main/scala/com/test/leetcode/hash/InterSection.scala)
### 树
* [94. 二叉树的中序遍历](src/main/scala/com/test/leetcode/tree/BinaryTreeInorderTraversal.scala)
* [98.验证二叉搜索树](src/main/scala/com/test/leetcode/tree/IsValidBST.java)
* [102. 二叉树的层序遍历](src/main/scala/com/test/leetcode/tree/BinaryTreeLevelOrderTraversal.scala)
* [100. 相同的树](src/main/scala/com/test/leetcode/tree/IsSameTree.scala)
* [101. 对称二叉树](src/main/scala/com/test/leetcode/tree/IsSymmetric.scala)
* [105.从前序与中序遍历序列构造二叉树](src/main/scala/com/test/leetcode/tree/BuildTree.java)
* [112.路径总和](src/main/scala/com/test/leetcode/tree/PathSum.scala)
* [114.二叉树展开为链表](src/main/scala/com/test/leetcode/tree/FlattenTree.java)
* [124.二叉树中的最大路径和](src/main/scala/com/test/leetcode/tree/MaxPathSum.java)
* [144.二叉树的前序遍历](src/main/scala/com/test/leetcode/tree/BinaryTreePreorderTraversal.scala)
* [145. 二叉树的后序遍历](src/main/scala/com/test/leetcode/tree/BinaryTreePostorderTraversal.scala)
* [222.完全二叉树的节点个数](src/main/scala/com/test/leetcode/tree/CountCompleteTreeNodes.scala)
* [226.翻转二叉树](src/main/scala/com/test/leetcode/tree/InvertTree.java)
* [236.二叉树的最近公共祖先](src/main/scala/com/test/leetcode/tree/LowestCommonAncestor.java)
### 二分法
* [4. 寻找两个正序数组的中位数(部分测试用例存在bug)](src/main/scala/com/test/leetcode/binarysearch/FindMedianSortedArrays.scala)
* [35.搜索插入位置](src/main/scala/com/test/leetcode/binarysearch/SearchInsert.scala)
* [剑指 Offer 04. 二维数组中的查找](src/main/scala/com/test/leetcode/binarysearch/SearchMatrix.scala)
### 深度优先搜索
* [113.路径总和 II](src/main/scala/com/test/leetcode/graph/dfs/PathSum2.java)
* [200. 岛屿数量](src/main/scala/com/test/leetcode/graph/dfs/NumIsLands.scala)
* [437.路径总和 III(双重递归解法)](src/main/scala/com/test/leetcode/graph/dfs/PathSum3.java)
### 广度优先搜素
* [200. 岛屿数量](src/main/scala/com/test/leetcode/graph/bfs/NumIslands.scala)
### 分治法
* [53.最大子序和](src/main/scala/com/test/leetcode/divideconquer/RecursiveFunction.scala)  (尚未实现)
### 贪心法
* [53.最大子序和](src/main/scala/com/test/leetcode/greedy/MaxSubArr.scala)
### 二维数组
* [54.螺旋矩阵](src/main/scala/com/test/leetcode/twodarr/SpiralOrder.scala)
* [498.对角线遍历](src/main/scala/com/test/leetcode/twodarr/FindDiagonalOrder.scala)
### 双指针
* [11.盛最多水的容器](src/main/scala/com/test/leetcode/twopointer/MaxArea.java)
* [15. 三数之和](src/main/scala/com/test/leetcode/twopointer/ThreeNumSum.scala)
* [26.删除排序数组中的重复项](src/main/scala/com/test/leetcode/twopointer/RemoveDuplicates.scala)
* [27.移除元素](src/main/scala/com/test/leetcode/twopointer/RemoveElements.scala)
* [344. 反转字符串](src/main/scala/com/test/leetcode/twopointer/ReverseString.scala)
### 堆排序
* [215. 数组中的第K个最大元素](src/main/scala/com/test/leetcode/heap/KthLargesth.scala)
### 动态规划
* [5.最长回文子串](src/main/scala/com/test/leetcode/dynamicprograming/LongestPalindrome.scala)
* [42. 接雨水](src/main/scala/com/test/leetcode/dynamicprograming/TrappingRainWater.scala)
* [45. 跳跃游戏 II](src/main/scala/com/test/leetcode/dynamicprograming/Jump2.java)
* [55.跳跃游戏](src/main/scala/com/test/leetcode/dynamicprograming/CanJump.java)
* [62.不同路径](src/main/scala/com/test/leetcode/dynamicprograming/UniquePaths.java)
* [63.不同路径2](src/main/scala/com/test/leetcode/dynamicprograming/UniquePathsWithObstacles.java)
* [70.爬楼梯](src/main/scala/com/test/leetcode/dynamicprograming/ClimbStairs.java)
* [96.不同的二叉搜索树](src/main/scala/com/test/leetcode/dynamicprograming/NumTrees.java)
* [343.整数拆分](src/main/scala/com/test/leetcode/dynamicprograming/IntegerBreak.java)
* [746.使用最小花费爬楼梯](src/main/scala/com/test/leetcode/dynamicprograming/MinCostClimbingStairs.java)
* [1143. 最长公共子序列](src/main/scala/com/test/leetcode/dynamicprograming/LongestCommonSubsequence.scala)
### 回溯
* [51.N皇后](src/main/scala/com/test/leetcode/backtrack/SolveNQueens.java)
* [437.路径总和 III(前缀和解法)](src/main/scala/com/test/leetcode/backtrack/PathSum3.java)
### 排序
* [215. 数组中的第K个最大元素(堆排序解法)](src/main/scala/com/test/leetcode/sort/HeapSort.java)
* [215. 数组中的第K个最大元素(快排)](src/main/scala/com/test/leetcode/sort/QuickSort.java)

### 其他
* [3. 无重复字符的最长子串](src/main/scala/com/test/leetcode/others/LengthOfLongestSubstring.scala)
* [7.整数反转](src/main/scala/com/test/leetcode/others/Reverse.scala)
* [9. 回文数](src/main/scala/com/test/leetcode/others/IsPalindrome.scala)
* [14. 最长公共前缀](src/main/scala/com/test/leetcode/others/LongestCommonPrefix.scala)
* [28.实现 strStr()](src/main/scala/com/test/leetcode/others/StrStr.scala)
* [66.加一](src/main/scala/com/test/leetcode/others/PlusOne.scala)
* [67.二进制求和](src/main/scala/com/test/leetcode/others/AddBinary.scala)
* [747.至少是其他数字两倍的最大数](src/main/scala/com/test/leetcode/others/DominantIndex.scala)



