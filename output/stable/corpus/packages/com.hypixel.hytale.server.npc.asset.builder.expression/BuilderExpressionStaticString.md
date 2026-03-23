# BuilderExpressionStaticString

Type: class | Package: com.hypixel.hytale.server.npc.asset.builder.expression | Extends: BuilderExpression

public class BuilderExpressionStaticString extends BuilderExpression

## Fields

- private final String string

## Methods

- public BuilderExpressionStaticString(String string)
- public ValueType getType()
- public boolean isStatic()
- public String getString(ExecutionContext executionContext)
- public void addToScope(String name, @Nonnull StdScope scope)
- public void updateScope(@Nonnull StdScope scope, String name, ExecutionContext executionContext)

Also in this package: BuilderExpression, BuilderExpressionDynamic, BuilderExpressionDynamicBoolean, BuilderExpressionDynamicBooleanArray, BuilderExpressionDynamicNumber, BuilderExpressionDynamicNumberArray, BuilderExpressionDynamicString, BuilderExpressionDynamicStringArray, BuilderExpressionStaticBoolean, BuilderExpressionStaticBooleanArray, BuilderExpressionStaticEmptyArray, BuilderExpressionStaticNumber, BuilderExpressionStaticNumberArray, BuilderExpressionStaticStringArray, SchemaGenerator

Complete API:
  public ValueType getType()
  public boolean isStatic()
  public String getString(ExecutionContext executionContext)
  public void addToScope(String name, StdScope scope)
  public void updateScope(StdScope scope, String name, ExecutionContext executionContext)

Fields:
private final String string
