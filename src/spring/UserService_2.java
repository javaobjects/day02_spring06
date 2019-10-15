package spring;

/**
 * 
* <p>Title: UserService_2</p>  
* <p>
*	Description: 
*	set属性注入
*   
* </p> 
* @author xianxian 
* @date 2019年10月14日
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
