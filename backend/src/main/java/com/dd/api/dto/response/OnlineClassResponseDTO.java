package com.dd.api.dto.response;

import java.util.Map;
import java.util.UUID;

import com.dd.common.model.BaseResponseDto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Getter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel("OnlineClassResponseDTO")
public class OnlineClassResponseDTO extends BaseResponseDto {

	@ApiModelProperty(name = "온라인 수업 정보 - classId")
	private UUID classId;

	@ApiModelProperty(name = "파일", example = "orginFile, 파일 URL")
	private Map<String, String> files;

	public static OnlineClassResponseDTO of(Integer statusCode, String message,
			OnlineClassResponseDTO onlineClassResponseDTO) {
		OnlineClassResponseDTO res = onlineClassResponseDTO;
		res.setStatusCode(statusCode);
		res.setMessage(message);

		return res;
	}
}
