# AST

Type: class | Package: com.hypixel.hytale.server.npc.util.expression.compile.ast

public abstract class AST

Abstract base class in the `ast` package.

## Fields

- private AST parent
- @Nullable protected Function<Scope, ExecutionContext.Instruction> codeGen

## Methods

- public AST getParent()
- public void setParent(AST parent)
- @Nonnull public ValueType getValueType()
- @Nonnull public Token getToken()
- public int getTokenPosition()
- @Nullable public Function<Scope, ExecutionContext.Instruction> getCodeGen()
- public abstract boolean isConstant()
- public ExecutionContext.Operand asOperand()
- throw new IllegalStateException("AST: Cannot be returned as operand")
- public String getString()
- throw new IllegalStateException("AST: Cannot return string")
- public boolean getBoolean()
- throw new IllegalStateException("AST: Cannot return boolean")
- public double getNumber()
- throw new IllegalStateException("AST: Cannot return number")
- @Nonnull public ValueType returnType()
- public ValueType genCode(@Nonnull List<ExecutionContext.Instruction> list, Scope scope)
