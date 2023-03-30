class ListLoader{//class1
	int arr[];//instance variable
public void loadList(int startNum,int lastNum) {//user define method

for(int i=startNum;i<lastNum;i++) {//loop for sleep
	try {
		Thread.sleep(50);
	}catch(Exception e) {
}
}
}}
class LoaderThread implements Runnable{//class2 using thread
	ListLoader l1;//aggregration reference type entity
	int startNum;//instance variable
	int lastNum;
	int []arr;
public	LoaderThread(int startNum,int lastNum,int []arr){//perametrized constructor
	this.startNum=startNum;
	this.lastNum=lastNum;
	this.arr=arr;
	}
	public void run() {//predefine method
		for(int i=startNum;i<lastNum;i++) {
		arr[i]=i;	
		}
	}
}

public class Main_Thread {//main class
public static void main(String[] args) throws InterruptedException {//main method
	ListLoader l1= new ListLoader();//class1 object
	long startTime=System.currentTimeMillis();
	System.out.println("Start time: "+startTime);//to print start time
	l1.loadList(0, 100);
	long endTime=System.currentTimeMillis();
	System.out.println("end time: "+endTime);//to print end time
	System.out.println("Time taken: "+(endTime-startTime)+" ms");//distance between both the thread
int arr[]=new int[100];//size of array
LoaderThread l2= new  LoaderThread(0,50,arr);//thread1
LoaderThread l3= new  LoaderThread(50,100,arr);//thread2
Thread thread1= new Thread(l2);
Thread thread2= new Thread(l3);
thread1.start();//thread1 start
thread2.start();//thread2 start
thread1.join();//join between 2 thread
thread2.join();
}
}