package guru.springframework.api.v1.mapper;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import guru.springframework.api.v1.model.CustomerDTO;
import guru.springframework.domain.Customer;

public class CustomerMapperTest {

	public static final String FIRSTNAME = "Jimmy";
	public static final String LASTNAME = "Fallon";
	
	CustomerMapper customerMapper = CustomerMapper.INSTANCE;
	
	@Test
	public void customerToCustomerDTO() throws Exception{
		
		//given
		Customer customer = new Customer();
		customer.setFirstname(FIRSTNAME);
		customer.setLastname(LASTNAME);
		
		//when
		CustomerDTO customerDTO = customerMapper.customerToCustomerDTO(customer);
		
		//then
		assertEquals(FIRSTNAME, customerDTO.getFirstname());
		assertEquals(LASTNAME, customerDTO.getLastname());
	}

}
