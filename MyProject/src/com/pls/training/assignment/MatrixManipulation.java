package com.pls.training.assignment;

import java.util.Scanner;

public class MatrixManipulation {
	
	int matrix[][] = new int[10][10];
	int row,colm;
	public void acceptArray(Scanner sc)
	{
		int i,j;
		
		System.out.print("Enter No of rows :");		
		row = sc.nextInt();
		System.out.print("Enter No of colms :");
		colm = sc.nextInt();
		
		System.out.println("Enter Elements");
		
		for(i=0;i<row;i++)
		{
			for(j=0;j<colm;j++)
			{
				System.out.print("Matrix["+ i + "]["+j+"] : ");
				matrix[i][j] = sc.nextInt();
			}
		}
	}
	public void displayArray()
	{
		int i,j;
	
		for(i=0;i<row;i++)
		{
			for(j=0;j<colm;j++)
			{
				System.out.print(matrix[i][j]+"\t");
			}
			System.out.print("\n");
		}
	} 
	public void matrixAddition(MatrixManipulation m2)
	{ 
		int sum[][] = new int[10][10];
		int i,j;
		if(this.row == m2.row && this.colm == m2.colm)
		{
			for(i=0;i<this.row;i++)
			{
				for(j=0;j<this.colm;j++)
				{
					sum[i][j] = this.matrix[i][j] + m2.matrix[i][j];
				}
			}
			System.out.print("\nMatrix Addition Is \n");
			for(i=0;i<this.row;i++)
			{
				for(j=0;j<this.colm;j++)
				{
					System.out.print(sum[i][j]+"\t");
				}
				System.out.print("\n");
			}
		}
		else
		{
			System.out.println("Addition is not possible!!!");
		}
	}
	public void matrixMultiplication(MatrixManipulation m2)
	{
		int i,j,k;
		int sum=0;
		int multi[][] = new int[10][10];
		if(this.colm == m2.row)
		{
			for(i=0;i<this.row;i++)
			{
				for(j=0;j<m2.colm;j++)
				{
					for(k=0;k<m2.row;k++)
					{
						sum = sum + this.matrix[i][k]*m2.matrix[k][j];
					}
					multi[i][j] = sum;
					sum=0;
				}
			}
			System.out.print("Matrix Multiplication Is : \n");
			for(i=0;i<this.row;i++)
			{
				for(j=0;j<m2.colm;j++)
				{
					System.out.print(multi[i][j]+"\t");
				}
				System.out.print("\n");
			}
		}
		else
		{
			System.out.println("Multiplication is not possible!!!");
		}
	}
	public void matrixtranspose()
	{
		int trans[][] = new int[10][10];
		int i,j;
		for(i=0;i<row;i++)
		{
			for(j=0;j<colm;j++)
			{
				trans[i][j] = matrix[j][i];
			}
		}
		for(i=0;i<row;i++)
		{
			for(j=0;j<colm;j++)
			{
				System.out.print(trans[i][j]+"\t");
			}
			System.out.print("\n");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Matrix Manipulation");
		MatrixManipulation m1 = new MatrixManipulation();
		MatrixManipulation m2 = new MatrixManipulation();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Matrix A");
		m1.acceptArray(sc);
		System.out.println("\nMatrix A");
		m1.displayArray();
		
		System.out.println("\nMatrix B");
		m2.acceptArray(sc);
		System.out.println("\nMatrix B");
		m2.displayArray();
		
		m1.matrixAddition(m2);
		
		m1.matrixMultiplication(m2);
		
		System.out.print("Matrix A Transpose \n");
		m1.matrixtranspose();
		
		System.out.print("Matrix B Transpose \n");
		m2.matrixtranspose();
		sc.close();
	}
}
