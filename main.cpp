#include <iostream>
#include <queue>
#include <stack> 
using namespace std;
int main() 
{
	int n=0;
    cin>>n;
    int arr[n];
    for(int i=0;i<n;i++)
        cin>>arr[i];
    queue<int> Q;
    queue<int> dispQ;
    stack <int> S;  
    stack <int> dispS; 
    int temp=0;
    for(int i=0;i<n;i++)
    {
        int x= arr[i];
        //1st
        if((Q.empty() && S.empty()) || i==0)
            Q.push(x);
        //2 a
        else if(x>=Q.back())
            Q.push(x);
        //2 b
        else if(S.empty() || x<=S.top())
            S.push(x);
        //2 c
        else
        {
            //2 c i
            while(!S.empty())
            {
                int top=S.top();
                //2 c i i
                if(top<Q.front())
                {
                    temp=S.top();
                    S.pop();
                    Q.push(temp);
                }
                else
                {
                    temp=Q.front();
                    Q.pop();
                    Q.push(temp);
                }
            }
            //2 c ii
            while(Q.front()<x)
            {
                temp=Q.front();
                Q.pop();
                Q.push(temp);
            }
            //2 c iii
            temp=Q.front();
            Q.pop();
            S.push(temp);
            //2 c iv
            S.push(x);
            //2 c v
            while(Q.front()>Q.back())
            {
                temp=Q.front();
                Q.pop();
                Q.push(temp);
            }
        }  
        int dupli=0;
        //displaying queue
        while(!Q.empty())
        {
            dupli=Q.front();
            Q.pop();
            cout<<dupli<<" ";
            dispQ.push(dupli);
        }
        //putting elements back
        while(!dispQ.empty())
        {
            dupli=dispQ.front();
            dispQ.pop();
            Q.push(dupli);
        }
        //displaying stack
        cout<<"\n";
        while(!S.empty())
        {
            dupli=S.top();
            S.pop();
            cout<<dupli<<" ";
            dispS.push(dupli);
        }
        while(!dispS.empty())
        {
            dupli=dispS.top();
            dispQ.pop();
            S.push(dupli);
        }
	}
    return 0;
}

        