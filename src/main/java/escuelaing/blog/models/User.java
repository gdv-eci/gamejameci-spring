package escuelaing.blog.models;

/**
 * User
 */
public class User {

  String name = "";
  String lastName = "";
  String email = "";
  String tp = "";
  String numDoc = "";
  String uniInv = "";
  String uniEst = "";
  String code = "";
  String cel = "";
  Boolean wa = false;
  Boolean veg = false;
  String rol = "";
  String level = "";

  public User() {
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getTp() {
    return tp;
  }

  public void setTp(String tp) {
    this.tp = tp;
  }

  public String getNumDoc() {
    return numDoc;
  }

  public void setNumDoc(String numDoc) {
    this.numDoc = numDoc;
  }

  public String getUniInv() {
    return uniInv;
  }

  public void setUniInv(String uniInv) {
    this.uniInv = uniInv;
  }

  public String getUniEst() {
    return uniEst;
  }

  public void setUniEst(String uniEst) {
    this.uniEst = uniEst;
  }

  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public String getCel() {
    return cel;
  }

  public void setCel(String cel) {
    this.cel = cel;
  }

  public Boolean getWa() {
    return wa;
  }

  public void setWa(Boolean wa) {
    this.wa = wa;
  }

  public Boolean getVeg() {
    return veg;
  }

  public void setVeg(Boolean veg) {
    this.veg = veg;
  }

  public String getRol() {
    return rol;
  }

  public void setRol(String rol) {
    this.rol = rol;
  }

  public String getLevel() {
    return level;
  }

  public void setLevel(String level) {
    this.level = level;
  }

}