#include<bits/stdc++.h>
using namespace std;

struct node{
    int data;
    struct node *left;
    struct node *right;

    node(int val){
        data=val;
        left=right=NULL;
    }
};

void preorder(struct node* node){
    // root -> left -> right
    if(node == NULL) return;
    
    cout<< node->data << " ";
    preorder(node->left);
    preorder(node->right);
}

void postorder(struct node* node){
    // left -> right -> root
    if(node == NULL) return;
    
    postorder(node->left);
    postorder(node->right);
    cout<< node->data << " ";
}

void inorder(struct node* node){
    // left -> root -> right
    if(node == NULL) return;
    
    inorder(node->left);
    cout<< node->data << " ";
    inorder(node->right);
}

vector<vector<int>> levelOrder(struct node* node){
    vector<vector<int>> ans;
    if(node==NULL) return ans;
    queue<struct node*> q;
    q.push(node);
    while(!q.empty()){
        int size=q.size();
        vector<int> level;
        for(int i=0;i<size;i++){
            struct node* temp = q.front();
            q.pop();
            if(temp->left != NULL) q.push(temp->left);
            if(temp->right != NULL) q.push(temp->right);
            level.push_back(temp->data);
        }
        ans.push_back(level);
    }
    return ans;
}


int main(){
    struct node* root=new node(1);
    root->left = new node(2);
    root->right = new node(3);
    root->left->left = new node(4);
    root->left->right = new node(5);
    root->right->left = new node(6);
    root->right->right = new node(7);
    cout << "\nPreorder traversal of binary tree is \n";
    preorder(root);
    cout << "\nPostorder traversal of binary tree is \n";
    postorder(root);
    cout << "\nInorder traversal of binary tree is \n";
    inorder(root);
    return 0;
}