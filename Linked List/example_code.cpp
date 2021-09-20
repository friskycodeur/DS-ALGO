#include<bits/stdc++.h>
using namespace std;

class node{
    public:
    int data;
    node* next;

    node(int val){
        data=val;
        next=NULL;
    }
};

// Inserting at beginning of a linked list
void insertAtHead(node* &head, int val){
    node *n= new node(val);
    n->next = head;
    head=n;
}

// Inserting at end of a linked list
void insertAtTail(node* &head, int val){

    node *n=new node(val);
    if(head==NULL){
        head=n;
        return;
    }
    node *temp = head;
    while(temp->next != NULL){
        temp=temp->next;
    }
    temp->next = n;
}

bool search(node* &head, int key){
    node* temp=head;
    while(temp!=NULL){
        if(temp->data == key){
            return true;
        }
        temp=temp->next;
    }
    return false;
}

// Displaying the linked list on console
void display(node* head){
    node* temp=head;
    while(temp!=NULL){
        cout<<temp->data<<" -> ";
        temp=temp->next;
    }
    cout<<"NULL";
}

int main(){

    node* head = NULL;
    insertAtTail(head,1);
    insertAtTail(head,2);
    insertAtTail(head,3);
    insertAtHead(head,0);
    display(head);
    cout<<"\n"<<search(head,0);

    return 0;
}