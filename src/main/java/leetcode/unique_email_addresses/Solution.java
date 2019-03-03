package leetcode.unique_email_addresses;

import java.util.*;

class Solution {
  public int numUniqueEmails(String[] emails) {
    Set<String> emailSet = new HashSet<String>();
    String filtered;

    for (int i = 0; i < emails.length; i++) {
      filtered = filter(emails[i]);
      // System.out.println(filtered);
      emailSet.add(filtered);
    }

    return emailSet.size();
  }

  private String filter(String str) {
    int firstPlus;
    String domain, account;

    account = str.split("@")[0];
    domain = str.split("@")[1];

    firstPlus = account.indexOf("+");

    if (firstPlus >= 0) {
      account = account.substring(0, firstPlus);
    }

    account = account.replace(".", "");

    return account.concat(domain);
  }
}
