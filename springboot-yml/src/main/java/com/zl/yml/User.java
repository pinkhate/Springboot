package com.zl.yml;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

/**
 * @author ZL
 * @creatTime 2023-03-19
 */

@Component
@ConfigurationProperties(prefix = "user")
public class User {

    private String username;
    private String address;

    private List<String> favorites;

    private Dog[] dog;

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", address='" + address + '\'' +
                ", favorites=" + favorites +
                ", dog=" + Arrays.toString(dog) +
                '}';
    }

    public Dog[] getDog() {
        return dog;
    }

    public void setDog(Dog[] dog) {
        this.dog = dog;
    }

    public List<String> getFavorites() {
        return favorites;
    }

    public void setFavorites(List<String> favorites) {
        this.favorites = favorites;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}
