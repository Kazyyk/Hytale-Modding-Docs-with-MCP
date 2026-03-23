---
title: "com.hypixel.hytale.server.npc.util.expression.compile"
package: "com.hypixel.hytale.server.npc.util.expression.compile"
generator_version: "2.0.0"
generated_at: "2026-03-21T06:08:32Z"
---

**Package:** `com.hypixel.hytale.server.npc.util.expression.compile`

This package implements a lexer, parser, and compiler for NPC expression evaluation. Supports arithmetic, logical, and comparison operators with function calls and tuples.

## Classes

| Type | Description |
|---|---|
| [CompileContext](CompileContext.md) | Compiles expression strings into executable instruction lists via the shunting-yard algorithm |
| [Lexer](Lexer.md) | Generic tokenizer that splits expression strings into tokens (identifiers, numbers, strings, operators) using a character-sequence matching trie |
| [LexerContext](LexerContext.md) | Mutable state for the lexer: tracks position, current token, and token string/number values during tokenization |
| [OperatorBinary](OperatorBinary.md) | Lookup table for binary operators mapping (token, lhs type, rhs type) to result type and code generation function |
| [OperatorUnary](OperatorUnary.md) | Lookup table for unary operators mapping (token, argument type) to result type and code generation function |
| [Parser](Parser.md) | Shunting-yard parser converting token streams into AST operations via operator precedence and bracket matching |

## Enums

| Type | Description |
|---|---|
| [Token](Token.md) | Enumeration of all expression tokens: operators, brackets, literals, and identifiers with precedence and flag metadata |
| [TokenFlags](TokenFlags.md) | Flags used by `Token` to classify token types: OPERAND, LITERAL, OPERATOR, UNARY, brackets, LIST |
