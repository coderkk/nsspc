#include <iostream>

int main() 
{
	int c1, c2, c3;
	int i1, i2, i3;
	int item1, item2, item3;
	int totalC1, totalC2, totalC3;
	int noOfItems;
	
	std::cin >> c1 >> c2 >> c3;
	std::cin >> i1 >> i2 >> i3;
	
	item1 = c1 % i1;
	item2 = c2 % i2;
	item3 = c3 % i3;
	
	noOfItems = 9999;
	noOfItems = (item1 < item2) ? item1 : item2;
	if (item3 < noOfItems) noOfItems = item3;
	
	totalC1 = i1 * noOfItems;
	totalC2 = i2 * noOfItems;
	totalC3 = i3 * noOfItems;

	std::cout<<totalC1<<totalC2<<totalC3;
	std::cout<<c1 - totalC1<<c2 - totalC2<<c3 - totalC3;
	
	return 0;
}
