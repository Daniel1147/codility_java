package leetcode.reveal_cards_in_increasing_order;

import java.util.*;

class Solution {
  public int[] deckRevealedIncreasing(int[] deck) {
    Queue<Integer> q = new LinkedList<Integer>();
    Integer card;

    Arrays.sort(deck);

    if (deck.length <= 0)
      return deck;

    q.add(deck[deck.length - 1]);
    for (int i = deck.length - 2; i >= 0; i--) {
      card = q.poll();
      q.add(card);
      q.add(deck[i]);
    }

    for (int i = deck.length - 1; i >= 0; i--) {
      deck[i] = q.poll();
    }

    return deck;
  }
}
