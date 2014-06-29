package com.zts1993.Bean;

import java.io.Serializable;

/**
 * UserTemp entity. @author MyEclipse Persistence Tools
 */

public class UserTemp implements Serializable {

	// Fields

	private Long id;
	private String uuid;
	private String head;
	private String name;
	private String nick;
    private String hash;
    private String other;

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other;
    }

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public UserTemp(Long id, String uuid, String head, String name, String nick, String hash, String other) {
        this.id = id;
        this.uuid = uuid;
        this.head = head;
        this.name = name;
        this.nick = nick;
        this.hash = hash;
        this.other = other;
    }
    // Constructors

	/** default constructor */
	public UserTemp() {
	}



	// Property accessors

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUuid() {
		return this.uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public String getHead() {
		return this.head;
	}


    public void setHead(String head) {
		this.head = head;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNick() {
		return this.nick;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}


    @Override
    public String toString() {
        return "UserTemp{" +
                "id=" + id +
                ", uuid='" + uuid + '\'' +
                ", head='" + head + '\'' +
                ", name='" + name + '\'' +
                ", nick='" + nick + '\'' +
                ", hash='" + hash + '\'' +
                ", other='" + other + '\'' +
                '}';
    }
}