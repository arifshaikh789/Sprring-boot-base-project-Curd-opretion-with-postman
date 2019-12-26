package springbootPackage.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import springbootPackage.model.UserModel;
import springbootPackage.repository.UserRepository;

    @Controller
	public class TestController {
		
		@Autowired
		private UserRepository ur;
		@ResponseBody
		@RequestMapping(value="/arif" ,method=RequestMethod.GET)
		public List<UserModel> findUser()
		{
		   List<UserModel>l=ur.findAll();
		   
			/*
			 * Iterator<UserModel> iterator = l.iterator(); while(iterator.hasNext()) {
			 * UserModel pr = (UserModel) iterator.next();
			 * System.out.println(pr.getEmail()); System.out.println(pr.getId()); }
			 */
		   
		   System.out.println("i m in finduser");
		   return l;
			
		}
		
		
		
		 
		@ResponseBody
		@RequestMapping(value="/save",method=RequestMethod.POST)
		public void saveUSer(@RequestBody UserModel usr)
		{
		    
			ur.save(usr);
			System.out.println("data saveed ");
		}
		
		@ResponseBody
		@RequestMapping(value="/update",method=RequestMethod.PUT)
		public void updateUSer(@RequestBody UserModel usr)
		{
			System.out.println("data updated");
			 ur.save(usr);
			  
		}
		

		@ResponseBody
		@RequestMapping(value="/delete/{id}",method=RequestMethod.DELETE)
		public  void deleteUser(@PathVariable("id") int id)
		{
			ur.delete(id);
	  }
	}