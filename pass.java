import java.util.*;
public class pass{ 
    public static void main(String[] args) {
        int marks = 77;
        String status = (marks>= 75) ? "Distinctionn": (marks>=33) ? "pass" : "fail";
        System.out.println(status);
        }
    }