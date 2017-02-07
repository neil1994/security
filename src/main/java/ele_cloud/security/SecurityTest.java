package ele_cloud.security;

public class SecurityTest {
	/*ApplicationContext ac=null;

	private UserService us;
	private RoleService rs;
	private ResourceService res;
	

	
	
	{
	
		ac=new ClassPathXmlApplicationContext("META-INF/spring/spring-config.xml");
		
		us=ac.getBean(UserService.class);
		rs=ac.getBean(RoleService.class);
		res=ac.getBean(ResourceService.class);
		
		

	}
	
	@Test
	public void test2(){
		
		
		User user= new User("name1","kk","k");
		Authenticator au=AuthenticatorManager.getInstance("JWT");
	    String token=au.buildToken(Integer.toString(user.getId()), "issuer", "subject", 7200000);
	    System.out.print("token:"+token);
		
		
	}
	
	@Test
	public void test() {
		
		//Resource re= new Resource("fun3","info");
		//res.insertResource(re);
		//System.out.println(res.deleteResourceById(9) );
		
		
		//System.out.println(res.getResourceById(1).getName());
	
		String tt="password";
		try {
			System.out.println("md5:"+ EncryptUtil.encodeMd5(tt) );
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*//*
		List<Permission> list=us.getPermissionByUserId(1, 2);
		//List<Permission> list=us.getPermissionByUserName("luke", 1);
		for (Permission p:list){
			System.out.print(p.getPerm());
		}
		
	System.out.println(us.isUserAuthorized4Resource(1, 1, new Permission('r')));
	*//*
	//System.out.println("grant permission:"+rs.grantPermissions(1,2,"*"));
	//System.out.println("grant permission:"+rs.cancelPermissions(1, 1));
		*//*
		User tu=us.getUser(6);
		System.out.println(tu.toString());
		Role r= new Role("audit",3);
		*//*
		//JsonResponseStatus status=new JsonResponseStatus(JsonResponseStatus.Status.SUCCESS,"hello");
		//JsonResponseStatus.Status tt=JsonResponseStatus.Status.SUCCESS;
		//System.out.println(tt);
		//rs.insertRole(r);
		
		//List<Role> rl=us.getUserRoleById(6);
	//	User a=new User("joe3","io","c");
		//int result=us.insertUser(a);
		//System.out.println(" insert id:"+result);
	
		//int result=us.updateUser(new User("joe","kk99","v"));
		//int result=us.deleteUserByName("joe3");
		//int result=us.deleteUserById(6);
		//System.out.println(" update id:"+result);
		
		
	}
	
	@Test
	public void testUrl(){
		
	        final String port = "8888";
		    String url="http://localhost:" + port + "/services/user/role";
	 
	        MediaType mediaType=MediaType.APPLICATION_JSON_TYPE;
	        Client client = ClientBuilder.newClient();
	        WebTarget target = client.target(url);
	        
	        QueryParamUserRole param = new QueryParamUserRole(8,1);
	        
	        Response response = target.request().put(Entity.entity(param, mediaType));
	        if (response.getStatus() != 200) {
                throw new RuntimeException("Failed with HTTP error code : " + response.getStatus());
            }
            String tt=response.readEntity(String.class);
            System.out.println("Successfully got result: " + tt);  
		
	}

*/


}