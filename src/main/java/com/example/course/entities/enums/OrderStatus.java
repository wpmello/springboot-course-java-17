package com.example.course.entities.enums;

public enum OrderStatus {

	// os atributos estao numerados para caso haja uma alteracao no futuro (adicionando ou removendo algum atributo)
	// o banco de dados nao seja quebrado
	WAITING_PAYMENT(1),
	PAID(2),
	SHIPPED(3),
	DELIVERED(4),
	CANCELED(5);
	
	private int code;
	
	private OrderStatus(int code) {
		this.code = code;
	}
	
	public int getCode() {
		return code;
	}
	
	// metodo estatico para retornar um tipo 'OrderStatus' a partir de um codigo (numero inteiro)
	public static OrderStatus valueOf(int code) {
		for (OrderStatus value : OrderStatus.values()) {
			if (value.getCode() == code) {
				return value;
			}
		}
		throw new IllegalArgumentException("Invalid OrderStatus code");
	}
}
