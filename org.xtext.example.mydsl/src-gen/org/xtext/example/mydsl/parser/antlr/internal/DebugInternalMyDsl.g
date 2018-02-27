/*
 * generated by Xtext 2.13.0
 */
grammar DebugInternalMyDsl;

// Rule Model
ruleModel:
	ruletranslation_unit
;

// Rule translation_unit
ruletranslation_unit:
	ruleexternal_declaration
	ruletranslation_unit_linha
;

// Rule external_declaration
ruleexternal_declaration:
	(
		rulefunction_definition
		    |
		ruledeclaration
	)
;

// Rule declaration_specifiers
ruledeclaration_specifiers:
	(
		rulestorage_class_specifier
		ruledeclaration_specifiers
		    |
		rulestorage_class_specifier
		    |
		ruletype_specifier
		ruledeclaration_specifiers
		    |
		ruletype_specifier
		    |
		ruletype_qualifier
		ruledeclaration_specifiers
		    |
		ruletype_qualifier
		    |
		rulefunction_specifier
		ruledeclaration_specifiers
		    |
		rulefunction_specifier
		    |
		rulealignment_specifier
		ruledeclaration_specifiers
		    |
		rulealignment_specifier
	)
;

// Rule function_specifier
rulefunction_specifier:
	(
		'inline'
		    |
		'_Noreturn'
	)
;

// Rule alignment_specifier
rulealignment_specifier:
	(
		'_Alignas'
		'('
		ruletype_name
		')'
		    |
		'_Alignas'
		'('
		ruleconstant_expression
		')'
	)
;

// Rule type_qualifier
ruletype_qualifier:
	(
		'const'
		    |
		'restrict'
		    |
		'volatile'
		    |
		'_Atomic'
	)
;

// Rule type_specifier
ruletype_specifier:
	(
		'void'
		    |
		'char'
		    |
		'short'
		    |
		'int'
		    |
		'long'
		    |
		'float'
		    |
		'double'
		    |
		'signed'
		    |
		'unsigned'
		    |
		'bool'
		    |
		'_Complex'
		    |
		'_Imaginary'
		    |
		ruleatomic_type_specifier
		    |
		rulestruct_or_union_specifier
		    |
		ruleenum_specifier
		    |
		'typedef'
	)
;

// Rule enum_specifier
ruleenum_specifier:
	(
		'enum'
		'{'
		ruleenumerator_list
		'}'
		    |
		'enum'
		'{'
		ruleenumerator_list
		','
		'}'
		    |
		'enum'
		RULE_IDZ
		'{'
		ruleenumerator_list
		'}'
		    |
		'enum'
		RULE_IDZ
		'{'
		ruleenumerator_list
		','
		'}'
		    |
		'enum'
		RULE_IDZ
	)
;

// Rule enumerator_list
ruleenumerator_list:
	ruleenumerator
	ruleenumerator_list_linha
;

// Rule enumerator_list_linha
ruleenumerator_list_linha:
	(
		','
		ruleenumerator
		ruleenumerator_list_linha
	)?
;

// Rule enumerator
ruleenumerator:
	(
		ruleenumeration_constant
		'='
		ruleconstant_expression
		    |
		ruleenumeration_constant
	)
;

// Rule atomic_type_specifier
ruleatomic_type_specifier:
	'_Atomic'
	'('
	ruletype_name
	')'
;

// Rule struct_or_union_specifier
rulestruct_or_union_specifier:
	(
		rulestruct_or_union
		'{'
		rulestruct_declaration_list
		'}'
		    |
		rulestruct_or_union
		RULE_IDZ
		rulestruct_or_union_specifier_complement
	)
;

// Rule struct_or_union
rulestruct_or_union:
	(
		'struct'
		    |
		'union'
	)
;

// Rule struct_or_union_specifier_complement
rulestruct_or_union_specifier_complement:
	(
		'{'
		rulestruct_declaration_list
		'}'
	)?
;

// Rule struct_declaration_list
rulestruct_declaration_list:
	rulestruct_declaration
	rulestruct_declaration_list_linha
;

// Rule struct_declaration_list_linha
rulestruct_declaration_list_linha:
	(
		rulestruct_declaration
		rulestruct_declaration_list_linha
	)?
;

// Rule struct_declaration
rulestruct_declaration:
	(
		rulespecifier_qualifier_list
		';'
		    |
		rulespecifier_qualifier_list
		rulestruct_declarator_list
		';'
		    |
		rulestatic_assert_declaration
	)
