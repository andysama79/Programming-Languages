#include <iostream>
#include <stack>
#include <vector>

using namespace std;

class Node {
    public:
    int data;
    Node *left, *right;
    Node(int data) {
        this->data = data;
        left = right = NULL;
    }
};

class Tree {
    public:
    Node *root;
    Tree() {
        root = NULL;
    }
    vector<int> inOrder(Node* root)
    {
        vector<int> seq;
        stack<Node*> node;
        Node* curr = root;
        node.push(curr);
        
        while (!node.empty() and curr != NULL) {
            if (curr != NULL) {
                curr = curr->left;
                node.push(curr);
            }
            
            else {
                seq.push_back(node.top()->data);
                curr = curr->right;
                node.pop(); 
            }
        }
        return seq;
    }
};

int main() {
    Tree tree;
    tree.root = new Node(1);
    tree.root->left = new Node(2);
    tree.root->right = new Node(3);
    tree.root->left->left = new Node(4);
    tree.root->left->right = new Node(5);

    vector<int> inOrder = tree.inOrder(tree.root);
    for (int i = 0; i < inOrder.size(); i++) {
        cout << inOrder[i] << " ";
    }
}
