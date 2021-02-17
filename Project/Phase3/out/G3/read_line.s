.data
	_string_true: .asciiz "true"
	_string_false: .asciiz "false"
	errorMsg: .asciiz "Semantic Error"
	_array_size_negative_error: .asciiz "ERROR : array size is negative"
	aa_: .space 64
.text
.globl main
	main:
	# Read String from input
	li $v0, 8
	la $a0, aa_
	li $a1, 64
	syscall
	# Print aa_
	li $v0, 4
	la $a0, aa_
	syscall
	
	# Printing a new line in mips' output
	li $a0, 0xA
	li $v0, 0xB
	syscall
	
	jr $ra
