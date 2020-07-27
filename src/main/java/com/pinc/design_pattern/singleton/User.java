package com.pinc.design_pattern.singleton;

public class User {

    static enum EnumSingleton {

        INSTANCE;

        private User user;

        private EnumSingleton() {
            user = new User();
        }

        public User getInstance() {
            return user;
        }
    }

    public static User getInstance() {
        return EnumSingleton.INSTANCE.getInstance();
    }
}
