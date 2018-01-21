import com.naveen.interviewBit.dynamicProgramming.LongestSubSeq;
import com.naveen.interviewBit.graphs.DFS;
import com.naveen.interviewBit.graphs.Graph;
import com.naveen.interviewBit.maths.FindDuplicate;
import com.naveen.interviewBit.maths.GCD;
import com.naveen.interviewBit.strings.StringPermutation;
import com.naveen.interviewBit.stuff.LRUCache;
import com.naveen.interviewBit.stuff.ThreadCr;
import com.naveen.interviewBit.stuff.ThreadExampl;
import com.naveen.interviewBit.tree.InorderTraversal;
import com.naveen.interviewBit.tree.PostOrderTraversal;
import com.naveen.interviewBit.tree.PreOrderTraversal;
import com.naveen.interviewBit.tree.TreeNode;
import com.naveen.interviewBit.tree.VerticalTraversal;
import com.naveen.interviewBit.tree.ZigZagLevelTraverse;
import javafx.util.Pair;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        /*TreeNode treeNode = new TreeNode(1);
        treeNode.left = new TreeNode(2);
        treeNode.right = new TreeNode(3);
        treeNode.right.left = new TreeNode(6);
        treeNode.right.right = new TreeNode(7);
        treeNode.left.left = new TreeNode(4);
        treeNode.left.right = new TreeNode(5);*/
        /*
        *    1
        *  2   3
        * 4 5 6 7
        * */
        /*InorderTraversal inorderTraversal = new InorderTraversal();
        ArrayList<Integer> integerArrayList = inorderTraversal.inorderTraversal(treeNode);
         */

        /*VerticalTraversal traversal = new VerticalTraversal();
        traversal.verticalOrderTraversal(treeNode);*/

        /*ZigZagLevelTraverse zigZagLevelTraverse = new ZigZagLevelTraverse();
        zigZagLevelTraverse.solution(treeNode);*/

        /*PostOrderTraversal postOrderTraversal = new PostOrderTraversal();
        postOrderTraversal.postOrder(treeNode);*/

        /*PreOrderTraversal preOrderTraversal = new PreOrderTraversal();
        preOrderTraversal.solution(treeNode);*/

        /*GCD gcd = new GCD();
        gcd.gcd(4,6);*/

        /*FindDuplicate duplicate = new FindDuplicate();
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        duplicate.repeatedNumber(list);*/

        //new StringPermutation().printAllPermutation("ABC");
        /*int arr[] = {1, 3, 5, 6, 4, 8, 4, 3, 2, 1};
        int r = new LongestSubSeq().longestSubSeq(arr);*/

        /*Graph graph = new Graph(4);
        graph.addEdge(1,2);
        graph.addEdge(1,3);
        graph.addEdge(2,3);
        graph.addEdge(2,4);
        graph.addEdge(3,4);
        DFS dfs = new DFS(4,graph);
        dfs.dfsTraverse(1);*/
        //6 2 S 2 1 S 1 1 S 2 3 S 4 1 G 1 G 2
        /*LRUCache lruCache = new LRUCache(2);
        //lruCache.getInt(1);
        lruCache.setKey(2,1);
        lruCache.setKey(1,1);
        lruCache.setKey(2,3);
        lruCache.setKey(4,1);
        int r1 = lruCache.getInt(1);
        //lruCache.setKey(3,2);
        int r2 = lruCache.getInt(2);
        //int r3 = lruCache.getInt(3);
        List<Object> list = new ArrayList<>();
        list.add(1);
        list.add("a");*/
        /*ThreadCr threadCr = new ThreadCr();
        threadCr.start();

        ThreadCr threadCr2 = new ThreadCr();

        threadCr2.start();
        System.out.println("FInished !");*/

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Pair<Integer,Integer>> list = new ArrayList<Pair<Integer,Integer>>();
        for (int i =0; i<n;i++)
        {
            int a= sc.nextInt();
            int b= sc.nextInt();

            list.add(new Pair<Integer,Integer>(a,b));

        }
        ArrayList<Integer> list2 = new ArrayList<>();

        for (int i =0; i<n; i++) {
            list2.add(list.get(i).getKey()-list.get(i).getValue());
        }
        int s = 0; int k = 0;
        for (int i =0;i<n;i++) {
            s+= list2.get(i);
            if(s<0) {
                s = 0;
                k = i+1;
            }
        }
        System.out.println(k);


        /*ThreadExampl exampl = new ThreadExampl();
        Thread ex=new Thread(exampl);
        ex.start();
        Thread ex2 = new Thread(exampl);
        ex2.start();*/



        return;
    }
}