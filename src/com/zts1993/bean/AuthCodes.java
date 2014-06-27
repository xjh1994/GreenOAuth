package com.zts1993.Bean;

import java.io.Serializable;

/**
 * AuthCodes entity. @author MyEclipse Persistence Tools
 */

public class AuthCodes implements Serializable {

	// Fields

	private Long id;
	private Clients clients;
	private String code;
    private String uuid;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    private String redirectUri;
	private Integer expires;
	private String scope;
	private String clientId;

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }
    // Constructors

	/** default constructor */
	public AuthCodes() {
	}

	/** minimal constructor */
	public AuthCodes(Clients clients, String redirectUri) {
		this.clients = clients;
		this.redirectUri = redirectUri;
	}

	/** full constructor */
	public AuthCodes(Clients clients, String code, String redirectUri,
			Integer expires, String scope) {
		this.clients = clients;
		this.code = code;
		this.redirectUri = redirectUri;
		this.expires = expires;
		this.scope = scope;
	}

	// Property accessors

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Clients getClients() {
		return this.clients;
	}

	public void setClients(Clients clients) {
		this.clients = clients;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getRedirectUri() {
		return this.redirectUri;
	}

    @Override
    public String toString() {
        return "AuthCodes{" +
                "id=" + id +
                ", clients=" + clients +
                ", code='" + code + '\'' +
                ", redirectUri='" + redirectUri + '\'' +
                ", expires=" + expires +
                ", scope='" + scope + '\'' +
                ", clientId='" + clientId + '\'' +
                '}';
    }

    public void setRedirectUri(String redirectUri) {
		this.redirectUri = redirectUri;
	}

	public Integer getExpires() {
		return this.expires;
	}

	public void setExpires(Integer expires) {
		this.expires = expires;
	}

	public String getScope() {
		return this.scope;
	}

	public void setScope(String scope) {
		this.scope = scope;
	}

}