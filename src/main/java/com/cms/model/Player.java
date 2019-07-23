package com.cms.model;

public class Player {
	private Long id;
	private Long sport_team_id;
	private String last_name;
	private String first_name;
	private String full_name;
	
	public Player(Long id, Long sport_team_id, String last_name, String first_name, String full_name) {
		super();
		this.id = id;
		this.sport_team_id = sport_team_id;
		this.last_name = last_name;
		this.first_name = first_name;
		this.full_name = full_name;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getSport_team_id() {
		return sport_team_id;
	}
	public void setSport_team_id(Long sport_team_id) {
		this.sport_team_id = sport_team_id;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getFull_name() {
		return full_name;
	}
	public void setFull_name(String full_name) {
		this.full_name = full_name;
	}
	@Override
	public String toString() {
		return "Player [id=" + id + ", sport_team_id=" + sport_team_id + ", last_name=" + last_name + ", first_name="
				+ first_name + ", full_name=" + full_name + "]";
	}
	
	
}
