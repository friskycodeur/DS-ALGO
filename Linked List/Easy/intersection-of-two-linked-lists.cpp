//https://leetcode.com/problems/intersection-of-two-linked-lists/

/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode(int x) : val(x), next(NULL) {}
 * };
 */
class Solution {
public:
    ListNode *getIntersectionNode(ListNode *headA, ListNode *headB) {
        ListNode* temp1=headA;
        ListNode* temp2=headB;
        int l1=0,l2=0;
        while(temp1!=NULL || temp2!=NULL){
            if(temp1!=NULL){
                l1++;
                temp1=temp1->next;
            }
            if(temp2!=NULL){
                l2++;
                temp2=temp2->next;
            }
        }
        temp1=headA;
        temp2=headB;
        int diff = l1>l2? l1-l2:l2-l1;
        while(diff>0){
            if(l1>l2){
                temp1=temp1->next;
            }
            if(l1<l2){
                temp2=temp2->next;
            }
            diff--;
        }
        while(temp1!=NULL || temp2!=NULL){
            if(temp1 == temp2){
                return temp1;
            }
            temp1=temp1->next;
            temp2=temp2->next;
        }
        return NULL;
    }
};