;

// Rule struct_declarator_list
rulestruct_declarator_list:
	rulestruct_declarator
	rulestruct_declarator_list_linha
;

// Rule struct_declarator_list_linha
rulestruct_declarator_list_linha:
	(
		','
		rulestruct_declarator
		rulestruct_declarator_list_linha
	)?
;

// Rule struct_declarator
rulestruct_declarator:
	(
		':'
		ruleconstant_expression
		    |
		ruledeclarator
		':'
		ruleconstant_expression
		    |
		ruledeclarator
	)
;

// Rule specifier_qualifier_list
rulespecifier_qualifier_list:
	(
		ruletype_specifier
		rulespecifier_qualifier_list
		    |
		ruletype_specifier
		    |
		ruletype_qualifier
		rulespecifier_qualifier_list
		    |
		ruletype_qualifier
	)
;

// Rule storage_class_specifier
rulestorage_class_specifier:
	(
		'typedef'
		    |
		'extern'
		    |
		'static'
		    |
		'_Thread_local'
		    |
		'auto'
		    |
		'register'
	)
;

// Rule declaration
ruledeclaration:
	(
		ruledeclaration_specifiers
		';'
		    |
		ruledeclaration_specifiers
		ruleinit_declarator_list
		';'
		    |
		rulestatic_assert_declaration
	)
;

// Rule function_definition
rulefunction_definition:
	(
		ruledeclaration_specifiers
		ruledeclarator
		ruledeclaration_list
		rulecompound_statement
		    |
		ruledeclaration_specifiers
		ruledeclarator
		rulecompound_statement
	)
;

// Rule declaration_list
ruledeclaration_list:
	ruledeclaration
	ruledeclaration_list_linha
;

// Rule declaration_list_linha
ruledeclaration_list_linha:
	(
		ruledeclaration
		ruledeclaration_list_linha
	)?
;

// Rule declarator
ruledeclarator:
	(
		rulepointer
		ruledirect_declarator
		    |
		ruledirect_declarator
	)
;

// Rule pointer
rulepointer:
	(
		'*'
		ruletype_qualifier_list
		rulepointer
		    |
		'*'
		ruletype_qualifier_list
		    |
		'*'
		rulepointer
		    |
		'*'
	)
;

// Rule type_qualifier_list
ruletype_qualifier_list:
	ruletype_qualifier
	ruletype_qualifier_list_linha
;

// Rule type_qualifier_list_linha
ruletype_qualifier_list_linha:
	(
		ruletype_qualifier
		ruletype_qualifier_list_linha
	)?
;

// Rule direct_declarator
ruledirect_declarator:
	(
		RULE_IDZ
		ruledirect_declarator_linha
		?
		    |
		'('
		ruledeclarator
		')'
		ruledirect_declarator_linha
		?
	)
;

// Rule direct_declarator_linha
ruledirect_declarator_linha:
	ruledirect_declarator_complemento
	ruledirect_declarator_linha
	?
;

// Rule direct_declarator_complemento
ruledirect_declarator_complemento:
	(
		'['
		']'
		    |
		'['
		'*'
		']'
		    |
		'['
		'static'
		ruletype_qualifier_list
		ruleassignment_expression
		']'
		    |
		'['
		'static'
		ruleassignment_expression
		']'
		    |
		'['
		ruletype_qualifier_list
		'*'
		']'
		    |
		'['
		ruletype_qualifier_list
		'static'
		ruleassignment_expression
		']'
		    |
		'['
		ruletype_qualifier_list
		ruleassignment_expression
		']'
		    |
		'['
		ruletype_qualifier_list
		']'
		    |
		'['
		ruleassignment_expression
		']'
		    |
		'('
		ruleparameter_type_list
		')'
		    |
		'('
		')'
		    |
		'('
		ruleidentifier_list
		')'
	)
;

// Rule parameter_type_list
ruleparameter_type_list:
	(
		ruleparameter_lista
		','
		'...'
		    |
		ruleparameter_lista
	)
;

// Rule parameter_lista
ruleparameter_lista:
	ruleparameter_declaration
	(
		','
		ruleparameter_declaration
	)*
;

// Rule parameter_list_linha
ruleparameter_list_linha:
	(
		','
		ruleparameter_declaration
		ruleparameter_list_linha
	)?
;

