/**
* Dev space by Mayu... 
**/
package com.account.client.business;

import java.util.List;

import com.account.client.bean.Client;
import com.account.client.exception.ClientAppException;


public interface ClientBusiness {
	
	public Client saveClient(Client cliet) throws ClientAppException;
	
	public List<Client> findClientByType(String clientType) throws ClientAppException;
	
	public Client findClientById(Long clientId) throws ClientAppException;

}
