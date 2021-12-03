package com.khadar.dp.builder;

/***
 * @author Khadar Basha Shaik
 * @version V1
 *
 */
public class User {

    private final String firstName;

    private final String lastName;

    private final int age;

    private final String phone;

    private final String address;

    /**
     * Constructor to build the User class object using UserBuilder
     * @param userBuilder
     */
    public User(UserBuilder userBuilder){
        this.firstName = userBuilder.firstName;
        this.lastName = userBuilder.lastName;
        this.age = userBuilder.age;
        this.phone = userBuilder.phone;
        this.address = userBuilder.address;
    }

    /**
     * Getter method to get the firstName
     * @return
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Getter method to return the lastName
     * @return
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Getter method to return the age
     * @return
     */
    public int getAge() {
        return age;
    }

    /**
     * Getter method to return the phone
     * @return
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Getter method to return the address
     * @return
     */
    public String getAddress() {
        return address;
    }

    public static class UserBuilder{

        private final String firstName;

        private final String lastName;

        private int age;

        private String phone;

        private String address;

        /**
         * Building UserBuilder Object with mandatory params firstName and lastName
         * @param firstName
         * @param lastName
         */
        public UserBuilder(String firstName, String lastName){
            this.firstName = firstName;
            this.lastName = lastName;
        }

        /**
         * Set age to UserBuilder object
         * @param age
         * @return
         */
        public UserBuilder age(int age){
            this.age = age;
            return this;
        }

        /**
         * Set Phone to UserBuilder Object
         * @param phone
         * @return
         */
        public UserBuilder phone(String phone){
            this.phone = phone;
            return this;
        }

        /**
         * Set address attribute to UserBuilder Object
         * @param address
         * @return
         */
        public UserBuilder address(String address){
            this.address = address;
            return this;
        }

        /**
         * Method to build the User Object;
         * @return
         */
        public User build(){
            return new User(this);
        }

    }

    /**
     * To String method
     * @return
     */
    @Override
    public String toString() {
        return firstName+" "+lastName;
    }
}


