import java.util.*;
public class hashMapImplementation
{
    public static class HashMap<K,V>{
        private final int DEFAULT_CAPACITY = 4;
        private final float DEFAULT_LOAD_FACTOR = 0.75f;
        private int n; //number of enteries
        private class Node{
            K key;
            V value;
            private Node(K key, V value){
                this.key = key;
                this.value = value;
            }
        }
        private LinkedList<Node>[] buckets;
        
        public void initBuckets(int N){
            buckets = new LinkedList[N];
            for(int i=0;i<N;i++) buckets[i] = new LinkedList<>();
        }
        
        public int hashFunction(K key){
            int hc = key.hashCode();
            return (Math.abs(hc)) % buckets.length;
        }
        
        private int searchInBucket(LinkedList<Node> l, K key){
            for(int i=0;i<l.size();i++){
                if(l.get(i).key.equals(key)) return i;
            }
            return -1;
        }
        
        public HashMap(){
            initBuckets(DEFAULT_CAPACITY);
        }
        
        public void rehash(){
            LinkedList<Node>[] oldBuckets = buckets;
            initBuckets(oldBuckets.length*2);
            n=0;
            for(var bucket : oldBuckets){
                for(var node : bucket){
                    put(node.key, node.value);
                }
            }
        }
        
        public void put(K key, V value){
            int bi = hashFunction(key);
            LinkedList<Node> currBucket = buckets[bi];
            int ei = searchInBucket(currBucket, key);
            if(ei==-1){ //key doesn't exist, We have to insert a new node
                Node node = new Node(key, value);
                currBucket.add(node);
                n++;
            }else{ //update case
                currBucket.get(ei).value = value;
            }
            
            if(n>=buckets.length*DEFAULT_LOAD_FACTOR){
                rehash();
            }
        }
        
        public V get(K key){
            int bi = hashFunction(key);
            LinkedList<Node> currBucket = buckets[bi];
            int ei = searchInBucket(currBucket, key);
            if(ei!=-1) return currBucket.get(ei).value;
            return null;
        }
        
        public V remove(K key){
            int bi = hashFunction(key);
            LinkedList<Node> currBucket = buckets[bi];
            int ei = searchInBucket(currBucket, key);
            if(ei!=-1){ //key exists
                n--;
                return currBucket.remove(ei).value;
            }
            return null; //key doesn't exists
        }
        
        public int capacity(){
            return buckets.length;
        }
        
        public float load(){
            return (n*1.0f)/buckets.length; 
        }

        public int size(){
            return n;
        }
        
    }
    
	public static void main(String[] args) {
	    HashMap<String,Integer> m = new HashMap<>();
	    m.put("a",97);
	    m.put("b",98);
	    System.out.println(m.capacity()); //4
	    System.out.println(m.load()); //0.5
	    m.put("c",11);
	    m.put("d",22);
	    m.put("e",43);
	    m.put("a",69);
	    System.out.println(m.get("d")); //22
	    System.out.println(m.get("e")); //43
	    System.out.println(m.capacity()); //8
	    System.out.println(m.load()); //0.625
	}
}


















