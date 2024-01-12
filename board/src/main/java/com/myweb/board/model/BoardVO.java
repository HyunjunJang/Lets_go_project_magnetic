package com.myweb.board.model;

import java.sql.Timestamp;

public class BoardVO {

	private int board_id;
	private String member_id;
	private String entty_type;
	private String bd_title;
	private String bd_contents;
	private Timestamp bd_date;
	private Timestamp bd_update;
	private int bd_cnt;
	
	public BoardVO() {
	}

	public BoardVO(int board_id, String member_id, String entty_type, String bd_title, String bd_contents,
			Timestamp bd_date, Timestamp bd_update, int bd_cnt) {
		super();
		this.board_id = board_id;
		this.member_id = member_id;
		this.entty_type = entty_type;
		this.bd_title = bd_title;
		this.bd_contents = bd_contents;
		this.bd_date = bd_date;
		this.bd_update = bd_update;
		this.bd_cnt = bd_cnt;
	}
	
	@Override
	public String toString() {
		return "BoardVO [board_id=" + board_id + ", member_id=" + member_id + ", entty_type=" + entty_type + ", bd_title="
				+ bd_title + ", bd_contents=" + bd_contents + ", bd_date=" + bd_date + ", bd_update=" + bd_update
				+ ", bd_cnt=" + bd_cnt + "]";
	}

	public int getBoard_id() {
		return board_id;
	}

	public void setBoard_id(int board_id) {
		this.board_id = board_id;
	}

	public String getMember_id() {
		return member_id;
	}

	public void setMember_id(String member_id) {
		this.member_id = member_id;
	}

	public String getEntty_type() {
		return entty_type;
	}

	public void setEntty_type(String entty_type) {
		this.entty_type = entty_type;
	}

	public String getBd_title() {
		return bd_title;
	}

	public void setBd_title(String bd_title) {
		this.bd_title = bd_title;
	}

	public String getBd_contents() {
		return bd_contents;
	}

	public void setBd_contents(String bd_contents) {
		this.bd_contents = bd_contents;
	}

	public Timestamp getBd_date() {
		return bd_date;
	}

	public void setBd_date(Timestamp bd_date) {
		this.bd_date = bd_date;
	}

	public Timestamp getBd_update() {
		return bd_update;
	}

	public void setBd_update(Timestamp bd_update) {
		this.bd_update = bd_update;
	}

	public int getBd_cnt() {
		return bd_cnt;
	}

	public void setBd_cnt(int bd_cnt) {
		this.bd_cnt = bd_cnt;
	}



	
	
	
	
	
}
