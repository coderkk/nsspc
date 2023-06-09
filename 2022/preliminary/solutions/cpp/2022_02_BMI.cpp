#include <iostream>
#include <string> // for string and to_string()
#include <iomanip>

using namespace std;

int main()
{
	float BMI = 0;
	int kg;
	float m;
	string result;
	
	cin >> kg >> m;
	
	BMI = kg / (m * m);
	if (BMI < 20) {
		result = "Underweight";
	} else if (BMI < 25) {
		result = "Healthy Weight";
	} else if (BMI < 30) {
		result = "Overweight";
	} else {
		result = "Obesity";
	} 
	
	std::cout << std::fixed << std::setprecision(2) << BMI << endl;
	std::cout << result;
	
	return 0;
}