package leetcodeQuestions;
import java.util.*;

public class Word_Break_Leetcode {

	public static void main(String[] args) {
		 

	}
	
	class Node {
		Character val;
		HashMap<Character,Node> children = new HashMap<>();
		boolean isTerminal = false;
		
		public Node() {
			
		}
		public Node(Character val, HashMap<Character, Node> children, boolean isTerminal) {
			this.val = val;
			this.children = children;
			this.isTerminal = isTerminal;
		}
	}
	
	public Node root;
	
	public void createRoot() {
		Node nn = new Node('*',new HashMap<>(),false);
		this.root = nn;
	}
	
	public void insertWord(String val, boolean isTerminal) {
		
		Node nn = this.root;
		for(int i = 0; i<val.length(); i++) {
			
			if(nn.children.containsKey(val.charAt(i))){
				nn = nn.children.get(val.charAt(i));
			}
			else {
				Node node = new Node();
			}

		}
		
	}
	
	

}
