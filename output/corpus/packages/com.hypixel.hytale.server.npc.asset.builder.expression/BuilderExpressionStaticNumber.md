# BuilderExpressionStaticNumber

Type: class | Package: com.hypixel.hytale.server.npc.asset.builder.expression | Extends: BuilderExpression

public class BuilderExpressionStaticNumber extends BuilderExpression

## Fields

- private final double number

## Methods

- public BuilderExpressionStaticNumber(double number)
- public ValueType getType()
- public boolean isStatic()
- public double getNumber(ExecutionContext executionContext)
- public void addToScope(String name, @Nonnull StdScope scope)
- public void updateScope(@Nonnull StdScope scope, String name, ExecutionContext executionContext)
