package edu.unl.cc.roomvibe.domain.security;

import edu.unl.cc.roomvibe.domain.common.Person;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
@NamedQueries({
        @NamedQuery(name = "User.findLikeName", query = "select o from User o where o.name like :name"),
        @NamedQuery(name = "User.findById", query = "select o from User o where o.id = :id ")
})
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    @NotNull @NotEmpty
    private String name;

    @NotNull @NotEmpty
    private String password;

    @NotNull @NotEmpty
    @Column(unique = true)
    private String email;

    // Relations
    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH})
    private Person person;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "USER_ROLE",
            joinColumns = @JoinColumn(name = "USER_ID"),
            inverseJoinColumns = @JoinColumn(name = "ROLE_ID"))
    private Set<Role> roles;


    public User() {
        roles = new HashSet<>();
        person = new Person();
    }

    /**
     *
     * @param id
     * @param name
     * @param password
     * @throws IllegalArgumentException
     */
    public User(Long id, String name, String password) throws IllegalArgumentException{
        this();
        this.id = id;
        validateNameRestriction(name);
        this.name = name.trim();
        this.password = password;
    }

    /**
     *
     * @param id
     * @param name
     * @param password
     * @param person
     * @throws IllegalArgumentException
     */
    public User(Long id, String name, String password, Person person)
            throws IllegalArgumentException{
        this(id, name, password);
        this.person = person;
    }

    /**
     *
     * @param text
     * @throws IllegalArgumentException
     */
    private void validateNameRestriction(String text) throws IllegalArgumentException{
        if (text == null || text.isEmpty()){
            throw new IllegalArgumentException("Valor reequerido para name");
        }

        if (text.trim().length() < 5){
            throw new IllegalArgumentException("Valor para name debe supera los 5 caracteres");
        }
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 41 * hash + Objects.hashCode(this.id);
        hash = 41 * hash + Objects.hashCode(this.name);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        return false;
    }

    @Override
    public String toString() {
        return "User{" + "id:" + id + ", name:" + name + ", password:" + password
                + ", person{" + person + '}' + '}';
    }

    public void setEmail(String email) {
        this.email = email;
    }


}