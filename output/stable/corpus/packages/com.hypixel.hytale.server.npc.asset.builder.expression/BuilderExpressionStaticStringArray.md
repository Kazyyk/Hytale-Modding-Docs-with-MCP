# BuilderExpressionStaticStringArray

Type: class | Package: com.hypixel.hytale.server.npc.asset.builder.expression | Extends: BuilderExpression

public class BuilderExpressionStaticStringArray extends BuilderExpression

## Constants

- public static final BuilderExpressionStaticStringArray INSTANCE_EMPTY

## Fields

- private final String[] stringArray

## Methods

- public BuilderExpressionStaticStringArray(String[] array)
- public ValueType getType()
- public boolean isStatic()
- public String[] getStringArray(ExecutionContext executionContext)
- public void addToScope(String name, @Nonnull StdScope scope)
- public void updateScope(@Nonnull StdScope scope, String name, ExecutionContext executionContext)
- public static BuilderExpressionStaticStringArray fromJSON(@Nonnull JsonArray jsonArray)
