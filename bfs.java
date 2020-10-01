/*
    Aman Agarwal
    algo.java
*/

import java.util.*;
import java.io.*;

public class bfs
{
    static class FastReader
    {
            BufferedReader br;
            StringTokenizer st;

            public FastReader()
            {
                br = new BufferedReader(new InputStreamReader(System.in));
            }

            String next()
            {
                while (st == null || !st.hasMoreElements())
                {
                    try
                    {
                        st = new StringTokenizer(br.readLine());
                    }
                    catch (IOException  e)
                    {
                        e.printStackTrace();
                    }
                }
                return st.nextToken();
            }

            int nextInt()
            {
                return Integer.parseInt(next());
            }

            long nextLong()
            {
                return Long.parseLong(next());
            }

            double nextDouble()
            {
                return Double.parseDouble(next());
            }

            String nextLine()
            {
                String str = "";
                try
                {
                    str = br.readLine();
                }
                catch (IOException e)
                {
                    e.printStackTrace();
                }
                return str;
            }
    }


    static FastReader sc = new FastReader();
    static PrintWriter out = new PrintWriter(System.out);
    static int ni()throws IOException{return sc.nextInt();}
    static long nl()throws IOException{return sc.nextLong();}
    static int[][] nai2(int n,int m)throws IOException{int a[][] = new int[n][m];for(int i=0;i<n;i++)for(int j=0;j<m;j++)a[i][j] = ni();return a;}
    static int[] nai(int N,int start)throws IOException{int[]A=new int[N+start];for(int i=start;i!=(N+start);i++){A[i]=ni();}return A;}
    static Integer[] naI(int N,int start)throws IOException{Integer[]A=new Integer[N+start];for(int i=start;i!=(N+start);i++){A[i]=ni();}return A;}
    static long[] nal(int N)throws IOException{long[]A=new long[N];for(int i=0;i!=N;i++){A[i]=nl();}return A;}
    static char[] nac()throws IOException{char[]A=sc.next().toCharArray();return A;}
    static void print(int arr[]){for(int i=0;i<arr.length;i++)out.print(arr[i]+" ");out.println();}
    static void print(long arr[]){for(int i=0;i<arr.length;i++)out.print(arr[i]+" ");out.println();}
    static long gcd(long a, long b)throws IOException{return (b==0)?a:gcd(b,a%b);}
    static int gcd(int a, int b)throws IOException{return (b==0)?a:gcd(b,a%b);}
    static int bit(long n)throws IOException{return (n==0)?0:(1+bit(n&(n-1)));} // return the number of set bits.
    static boolean isPrime(int number){if(number==1) return false;if (number == 2 || number == 3){return true;}if (number % 2 == 0) {return false;}int sqrt = (int) Math.sqrt(number) + 1;for(int i = 3; i < sqrt; i += 2){if (number % i == 0){return false;}}return true;}
    static boolean isPrime(long number){if(number==1) return false;if (number == 2 || number == 3){return true;}if (number % 2 == 0) {return false;}long sqrt = (long) Math.sqrt(number) + 1;for(int i = 3; i < sqrt; i += 2){if (number % i == 0){return false;}}return true;}
    static int power(int n,int p){if(p==0)return 1;int a = power(n,p/2);a = a*a;int b = p & 1;if(b!=0){a =  n*a;}return a;}
    static long power(long n,long p){if(p==0)return 1;long a = power(n,p/2);a = a*a;long b = p & 1;if(b!=0){a =  n*a;}return a;}
    static void reverse(int[] a) {int b;for (int i = 0, j = a.length - 1; i < j; i++, j--) {b = a[i];a[i] = a[j];a[j] = b;}}
    static void reverse(long[] a) {long b;for (int i = 0, j = a.length - 1; i < j; i++, j--) {b = a[i];a[i] = a[j];a[j] = b;}}
    static void swap(int a[],int i,int j){a[i] = a[i] ^ a[j];a[j] = a[j] ^ a[i];a[i] = a[i] ^ a[j];}
    static void swap(long a[],int i,int j){a[i] = a[i] ^ a[j];a[j] = a[j] ^ a[i];a[i] = a[i] ^ a[j];}
    static int count(int n){int c=0;while(n>0){c++;n = n/10;}return c;}
    static int[] prefix_sum(int a[],int n){int s[] = new int[n];s[0] = a[0];for(int i=1;i<n;i++){s[i] = a[i]+s[i-1];}return s;}
    static long[] prefix_sum_int(int a[],int n){long s[] = new long[n];s[0] = (long)a[0];for(int i=1;i<n;i++){s[i] = ((long)a[i])+s[i-1];}return s;}
    static long[] prefix_sum_Integer(Integer a[],int n){long s[] = new long[n];s[0] = (long)a[0];for(int i=1;i<n;i++){s[i] = ((long)a[i])+s[i-1];}return s;}
    static long[] prefix_sum_long(long a[],int n){long s[] = new long[n];s[0] = a[0];for(int i=1;i<n;i++){s[i] = a[i]+s[i-1];}return s;}
    static boolean isPerfectSquare(double x){double sr = Math.sqrt(x);return ((sr - Math.floor(sr)) == 0);}
    static ArrayList<Integer> sieve(int n) {int k=0; boolean prime[] = new boolean[n+1];ArrayList<Integer> p_arr = new ArrayList<>();for(int i=0;i<n;i++) prime[i] = true;for(int p = 2; p*p <=n; p++){ k=p;if(prime[p] == true) { p_arr.add(p);for(int i = p*2; i <= n; i += p) prime[i] = false; } }for(int i = k+1;i<=n;i++){if(prime[i]==true)p_arr.add(i);}return p_arr;} 
    static boolean[] seive_check(int n) {boolean prime[] = new boolean[n+1];for(int i=0;i<n;i++) prime[i] = true;for(int p = 2; p*p <=n; p++){ if(prime[p] == true) { for(int i = p*2; i <= n; i += p) prime[i] = false; } }prime[1]=false;return prime;} 
    static int get_bits(int n){int p=0;while(n>0){p++;n = n>>1;}return p;}
    static int get_bits(long n){int p=0;while(n>0){p++;n = n>>1;}return p;}
    static int get_2_power(int n){if((n & (n-1))==0)return get_bits(n)-1;return -1;}
    static int get_2_power(long n){if((n & (n-1))==0)return get_bits(n)-1;return -1;}
    //gives the divisors of first n natural numbers in n*sqrt(n) time..
    static ArrayList<ArrayList<Integer>> divisors_n(int n){int i,j;ArrayList<ArrayList<Integer>> ans = new ArrayList<>();ArrayList<Integer> arr = new ArrayList<>();arr.add(1);ans.add(arr);for (i = 2; i <= n; i++){arr = new ArrayList<>();for (j = 1; j * j <= i; j++){if (i % j == 0){arr.add(j);if (i / j != j)arr.add(i/j);}}ans.add(arr);} return ans;} 
    //gives divisors of a particular number in sqrt(n) time..
    static ArrayList<Integer> divisors_1(int n){ArrayList<Integer> ans = new ArrayList<>();for (int i=1; i<=Math.sqrt(n); i++){if (n%i==0){if (n/i == i)ans.add(i);else{ans.add(i);ans.add(n/i);}}}return ans;} 
    static void close(){out.flush();}

