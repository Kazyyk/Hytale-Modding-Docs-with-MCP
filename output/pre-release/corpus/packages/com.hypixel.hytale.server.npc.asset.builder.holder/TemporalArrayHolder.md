# TemporalArrayHolder

Type: class | Package: com.hypixel.hytale.server.npc.asset.builder.holder | Extends: StringArrayHolder

public class TemporalArrayHolder extends StringArrayHolder

## Fields

- protected TemporalArrayValidator validator
- private TemporalAmount[] cachedTemporalArray

## Methods

- public static TemporalAmount[] convertStringToTemporalArray(@Nullable String[] source)
- public void readJSON( @Nonnull JsonElement requiredJsonElement, int minLength, int maxLength, TemporalArrayValidator validator, String name, @Nonnull BuilderParameters builderParameters )
- public TemporalAmount[] getTemporalArray(ExecutionContext executionContext)
- public TemporalAmount[] rawGetTemporalArray(ExecutionContext executionContext)
- public void validate(@Nullable TemporalAmount[] value)

Also in this package: ArrayHolder, AssetArrayHolder, AssetHolder, BooleanArrayHolder, BooleanHolder, DeferEvaluateAssetHolder, DoubleHolder, DoubleHolderBase, EnumArrayHolder, EnumHolder, EnumSetHolder, FloatHolder, IntHolder, NumberArrayHolder, StringArrayHolder, StringHolder, StringHolderBase, ValueHolder

Complete API:
  public static TemporalAmount[] convertStringToTemporalArray(String[] source)
  public void readJSON(JsonElement requiredJsonElement, int minLength, int maxLength, TemporalArrayValidator validator, String name, BuilderParameters builderParameters)
  public TemporalAmount[] getTemporalArray(ExecutionContext executionContext)
  public TemporalAmount[] rawGetTemporalArray(ExecutionContext executionContext)
  public void validate(TemporalAmount[] value)

Fields:
protected TemporalArrayValidator validator
private TemporalAmount[] cachedTemporalArray
