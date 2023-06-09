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
	int n;
	int tempValue;
	string input;
	float result;
	
	cin >> n;
	
	for (int i = 0; i < n; i++) {
		cin >> input;
		tempValue = stoi(input);

		result = (2800 * (tempValue + 273.15)) / (99 + 273.15);
		
		cout << fixed << setprecision(7) << result;
	}
	
	return 0;
}