package com.mb.social.network.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SenderResponse {
    private String id;
    private String name;
    private String email;
    private String avatar;
}
