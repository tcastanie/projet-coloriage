package peinture;

public class Pixel {

	private int rouge;
	private int bleu;
	private int vert;
	
	public Pixel(int r,int g,int b)
	{
		this.rouge=r;
		this.bleu=b;
		this.vert=g;
	}
	
	public int getR()
	{
		return this.rouge;
	}
	public void setR(int n)
	{
		this.rouge = n;
	}
	public int getG()
	{
		return this.vert;
	}
	public void setG(int n)
	{
		this.vert = n;
	}
	public int getB()
	{
		return this.bleu;
	}
	public void setB(int n)
	{
		this.bleu = n;
	}
	public void setRGB(int r,int g, int b)
	{
		this.setR(r);
		this.setG(g);
		this.setB(b);
	}
	public int sommeRGB()
	{
		return this.rouge+this.vert+this.bleu;
	}
	
}
