package jp.itacademy.samples.api.consurrent;

public class Seat {
	
	private String userName;
	private String userSign;
	
	public void hold(String userName) {
		this.userName = userName;
		this.userSign = userName;
		checkSign();
		System.out.println(this.userName + "���񂪍����Ă܂�");
	}
	private void checkSign() {
		if (userName.charAt(0) != userSign.charAt(0)) {
			System.err.println("�T�C���Ɩ��O���Ⴂ�܂���..."
				+ " name:" + userName + " sign:" + userSign);
			System.exit(-1);
		}
	}

}
