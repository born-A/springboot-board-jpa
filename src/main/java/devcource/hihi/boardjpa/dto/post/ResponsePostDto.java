package devcource.hihi.boardjpa.dto.post;

import devcource.hihi.boardjpa.domain.User;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotNull;

public record ResponsePostDto(Long id,String title,String content,User created_by) {
}