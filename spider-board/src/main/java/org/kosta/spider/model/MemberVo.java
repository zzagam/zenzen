package org.kosta.spider.model;

public class MemberVo {
  private String name;
  private String password;
  private String id;
  private String address;
  
  /**
   * 멤버 초기화 생성자.
   * @param name 이름.
   * @param password 비번.
   * @param id 아이디.
   * @param address 주소.
   */
  public MemberVo(String name, String password, String id, String address) {
    super();
    this.name = name;
    this.password = password;
    this.id = id;
    this.address = address;
  }
  
  public MemberVo() {
    super();
    // TODO Auto-generated constructor stub
  }
  
  public String getName() {
    return name;
  }
  
  public void setName(String name) {
    this.name = name;
  }
  
  public String getPassword() {
    return password;
  }
  
  public void setPassword(String password) {
    this.password = password;
  }
  
  public String getId() {
    return id;
  }
  
  public void setId(String id) {
    this.id = id;
  }
  
  public String getAddress() {
    return address;
  }
  
  public void setAddress(String address) {
    this.address = address;
  }
  
  @Override
  public String toString() {
    return "MemberVo [name=" + name + ", password=" + password + ", id=" + id + ", address="
        + address + "]";
  }
  
  
}
