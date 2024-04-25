package com.learning.graphql.controllers;

import com.learning.graphql.schemas.Group;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
public class GroupController {
    @QueryMapping
    public Group getByName(@Argument String name) {
        return Group.getByName(name);
    }



}
