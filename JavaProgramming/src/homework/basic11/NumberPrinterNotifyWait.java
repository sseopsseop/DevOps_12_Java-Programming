package homework.basic11;

public class NumberPrinterNotifyWait {
	private int num;
	private boolean isFlag;

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	
	public NumberPrinterNotifyWait() {
		
	}
	
	public NumberPrinterNotifyWait(int num) {
		this.num = num;
		isFlag = false;
	}
	
	public synchronized void numPrint1(int num) {
		for(int i = num; i <= 50; ++i) {
			if(i % 3 == 0) System.out.println(i+"는 3의 배수");
			
			notify();
			
			try {
				if(i == 50) isFlag = true;
				wait();
			}catch(InterruptedException ie) {
				System.out.println(ie.getMessage());
			}
		}
	}
	
	public synchronized void numPrint2(int num) {
		for(int i = num; i <= 100; ++i) {
			if(i % 5 == 0 && i % 7 == 0) System.out.println(i+"는 5와 7의 공배수");
			if(i == 100) isFlag = false;
			if(!isFlag) {
				notify();
				try {
					wait();
				}catch(InterruptedException ie) {
					System.out.println(ie.getMessage());
				}
			}
		}
	}
}
