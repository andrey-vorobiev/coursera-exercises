package org.coursera;

import java.util.Arrays;

public class QuickFind 
{
	private int[] id;
	
	public QuickFind(int size)
	{
		id = new int[size];
		
		for (int i = 0; i < size; i++)
		{
			id[i] = i;
		}
	}
	
	public boolean find(int p, int q)
	{
		return id[p] == id[q];
	}
	
	public void union(int p, int q)
	{
		int pid = id[p], qid = id[q];
		
		for (int i = 0; i < id.length; i++)
		{			
			if (id[i] == pid)
			{
				id[i] = qid;
			}
		}
	}
	
	public static void main(String[] args) 
	{
		QuickFind qf = new QuickFind(10);
		
		qf.union(4, 3);
		System.out.println(Arrays.toString(qf.id));
		
		qf.union(3, 8);
		System.out.println(Arrays.toString(qf.id));
	}
}
