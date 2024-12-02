package main

import "testing"

func TestValue(t *testing.T) {
	var number = 5
	if number != 5 {
		t.Errorf("Expected 5, but got %d", number)
	}
}
