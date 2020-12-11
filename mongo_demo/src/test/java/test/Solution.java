package test;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class ListNode{
    int val;
    ListNode next;
    ListNode(int x){
        val=x;
    }

}
class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x){
        val=x;
    }
}
    /*
     * 使用队列来是实现层序遍历
     */




//单链表翻转
public class Solution {
   public  ListNode ReverseList(ListNode head) {
       ListNode pre=null;
       ListNode curr=head;
       while (curr!=null){
           ListNode temp=curr.next;
           curr.next=pre;
           pre=curr;
           curr=temp;
       }
       return pre;
    }
    //二叉树层序遍历
    public ArrayList<ArrayList<Integer>> levelOrder1(TreeNode root) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        if (root == null)
            return res;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            ArrayList<Integer> level = new ArrayList<>();
            int levelNum = queue.size();
            for (int i = 0; i < levelNum; i++) {
                if (queue.peek().left != null)
                    queue.offer(queue.peek().left);
                if (queue.peek().right != null)
                    queue.offer(queue.peek().right);
                level.add(queue.poll().val);
            }
            res.add(level);
        }
        return res;
    }

    public static void main(String[] args) {

    }
}



