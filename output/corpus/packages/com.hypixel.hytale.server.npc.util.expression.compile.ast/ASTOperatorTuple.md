# ASTOperatorTuple

Type: class | Package: com.hypixel.hytale.server.npc.util.expression.compile.ast | Extends: ASTOperator

public class ASTOperatorTuple extends ASTOperator

Extends `ASTOperator`.

## Methods

- super(arrayType, token, tokenPosition)
- @Override public boolean isConstant()
- public static void fromParsedTuple(@Nonnull Parser.ParsedToken openingToken, int argumentCount, @Nonnull CompileContext compileContext)
- > throw new IllegalStateException("Invalid type in array: " + argumentType)
- > new ASTOperandNumberArray(token, tokenPosition, operandStack, firstArgument, argumentCount)
- > new ASTOperandStringArray(token, tokenPosition, operandStack, firstArgument, argumentCount)
- > new ASTOperandBooleanArray(token, tokenPosition, operandStack, firstArgument, argumentCount)
- > throw new IllegalStateException("Unexpected array type when creating constant array: " + arrayType)