    /*-------------------------Main Code Starts(algo.java)----------------------------------*/    

    static Map<Integer,List<Integer>> graph;
    static List<Integer> vert;
    static Map<Integer,Boolean> visited;
    static List<Integer> bfs_traversal;

    static void printgraph(int v) throws IOException
    {
        System.out.println();
        System.out.println("*****************");
        for(int i=0;i<v;i++)
        {
            int x = vert.get(i);
            System.out.println(x+" ---> "+graph.get(x));
        }
        System.out.println("******************");
    }

    static void createGraph(int e,int v,boolean directed) throws IOException
    {
        System.out.println("Enter all the vertices -> ");
        for(int i=0;i<v;i++)
        {
            int x = ni();
            vert.add(x);
            graph.put(x,new ArrayList<Integer>());
        }

        System.out.println("Enter all the edges -> ");
        for(int i=0;i<e;i++)
        {
            System.out.print("Source : ");
            int src = ni();
            System.out.print("Dest : ");
            int dest = ni();

            List<Integer> arr = graph.get(src);
            arr.add(dest);
            graph.put(src,arr);
            if(!directed)
            {
                arr = graph.get(dest);
                arr.add(src);
                graph.put(dest,arr);
            }
        }
    }


    static void bfs(int src)
    {
        Queue<Integer> q = new LinkedList<>();
        q.add(src);
        visited.put(src,true);
        while(q.size()>0)
        {
            int x = q.poll();
            bfs_traversal.add(x);
            for(Integer neighbours : graph.get(x))
            {
                if(!visited.containsKey(neighbours))
                {
                    q.add(neighbours);
                    visited.put(neighbours,true);
                }
            }
        }        
    }

    public static void solve() throws IOException 
    {
        
        int n_edges = ni();
        int n_vert = ni();

        createGraph(n_edges,n_vert,true);
        printgraph(n_vert);
        
        for(int i=0;i<n_vert;i++)
        {
            if(!visited.containsKey(vert.get(i)))
                bfs(vert.get(i));
        }
        System.out.println("BFS traversal is : "+bfs_traversal);
    }

    public static void main(String[] args) throws IOException 
    {
        int test = 1;
        //test = sc.nextInt();
        graph = new HashMap<>();
        vert = new ArrayList<Integer>();
        visited = new HashMap<>();
        bfs_traversal = new ArrayList<>();
        while(test-- > 0)
        {
            solve();
        }
        close();
    }
}
