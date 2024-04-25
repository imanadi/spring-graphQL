package com.learning.graphql.controllers;

import com.learning.graphql.schemas.Member;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class MemberController {


    @QueryMapping
    public List<Member> getAllMembers() {
        return Member.memebers;
    }

}
