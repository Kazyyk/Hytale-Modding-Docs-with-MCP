# BooleanArrayHolder

Type: class | Package: com.hypixel.hytale.server.npc.asset.builder.holder | Extends: ArrayHolder

public class BooleanArrayHolder extends ArrayHolder

## Fields

- protected BooleanArrayValidator booleanArrayValidator

## Methods

- public BooleanArrayHolder()
- public void validate(ExecutionContext context)
- public void readJSON( @Nonnull JsonElement requiredJsonElement, int minLength, int maxLength, BooleanArrayValidator validator, String name, @Nonnull BuilderParameters builderParameters )
- public void readJSON( JsonElement optionalJsonElement, int minLength, int maxLength, boolean[] defaultValue, BooleanArrayValidator validator, String name, @Nonnull BuilderParameters builderParameters )
- public boolean[] get(ExecutionContext executionContext)
- public boolean[] rawGet(ExecutionContext executionContext)
- public void validate(@Nullable boolean[] value)

Also in this package: ArrayHolder, AssetArrayHolder, AssetHolder, BooleanHolder, DeferEvaluateAssetHolder, DoubleHolder, DoubleHolderBase, EnumArrayHolder, EnumHolder, EnumSetHolder, FloatHolder, IntHolder, NumberArrayHolder, StringArrayHolder, StringHolder, StringHolderBase, TemporalArrayHolder, ValueHolder

Complete API:
  public void validate(ExecutionContext context)
  public void readJSON(JsonElement requiredJsonElement, int minLength, int maxLength, BooleanArrayValidator validator, String name, BuilderParameters builderParameters)
  public void readJSON(JsonElement optionalJsonElement, int minLength, int maxLength, boolean[] defaultValue, BooleanArrayValidator validator, String name, BuilderParameters builderParameters)
  public boolean[] get(ExecutionContext executionContext)
  public boolean[] rawGet(ExecutionContext executionContext)
  public void validate(boolean[] value)

Fields:
protected BooleanArrayValidator booleanArrayValidator
