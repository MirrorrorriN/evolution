package com.mirror.evolution.domain.DTO;

import lombok.Data;

/**
 * Created by mirrordingjing
 *
 * @Date 2019/5/5
 */
@Data
public class RiddleDTO {
    private Long id;

    private String question;

    private String hint;

    private String answer;

    private String explanation;

}
