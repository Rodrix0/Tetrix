package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class TetrixTest {

	@Test
	void CrearPieceT(){
		Tetrix piecet=new PieceT(1);
		assertTrue(piecet.FueCreado());
		
	}

}
