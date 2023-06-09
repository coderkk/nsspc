#include <iostream>
#include <string>
#include <iomanip>
#include <cmath>

using namespace std;

double round_up(float value, int decimal_places) {
    const int multiplier = std::pow(10, decimal_places);
    return std::ceil(value * multiplier) / multiplier;
}

int main()
{
	string input;
	string tempType;
	float tempValue;
	float converted;
	string result;
	
	cin >> input;
	
	tempValue = stoi(input);
	tempType = input.substr(input.length() - 1, 1);
	
	
	if (tempType == "C") {
		converted = round_up((9/5 * tempValue) + 32, 1);
		result = to_string(converted) + "F";
	} else if (tempType == "F") {
		converted = round_up((tempValue - 32) * 5 / 9, 1);
		result = to_string(converted) + "C";
	} else {
		result = "";
	}
	
	cout << fixed << setprecision(1) << result;
	
	return 0;
}