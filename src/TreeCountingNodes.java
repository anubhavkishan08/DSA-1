class TreeNode{
    TreeNode left; TreeNode right;
    int data;
    TreeNode(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
}

public class TreeCountingNodes {
    static int count=0,cnt_leaves=0, sum=0;
    public static void main(String[] args){
        TreeNode root=new TreeNode(5);
        TreeNode root1=new TreeNode(10);
        TreeNode root2=new TreeNode(7);
        TreeNode root3=new TreeNode(9);
        TreeNode root4=new TreeNode(11);
        TreeNode root5=new TreeNode(60);
        root.left=root1;root.right=root2;root2.left=root3;root2.right=root4;root3.right=root5;

        //countNode(root);
        //System.out.println(count);
       // System.out.println(CountNodes(root));
        //System.out.println(CountLeaves(root));
        //countLeaves(root);
     ///   System.out.println(cnt_leaves);
     //   sumofleftleaves(root);
       // System.out.println(sum);
        int l=0,ans=Integer.MAX_VALUE;
        minht(root,l,ans);
        System.out.println(ans);
    }
    static void minht(TreeNode root,int l,int ans){
        if(root==null) return;
        if(root.left==null && root.right==null){
            ans=Math.min(ans,l);
         //   return;
        }
        minht(root.left,l+1,ans);
        minht(root.right,l+1,ans);
       // System.out.println(ans);
    }
     static void sumofleftleaves(TreeNode root){
        if(root==null) return;
        if(root.left!=null && root.left.left==null && root.left.right==null){
            //    System.out.println(root.left.val);
            sum=sum+root.left.data;
            //System.out.println(sum);
        }
        sumofleftleaves(root.left);
        sumofleftleaves(root.right);
        //  return sum;
    }
    static void countNode(TreeNode root){
        if(root==null) return;
        count=count+1;
        countNode(root.left);
        countNode(root.right);
    }

    static int CountNodes(TreeNode root){
        if(root==null) return 0;
        return 1+CountNodes(root.left)+CountNodes(root.right);
    }
    static int CountLeaves(TreeNode root){
        if(root==null) return 0;
        if(root.left==null && root.right==null) return 1;
        return CountLeaves(root.left)+CountLeaves(root.right);
    }
    static void countLeaves(TreeNode root){
        if(root==null) return;
        if(root.left==null && root.right==null)
            cnt_leaves++;
        countLeaves(root.left);
        countLeaves(root.right);
    }
}
