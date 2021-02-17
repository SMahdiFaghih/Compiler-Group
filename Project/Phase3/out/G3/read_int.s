.data
	_string_true: .asciiz "true"
	_string_false: .asciiz "false"
	errorMsg: .asciiz "Semantic Error"
	_array_size_negative_error: .asciiz "ERROR : array size is negative"
	aa_: .word 0
.text
.globl main
	main:
	# Reading an integer
	li $v0, 5
	syscall
	la $s0, aa_
	sw $v0, 0($s0)
	
	# Print aa_
	li $v0, 1
	lw $a0, aa_
	syscall
	
	# Printing a new line in mips' output
	li $a0, 0xA
	li $v0, 0xB
	syscall
	
	jr $ra
