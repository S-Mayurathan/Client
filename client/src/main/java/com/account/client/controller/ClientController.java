/**
* Dev space by Mayu... 
**/
package com.account.client.controller;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.account.client.bean.Client;
import com.account.client.exception.ClientAppException;
import com.account.client.services.ClientService;

/**
 * Client API Gate way
 * @author mayu
 *
 */
@RestController
public class ClientController {

	@Autowired
	private ClientService clientService;

	/**
	 * Create Client object
	 * @param client
	 * @return
	 * @throws ClientAppException
	 */
	@PostMapping("/client")
	public ResponseEntity<Object> createClient(@RequestBody Client client) throws ClientAppException {
		Client savedClient = clientService.saveClient(client);
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
				.buildAndExpand(savedClient.getId()).toUri();
		return ResponseEntity.created(location).build();
	}

	/**
	 * Get client object by Id
	 * @param clientId
	 * @return
	 * @throws ClientAppException
	 */
	@GetMapping("/client/{clientId}")
	public ResponseEntity<Client>  getClient(@PathVariable(name = "clientId") Long clientId) throws ClientAppException {
		Client client=clientService.findClientById(clientId);
		if(client==null){
			return new ResponseEntity<>(client, HttpStatus.NO_CONTENT);
		}else{
			return new ResponseEntity<>(client, HttpStatus.OK);
		}
		
	}
	
	/**
	 * get client object by client type
	 * @param type
	 * @return
	 * @throws ClientAppException
	 */
	@GetMapping("/client")
	public List<Client> getClientByType(@RequestParam(required = false) String type) throws ClientAppException {
		return clientService.findClientByType(type);
	}
	
}
