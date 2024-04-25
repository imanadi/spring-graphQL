package com.learning.graphql.schemas;

import java.util.Arrays;
import java.util.List;

public record Member(String name, String email, Integer age) {

    public static List<Member> memebers = Arrays.asList(
            new Member("member-1", "member-1@email.com", 20),
            new Member("member-2", "member-2@email.com", 30),
            new Member("member-3", "member-3@email.com", 40),
            new Member("member-4", "member-4@email.com", 50)
    );

}
