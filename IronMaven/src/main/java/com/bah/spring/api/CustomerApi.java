package com.bah.spring.api;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.bah.spring.domain.Customer;

@RestController
@RequestMapping("/customers")
public class CustomerApi {
	
	ArrayList<Customer> list = new ArrayList<Customer>();
	
	public CustomerApi() {
		
		Customer c1 = new Customer(1, "Steve", "pass", "steve@abc.com");
		Customer c2 = new Customer(2, "Bob", "pass", "bob@abc.com");
		Customer c3 = new Customer(3, "Cindy", "pass", "cindy@abc.com");
		list.add(c1);
		list.add(c2);
		list.add(c3);
		
		
	}
//	
//	@GetMapping
//	public Collection<id> get###############All(){
//		return this.list;
//	}
//	
	@GetMapping("/{customerId}")
	public Customer getCustomerById(@PathVariable("customerId") long id) {
		
		Customer customer = null;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getId() == id) {
				customer = list.get(i);
			}
		}
		return customer;
	}
	
	
//	@Autowired
//	CustomersRepository repo;

	@GetMapping
	public Iterable<Customer> getAll() {
		//  Workshop:  Write an implementation that replies with all customers.
		//  Your implementation should be no more than a few lines, at most, and make use of the 'repo' object
		return this.list;   
	}

//	@GetMapping("/{customerId}")
//	public Optional<Customer> getCustomerById(@PathVariable("customerId") long id) {
//		//  Workshop:  Write an implementatoin that looks up one customer.  What do you return if the requested 
//		//  customer ID does not exists?  This implementation could be as short as a single line.
//		Customer customer;
//		customer = list.get(id);
//		return null;
//	}
	
//	@PostMapping
//	public ResponseEntity<?> addCustomer(@RequestBody Customer newCustomer, UriComponentsBuilder uri) {
//		//  Workshop:  Write an implementation that adds a new customer.  Your
//		//  implementation should check to make sure that the name and email fields are
//		//  not null and that no id was passed (it will be auto generated when the record
//		//  is inserted.  Remember REST semantics - return a reference to the newly created 
//		//  entity as a URI.
//		return null;
//	}
//
//	//lookupCustomerByName GET
//	@GetMapping("/byname/{username}")
//	public ResponseEntity<?> lookupCustomerByNameGet(@PathVariable("username") String username,
//			UriComponentsBuilder uri) {
//		//  Workshop:  Write an implemenatation to look up a customer by name.  Think about what
//		//  your response should be if no customer matches the name the caller is searching for.
//		//  With the data model implemented in CustomersRepository, do you need to handle more than
//		//  one match per request?
//		return null;
//	}
//	
//	//lookupCustomerByName POST
//	@PostMapping("/byname")
//	public ResponseEntity<?> lookupCustomerByNamePost(@RequestBody String username, UriComponentsBuilder uri) {
//		//  Workshop:  Write an implementation to look up a customer by name, using POST semantics
//		//  rather than GET.  You should be able to make use of most of your implmentation for
//		//  lookupCustomerByNameGet().  
//		return null;
//	}	
//	
//	
//	@PutMapping("/{customerId}")
//	public ResponseEntity<?> putCustomer(
//			@RequestBody Customer newCustomer,
//			@PathVariable("customerId") long customerId) 
//	{
//		//  Workshop:  Write an implementation to update or create a new customer with an HTTP PUT, with the 
//		//  requestor specifying the customer ID.  Are there error conditions to be handled?  How much data
//		//  validation should you implement considering that customers are stored in a CustomersRepository object.
//		return null;
//	}	
//	
//	@DeleteMapping("/{customerId}")
//	public ResponseEntity<?> deleteCustomerById(@PathVariable("customerId") long id) {
//		//  Implement a method to delete a customer.  What is an appropriate response? 
//		//
//		//  For discussion (do not worry about implementation):  What are some ways of handling 
//		//  a "delete"?  Is it always the right thing from a business point of view to literally 
//		//  delete a customer entry?  If you did actually delete a customer entry, are there issues
//		//  you could potentially run into later? 
//		return null;
//	}	
}