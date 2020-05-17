class Solution {
public:
	ListNode* oddEvenList(ListNode* head) {
		if (!head) return head;
		ListNode *p = head, *q = head;
		while (q) {
			q = q->next;
			if (!q || !q->next) break;
			ListNode *next_p = p->next, *next_q = q->next;
			q->next = next_q->next;
			p->next = next_q;
			next_q->next = next_p;
			p = p->next;
		}
		return head;
	}
};