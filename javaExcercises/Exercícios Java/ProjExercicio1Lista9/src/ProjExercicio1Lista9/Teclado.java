package ProjExercicio1Lista9;

import java.io.*;


public class Teclado
{
	private String s;
	private InputStreamReader i = new InputStreamReader (System.in);
	private BufferedReader d = new BufferedReader(i);

	public int leInt ()
	{   
		System.out.print('\b');  
		int a = 0;
		try{
			s = d.readLine();
			a = Integer.parseInt(s);
		}
		catch (IOException e){
			System.out.println ("Erro de I/O: " + e);
		}
		catch (NumberFormatException e){
			System.out.println ("o valor digitado deve ser inteiro: "+e );
		}
		return (a);
	}

	public int leInt (String msg)
	{ 
	
		int a = 0;
		System.out.println(msg);
		try
		{
			s = d.readLine();
			a = Integer.parseInt(s);
		}
		catch (IOException e)
		{
			System.out.println ("Erro de I/O: "+e );
		}
		catch (NumberFormatException e)
		{
			System.out.println ("o valor digitado deve ser inteiro: "+e );
		}
		return (a);
     
	}

	public double leDouble()
	{ 
		System.out.print('\b');  
		double a = 0;
		try
		{
			s = d.readLine();
			a = Double.parseDouble(s);
		}
		catch (IOException e)
		{
			System.out.println ("Erro de I/O: " + e);
		}
		catch (NumberFormatException e)
		{
			System.out.println ("o valor digitado deve ser numero: "+e );
		}
		return (a);
	}

	/**
		Le um double, com mensagem.
		@return double
	 */
	public double leDouble(String msg)
	{   
		double a = 0;
		System.out.println(msg);
		try
		{
			s = d.readLine();
			a = Double.parseDouble(s);
		}
		catch (IOException e)
		{
			System.out.println ("Erro de I/O: " + e);
		}
		catch (NumberFormatException e)
		{
			System.out.println ("o valor digitado deve ser numero: "+e );
		}
		return (a);
	}

	public String leString()
	{ 
		System.out.print('\b');  
		s = "";
		try
		{
			s = d.readLine();
            
		}
		catch (IOException e)
		{
			System.out.println ("Erro de I/O: " + e);
		}
		return (s);
	}

	/**
		Le um string. com mensagem.
		@return String
	 */
	public String leString(String msg)
	{   
		s = "";
		System.out.println(msg);
		try
		{
			s = d.readLine();
		}
		catch (IOException e)
		{
			System.out.println ("Erro de I/O: " + e);
		}
		return (s);
	}
       
     public char leChar()
     {  
         System.out.print('\b');  
         s = "";
         char c=' ';
         try
         {
            s = d.readLine();
            c = s.charAt(0);
         }
         catch (IOException e)
         {
            System.out.println ("Erro de I/O: " + e);
         }
         return (c);
     }
        
     public char leChar(String msg)
     {   
    	 s = "";
    	 char c=' ';
    	 System.out.println(msg);
    	 try
    	 {
    		 s = d.readLine();
    		 c = s.charAt(0);
    	 }
    	 catch (IOException e)
    	 {
    		 System.out.println ("Erro de I/O: " + e);
    	 }
    	 return (c);
     }
     
}
