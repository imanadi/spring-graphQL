package com.learning.graphql.schemas;

import org.springframework.graphql.data.method.annotation.QueryMapping;

import java.util.Arrays;
import java.util.List;

public record Group(String name, String description, List<Member> members) {


    public static List<Group> groups = Arrays.asList(
            new Group("group-1", "Group 1", Arrays.asList(Member.memebers.get(0), Member.memebers.get(3))),
            new Group("group-2", "Group 2", Arrays.asList(Member.memebers.get(1), Member.memebers.get(2))),
            new Group("group-3", "Group 3", Arrays.asList(Member.memebers.get(2), Member.memebers.get(1))),
            new Group("group-4", "Group 4", Arrays.asList(Member.memebers.get(3), Member.memebers.get(1)))
    );

    public static Group getByName(String name) {
        return groups.stream()
                .filter(group -> group.name().equals(name))
                .findFirst()
                .orElse(null);
    }

}
