package com.dd.api.service;

import java.util.UUID;

import com.dd.api.dto.request.TimeTableRegisterRequestDTO;
import com.dd.api.dto.request.TimeTableUpdateRequestDTO;
import com.dd.api.dto.response.TimeTableGetListWrapperResponseDTO;
import com.dd.api.dto.response.TimeTableResponseDTO;
import com.dd.db.entity.schoollife.TimeTable;

public interface TimeTableService {

	TimeTable register(String accessToken, TimeTableRegisterRequestDTO timeTableRegisterRequestDTO);

	TimeTableResponseDTO get(String accessToken, UUID timeTableId);

	TimeTable modify(String accessToken, TimeTableUpdateRequestDTO timeTableUpdateRequestDTO);

	TimeTable delete(String accessToken, UUID timeTableId);

	TimeTableGetListWrapperResponseDTO getAll(String accessToken);

}
