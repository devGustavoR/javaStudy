package br.com.gustavoribeiro.JavaStudy.user;

public class UserModel {
  private String username;
  private String name;
  private int password;

  public void setUsername(String username) {
    this.username = username;
  }

  public String getUsername() {
    return username;
  }

  public void setName(String name) {
    this.name = name;
  }
  
  public String getName() {
    return name;
  }

  public void setPassword(int password) {
    this.password = password;
  }
  
  public int getPassword() {
    return password;
  }
}
