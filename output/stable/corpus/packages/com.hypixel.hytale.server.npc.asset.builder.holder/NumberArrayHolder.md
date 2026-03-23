# NumberArrayHolder

Type: class | Package: com.hypixel.hytale.server.npc.asset.builder.holder | Extends: ArrayHolder

public class NumberArrayHolder extends ArrayHolder

## Fields

- protected IntArrayValidator intArrayValidator
- protected DoubleArrayValidator doubleArrayValidator

## Methods

- public NumberArrayHolder()
- public void validate(ExecutionContext context)
- public void readJSON( @Nonnull JsonElement requiredJsonElement, int minLength, int maxLength, IntArrayValidator validator, String name, @Nonnull BuilderParameters builderParameters )
- public void readJSON( @Nonnull JsonElement requiredJsonElement, int minLength, int maxLength, DoubleArrayValidator validator, String name, @Nonnull BuilderParameters builderParameters )
- public void readJSON( JsonElement optionalJsonElement, int minLength, int maxLength, int[] defaultValue, IntArrayValidator validator, String name, @Nonnull BuilderParameters builderParameters )
- public void readJSON( JsonElement optionalJsonElement, int minLength, int maxLength, double[] defaultValue, DoubleArrayValidator validator, String name, @Nonnull BuilderParameters builderParameters )
- public double[] get(ExecutionContext executionContext)
- public double[] rawGet(ExecutionContext executionContext)
- public int[] getIntArray(ExecutionContext executionContext)
- public int[] rawGetIntArray(ExecutionContext executionContext)
- public void validate(@Nullable int[] value)
- public void validate(@Nullable double[] value)

Also in this package: ArrayHolder, AssetArrayHolder, AssetHolder, BooleanArrayHolder, BooleanHolder, DeferEvaluateAssetHolder, DoubleHolder, DoubleHolderBase, EnumArrayHolder, EnumHolder, EnumSetHolder, FloatHolder, IntHolder, StringArrayHolder, StringHolder, StringHolderBase, TemporalArrayHolder, ValueHolder

Complete API:
  public void validate(ExecutionContext context)
  public void readJSON(JsonElement requiredJsonElement, int minLength, int maxLength, IntArrayValidator validator, String name, BuilderParameters builderParameters)
  public void readJSON(JsonElement requiredJsonElement, int minLength, int maxLength, DoubleArrayValidator validator, String name, BuilderParameters builderParameters)
  public void readJSON(JsonElement optionalJsonElement, int minLength, int maxLength, int[] defaultValue, IntArrayValidator validator, String name, BuilderParameters builderParameters)
  public void readJSON(JsonElement optionalJsonElement, int minLength, int maxLength, double[] defaultValue, DoubleArrayValidator validator, String name, BuilderParameters builderParameters)
  public double[] get(ExecutionContext executionContext)
  public double[] rawGet(ExecutionContext executionContext)
  public int[] getIntArray(ExecutionContext executionContext)
  public int[] rawGetIntArray(ExecutionContext executionContext)
  public void validate(int[] value)
  public void validate(double[] value)

Fields:
protected IntArrayValidator intArrayValidator
protected DoubleArrayValidator doubleArrayValidator
