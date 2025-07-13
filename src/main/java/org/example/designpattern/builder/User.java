package org.example.designpattern.builder;

public class User {

    private final String name;
    private final int age;
    private final String address;

    private User(userBuilder userBuilder) {
        this.name = userBuilder.name;
        this.address = userBuilder.address;
        this.age = userBuilder.age;
    }


  public static   class userBuilder {

      private final String name;
      private int age;
      private String address;

      public userBuilder(String name) {
          this.name = name;
      }

      public userBuilder age(int age) {
          this.age = age;
          return this;
      }

      public userBuilder address(String address) {
          this.address = address;
          return this;
      }

      public User build() {
          return new User(this);
      }
  }
        @Override
        public String toString()
        {
            return name+" "+ age+ " "+ address;
        }
    }
