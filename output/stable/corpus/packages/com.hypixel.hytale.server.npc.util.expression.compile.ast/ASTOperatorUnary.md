# ASTOperatorUnary

Type: class | Package: com.hypixel.hytale.server.npc.util.expression.compile.ast | Extends: ASTOperator

public class ASTOperatorUnary extends ASTOperator

Extends `ASTOperator`.

## Methods

- @Override public boolean isConstant()
- public static void fromUnaryOperator(@Nonnull Parser.ParsedToken operand, @Nonnull CompileContext compileContext)
- throw new ParseException("Type mismatch for operator " + token, tokenPosition)
- throw new IllegalStateException("Failed to evaluate constant unary AST")
- throw new ParseException("Not enough operands for operator '" + operand.tokenString, tokenPosition)