// Rule parameter_declaration
ruleparameter_declaration:
	(
		ruledeclaration_specifiers
		ruledeclarator
		    |
		ruledeclaration_specifiers
		ruleabstract_declarator
		    |
		ruledeclaration_specifiers
	)
;

// Rule abstract_declarator
ruleabstract_declarator:
	(
		rulepointer
		ruledirect_abstract_declarator
		    |
		rulepointer
		    |
		ruledirect_abstract_declarator
	)
;

// Rule direct_abstract_declarator
ruledirect_abstract_declarator:
	(
		'('
		ruleabstract_declarator
		')'
		    |
		'['
		']'
		    |
		'['
		'*'
		']'
		    |
		'['
		'static'
		ruletype_qualifier_list
		ruleassignment_expression
		']'
		    |
		'['
		'static'
		ruleassignment_expression
		']'
		    |
		'['
		ruletype_qualifier_list
		'static'
		ruleassignment_expression
		']'
		    |
		'['
		ruletype_qualifier_list
		ruleassignment_expression
		']'
		    |
		'['
		ruletype_qualifier_list
		']'
		    |
		'['
		ruleassignment_expression
		']'
		    |
		'('
		')'
		    |
		'('
		ruleparameter_type_list
		')'
	)
	ruledirect_abstract_declarator_linha
;

// Rule initializer
ruleinitializer:
	(
		'{'
		ruleinitializer_list
		'}'
		    |
		'{'
		ruleinitializer_list
		','
		'}'
		    |
		ruleassignment_expression
	)
;

// Rule direct_abstract_declarator_linha
ruledirect_abstract_declarator_linha:
	(
		ruledirect_abstract_declarator_complement
		ruledirect_abstract_declarator_linha
	)?
;

// Rule direct_abstract_declarator_complement
ruledirect_abstract_declarator_complement:
	(
		'['
		']'
		    |
		'['
		'*'
		']'
		    |
		'['
		'static'
		ruletype_qualifier_list
		ruleassignment_expression
		']'
		    |
		'['
		'static'
		ruleassignment_expression
		']'
		    |
		'['
		ruletype_qualifier_list
		ruleassignment_expression
		']'
		    |
		'['
		ruletype_qualifier_list
		'static'
		ruleassignment_expression
		']'
		    |
		'['
		ruletype_qualifier_list
		']'
		    |
		'['
		ruleassignment_expression
		']'
		    |
		'('
		')'
		    |
		'('
		ruleparameter_type_list
		')'
	)
;

// Rule identifier_list
ruleidentifier_list:
	RULE_IDZ
	ruleidentifier_list_linha
;

// Rule identifier_list_linha
ruleidentifier_list_linha:
	(
		','
		RULE_IDZ
		ruleidentifier_list_linha
	)?
;

// Rule translation_unit_linha
ruletranslation_unit_linha:
	(
		ruleexternal_declaration
		ruletranslation_unit_linha
	)?
;

// Rule primary_expression
ruleprimary_expression:
	(
		RULE_IDZ
		    |
		ruleconstant
		    |
		'('
		ruleexpression
		')'
		    |
		rulegeneric_selection
	)
;

// Rule enumeration_constant
ruleenumeration_constant:
	RULE_IDZ
;

// Rule generic_selection
rulegeneric_selection:
	'_Generic'
	'('
	ruleassignment_expression
	','
	rulegeneric_assoc_list
	')'
;

// Rule generic_assoc_list
rulegeneric_assoc_list:
	rulegeneric_association
	rulegeneric_assoc_list_linha
;

// Rule generic_assoc_list_linha
rulegeneric_assoc_list_linha:
	(
		','
		rulegeneric_association
		rulegeneric_assoc_list_linha
	)?
;

// Rule generic_association
rulegeneric_association:
	(
		ruletype_name
		':'
		ruleassignment_expression
		    |
		'default'
		':'
		ruleassignment_expression
	)
;

// Rule postfix_expression
rulepostfix_expression:
	(
		ruleprimary_expression
		rulepostfix_expression_linha
		    |
		'('
		ruletype_name
		')'
		'{'
		ruleinitializer_list
		'}'
		rulepostfix_expression_linha
		    |
		'('
		ruletype_name
		')'
		'{'
		ruleinitializer_list
		','
		'}'
		rulepostfix_expression_linha
	)
;

// Rule postfix_expression_linha
rulepostfix_expression_linha:
	(
		rulepostfix_expression_complement
		rulepostfix_expression_linha
	)?
;

