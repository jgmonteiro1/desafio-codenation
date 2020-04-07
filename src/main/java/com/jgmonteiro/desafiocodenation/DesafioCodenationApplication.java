package com.jgmonteiro.desafiocodenation;

import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.net.ProxySelector;
import java.security.MessageDigest;

import org.apache.http.client.HttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import com.google.gson.Gson;
import com.jgmonteiro.desafiocodenation.criptografia.CifraCesar;
import com.jgmonteiro.desafiocodenation.model.JsonResult;

@SpringBootApplication
public class DesafioCodenationApplication {

	private static final Gson gson = new Gson();

	public static void main(String[] args) throws UnsupportedEncodingException {
		SpringApplication.run(DesafioCodenationApplication.class, args);

		RestTemplate template = new RestTemplate();

		UriComponents endereco = UriComponentsBuilder.newInstance().scheme("https").host("api.codenation.dev")
				.path("v1/challenge/dev-ps/generate-data")
				.queryParam("token", "33dc16b111a0afe59541a1cf0468b09c406a0f64").build();

		ResponseEntity<JsonResult> responseEntity = template.getForEntity(endereco.toUriString(), JsonResult.class);

		/*
		 * System.out.println(responseEntity.getBody().getToken());
		 * System.out.println(responseEntity.getBody().getCifrado());
		 */

		// ResponseEntity.ok(gson.toJson(responseEntity.getBody().getClass()));
		System.out.println("{");
		System.out.println(gson.toJson(responseEntity.getBody().getNumeroDeCasas()));
		System.out.println(gson.toJson(responseEntity.getBody().getToken()));
		System.out.println(gson.toJson(responseEntity.getBody().getCifrado()));
		System.out.println(gson.toJson(responseEntity.getBody().getDecifrado()));
		System.out.println(gson.toJson(responseEntity.getBody().getResumo()));
		System.out.println("}");
		
		CifraCesar cifra = new CifraCesar();
		
		String cifrado = responseEntity.getBody().getCifrado();
		int numeroDeCasas = responseEntity.getBody().getNumeroDeCasas();
		
		System.out.println(cifra.decifra(cifrado, numeroDeCasas));
		
		String decifrado = cifra.decifra(cifrado, numeroDeCasas);
		
		try {
			MessageDigest md = MessageDigest.getInstance("SHA-1");
			byte[] messageDigest = md.digest(decifrado.getBytes());
			
			BigInteger n = new BigInteger(1, messageDigest);
			
			String textHash = n.toString(16);
			
			while(textHash.length()<32) {
				textHash = "0" + textHash;
			}
			
			System.out.println(textHash);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	


	
	
}
