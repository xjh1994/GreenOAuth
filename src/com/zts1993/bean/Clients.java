package com.zts1993.Bean;

import java.util.HashSet;
import java.util.Set;

/**
 * Clients entity. @author MyEclipse Persistence Tools
 */

public class Clients implements java.io.Serializable {

	// Fields

	private Long id;
	private String clientId;
	private String clientSecret;
	private String redirectUri;
	private Long userId;
	private String clientName;
	private Set authCodeses = new HashSet(0);

	// Constructors

    @Override
    public String toString() {
        return "Clients{" +
                "id=" + id +
                ", clientId='" + clientId + '\'' +
                ", clientSecret='" + clientSecret + '\'' +
                ", redirectUri='" + redirectUri + '\'' +
                ", userId=" + userId +
                ", clientName='" + clientName + '\'' +
                ", authCodeses=" + authCodeses +
                '}';
    }

    /** default constructor */
	public Clients() {
	}

	/** minimal constructor */
	public Clients(String clientId) {
		this.clientId = clientId;
	}

	/** full constructor */
	public Clients(String clientId, String clientSecret, String redirectUri,
			Long userId, String clientName, Set authCodeses) {
		this.clientId = clientId;
		this.clientSecret = clientSecret;
		this.redirectUri = redirectUri;
		this.userId = userId;
		this.clientName = clientName;
		this.authCodeses = authCodeses;
	}

	// Property accessors

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getClientId() {
		return this.clientId;
	}

	public void setClientId(String clientId) {
		this.clientId = clientId;
	}

	public String getClientSecret() {
		return this.clientSecret;
	}

	public void setClientSecret(String clientSecret) {
		this.clientSecret = clientSecret;
	}

	public String getRedirectUri() {
		return this.redirectUri;
	}

	public void setRedirectUri(String redirectUri) {
		this.redirectUri = redirectUri;
	}

	public Long getUserId() {
		return this.userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getClientName() {
		return this.clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public Set getAuthCodeses() {
		return this.authCodeses;
	}

	public void setAuthCodeses(Set authCodeses) {
		this.authCodeses = authCodeses;
	}

}