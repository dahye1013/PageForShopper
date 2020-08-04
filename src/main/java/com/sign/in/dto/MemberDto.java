package com.sign.in.dto;

import com.sign.in.domain.entity.MemberEntity;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class MemberDto {
    private Long id;
    private String email;
    private String password;
    private String zipcode;
    private String memberName;
    private LocalDateTime createdDate;
    private LocalDateTime modifiedDate;

    public MemberDto(MemberEntity memberEntity) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.zipcode = zipcode;
        this.memberName = memberName;
    }

    public MemberEntity toEntity(){
        return MemberEntity.builder()
                .memberName(memberName)
                .id(id)
                .email(email)
                .password(password)
                .zipcode(zipcode)
                .build();
    }

    @Builder
    public MemberDto(Long id, String email, String password, String zipcode, String memberName) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.zipcode = zipcode;
        this.memberName = memberName ;
    }
}
