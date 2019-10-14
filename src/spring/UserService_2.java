package spring;
/**
 * set属性注入
 */
public class UserService_2 {

	private IUserDao userDao;
	private String username;
	
	public UserService_2()
	{
		System.out.println("new UserService_2()实例化");
	}
	
	//userDao的set方法
	public void setUserDao(IUserDao userDao)
	{
		this.userDao = userDao;
		System.out.println("UserService_2.setUserDao("+userDao+")");
	}
	
	//username的set方法
	public void setUsername(String username)
	{
		this.username = username;
		System.out.println("UserService_2.setUsername("+username+")");
	}
	
	public void findUsers()
	{
	    userDao.selectUser();
	}
}
