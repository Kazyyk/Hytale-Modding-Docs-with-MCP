# StringHolder

Type: class | Package: com.hypixel.hytale.server.npc.asset.builder.holder | Extends: StringHolderBase

public class StringHolder extends StringHolderBase

## Fields

- protected StringValidator stringValidator

## Methods

- public void validate(ExecutionContext context)
- public void readJSON(@Nonnull JsonElement requiredJsonElement, StringValidator validator, String name, @Nonnull BuilderParameters builderParameters)
- public void readJSON( JsonElement optionalJsonElement, String defaultValue, StringValidator validator, String name, @Nonnull BuilderParameters builderParameters )
- public String get(ExecutionContext executionContext)
- public String rawGet(ExecutionContext executionContext)
- public void validate(String value)

Also in this package: ArrayHolder, AssetArrayHolder, AssetHolder, BooleanArrayHolder, BooleanHolder, DeferEvaluateAssetHolder, DoubleHolder, DoubleHolderBase, EnumArrayHolder, EnumHolder, EnumSetHolder, FloatHolder, IntHolder, NumberArrayHolder, StringArrayHolder, StringHolderBase, TemporalArrayHolder, ValueHolder

Complete API:
  public void validate(ExecutionContext context)
  public void readJSON(JsonElement requiredJsonElement, StringValidator validator, String name, BuilderParameters builderParameters)
  public void readJSON(JsonElement optionalJsonElement, String defaultValue, StringValidator validator, String name, BuilderParameters builderParameters)
  public String get(ExecutionContext executionContext)
  public String rawGet(ExecutionContext executionContext)
  public void validate(String value)

Fields:
protected StringValidator stringValidator
