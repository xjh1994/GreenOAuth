package com.zts1993.Bean;

/**
 * UserTemp entity. @author MyEclipse Persistence Tools
 */

public class UserTemp implements java.io.Serializable {

	// Fields

	private Long id;
	private String uuid;
	private String head;
	private String name;
	private String nick;

	// Constructors

	/** default constructor */
	public UserTemp() {
	}

	/** full constructor */
	public UserTemp(String uuid, String head, String name, String nick) {
		this.uuid = uuid;
		this.head = head;
		this.name = name;
		this.nick = nick;
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

    @Override
    public String toString() {
        return "UserTemp{" +
                "id=" + id +
                ", uuid='" + uuid + '\'' +
                ", head='" + head + '\'' +
                ", name='" + name + '\'' +
                ", nick='" + nick + '\'' +
                '}';
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

}