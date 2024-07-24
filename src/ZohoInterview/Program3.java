package ZohoInterview;

import java.util.*;

class TrieNode
{
	Map<Character, TrieNode> children = new HashMap<>();
	boolean isWord = false;
}

class Trie {
	TrieNode root = new TrieNode();

	public void insert(String word) 
	{
		
		TrieNode node = root;
		for (char c : word.toCharArray()) 
		{
			if (!node.children.containsKey(c)) 
			{
				node.children.put(c, new TrieNode());
				System.out.println(node.children);
			}
			node = node.children.get(c);
		}
		node.isWord = true;
	}

	public boolean search(String word) {
		TrieNode node = root;
		for (char c : word.toCharArray()) {
			if (!node.children.containsKey(c)) {
				return false;
			}
			node = node.children.get(c);
		}
		return node.isWord;
	}
}
public class Program3 {
	static int ROWS, COLS;

	public static void searchWords(char[][] grid, Trie trie) {  
		for (int i = 0; i < ROWS; i++) {
			for (int j = 0; j < COLS; j++) {
				StringBuilder sb = new StringBuilder();
				sb.append(grid[i][j]);
				search(grid, trie, i, j, sb);
			}
		}
	}
	public static void search(char[][] grid, Trie trie, int row, int col, StringBuilder sb) {
		if (trie.search(sb.toString())) {
			System.out.println(sb);
		}
		// Move right
		if (col < COLS - 1){
			sb.append(grid[row][col + 1]);
			search(grid, trie, row, col + 1, sb);
			sb.deleteCharAt(sb.length() - 1);
		}
		// Move down
		if (row < ROWS - 1) {
			sb.append(grid[row + 1][col]);
			search(grid, trie, row + 1, col, sb);
			sb.deleteCharAt(sb.length() - 1);
		}
	}
	public static void main(String[] args) {
		char[][] grid = { { 'd', 'z', 'o', 'l' }, 
				          { 'h', 'x', 'h', 'o' }, 
				          { 'a', 'y', 'i', 'v' },
				          { 'm', 'o', 's', 'e' } };

		String[] dictionary = { "dhamo", "zoho", "love", "are", "is" };

		ROWS = grid.length;
		COLS = grid[0].length;

		Trie trie = new Trie();
		for (String word : dictionary)
		{
			trie.insert(word);
		}
		//System.out.println(trie.root.children);
		searchWords(grid, trie);
	}
}