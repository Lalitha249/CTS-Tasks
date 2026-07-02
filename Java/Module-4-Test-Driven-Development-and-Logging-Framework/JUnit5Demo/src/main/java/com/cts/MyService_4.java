package com.cts;

public class MyService_4 {
private ExternalAPi_4 api;
 public MyService_4(ExternalAPi_4 api)
 {
	 this.api = api;
 }
 public void procesData() {
	 api.sendData();
 }
}
