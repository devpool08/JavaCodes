package Z4_Binary_Tree;

import java.util.LinkedList;
import java.util.Queue;

//node ,left ,right;
public class BinTr {
	public static class node{
		int data;
		node left;
		node right;
		node(int data){
			this.data=data;
			this.right=null;
			this.left=null;
			
		}
	}
	public static class Binary_Tree{
		static	int  idx=-1;
		public node build(int nodeA[]){
			idx=idx+1;
			if(nodeA[idx]==-1) {
				return null;
			}
			node N=new node(nodeA[idx]);
			N.left=build(nodeA);
			N.right=build(nodeA);
			return N;
			
		}
		public void preorder(node root) {
			if(root==null) {
				return;
			}System.out.print(root.data+",");
			preorder(root.left);
			preorder(root.right);
		}
		public void Inorder(node root) {
			if(root==null) {
				return;
			}
			preorder(root.left);
			System.out.print(root.data+",");
			preorder(root.right);
		}
		public void Postorder(node root) {
			if(root==null) {
				return;
			}
			preorder(root.left);
			preorder(root.right);
			System.out.print(root.data+",");

		}
		public void BFS(node root) {
			
			//time complexity:O(n);
			if(root==null) {
				return;
			}
			Queue<node> q =new LinkedList<>();
			q.add(root);
			q.add(null);
			while(!q.isEmpty()) {
				node curnode=q.remove();
				if(curnode==null) {
					System.out.println();
					if(q.isEmpty()) {
						break;
					}
					else {
						q.add(null);
					}
				}
				else {
					System.out.print(curnode.data+" ");
					if(curnode.left!=null) {
						q.add(curnode.left);
					}
					if(curnode.right!=null) {
						q.add(curnode.right);
					}
				}
			}
		}
		public  int height(node root) {
			if(root ==null) {
				return 0;
			}else {
				int hr=height(root.right);
				int hl=height(root.left);
				return Math.max(hr, hl)+1;
			}
			
		}
		public int count(node root) {
			if(root==null) {
				return 0;
			}
			else {
				int rh=count(root.right);
				int lf=count(root.left);
				return rh+lf+1;
			}
		}
		public int sum(node root) {
			if(root==null) {
				return 0;
			}
			else {
				int ls=sum(root.left);
				int rs=sum(root.right);
				return ls+rs+root.data;
			}
		}
		public int dimAP1(node root) {//TC=O(n^2)   //calculating diameter by approach 1;;; 
			if(root==null) {
				return 0;
			}
			else {
				int ldim=dimAP1(root.left);
				int rdim=dimAP1(root.right);
				int rh=height(root.left);
				int lh=height(root.right);
				int sd=lh+rh+1;//self diameter that a node include itself 
				return Math.max(Math.max(ldim, rdim),sd);

			}
		}public static class info{
			int dim;
			int ht;
		public info(int dim,int ht){
				this.dim=dim;
				this.ht=ht;
			}
		}
		public info dimAP2(node root) {
			if(root==null) {
				return new info(0,0);
			} 
			 info lft=dimAP2(root.left);
			 info rht=dimAP2(root.right);
			 int dim=Math.max(lft.ht+rht.dim+1,Math.max(lft.dim, rht.dim));
			 int ht=Math.max(lft.ht, rht.ht)+1;
			 return new info(dim,ht);
		}
		public boolean identical(node root,node sub) {
			if(root==null&&sub==null) {
				return true;
			}
			else if(root==null||sub==null||root.data!=sub.data) {
				return false;
			}
			if(!identical(root.left,sub.left)) {
				return false;
			}
			if(!identical(root.right,sub.right)) {
				return false;
			}
			return true;
		}
		public boolean isSubtree(node root,node sub) {
			if(root==null) {
				return false;
			}
			if(root.data==sub.data) {
				return true;
			}
			return isSubtree(root.left,sub)||isSubtree(root.right,sub);
		}

	}

	public static void main(String[] args) {
		int nodeA[]= {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
		Binary_Tree tree= new Binary_Tree();
		node root=tree.build(nodeA);
		System.out.println("1: Root Of The Tree is: "+root.data);
		System.out.println("2: Pre-order Of The Tree is:");
		tree.preorder(root);
		System.out.println();
		System.out.println("3: Post-Order Of The Tree is: ");
		tree.Postorder(root);
		System.out.println();
		System.out.println("4: In-Order Of The Tree is: ");
		tree.Inorder(root);
		System.out.println();
		System.out.println("5: BFS Of The Tree is: ");
		tree.BFS(root);
		System.out.println("6: Height Of the Tree is: "+tree.height(root));
		System.out.println("7: Numbe Of Nodes of the tree is:"+tree.count(root));
		System.out.println("8: Sum Of Node The Tree is :"+tree.sum(root));
		System.out.println("9: Diameter Of The Tree is(By Approach1 TC=O(n^2): "+tree.dimAP1(root));
		System.out.println("10: Diameter Of The Tree is(By Approach2 TC=O(n): "+tree.dimAP2(root).dim);
		//building a sub tree;;
		node sub=new node(2);
		sub.left=new node(4);
		sub.right=new node(5);
		System.out.println("11: is subtree is present in root tree: "+tree.isSubtree(root,sub));

	

	}



}
