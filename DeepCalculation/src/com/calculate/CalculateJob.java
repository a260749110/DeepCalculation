package com.calculate;

import java.util.ArrayList;
import java.util.List;

import com.sql.dto.ParameterDto;

public class CalculateJob {
private ParameterDto base;

private List<ParameterDto> resultList;
public CalculateJob(ParameterDto dto)
{
	base=dto;
	
	resultList=new ArrayList<>();
	}

}
