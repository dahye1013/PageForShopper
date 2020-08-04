package com.sign.in.dto;

import com.sign.in.domain.entity.MemberEntity;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class MemberPersonalDto {
    private Long id;
    private String email;
    private String password;
    private String zipcode;
    private LocalDateTime createdDate;
    private LocalDateTime modifiedDate;

    public MemberPersonalDto(MemberEntity memberEntity) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.zipcode = zipcode;
    }

    public MemberEntity toEntity(){
        return MemberEntity.builder()
                .id(id)
                .email(email)
                .password(password)
                .zipcode(zipcode)
                .build();
    }

    @Builder
    public MemberPersonalDto(Long id, String email, String password, String zipcode) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.zipcode = zipcode;

    }
}
