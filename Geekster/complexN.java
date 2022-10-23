package Geekster;

import java.util.Scanner;

class ComplexNum {
	 
	int real;
	int img;

	ComplexNum(int real, int img) {
		this.real = real;
		this.img = img;
	}

	public void plus(ComplexNum c2) 
	
		{
			this.real = this.real + c2.real;
			this.img = this.img + c2.img;
		}

	public void print() 
		{
			System.out.println(this.real + " + i" + this.img);
		}

	public void multiply(ComplexNum c2) 
		{
			int r = this.real * c2.real - this.img * c2.img;
			this.img = this.real * c2.img + this.img * c2.real;
			this.real = r;

		}
}

public class complexN {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int real1 = s.nextInt();
		int img1 = s.nextInt();

		int real2 = s.nextInt();
		int img2 = s.nextInt();

		ComplexNum c1 = new ComplexNum(real1, img1);
		ComplexNum c2 = new ComplexNum(real2, img2);

		int choice = s.nextInt();

		if (choice == 1) 				 
			{			
				c1.plus(c2);
				c1.print();
		} else if (choice == 2) 	 
			{
				c1.multiply(c2);
				c1.print();
		} else 
			{
				return;
			}
	}
}