#include<iostream>

using namespace std;

int main(){
    int rows = 4;
    int cols = 5;
    int i, j;
    int matrix[rows][cols] = {{1, 3, 6, 10, 14},
                              {2, 5, 9, 13, 17},
                              {4, 8, 12, 16, 19},
                              {7, 11, 15, 18, 20}};
    for(int k = 0; k <= rows-1; k++){
        i = k;
        j = 0;
        while(i >= 0){
            cout<<matrix[i][j]<<" ";
            i = i - 1;
            j = j + 1;
        }
    }
    for(int k = 1; k <= cols - 1; k++){
        i = rows - 1;
        j = k;
        while(j <= cols-1){
            cout<<matrix[i][j]<<" ";
            i = i - 1;
            j = j + 1;
        }
    }
    return 0;
}