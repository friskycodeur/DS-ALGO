#include<bits/stdc++.h>
using namespace std;

class node{
    public:
    int data;
    node* next;
    node* prev;

    node(int val){
        data=val;
        next=NULL;
        prev=NULL;
    }
};


void insertAtHead(node* &head,int val){
    node* n=new node(val);
    n->next = head;
    if(head!=NULL){
        head->prev = n;
    }
    
    head = n;
}

void insertAtTail(node* &head,int val){
    if(head==NULL){
        insertAtHead(head,val);
        return;
    }
    
    node *n= new node(val);
    node* temp=head;

    while(temp->next!=NULL){
        temp=temp->next;
    }
    temp->next = n;
    n->prev=temp;
}

void deleteAtHead(node* &head){
    node* temp=head;
    head=head->next;
    head->prev=NULL;

    delete temp;
}

void deletion(node* &head,int pos){
    node* temp=head;
    if(pos==1){
        deleteAtHead(head);
    }
    int cnt=0;
    while(cnt!=pos && temp!=NULL){
        temp=temp->next;
        cnt++;
    }
    if(temp->next != NULL){
        temp->next->prev = temp->prev;
    }
    temp->prev->next = temp->next;
    delete temp;
}

void display(node* &head){
    node* temp = head;
    while(temp!=NULL){
        cout<<temp->data<<" ";
        temp=temp->next;
    }
    cout<<endl;
}

int main(){
    node* head=NULL;
    insertAtHead(head,2);
    insertAtHead(head,1);
    insertAtTail(head,3);
    insertAtTail(head,4);
    display(head);
    deletion(head,2);
    display(head);
    return 0;
}
