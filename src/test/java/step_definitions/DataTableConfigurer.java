package step_definitions;

import java.util.Locale;
import java.util.Map;

import beans.Users;
import cucumber.api.TypeRegistry;
import cucumber.api.TypeRegistryConfigurer;
import io.cucumber.datatable.DataTableType;
import io.cucumber.datatable.TableEntryTransformer;
public class DataTableConfigurer implements TypeRegistryConfigurer {
	
	
	@Override
	public Locale locale() {
		return Locale.ENGLISH;
	}
	
	
	public void configureTypeRegistry(TypeRegistry typeRegistry) {
		
		typeRegistry.defineDataTableType(new DataTableType(Users.class,	 
				new TableEntryTransformer<Users>() {

					@Override
					public Users transform(Map<String, String> row) throws Throwable {
 						String firstName = row.get("First Name");
 						String lastName = row.get("Last Name");
 						String age = row.get("age");
 						String gender = row.get("gender");
 				 
						return new Users(firstName,lastName,age,gender);
					}
				}));
	}
	
	
	

}
