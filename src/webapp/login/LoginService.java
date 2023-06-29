package webapp.login;

public class LoginService {

	//이름과 비번을 검사해서 맞으면 참, 아니면 거짓 리턴
	public boolean isUserValid(String username, String password) {
		if(username.equals("drv98") && password.equals("1234")) {
			return true;
		}
		return false;
	}
}