// Rule initializer_list
ruleinitializer_list:
	(
		ruledesignation
		ruleinitializer
		ruleinit_declarator_list_linha
		    |
		ruleinitializer
		ruleinit_declarator_list_linha
	)
;

// Rule initializer_list_complement
ruleinitializer_list_complement:
	(
		','
		ruledesignation
		ruleinitializer
		    |
		','
		ruleinitializer
	)
;

// Rule designation
ruledesignation:
	ruledesignator_list
	'='
;

// Rule designator_list
ruledesignator_list:
	ruledesignator
	ruledesignator_list_linha
;

// Rule designator_list_linha
ruledesignator_list_linha:
	(
		ruledesignator
		ruledeclaration_list_linha
	)?
;

// Rule designator
ruledesignator:
	(
		'['
		ruleconditional_expression
		']'
		    |
		'.'
		RULE_IDZ
	)
;

// Rule static_assert_declaration
rulestatic_assert_declaration:
	'_Static_assert'
	'('
	ruleconstant_expression
	','
	RULE_STRING_LITERAL
	')'
	';'
;

// Rule postfix_expression_complement
rulepostfix_expression_complement:
	(
		'['
		ruleexpression
		']'
		    |
		'('
		')'
		    |
		'('
		ruleargument_expression_list
		')'
		    |
		'.'
		RULE_IDZ
		    |
		'->'
		RULE_IDZ
		    |
		'++'
		    |
		'--'
	)
;

// Rule argument_expression_list
ruleargument_expression_list:
	ruleassignment_expression
	(
		','
		ruleassignment_expression
	)*
;

// Rule argument_expression_list_linha
ruleargument_expression_list_linha:
	(
		','
		ruleassignment_expression
		ruleargument_expression_list_linha
	)?
;

// Rule unary_expression
ruleunary_expression:
	(
		rulepostfix_expression
		    |
		'++'
		ruleunary_expression
		    |
		'--'
		ruleunary_expression
		    |
		ruleunary_operator
		rulecast_expression
		    |
		'sizeof'
		ruleunary_expression
		    |
		'sizeof'
		'('
		ruletype_name
		')'
		    |
		'_Alignof'
		'('
		ruletype_name
		')'
	)
;

// Rule cast_expression
rulecast_expression:
	(
		ruleunary_expression
		    |
		'('
		ruletype_name
		')'
		rulecast_expression
	)
;

// Rule multiplicative_expression
rulemultiplicative_expression:
	rulecast_expression
	rulemultiplicative_expression_linha
;

// Rule multiplicative_expression_linha
rulemultiplicative_expression_linha:
	(
		rulemultiplicative_expression_complement
		rulemultiplicative_expression_linha
	)?
;

// Rule multiplicative_expression_complement
rulemultiplicative_expression_complement:
	(
		'*'
		rulecast_expression
		    |
		'/'
		rulecast_expression
		    |
		'%'
		rulecast_expression
	)
;

// Rule additive_expression
ruleadditive_expression:
	rulemultiplicative_expression
	ruleadditive_expression_linha
;

// Rule additive_expression_linha
ruleadditive_expression_linha:
	(
		ruleadditive_expression_complement
		ruleadditive_expression_linha
	)?
;

// Rule additive_expression_complement
ruleadditive_expression_complement:
	(
		'+'
		rulemultiplicative_expression
		    |
		'-'
		rulemultiplicative_expression
	)
;

// Rule shift_expression
ruleshift_expression:
	ruleadditive_expression
	ruleshift_expression_linha
;

// Rule shift_expression_linha
ruleshift_expression_linha:
	(
		ruleshift_expression_complement
		ruleshift_expression_linha
	)?
;

// Rule shift_expression_complement
ruleshift_expression_complement:
	(
		'<<'
		ruleadditive_expression
		    |
		'>>'
		ruleadditive_expression
	)
;

// Rule relational_expression
rulerelational_expression:
	ruleshift_expression
	rulerelational_expression_linha
;

// Rule relational_expression_linha
rulerelational_expression_linha:
	(
		ruleshift_expression_complement
		rulerelational_expression_linha
	)?
;

// Rule equality_expression
ruleequality_expression:
	rulerelational_expression
	ruleequality_expression_linha
;

// Rule equality_expression_linha
ruleequality_expression_linha:
	(
		ruleequality_expression_complement
		ruleequality_expression_linha
	)?
;

