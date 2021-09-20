// Question -> https://leetcode.com/problems/convert-binary-number-in-a-linked-list-to-integer/

/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    int getDecimalValue(ListNode* head) {
        int x=0,num=0;
        if(head==NULL){
            return 0;
        }
        ListNode* temp=head;
        while(temp!=NULL){
            temp=temp->next;
            x++;
        }
        x--;
        temp=head;
        while(temp!=NULL){
            num+=(temp->val)*pow(2,x);
            x--;
            temp=temp->next;
        }
        return num;
    }
};