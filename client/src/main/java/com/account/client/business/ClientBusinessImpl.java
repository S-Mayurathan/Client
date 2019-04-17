/**
* Dev space by Mayu... 
**/
package com.account.client.business;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.account.client.bean.Client;
import com.account.client.exception.ClientAppException;
import com.account.client.repository.ClientRepository;

/**
 * Client Business functionality.
 * @author mayu
 *
 */
@Component
public class ClientBusinessImpl implements ClientBusiness {

	@Autowired
	ClientRepository clientRepository;

	@Override
	public Client saveClient(Client cliet) throws ClientAppException {
		return clientRepository.save(cliet);
	}

	@Override
	public List<Client> findClientByType(String clientType) throws ClientAppException {
		return clientRepository.findByClientType(clientType);
	}

	@Override
	public Client findClientById(Long clientId) throws ClientAppException {
		Optional<Client> client = clientRepository.findById(clientId);
		if(client.isPresent()){
			return client.get();
		}
		return null;
	}

}
