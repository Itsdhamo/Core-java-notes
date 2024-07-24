package interviewprogram;
import java.util.HashMap;
import java.util.Map;

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
			}
			node = node.children.get(c);
		}
		//System.out.println(node);
		node.isWord = true;
	}}
public class array {
public static void main(String[] args) {
	String[] dictionary = { "van", "zoho", "love", "are", "is" };

	Trie trie = new Trie();
	for (String word : dictionary)
	{
		trie.insert(word);
	}
	System.out.println(trie.root.children);
}
}
