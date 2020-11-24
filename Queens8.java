package ai.lab.project;

import java.util.*;

public class Queens8 {
    public static void main(String argv[])
    {
    	Scanner in = new Scanner(System.in);
    	System.out.println("Choose Option : \n1.8 Queens Problem with Backtracking\n2.8 Queens Problem without Backtracking");
    	int a = in.nextInt();
    	if(a==1)
    	{
    		BT bt = new BT();
    		System.out.println("8 Queens Problem using Backtracking : ");
    		bt.solveNQ();
    	}
    	else if(a==2)
    	{
    		NBT nbt = new NBT(); 
    		System.out.println("8 Queens Problem without using Backtracking : ");
    		nbt.solveNQ();
    	}
    	else
    	{
    		System.out.println("Invalid Choice");
    	}
    } 
}