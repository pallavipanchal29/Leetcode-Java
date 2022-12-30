package string.easy;

import java.util.HashSet;

public class UniqueEmailAddresses {
    public static void main(String[] args) {
        String[] emails = {"test.email+alex@leetcode.com", "test.e.mail+bob.cathy@leetcode.com", "testemail+david@lee.tcode.com"};
        System.out.println(numUniqueEmails(emails));
    }

    public static int numUniqueEmails(String[] emails) {
        HashSet<String> ans = new HashSet<>();
        for (int i = 0; i < emails.length; i++) {
            StringBuilder sb = new StringBuilder();
            String email = emails[i];
            String[] parts = email.split("@");
            String local = parts[0];
            for (int j = 0; j < local.length(); j++) {
                if (local.charAt(j) == '+')
                    break;
                else if (local.charAt(j) == '.')
                    continue;
                else
                    sb.append(local.charAt(j));
            }
            sb.append("@");
            sb.append(parts[1]);
            ans.add(sb.toString());
        }
        return ans.size();
    }
}
