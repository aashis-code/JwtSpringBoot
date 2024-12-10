package com.springBoot.JwtAuth.Entity;

import java.util.Collection;
import java.util.Date;
import java.util.List;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "users")
@Entity
public class User implements UserDetails{
	
	    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

		@Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    @Column(nullable = false)
	    private Integer id;

	    @Column(nullable = false)
	    private String fullName;

	    @Column(unique = true, length = 100, nullable = false)
	    private String email;

	    @Column(nullable = false)
	    private String password;
	    
	    @Column(nullable = false)
	    private String about;

	    @CreationTimestamp
	    @Column(updatable = false, name = "created_at")
	    private Date createdAt;

	    @UpdateTimestamp
	    @Column(name = "updated_at")
	    private Date updatedAt;

	    @Override
	    public Collection<? extends GrantedAuthority> getAuthorities() {
	        return List.of();
	    }

	    public String getPassword() {
	        return password;
	    }

	    @Override
	    public String getUsername() {
	        return email;
	    }

	    @Override
	    public boolean isAccountNonExpired() {
	        return true;
	    }

	    @Override
	    public boolean isAccountNonLocked() {
	        return true;
	    }

	    @Override
	    public boolean isCredentialsNonExpired() {
	        return true;
	    }

	    @Override
	    public boolean isEnabled() {
	        return true;
	    }

}
