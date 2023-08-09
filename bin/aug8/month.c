#include <stdio.h>
int main()
{
    int num;
    printf("Enter the month Number to display the Month Name: ");
    scanf("%d", &num);
    switch (num)
    {
    case 1:
        printf("This month is January");
        break;
    case 2:
        printf("This month is February");
        break;
    case 3:
        printf("This month is March");
        break;
    case 4:
        printf("This month is April");
        break;
    case 5:
        printf("This month is May");
        break;
    case 6:
        printf("This month is June");
        break;
    case 7:
        printf("This month is July");
        break;
    case 8:
        printf("This month is August");
        break;
    case 9:
        printf("This month is September");
        break;
    case 10:
        printf("This month is October");
        break;
    case 11:
        printf("This month is November");
        break;
    case 12:
        printf("This month is December");
        break;
    default:
        printf("invalid month number!!");
        break;
    }
    return 0;
}
