package de.becoca;


import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.domain.AbstractAggregateRoot;
import org.springframework.data.relational.core.mapping.Table;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Table(value = "customer")
public class Customer extends AbstractAggregateRoot<Customer> {

    @Id
    private String id;
    private String firstName;
    private String lastName;

}
