package Exam.src.Exam0725;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

class Account {
  String id;
  String name;
  Integer balance;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Integer getBalance() {
    return balance;
  }

  public void setBalance(Integer balance) {
    this.balance = balance;
  }

  public Account(String id, String name, Integer balance) {
    this.id = id;
    this.name = name;
    this.balance = balance;
  }
}

public class HashMapTest1 {
  public static void main(String[] args) {
//id를 key, type을 value로 가져가기
    HashMap<String, Account> hs = new HashMap<>();

    hs.put("1001", new Account("1001","hong",100000));
    hs.put("1002", new Account("1002","song",200000));
    hs.put("1003", new Account("1003","tong",300000));
    hs.put("1004", new Account("1004","gong",400000));
    hs.put("1005", new Account("1005","bong",500000));

    //get은 키를 가지고 value를 얻어 오는 것.
    Account acc = hs.get("1003");
    System.out.println(acc);

    if(hs.containsKey("1006")==false){
      hs.put("1006", new Account("1006","wong",600000));
    }
    System.out.println(hs);

    hs.remove("1006");
    System.out.println(hs);

    Set<String> ks = hs.keySet();
    System.out.println(ks);

    Collection<Account> vs = hs.values();
    System.out.println(vs);

    for(Account ac : hs.values()){
      System.out.println(ac);
    }

    hs.values().iterator();

    for(Set<Entry<String,Account>> es : hs.entrySet()){

    }


  }
}
