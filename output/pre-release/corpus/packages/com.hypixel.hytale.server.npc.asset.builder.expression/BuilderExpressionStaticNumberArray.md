# BuilderExpressionStaticNumberArray

Type: class | Package: com.hypixel.hytale.server.npc.asset.builder.expression | Extends: BuilderExpression

public class BuilderExpressionStaticNumberArray extends BuilderExpression

## Constants

- public static final BuilderExpressionStaticNumberArray INSTANCE_EMPTY

## Fields

- private final double[] numberArray
- private int[] cachedIntArray

## Methods

- public BuilderExpressionStaticNumberArray(double[] array)
- public ValueType getType()
- public boolean isStatic()
- public double[] getNumberArray(ExecutionContext executionContext)
- public int[] getIntegerArray(ExecutionContext executionContext)
- public void addToScope(String name, @Nonnull StdScope scope)
- public void updateScope(@Nonnull StdScope scope, String name, ExecutionContext executionContext)
- private void createCacheIfAbsent()
- public static BuilderExpressionStaticNumberArray fromJSON(@Nonnull JsonArray jsonArray)
- public static int[] convertDoubleToIntArray(@Nullable double[] source)
- public static double[] convertIntToDoubleArray(@Nullable int[] source)
