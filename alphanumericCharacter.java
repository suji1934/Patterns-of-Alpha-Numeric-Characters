package coreJava;

import java.util.Scanner;

public class alphanumericCharacter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Name: ");
		String s = sc.nextLine();
		s = s.toUpperCase();
		int n = 7;
		for (int i = 0; i < n; i++){
			System.out.println(" ");
			for(int k = 0; k < s.length(); k++) {
				char c = s.charAt(k);
			//A
			if(c == 'A') {
			for (int j = 0; j < n; j++) {
				if(i == 0 && j != 0 && j != n-1 || i > 0 && i < n && j == 0 || i > 0 && i < n && j == n-1 || i == n-4 && j < n)
					System.out.print("*");
				else
					System.out.print(" ");
			}System.out.print("  ");}
			//B
			if(c == 'B') {
			for (int j = 0; j < n; j++) {
				if(i == 0 && j != 0 && j != n-1 || i < n && j == 0 || i > 0 && i < n-1 && j == n-1 || i == n-4 && j<n || i == n-1 && j != 0 && j != n-1)
					System.out.print("*");
				else
					System.out.print(" ");
			}System.out.print("  ");}
			//C
			if(c == 'C') {
			for (int j = 0; j < n; j++) {
				if(i == 0 && j != 0 && j != n-1 || i > 0 && i < n-1 && j == 0 ||  i == n-1 && j != 0 && j != n-1)
					System.out.print("*");
				else
					System.out.print(" ");
			}System.out.print("  ");}
			//D
			if(c == 'D') {
			for (int j = 0; j < n; j++) {
				if(i < n && j == 0 || i == 0 && j <= 3 || i == 1 && j == 4 || i > 1 && i < 5 && j == 5 || i == 5 && j == 4 || i == n-1 && j <= 3)
					System.out.print("*");
				else
					System.out.print(" ");
			}System.out.print("  ");}
			//E
			if(c== 'E') {
			for (int j = 0; j < n; j++) {
				if(i < n && j == 0 || i == 0 && j < n || i == n/2 && j <= n/2 || i == n-1 && j< n)
					System.out.print("*");
				else
					System.out.print(" ");
			}System.out.print("  ");}
			//F
			if(c == 'F') {
			for (int j = 0; j < n; j++) {
				if(i < n && j == 0 || i == 0 && j < n || i == n/2 && j <= n/2)
					System.out.print("*");
				else
					System.out.print(" ");
			}System.out.print("  ");}
			//G
			if(c == 'G') {
			for (int j = 0; j < n; j++) {
				if(i == 0 && j != 0 && j != n-1 || i > 0 && i < n-1 && j == 0 || i == n-1 && j != 0 && j != n-1 || i < n-1 && i > n/2 && j == n-1 || i == n/2 && j > 2)
					System.out.print("*");
				else
					System.out.print(" ");
			}System.out.print("  ");}
			//H
			if(c == 'H') {
			for (int j = 0; j < n; j++) {
				if(i < n && j == 0 || i < n && j == n-1 || i == n/2 && j <= n)
					System.out.print("*");
				else
					System.out.print(" ");
			}System.out.print("  ");}
			//I
			if(c == 'I') {
			for(int j = 0; j < n; j++) {
				if(i == 0 || i == n-1 && j < n || i < n && j == 3)
					System.out.print("*");
				else
					System.out.print(" ");
			}System.out.print("  ");}
			//J
			if(c == 'J') {
			for (int j = 0; j < n; j++) {
				if (i==0 || i < n-1 && j == 3 || i == n-1 && j != 0 && j <= 2 || i == 5 && j == 0) 
					System.out.print("*");
				else
					System.out.print(" ");
			}System.out.print("  ");}
			//K
			if(c == 'K') {
			for (int j = 0; j < n; j++) {
				if(i < n && j == 0 || i == 3 && j <= 2  || i == 2 && j == 3 || i == 4 && j == 3 || i == 1 && j == 4 || i == 5 && j == 4 || i == 0 && j == 5 || i == 6 && j == 5 )
					System.out.print("*");
				else
					System.out.print(" ");
			}System.out.print("  ");}
			//L
			if(c == 'L') {
			for (int j = 0; j < n; j++) {
				if (i < n && j == 0|| i == n-1 && j < n) 
					System.out.print("*");
				else
					System.out.print(" ");
			}System.out.print("  ");}
			//M
			if(c == 'M') {
			for (int j = 0; j < n+4; j++) {
				if (i < n && j == 0 || i < n && j == (n+4)-1 || i == 3 && j == 5 || i == 2 && j == 3 || i == 2 && j == 7 || i == 1 && j == 2 || i == 1 && j == 8) 
					System.out.print("*");
				else
					System.out.print(" ");
			}System.out.print("  ");}
			//N
			if(c == 'N') {
			for (int j = 0; j < n; j++) {
				if (i < n && j == 0 || i < n && j == n-1 || i == n/2 && j == n/2 || i == 1 && j == 1 || i == 2 && j == 2 || i == 4 && j == 4 || i == 5 && j == 5) 
					System.out.print("*");
				else
					System.out.print(" ");
			}System.out.print("  ");}
			//O
			if(c == 'O') {
			for (int j = 0; j < n; j++) {
				if(i == 0 && j != 0 && j != n-1 || i > 0 && i < n-1 && j == 0 || i > 0 && i < n-1 && j == n-1 || i == n-1 && j != 0 && j != n-1)
					System.out.print("*");
				else
					System.out.print(" ");
			}System.out.print("  ");}
			//P
			if(c == 'P') {
			for (int j = 0; j < n; j++) {
				if(i == 0 && j < n-1 || i < n && j == 0 || i == 1 && j == n-1 || i == 2 && j == n-1 || i == n/2 && j < n-1)
					System.out.print("*");
				else
					System.out.print(" ");
			}System.out.print("  ");}
			//Q
			if(c == 'Q') {
			for (int j = 0; j < n; j++) {
				if(i < n-2 && i != 0 && j == 0 || i < n-2 && i != 0 && j == n-2 || i == 0 && j < n-2 && j != 0 || i == n-2 && j < n-1 && j != 0 || i == 3 && j == 3 || i == 4 && j == 4 || i == 6 && j == 6)
					System.out.print("*");
				else
					System.out.print(" ");
			}System.out.print("  ");}
			//R
			if(c == 'R') {
			for (int j = 0; j < n; j++) {
				if(i == 0 && j < n-1 || i < n && j == 0 || i == 1 && j == n-1 || i == 2 && j == n-1 || i == n/2 && j < n-1 || i == 4 && j == 3 || i == 5 && j == 4 || i == 6 && j == 5 )
					System.out.print("*");
				else
					System.out.print(" ");
			}System.out.print("  ");}
			//S
			if(c == 'S') {
			for (int j = 0; j < n; j++) {
				if (i == 0 && j != 0 || i != 0 && i <= 2 && j == 0 || i == 3 && j != 0 && j < n && j != n-1 || i > 3 && i != n-1 && j == n-1 || i == n-1 && j < n && j != n-1)
					System.out.print("*");
				else
					System.out.print(" ");
			}System.out.print("  ");}
			//T
			if(c == 'T') {
			for(int j = 0; j < n; j++) {
				if(i == 0 && j < n || i < n && j == 3)
					System.out.print("*");
				else
					System.out.print(" ");
			}System.out.print("  ");}
			//U
			if(c == 'U') {
			for (int j = 0; j < n; j++) {
				if ((j == 0 || j == n-1) && i < n-1 || i == n-1 && j > 0 && j < n-1) 
					System.out.print("*");
				else
					System.out.print(" ");
			}System.out.print("  ");}
			//V
			if(c == 'V') {
			for (int j = 0; j < n; j++) {
				if (i < 4 && j == 0 || i < 4 && j == n-1 || i == 4 && j == 1 || i == 4 && j == n-2 || i == 5 && j == 2 || i == 5 && j == n-3 || i == n-1 && j == n/2) 
					System.out.print("*");
				else
					System.out.print(" ");
			}System.out.print("  ");}
			//W
			if(c == 'W') {
			for (int j = 0; j < n+4; j++) {
				if (i < n && j == 0 || i < n && j == (n+4)-1 ||  i == 3 && j == 5 || i == 4 && j == 3 || i == 5 && j == 8 || i == 5 && j == 2 || i == 4 && j == n) 
					System.out.print("*");
				else
					System.out.print(" ");
			}System.out.print("  ");}
			//X
			if(c == 'X') {
			for (int j = 0; j < n; j++) {
				if (i < n && j == i || i < n && j == n-1-i) 
					System.out.print("*");
				else
					System.out.print(" ");
			}System.out.print("  ");}
			//Y
			if(c == 'Y') {
			for (int j = 0; j < n; j++) {
				if (i < 3 && j == i || i < n && j == n-i-1) 
					System.out.print("*");
				else
					System.out.print(" ");
			}System.out.print("  ");}
			//Z
			if(c == 'Z') {
			for (int j = 0; j < n; j++) {
				if (i == 0 && j < n || i == n-1 && j < n || i < n && j == n-i-1) 
					System.out.print("*");
				else
					System.out.print(" ");
			}System.out.print("  ");}
			//1
			if(c == '1') {
				for (int j = 0; j < n; j++) {
					if (i < n && j == n/2 || i == n-1 && j < n || i == 2 && j == 0 || i == 1 && j == 1 ) 
						System.out.print("*");
					else
						System.out.print(" ");
				}System.out.print("  ");}
			//2
			if(c == '2') {
				for (int j = 0; j < n; j++) {
					if (i == 0 && j < n || i > 0 && i < 4 && j == n-1 || i == n/2 && j < n || i > n/2 && j == 0 || i == n-1 && j < n) 
						System.out.print("*");
					else
						System.out.print(" ");
				}System.out.print("  ");}
			//3
			if(c == '3') {
				for (int j = 0; j < n; j++) {
					if (i == 0 && j < n || i > 0 && i < 4 && j == n-1 || i == n/2 && j < n || i > n/2 && j == n-1 || i == n-1 && j < n) 
						System.out.print("*");
					else
						System.out.print(" ");
				}System.out.print("  ");}
			//4
			if(c == '4') {
				for (int j = 0; j < n; j++) {
					if (i <= n/2 && j == 0 || i < n && j == n-1 || i == n/2 && j < n) 
						System.out.print("*");
					else
						System.out.print(" ");
				}System.out.print("  ");}
			//5
			if(c == '5') {
				for (int j = 0; j < n; j++) {
					if (i == 0 && j <= n || i <= 2 && j == 0 || i == 3 && j < n && j != n-1 || i > n/2 && i != n-1 && j == n-1 || i == n-1 && j < n && j != n-1)
						System.out.print("*");
					else
						System.out.print(" ");
				}System.out.print("  ");}
			//6
			if(c == '6') {
				for (int j = 0; j < n; j++) {
					if (i == 0 && j <= n || i < n && j == 0 || i == 3 && j <= n || i > n/2 && j == n-1 || i == n-1 && j <= n)
						System.out.print("*");
					else
						System.out.print(" ");
				}System.out.print("  ");}
			//7
			if(c == '7') {
				for (int j = 0; j < n; j++) {
					if (i == 0 && j < n || i < n && j == n-i-1) 
						System.out.print("*");
					else
						System.out.print(" ");
				}System.out.print("  ");}
			//8
			if(c == '8') {
				for (int j = 0; j < n; j++) {
					if(i == 0 && j != 0 && j != n-1 || i > 0 && i != n/2 && i < n-1 && j == 0 || i > 0 && i != n/2 && i < n-1 && j == n-1 || i == n/2 && j != 0 &&j < n-1 || i == n-1 && j != 0 && j != n-1)
						System.out.print("*");
					else
						System.out.print(" ");
				}System.out.print("  ");}
			//9
			if(c == '9') {
				for (int j = 0; j < n; j++) {
					if(i == 0 && j != 0 && j != n-1 || i < n/2 && j == 0 || i < n-1 && j == n-1 || i == n-4 && j<n || i == n-1 && j < n)
						System.out.print("*");
					else
						System.out.print(" ");
				}System.out.print("  ");}
			//0
			if(c == '0') {
				for (int j = 0; j < n; j++) {
					if(i == 0 && j < n || i < n && j == 0 || i > 0 && i < n-1 && j == n-1 || i == n-1 && j < n)
						System.out.print("*");
					else
						System.out.print(" ");
				}System.out.print("  ");}
			//^
			if(c == '^') {
			for (int j = 0; j < n; j++) {
				if (i != 0 && i < 3 && j == 0 || i == 0 && j != 0 && j != 3 && j != n-1 || i != 0 && i < 3 && j == n-1 || i == 1 && j == 3 || i == 4 && j == 3 || i == 3 && j == 1 || i == 3 && j == 5) 
					System.out.print("*");
				else
					System.out.print(" ");
			}System.out.print("  ");}
			//-
			if(c == '-') {
				for (int j = 0; j < n; j++) {
					if(i == n/2 && j < n)
						System.out.print("*");
					else
						System.out.print(" ");
				}System.out.print("  ");}
			//_
			if(c == '_') {
				for (int j = 0; j < n; j++) {
					if(i == n-1 && j < n)
						System.out.print("*");
					else
						System.out.print(" ");
				}System.out.print("  ");}
			//' '
			if(c == ' ') {
				System.out.print("	");}
			}
		
		}
	}
}

