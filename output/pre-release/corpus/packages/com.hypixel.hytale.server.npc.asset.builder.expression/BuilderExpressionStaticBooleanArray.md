# BuilderExpressionStaticBooleanArray

Type: class | Package: com.hypixel.hytale.server.npc.asset.builder.expression | Extends: BuilderExpression

public class BuilderExpressionStaticBooleanArray extends BuilderExpression

## Constants

- public static final BuilderExpressionStaticBooleanArray INSTANCE_EMPTY

## Fields

- private final boolean[] booleanArray

## Methods

- public BuilderExpressionStaticBooleanArray(boolean[] array)
- public ValueType getType()
- public boolean isStatic()
- public boolean[] getBooleanArray(ExecutionContext executionContext)
- public void addToScope(String name, @Nonnull StdScope scope)
- public void updateScope(@Nonnull StdScope scope, String name, ExecutionContext executionContext)
- public static BuilderExpressionStaticBooleanArray fromJSON(@Nonnull JsonArray jsonArray)

Also in this package: BuilderExpression, BuilderExpressionDynamic, BuilderExpressionDynamicBoolean, BuilderExpressionDynamicBooleanArray, BuilderExpressionDynamicNumber, BuilderExpressionDynamicNumberArray, BuilderExpressionDynamicString, BuilderExpressionDynamicStringArray, BuilderExpressionStaticBoolean, BuilderExpressionStaticEmptyArray, BuilderExpressionStaticNumber, BuilderExpressionStaticNumberArray, BuilderExpressionStaticString, BuilderExpressionStaticStringArray, SchemaGenerator

Complete API:
  public ValueType getType()
  public boolean isStatic()
  public boolean[] getBooleanArray(ExecutionContext executionContext)
  public void addToScope(String name, StdScope scope)
  public void updateScope(StdScope scope, String name, ExecutionContext executionContext)
  public static BuilderExpressionStaticBooleanArray fromJSON(JsonArray jsonArray)

Fields:
public static final BuilderExpressionStaticBooleanArray INSTANCE_EMPTY
private final boolean[] booleanArray
