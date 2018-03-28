import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//esercizio modulo
//		int range=10;
//		System.out.println(199%10);//mi restituisce il resto
//		Set<Impiegato> impiegati=new HashSet<Impiegato>();
//		Impiegato i1=new Impiegato(27,"a","A");
//		Impiegato i2=new Impiegato(28,"b","B");
//		Impiegato i3=new Impiegato(29,"c","C");
//		
//		impiegati.add(i1);
//		impiegati.add(i2);
//		impiegati.add(i3);
//		
//		Iterator<Impiegato> it=impiegati.iterator();
//		while(it.hasNext())
//			System.out.println(it.next());

		//cerchiamo di fare es più utile
		List<String> arrayList=new ArrayList<String>();
		List<String> linkedList=new LinkedList<String>();
		HashSet<String> set=new HashSet<String>();
		
		System.out.println("aggiungi elemento: il più lento è l'HASHCODE");

		Long t1=System.nanoTime();
		for(int i=0;i<10000;i++)
			arrayList.add("tag_"+i);
		long t2=System.nanoTime();
		System.out.println((t2-t1)/1e9);
		
		t1=System.nanoTime();
		for(int i=0;i<10000;i++)
			linkedList.add("tag_"+i);
		t2=System.nanoTime();
		System.out.println((t2-t1)/1e9);
		
		t1=System.nanoTime();  
		for(int i=0;i<10000;i++)
			set.add("tag_"+i);
		t2=System.nanoTime();
		System.out.println((t2-t1)/1e9);
		
		System.out.println("rimuovi elemento: il più lento è l'ARRAYLIST perchè linkedlist li rimuove in ordine e quindi è sempre il primo");

		t1=System.nanoTime();
		for(int i=0;i<10000;i++)
			arrayList.remove("tag_"+i);
		t2=System.nanoTime();
		System.out.println((t2-t1)/1e9);
		
		t1=System.nanoTime();
		for(int i=0;i<10000;i++)
			linkedList.remove("tag_"+i);
		t2=System.nanoTime();
		System.out.println((t2-t1)/1e9);
		
		t1=System.nanoTime();  
		for(int i=0;i<10000;i++)
			set.remove("tag_"+i);
		t2=System.nanoTime();
		System.out.println((t2-t1)/1e9);
		
		System.out.println("rimuovi elemento partendo dal fondo in teoria dovrebbe essere l'Hash il più veloce");

		t1=System.nanoTime();
		for(int i=99999;i>=0;i--)
			arrayList.remove("tag_"+i);
		t2=System.nanoTime();
		System.out.println((t2-t1)/1e9);
		
		t1=System.nanoTime();
		for(int i=99999;i>=0;i--)
			linkedList.remove("tag_"+i);
		t2=System.nanoTime();
		System.out.println((t2-t1)/1e9);
		
		t1=System.nanoTime();  
		for(int i=99999;i>=0;i--)
			set.remove("tag_"+i);
		t2=System.nanoTime();
		System.out.println((t2-t1)/1e9);
		
	}

}
