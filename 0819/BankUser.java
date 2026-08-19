package com.the.dto;

import java.util.Objects;

public class BankUser {
	 private String id="noData";
	 private String pw="noData";
	 private double account=0;
	 
	 public BankUser() {
		 this("u1","u1",0);
	 }

	 public BankUser(String id, String pw, double account) {
		super();
		this.id = id;
		this.pw = pw;
		this.account = account;
	 }

	 public String getId() {
		 return id;
	 }

	 public void setId(String id) {
		 this.id = id;
	 }

	 public String getPw() {
		 return pw;
	 }

	 public void setPw(String pw) {
		 this.pw = pw;
	 }

	 public double getAccount() {
		 return account;
	 }

	 public void setAccount(double account) {
		 this.account = account;
	 }

	 @Override
	 public int hashCode() {
		return Objects.hash(id, pw);
	 }

	 @Override
	 public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BankUser other = (BankUser) obj;
		return Objects.equals(id, other.id) && Objects.equals(pw, other.pw);
	 }

	 @Override
	 public String toString() {
		return "고객정보:BankUser [id=" + id + ", pw=" + pw + ", account=" + account + "]";
	 }
	 

}

