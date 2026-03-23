# ASTOperand

Type: class | Package: com.hypixel.hytale.server.npc.util.expression.compile.ast | Extends: AST

public abstract class ASTOperand extends AST

Abstract base class in the `ast` package.

## Methods

- super(valueType, token, tokenPosition)
- return new ASTOperandString(token, tokenPosition, tokenString)
- return new ASTOperandNumber(token, tokenPosition, operand.tokenNumber)
- throw new IllegalStateException("Unknown parser operand type in AST" + operand.token)
