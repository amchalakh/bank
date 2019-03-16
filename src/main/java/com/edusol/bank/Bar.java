package com.edusol.bank;

public class Bar {
	
	String id;
	Foo foo;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Foo getFoo() {
		return foo;
	}
	public void setFoo(Foo foo) {
		this.foo = foo;
	}
	
	public String getFooName() {
		return foo.getName();
	}
	

}
