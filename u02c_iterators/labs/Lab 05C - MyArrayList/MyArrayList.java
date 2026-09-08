package myarraylist;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.ConcurrentModificationException;

public class MyArrayList<T> implements Iterable<T>
{
   private T[] list;
   private int count;
	
   public MyArrayList() {
      this(10);
   }
	
   @SuppressWarnings("unchecked")
   public MyArrayList(int initSize) {
      list = (T[]) new Object[initSize];
   }
	
   public void add(T value)
   {
      if (count == list.length) {
         resizeArray();
      }
      list[++count] = value;
   }
	
   public void add(int index, T value)
   {
      if (count == list.length) {
         resizeArray();
      }
      list[index] = value;
   }
	
   public void clear()
   {
      for (T value : list) {
         value = null;
      }
   }
	
   public T get(int index) {
      return (T) list[index];
   }
	
   public int indexOf(T value)
   {
      int index = -1;
      for (int i = 0; i < list.length; ++i) {
         if (list[i] == value) {
            index = i;
         }
      }
      return index;
   }
	
   public boolean remove(T value)
   {
      return false;
   }
	
   public boolean isEmpty() {
      return false;
   }
	
   public T removeAt(int index)
   {
      return null;
   }
	
   public T set(int index, T element) {
      return list[index] = element;
   }
	
   public int size() {
      return list.length;
   }
	
   public int capacity() {
      return 0;
   }
	
   public Object[] toArray() {
      return null;
   }
	
   @Override
   public String toString()
   {
      return null;
   }
	
   public Iterator<T> iterator() {
      return new LinkedListIterator();
   }
	
   private class LinkedListIterator implements Iterator<T>
   {
      private int expectedCount;
      private int last;
      private int next;
   	
      public LinkedListIterator() {
      
      }
   	
      public boolean hasNext() {
         return false;
      }
   	
      public T next() {
         checkForComodification();
         return null;
      }
   	
      public void remove() {
      
      }
   	
      private void checkForComodification() {
      
      }
   }
	
	// ****************** Private Helper Methods ********************
	
   @SuppressWarnings("unchecked")
   private void resizeArray()
   {
      T[] temp = (T[]) new Object[list.length + 10];
      for (int index = 0; index < list.length; index++)
         temp[index] = list[index];
      list = temp;
   }
	
}

