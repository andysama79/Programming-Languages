#include <iostream>
#include <string>
#include <vector>

using namespace std;

class Universal {
public:
    vector<string> wordSubsets(vector<string>& words1, vector<string>& words2) {
        vector<string> words;
        for (auto w1: words1) {
            bool is_universal = true;
            for (auto w2: words2) {
                if (check_subset(w1, w2) == false) {
                    is_universal = false;
                    break;
                }
            }
            if (is_universal) {
                words.push_back(w1);
            }
        }
        return  words;
    }
    bool check_subset(string word1, string word2) {
        bool is_subset = true;
        for (int i = 0; i < word2.length(); i++) {
            if (word1.find(word2[i]) == string::npos) {
                is_subset = false;
                break;
            }
            else {
                word1.replace(i, 1, "*");
            }
        }
        return is_subset;
    }
};