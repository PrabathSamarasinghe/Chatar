package com.chatar.backend.service.serviceInterfaces;

import com.chatar.backend.dto.AuthRequest;
import com.chatar.backend.dto.AuthResponse;

public interface AuthService {
    AuthResponse login(AuthRequest authRequest);
}