// Rule equality_expression_complement
ruleequality_expression_complement:
	(
		'=='
		rulerelational_expression
		    |
		'<'
		rulerelational_expression
		    |
		'>'
		rulerelational_expression
		    |
		'<='
		rulerelational_expression
		    |
		'>='
		rulerelational_expression
		    |
		'!='
		rulerelational_expression
	)
;

// Rule statement
rulestatement:
	(
		rulelabeled_statement
		    |
		rulecompound_statement
		    |
		ruleexpression_statement
		    |
		ruleselection_statement
		    |
		ruleiteration_statement
		    |
		rulejump_statement
	)
;

// Rule jump_statement
rulejump_statement:
	(
		'goto'
		RULE_IDZ
		';'
		    |
		'continue'
		';'
		    |
		'break'
		';'
		    |
		'return'
		';'
		    |
		'return'
		ruleexpression
		';'
	)
;

// Rule iteration_statement
ruleiteration_statement:
	(
		'while'
		'('
		ruleexpression
		')'
		rulestatement
		    |
		'do'
		rulestatement
		'while'
		'('
		ruleexpression
		')'
		';'
		    |
		'for'
		'('
		ruleexpression_statement
		ruleexpression_statement
		')'
		rulestatement
		    |
		'for'
		'('
		ruleexpression_statement
		ruleexpression_statement
		ruleexpression
		')'
		rulestatement
		    |
		'for'
		'('
		ruledeclaration
		ruleexpression_statement
		')'
		rulestatement
		    |
		'for'
		'('
		ruledeclaration
		ruleexpression_statement
		ruleexpression
		')'
		rulestatement
	)
;

// Rule selection_statement
ruleselection_statement:
	(
		'if'
		'('
		ruleexpression
		')'
		rulestatement
		'else'
		rulestatement
		    |
		'if'
		'('
		ruleexpression
		')'
		rulestatement
		    |
		'switch'
		'('
		ruleexpression
		')'
		rulestatement
	)
;

// Rule labeled_statement
rulelabeled_statement:
	(
		RULE_IDZ
		':'
		rulestatement
		    |
		'case'
		ruleconditional_expression
		':'
		rulestatement
		    |
		'default'
		':'
		rulestatement
	)
;

// Rule compound_statement
rulecompound_statement:
	(
		'{'
		'}'
		    |
		'{'
		ruleblock_item_list
		'}'
	)
;

// Rule block_item_list
ruleblock_item_list:
	ruleblock_item
	ruleblock_item_list_linha
	?
;

// Rule block_item_list_linha
ruleblock_item_list_linha:
	ruleblock_item
	ruleblock_item_list_linha
	?
;

// Rule block_item
ruleblock_item:
	(
		ruledeclaration
		    |
		rulestatement
	)
;

// Rule expression_statement
ruleexpression_statement:
	(
		';'
		    |
		ruleexpression
		';'
	)
;

// Rule and_expression
ruleand_expression:
	ruleequality_expression
	ruleand_expression_linha
;

// Rule and_expression_linha
ruleand_expression_linha:
	(
		'&'
		ruleequality_expression
		ruleand_expression_linha
	)?
;

// Rule exclusive_or_expression
ruleexclusive_or_expression:
	ruleand_expression
	ruleexclusive_or_expression_linha
;

// Rule exclusive_or_expression_linha
ruleexclusive_or_expression_linha:
	(
		'^'
		ruleand_expression
		ruleexclusive_or_expression_linha
	)?
;

// Rule inclusive_or_expression
ruleinclusive_or_expression:
	ruleexclusive_or_expression
	ruleinclusive_or_expression_linha
;

// Rule inclusive_or_expression_linha
ruleinclusive_or_expression_linha:
	(
		'|'
		ruleexclusive_or_expression
		ruleinclusive_or_expression_linha
	)?
;

// Rule logical_and_expression
rulelogical_and_expression:
	ruleinclusive_or_expression
	rulelogical_and_expression_linha
;

// Rule logical_and_expression_linha
rulelogical_and_expression_linha:
	(
		'and'
		ruleinclusive_or_expression
		rulelogical_and_expression_linha
	)?
;

// Rule logical_or_expression
rulelogical_or_expression:
	rulelogical_and_expression
	rulelogical_or_expression_linha
;

// Rule logical_or_expression_linha
rulelogical_or_expression_linha:
	(
		'or'
		rulelogical_and_expression
		rulelogical_or_expression_linha
	)?
;

// Rule conditional_expression
ruleconditional_expression:
	rulelogical_or_expression
	ruleconditional_expression_linha
