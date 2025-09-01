#include <iostream>
using namespace std;
int main()
{
    // cout << "Happy\n";
    // cout << "Happy\n";
    // cout << "Happy\n";
    // cout << "Happy\n";
    // cout << "Happy\n";

    // // ===========
    // for (int i = 1; i <= 5; i++)
    // {
    //     cout << "Happy\n";
    // }

    // ==== NATURAL NUMBER ====
    // int n;
    // cin >> n;
    // for (int count = 1; count <= n; count++)
    // {
    //     cout << count << endl;
    // }

    // =====Square====
    // int n;
    // cin >> n;
    // for (int i = 1; i <= n; i++)
    // {
    //     cout << i * i << endl;
    // }

    // // ===Taking input from the user=====
    // int n;
    // cout << "Enter the Natural Number :";
    // cin >> n;
    // for (int i = 1; i <= n; i++)
    // {
    //     cout << i << " Square is :" << i * i << endl;
    // }

    // // === PRINT ALL EVEN NUMBER 1 to 20=====
    // int num;
    // cout << "Enter the number: ";
    // cin >> num;

    // for (int i = 2; i <= num; i = i + 2) // increment by 2
    // {
    //     cout << i << endl;
    // }

    // int num;
    // cout << "Enter the number: ";
    // cin >> num;

    // for (int i = 1; i <= num; i++) // increment by 2
    // {
    //     if (i % 2 == 0)
    //     {
    //         cout << i << " ";
    //     }
    //     else
    //     {
    //     }
    // }

    int num;
    cout << "Enter the number: ";
    cin >> num;
    for (int i = 1; i <= num; i++) // increment by 2
    {
        if (i % 2 == 1)
        {
            cout << i << " ";
        }
        else
        {
        }
    }

    return 0;
}