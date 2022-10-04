package chapter05.sec04;

public class Exam03_CallByReference {

	public static void main(String[] args) {
		
		//자바에는 Call By Reference가 없다..비슷해 보이지만 결국 Call By Value로 동작하고 있는 것.
		
		CounterRef counterRef = new CounterRef();
		System.out.println("before count : " + counterRef.count);
		
		UpdaterRef updaterRef = new UpdaterRef();
		
		updaterRef.update(counterRef);
		
		System.out.println("after count : " + counterRef.count);
	}
}


class CounterRef{
	int count = 0; //멤버 변수
}

class UpdaterRef{
	
	void update(CounterRef counterRef) {
		counterRef.count++;
	}
}
