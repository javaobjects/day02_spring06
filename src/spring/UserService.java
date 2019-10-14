package spring;
/**
 * 构造函数注入
 */
public class UserService {

	private IUserDao userDao;
	private String username;
	
	//无参构造函数
	public UserService()
	{
		System.out.println("new UserService() 实例化");
	}
	
	//带参构造函数
	public UserService(IUserDao userDao,String username)
	{
		this.userDao = userDao;
		this.username = username;
		
		System.out.println("new UserService("+userDao+","+username+") 实例化");
	}
	
	public void findUsers()
	{
	    userDao.selectUser();
	}
}
