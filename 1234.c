#include <stdio.h>
#include <string.h>
#include <stdlib.h>

// second code function
struct Book
{
    char title[100];
};

void insertionSort(struct Book arr[], int n)
{
    for (int i = 1; i < n; i++)
    {
        struct Book key = arr[i];
        int j = i - 1;
        while (j >= 0 && strcmp(arr[j].title, key.title) > 0)
        {
            arr[j + 1] = arr[j];
            j--;
        }
        arr[j + 1] = key;
    }
}

// third code function
void heapify(int arr[], int n, int i)
{
    int largest = i;
    int left = 2 * i + 1;
    int right = 2 * i + 2;

    if (left < n && arr[left] > arr[largest])
        largest = left;

    if (right < n && arr[right] > arr[largest])
        largest = right;

    if (largest != i)
    {
        // Swap elements
        int temp = arr[i];
        arr[i] = arr[largest];
        arr[largest] = temp;

        heapify(arr, n, largest);
    }
}

void heapSort(int arr[], int n)
{
    for (int i = n / 2 - 1; i >= 0; i--)
        heapify(arr, n, i);

    int steps = 0;
    for (int i = n - 1; i > 0; i--)
    {
        // Swap current root with end element
        int temp = arr[0];
        arr[0] = arr[i];
        arr[i] = temp;
        steps++;

        // Call max heapify on the reduced heap
        heapify(arr, i, 0);
    }

    printf("The number of steps is %d\n", steps);
}

// fourth code function

typedef struct
{
    int price;
    int score;
} Ticket;

void merge(Ticket arr[], int l, int m, int r)
{
    int n1 = m - l + 1;
    int n2 = r - m;

    Ticket L[n1], R[n2];

    for (int i = 0; i < n1; i++)
        L[i] = arr[l + i];
    for (int j = 0; j < n2; j++)
        R[j] = arr[m + 1 + j];

    int i = 0, j = 0, k = l;

    while (i < n1 && j < n2)
    {
        if (L[i].price <= R[j].price)
        {
            arr[k] = L[i];
            i++;
        }
        else
        {
            arr[k] = R[j];
            j++;
        }
        k++;
    }

    while (i < n1)
    {
        arr[k] = L[i];
        i++;
        k++;
    }

    while (j < n2)
    {
        arr[k] = R[j];
        j++;
        k++;
    }
}

void mergeSort(Ticket arr[], int l, int r)
{
    if (l < r)
    {
        int m = l + (r - l) / 2;

        mergeSort(arr, l, m);
        mergeSort(arr, m + 1, r);

        merge(arr, l, m, r);
    }
}

int main()
{
    printf("1.QUESTION\n");
    int N;
    printf("Enter the size of the array: ");
    scanf("%d", &N);

    int A[N];
    printf("Enter %d space-separated integers: ", N);
    for (int i = 0; i < N; i++)
    {
        scanf("%d", &A[i]);
    }

    int swaps = 0;
    for (int i = 0; i < N - 1; i++)
    {
        for (int j = 0; j < N - i - 1; j++)
        {
            if (A[j] > A[j + 1])
            {
                // Swap elements
                int temp = A[j];
                A[j] = A[j + 1];
                A[j + 1] = temp;
                swaps++;
            }
        }
    }

    printf("Number of swaps required: %d\n", swaps);

    printf("2.QUESTION\n");

    int n;
    printf("Enter the number of books: ");
    scanf("%d", &n);

    struct Book books[n];
    for (int i = 0; i < n; i++)
    {
        printf("Enter title of book %d: ", i + 1);
        scanf("%s", books[i].title);
    }

    insertionSort(books, n);

    printf("\nSorted books:\n");
    for (int i = 0; i < n; i++)
    {
        printf("%s\n", books[i].title);
    }

    printf("3.QUESTION\n");

    int X;
    printf("Enter the number of boys: ");
    scanf("%d", &X);

    int apples[X];
    printf("Enter the number of apples for each boy: ");
    for (int i = 0; i < X; i++)
    {
        scanf("%d", &apples[i]);
    }

    heapSort(apples, X);

    printf("4.QUESTION\n");

    int Y, Q;
    printf("Enter the number of lottery tickets and number of queries: ");
    scanf("%d %d", &Y, &Q);

    Ticket tickets[Y];

    printf("Enter the price of each lottery ticket: ");
    for (int i = 0; i < Y; i++)
    {
        scanf("%d", &tickets[i].price);
    }

    printf("Enter the score of each lottery ticket: ");
    for (int i = 0; i < Y; i++)
    {
        scanf("%d", &tickets[i].score);
    }

    mergeSort(tickets, 0, Y - 1);

    while (Q--)
    {
        int K;
        printf("Enter the number of tickets to purchase: ");
        scanf("%d", &K);

        long long totalMoney = 0;

        for (int i = Y - 1; i >= Y - K; i--)
        {
            totalMoney += tickets[i].price;
        }

        printf("Money required: %lld\n", totalMoney);
    }

        return 0;
}