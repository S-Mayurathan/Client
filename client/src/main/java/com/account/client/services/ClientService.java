/**
* Dev space by Mayu... 
**/
package com.account.client.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.account.client.bean.Client;
import com.account.client.business.ClientBusiness;
import com.account.client.exception.ClientAppException;

/**
 * Client service functionality 
 * @author mayu
 *
 */
@Service
@Transactional
public class ClientService {

	@Autowired
	private ClientBusiness clientBusiness;

	public Client saveClient(Client client) throws ClientAppException {
		return clientBusiness.saveClient(client);
	}

	public List<Client> findClientByType(String clientType) throws ClientAppException {
		return clientBusiness.findClientByType(clientType);
	}

	public Client findClientById(Long clientId) throws ClientAppException {
		Client client = clientBusiness.findClientById(clientId);
		return client;
	}

}
