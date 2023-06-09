#include <iostream>
#include <string>
#include <iomanip>
#include <cmath>

using namespace std;

int main()
{
	string input;
	string ch;
	int value;
	int result = 0;

	std::getline(std::cin, input);
	int inputLength = input.length();

	if (inputLength > 100)
	{
		cout << "Invalid Length" << endl;
	}
	else
	{
		for (int i = 0; i < inputLength; i++)
		{
			ch = std::toupper(input[i]);
			if (ch == "B")
				value = 2;
			else if (ch == "C")
				value = 3;
			else if (ch == "E")
				value = 5;
			else if (ch == "G")
				value = 7;
			else if (ch == "K")
				value = 11;
			else if (ch == "M")
				value = 13;
			else if (ch == "Q")
				value = 17;
			else if (ch == "S")
				value = 19;
			else if (ch == "W")
				value = 23;
			else
				value = 0;

			result += value;
		}

		cout << result;
	}

	return 0;
}