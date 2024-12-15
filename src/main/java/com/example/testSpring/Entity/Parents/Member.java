package com.example.testSpring.Entity.Parents;

import javax.persistence.*;

@Entity
@DiscriminatorColumn//부모클래스에 구분 컬럼
@Inheritance(strategy = InheritanceType.JOINED)
abstract public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="person_id")
    private Long id;

    @Column(unique = true)
    private String email;
    private String pwd;
    private String name;
    private String birth;
    private String gender;
    private String phone;
}
