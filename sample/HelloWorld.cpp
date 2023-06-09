#include <iostream>

int main() 
{
	std::cout<<"Please enter your Science and Math mark";
	int Science;
	int Math;
	std::cin>>Science;
	std::cin>>Math;
	std::cout<<"Total mark: "<<(Science + Math)/2;
	
	return 0;
}