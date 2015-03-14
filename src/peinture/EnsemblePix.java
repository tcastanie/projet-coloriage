package peinture;

import java.util.ArrayList;


public class EnsemblePix {

	private Pixel[][] tab;
	private int i;
	private int j;
	
	public EnsemblePix(int i,int j) {
		
		this.tab = new Pixel[i][j];
		this.i = i;
		this.j =j;
		
	}
	public Pixel[][] getTab()
	{
		return this.tab;
	}
	
	public int tabSizeI()
	{
		return this.i;
	}
	
	public int tabSizeJ()
	{
		return this.j;
	}
	
	public void addPixel(int r,int g,int b)
	{
		int i=0;
		int j=0;
		boolean cont=true;
		while(cont && i<this.tabSizeI() && j<this.tabSizeJ())
		{
			while(cont &&  i<this.tabSizeI() && j<this.tabSizeJ())
			{
			if(this.tab[i][j]==null)
			{
				this.tab[i][j] = new Pixel(r,g,b);
				cont=false;
				System.out.println("pixel add"+i+""+j);
				
			}
			j++;
		}
			j=0;
			i++;
		}
	}
	
	public void changeCouleur(int i,int j,int r,int g,int b)
	{
		this.tab[i][j].setRGB(i,g,b);
	}
	
	
	
	public boolean existPosISuiv(int i)
	{
		return !(i+1 == this.tabSizeI());
	}
	public boolean existPosIPrec(int i)
	{
		return !(i-1 < 0);
	}
	
	public boolean existPosJSuiv(int j)
	{
		return !(j+1 == this.tabSizeJ());
	}
	public boolean existPosJPrec(int j)
	{
		return !(j-1 < 0);
	}
	public void AfficheTab()
	{
		System.out.println(this.tabSizeI());
		for(int i=0;i< 30;i++)
		{
			
			for(int j=0;j<30;j++)
			{
				System.out.println(tab[i][j].getR()+""+tab[i][j].getG()+tab[i][j].getB());
				
			}
			
		}
	}
	
	
	public void remplissage(int i,int j,int r,int g,int b)
	{
		while(i<this.tabSizeI() && tab[i][j].sommeRGB()!= 0 && this.tab[i][j].sommeRGB() != r+g+b)
		{
			
			while(j<this.tabSizeJ() && tab[i][j].sommeRGB()!= 0)
			{
				
				tab[i][j].setRGB(r,g,b);
				
				if(existPosJPrec(j) )
				{
					
					this.remplissage(i, j-1, r, g, b);
					
				}
				
				if(existPosISuiv(i) )
				{
					
					this.remplissage(i+1, j, r, g, b);
					
				}
				
				if(existPosJSuiv(j))
				{
					
					this.remplissage(i, j+1, r, g, b);
					
				}
				
				if(existPosIPrec(i) )
				{
					
					this.remplissage(i-1, j, r, g, b);
					
				}
				j++;
			}
			j=0;
			i++;
		}
		
	}
}

