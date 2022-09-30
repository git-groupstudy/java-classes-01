package chapter05.sec04;

public class Exam02_CallByValue {

	public static void main(String[] args) {
		
		Counter counter = new Counter();
		System.out.println("before count : " + counter.count);
		
		Updater updater = new Updater();
		
		updater.update(counter.count);
		
		System.out.println("after count : " + counter.count);
	}
}


class Counter{
	int count = 0; //멤버 변수
}

class Updater{
	
	void update(int count) {
		count++;
	}
}
