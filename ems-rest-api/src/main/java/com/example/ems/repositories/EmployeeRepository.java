package com.example.ems.repositories;

        import com.example.ems.enitities.Employee;
        import org.springframework.data.jpa.repository.JpaRepository;
        import org.springframework.data.jpa.repository.Query;
        import org.springframework.data.repository.query.Param;
        import org.springframework.stereotype.Repository;

        import java.util.List;


@Repository
public interface EmployeeRepository  extends JpaRepository<Employee,Long> {


//        @Query("SELECT e FROM EMPLOYEES e WHERE e.firstName CONCAT('%',:firstName,'%') or e.lastName = CONCAT('%',:lastName,'%')")
//        List<Employee> findEmployeeByLastNameAndFirstNames(
//                @Param("firstName") String firstName,
//                @Param("lastName") String lastName);

        //  @Query("select c from Customer c where c.lastName LIKE :lastname||'%'")
        //List<Customer> findCustomByLastName( @Param("lastname") String lastName);


//        @Query("select e from Employee e where e.lastName LIKE :firstName||'%' OR e.firstName LIKE :lastName||'%'")
//        List<Employee> findEmployeeByLastNameAndFirstName(
//                @Param("firstName") String firstName,
//                @Param("lastName") String lastName);

         List<Employee> findByFirstNameContainingIgnoreCase(String firstName);

}
