# AssetArrayHolder

Type: class | Package: com.hypixel.hytale.server.npc.asset.builder.holder | Extends: StringArrayHolder

public class AssetArrayHolder extends StringArrayHolder

## Fields

- protected AssetValidator assetValidator

## Methods

- public void readJSON( @Nonnull JsonElement requiredJsonElement, int minLength, int maxLength, AssetValidator validator, String name, @Nonnull BuilderParameters builderParameters )
- public void readJSON( JsonElement optionalJsonElement, int minLength, int maxLength, String[] defaultValue, AssetValidator validator, String name, @Nonnull BuilderParameters builderParameters )
- public String[] get(ExecutionContext executionContext)
- public String[] rawGet(ExecutionContext executionContext)
- public void staticValidate()

Also in this package: ArrayHolder, AssetHolder, BooleanArrayHolder, BooleanHolder, DeferEvaluateAssetHolder, DoubleHolder, DoubleHolderBase, EnumArrayHolder, EnumHolder, EnumSetHolder, FloatHolder, IntHolder, NumberArrayHolder, StringArrayHolder, StringHolder, StringHolderBase, TemporalArrayHolder, ValueHolder

Complete API:
  public void readJSON(JsonElement requiredJsonElement, int minLength, int maxLength, AssetValidator validator, String name, BuilderParameters builderParameters)
  public void readJSON(JsonElement optionalJsonElement, int minLength, int maxLength, String[] defaultValue, AssetValidator validator, String name, BuilderParameters builderParameters)
  public String[] get(ExecutionContext executionContext)
  public String[] rawGet(ExecutionContext executionContext)
  public void staticValidate()

Fields:
protected AssetValidator assetValidator
