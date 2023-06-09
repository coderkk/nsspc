#include <iostream>
#include <string> // for string and to_string()
using namespace std;

int main()
{
	int result = 0;
	std::string input1;
	std::string input2;
	
	std::cin >> input1 >> input2;
	
	int num1 = std::stoi(input1);
	int num2 = std::stoi(input2);
	int tmp;
	
	if (num1 < 0 || to_string(num1) != input1 || num2 < 0 || to_string(num2) != input2) {
		std::cout << "Invalid Input";
		return 0;
	}
	
	if (num1 > num2) {
		tmp = num1;
		num1 = num2;
		num2 = tmp;
	}
	
	for (int n = num1; n <= num2; n++) {
		if ((n % 2) == 0) {
			result += n;
		}
	}
	
	std::cout<<result;
	
	return 0;
}