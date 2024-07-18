package com.tenzin.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.tenzin.datatypes.RoleType;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class AuthenticationResponse {

  private String accessToken;
  private String refreshToken;
  private boolean mfaEnabled;
  private String secretImageUri;
  private RoleType role;
}