;

// Rule conditional_expression_linha
ruleconditional_expression_linha:
	(
		'?'
		ruleexpression
		':'
		ruleconditional_expression
		ruleconditional_expression_linha
	)?
;

// Rule assignment_expression
ruleassignment_expression:
	(
		ruleconditional_expression
		    |
		ruleunary_expression
		ruleassignment_operator
		ruleassignment_expression
	)
;

// Rule assignment_operator
ruleassignment_operator:
	(
		'='
		    |
		'*='
		    |
		'/='
		    |
		'%='
		    |
		'+='
		    |
		'-='
		    |
		'<<='
		    |
		'>>='
		    |
		'&='
		    |
		'^='
		    |
		'|='
	)
;

// Rule unary_operator
ruleunary_operator:
	(
		'&'
		    |
		'*'
		    |
		'+'
		    |
		'-'
		    |
		'~'
		    |
		'!'
	)
;

// Rule type_name
ruletype_name:
	(
		rulespecifier_qualifier_list
		ruleabstract_declarator
		    |
		rulespecifier_qualifier_list
	)
;

// Rule expression
ruleexpression:
	ruleassignment_expression
	ruleexpression_linha
;

// Rule expression_linha
ruleexpression_linha:
	(
		','
		ruleassignment_expression
		ruleexpression_linha
	)?
;

// Rule constant_expression
ruleconstant_expression:
	ruleconditional_expression
;

// Rule init_declarator_list
ruleinit_declarator_list:
	ruleinit_declarator
	ruleinit_declarator_list_linha
;

// Rule init_declarator_list_linha
ruleinit_declarator_list_linha:
	(
		','
		ruleinit_declarator
		ruleinit_declarator_list_linha
	)?
;

// Rule init_declarator
ruleinit_declarator:
	(
		ruledeclarator
		'='
		ruleinitializer
		    |
		ruledeclarator
	)
;

// Rule constant
ruleconstant:
	(
		RULE_INT
		    |
		RULE_FLOAT
		    |
		RULE_CHAR
		    |
		'enum'
	)
;

RULE_IDZ : ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'1'..'9')*;

RULE_CHAR : '\'' . '\'';

RULE_FLOAT : ('0'..'9')+ '.' ('0'..'9')*;

fragment RULE_O : '0'..'7';

fragment RULE_D : '0'..'9';

fragment RULE_NZ : '1'..'9';

fragment RULE_A : ('a'..'z'|'A'..'Z'|'_'|'0' '..' '9');

fragment RULE_H : ('a'..'f'|'A'..'F'|'0' '..' '9');

fragment RULE_HP : '0' ('x'|'X');

fragment RULE_E : ('E'|'e') ('+'|'-')? RULE_D '+';

fragment RULE_P : ('P'|'p') ('+'|'-')? '{' RULE_D '}' '+';

fragment RULE_FS : ('f'|'F'|'l'|'L');

fragment RULE_ES : RULE_A;

fragment RULE_IS : (('u'|'U') ('l'|'L'|'l' 'l'|'L' 'L')?|('l'|'L'|'l' 'l'|'L' 'L') ('u'|'U')?);

fragment RULE_CP : ('u'|'U'|'L');

fragment RULE_SP : ('u' '8'|'u'|'U'|'L');

RULE_WS : (' '|'\t'|'\r'|'\n'|'\f')+ {skip();};

RULE_I_CONSTANT : (RULE_HP RULE_H '+' RULE_IS?|RULE_NZ RULE_D '*' RULE_IS?|'0' RULE_O '*' RULE_IS?|RULE_CP? '\'' (('^'|'\''|'\\'|'\n')|RULE_ES)+ '\'');

RULE_F_CONSTANT : (RULE_D '+' RULE_E RULE_FS?|RULE_D '*' '.' RULE_D '+' RULE_E? RULE_FS?|RULE_D '+' '.' RULE_E? RULE_FS?|RULE_HP RULE_H '+' RULE_P RULE_FS? RULE_HP RULE_H '*' '.' RULE_H '+' RULE_P RULE_FS?|RULE_HP RULE_H '+' '.' RULE_P RULE_FS?);

RULE_STRING_LITERAL : (RULE_SP? '"' (('^'|'\''|'\\'|'\n')|RULE_ES)* '"' RULE_WS*)+;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/' {skip();};

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')? {skip();};

RULE_ANY_OTHER : .;
