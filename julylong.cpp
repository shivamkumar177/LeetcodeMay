#include<bits/stdc++.h>
using namespace std;

int main()
{
    long long int t;
    cin>>t;
    while(t--)
    {
        long long int n,k;
        cin>>n>>k;
        long long int arr[n];
        for(int i=0;i<n;i++)
            cin>>arr[i];
        for(int i=0; i<n;i++)
        {
            if(arr[i]%k==0)
                cout<<'1';
            else{
                cout<<'0';
            }

        }
        cout<<"\n";
    }

}
