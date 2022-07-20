package com.empresa.proyecto.dto.response;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class OutResponse<T> implements Serializable {
	private static final long serialVersionUID = 1L;

	private Integer rcodigo;
	private String rmensaje;
	private T objeto;
}
