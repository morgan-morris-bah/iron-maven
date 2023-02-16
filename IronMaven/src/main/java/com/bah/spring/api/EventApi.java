package com.bah.spring.api;
import com.bah.spring.domain.*;
import java.util.ArrayList;
import java.util.Optional;
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

//public class EventApi {
@SuppressWarnings("deprecation")
@RestController
@RequestMapping("/events")
public class EventApi {
//		@Autowired
//		EventRepository repo;
	ArrayList<Event> eventList = new ArrayList<Event>();

	public EventApi() {

		Event e1 = new Event(1, "CNF001", "All-Java Conference", "Lectures and exhibits covering all Java topics");
		Event e2 = new Event(2, "WKS002", "Spring Boot Workshop", "Hands-on Spring Boot Workshop");
		Event e3 = new Event(3, "TRN001", "Angular Training Course", "Five day introductory training in Angular");
		Event e4 = new Event(4, "RNR004", "Rock n Roll Concert", "BAH Employees RocknRoll Concert");

		eventList.add(e1);
		eventList.add(e2);
		eventList.add(e3);
		eventList.add(e4);
	}

	@GetMapping
	public Iterable<Event> getAll() {
		// Workshop: Implement a method to retrieve all events
		return eventList;
	}

	@GetMapping("/{eventId}")
	public Optional<Event> getEventById(@PathVariable("eventId") long id) {
		// Workshop: Implement a method to retrieve a single event by it's ID
		return null;
	}

	@PostMapping
	public ResponseEntity<?> addEvent(@RequestBody Event newEvent, UriComponentsBuilder uri) {
		// Workshop: Implement a method to create a new event in response to a POST
		// message.
		// Think about how you ensure that the event is properly formed.
		return null;
	}

	@PutMapping("/{eventId}")
	public ResponseEntity<?> putEvent(@RequestBody Event newEvent, @PathVariable("eventId") long eventId) {
		// Workshop: Implement a method to update an entity in response to a PUT
		// message.
		return null;
	}

	@DeleteMapping("/{eventId}")
	public ResponseEntity<?> deleteEventById(@PathVariable("eventId") long id) {
		// Workshop: Implement a method to delete an entity.
		return null;
	}
}
