package ZohoInterview;

import java.util.*;

public class IBM {
	public static List<String> findRecentRequests(String[] requests, int k) {
		Deque<String> deque = new LinkedList<>();
		Set<String> seen = new HashSet<>();
		List<String> result = new ArrayList<>();

		for (int i = requests.length - 1; i >= 0; i--) {
			String request = requests[i];

			if (!seen.contains(request)) {
				deque.offerFirst(request);
				seen.add(request);
			}

			if (deque.size() > k) {
				String oldestRequest = deque.pollLast();
				seen.remove(oldestRequest);
			}

			if (deque.size() == k) {
				break;
			}
		}

		while (!deque.isEmpty()) {
			result.add(deque.pollFirst());
		}

		return result;
	}

	public static void main(String[] args) {
		String[] requests = { "hello","hii", "bye", "hii", "bye", "bye"};
		int k = 3;
		List<String> recentRequests = findRecentRequests(requests, k);
		System.out.println(recentRequests);
	}
}
