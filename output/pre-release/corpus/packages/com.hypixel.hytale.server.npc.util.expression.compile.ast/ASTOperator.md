# ASTOperator

Type: class | Package: com.hypixel.hytale.server.npc.util.expression.compile.ast | Extends: AST

public abstract class ASTOperator extends AST

Abstract base class in the `ast` package.

## Methods

- super(returnType, token, tokenPosition)
- public void addArgument(@Nonnull AST argument)
- @Nonnull public List<AST> getArguments()
- @Override public ValueType genCode(@Nonnull List<ExecutionContext.Instruction> list, Scope scope)
- public static void fromParsedOperator(@Nonnull Parser.ParsedToken operand, @Nonnull CompileContext compileContext)
- throw new ParseException("Not enough operands for operator '" + operand.tokenString, operand.tokenPosition)
