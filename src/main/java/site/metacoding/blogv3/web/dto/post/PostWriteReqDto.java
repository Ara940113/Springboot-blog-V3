package site.metacoding.blogv3.web.dto.post;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.web.multipart.MultipartFile;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class PostWriteReqDto {

    @NotBlank
    private Integer categoryId;

    @Size(min = 1, max = 60)
    @NotBlank
    private String title;

    @NotNull // 공백은 보내도 되는데 키값은 전송해야한다
    private MultipartFile thumnailFile; // 섬네일 없으면 없는거 null 허용

    @NotNull
    private String content; // 컨텐트도 null 허용
}
