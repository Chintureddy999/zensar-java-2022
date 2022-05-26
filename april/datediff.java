package april;
import java.util.*;
import java.time.*;
public class datediff {
    static void findDiff(LocalDate start_date, LocalDate end_date){
        Period diff=Period.between(start_date, end_date);
        System.out.println("Difference between two dates =");
        System.out.printf("%d years,%d months"+"%d days",diff.getYears(),diff.getMonths(),diff.getDays());
    
    }
    public static void main(String[] args) {
        LocalDate start_date=LocalDate.of(2022,05,13);
        LocalDate end_date=LocalDate.of(2025,06,11);
        findDiff(start_date,end_date);
    }
}
