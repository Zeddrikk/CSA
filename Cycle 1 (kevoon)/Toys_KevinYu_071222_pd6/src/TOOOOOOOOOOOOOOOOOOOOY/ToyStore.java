package TOOOOOOOOOOOOOOOOOOOOY;

import java.util.ArrayList;
public class ToyStore
{
private ArrayList<Toy> toyList;
private int size;
private Toy[] heap;
private ArrayList<Toy> sorted;
public ToyStore()
{
	toyList = new ArrayList<Toy>();
}
public void loadToys( String[] toys )
{
	for(String toy :toys) {
		int pos = this.getPosition(toy);
		if(pos==-1) {
			toyList.add(new Toy(1, toy));
		}
		else {
			toyList.get(pos).setCount(toyList.get(pos).getCount()+1);
		}
	}
}
public int getPosition(String toy) {
	int pos = -1;
	for(Toy t :toyList) {
		pos++;
		if(toy.equals(t.getName())) {
			return pos;
		}
	}
	return -1;
}
public String getThatToy(String toy) {
	int pos = this.getPosition(toy);
	if(pos!=-1) {
		return toyList.get(pos).toString();
	}
	return "Toy Not Found";
}
  
   public String getMostFrequentToy()
   {
	   String most ="";
	   int max =1;
		for(Toy toy:toyList) {
			int temp = toy.getCount();
			if(temp>max) {
				max =temp;
				most = toy.getName();
			}
		}
   return most;
   }  
 
  
   public String sortToysByCount()
   {
	   size = toyList.size();
	   heap = new Toy[size];
	   for(int x =0; x<size;x ++) {
		   heap[x] = toyList.get(x);
	   }
	   heapify(0);
	   sorted = new ArrayList<Toy>();
	   for(int x=0;x<toyList.size();x++) {
		   sorted.add(this.removeMax());
	   }
	  return sorted.toString();
	  
	   
	   
	   
	   
	   
	   
	   
   } 
   //make max heap
   private void heapify(int pos) {
	   if(isLeaf(pos)) {
		   return;
	   }
	   /*System.out.println("Parent= " + pos+""
	   		+ "\nLeft = "+(pos*2+1)+""
	   		+ "\nRight ="+(pos*2+2));
	   */
	   if(heap[pos].getCount()<heap[pos*2+1].getCount()||heap[pos].getCount()<heap[pos*2+2].getCount()) {
		  if(heap[pos*2+1].getCount()>heap[pos*2+2].getCount()) {
			  this.swap(pos, pos*2+1);
			   this.heapify(pos*2+1);
		  }
		  else {
			  this.swap(pos,pos*2+2);
			   this.heapify(pos*2+2); 
		  }
	   }
	   
   }
   //swap
   private void swap(int pos1, int pos2) {
	   /*System.out.println("Pre swap");
	   System.out.println(heap[pos1]);
	   System.out.println(heap[pos2]);
	   System.out.println("pos1=" + pos1);
	   System.out.println("pos2="+pos2);
	   */
	   Toy temp = heap[pos1];
	   heap[pos1]= heap[pos2];
	   heap[pos2]=temp;
	   /*System.out.println("Post swap");
	   System.out.println(heap[pos1]);
	   System.out.println(heap[pos2]);
	   */
   }
   //check leaf
   private boolean isLeaf(int pos)
   {
       if (pos > (size / 2 -1) && pos <= size) {
           return true;
       }
       return false;
   }
   //remove max
   private Toy removeMax() {
	   Toy max = heap[0];
	   //System.out.println("max=" +max);
	   heap[0]=heap[--size];
	   this.heapify(0);
	   /*for(Toy x :heap) {
		   System.out.print(x);
		   System.out.print(" ");
	   }
	   System.out.println();
	   */
	   return max;
   }

   
   

public String toString()
{
   return toyList.toString();
}
}