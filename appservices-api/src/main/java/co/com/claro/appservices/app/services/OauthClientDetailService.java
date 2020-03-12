package co.com.claro.appservices.app.services;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import co.com.claro.appservices.app.models.entity.auth.OauthClientDetail;
import co.com.claro.appservices.app.models.repository.OauthClientDetailRepository;
import com.google.gson.Gson;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.oauth2.provider.ClientDetails;
import org.springframework.security.oauth2.provider.ClientDetailsService;
import org.springframework.security.oauth2.provider.ClientRegistrationException;
import org.springframework.security.oauth2.provider.client.BaseClientDetails;

import org.springframework.stereotype.Service;

@Service
public class OauthClientDetailService implements ClientDetailsService {

	private static final Logger LOGGER = LoggerFactory.getLogger(OauthClientDetailService.class);
	
	@Autowired
	private OauthClientDetailRepository oauthClientDetailRepository;

	@Override
	public ClientDetails loadClientByClientId(String clientId) throws ClientRegistrationException {
		Map<String, Object> informacionAdicional = new HashMap<>();
		Gson gson = new Gson();
		OauthClientDetail client = oauthClientDetailRepository.findOauthClientDetailByClientId(clientId);
		
		if (client == null) {
			throw new ClientRegistrationException("No existe el clientId");
		}
		
		LOGGER.info("client: " + gson.toJson(client));
		//String resourceIds = client.getResourceIds();
        String scopes = client.getScope();
        String grantTypes = client.getAuthorizedGrantTypes();
        String authorities = client.getAuthorities();

		informacionAdicional.put("info", client.getAdditionalInformation());

        BaseClientDetails base = new BaseClientDetails(client.getClientId(), null, scopes, grantTypes, authorities);
        base.setClientSecret(client.getClientSecret());
        base.setAccessTokenValiditySeconds(client.getAccessTokenValidity());
        base.setRefreshTokenValiditySeconds(client.getRefreshTokenValidity());
        base.setAdditionalInformation(informacionAdicional);
        base.setAutoApproveScopes(Arrays.asList(client.getScope()));
        
		return base;
	}

}
