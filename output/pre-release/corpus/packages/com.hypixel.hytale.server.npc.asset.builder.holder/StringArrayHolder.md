# StringArrayHolder

Type: class | Package: com.hypixel.hytale.server.npc.asset.builder.holder | Extends: ArrayHolder

public class StringArrayHolder extends ArrayHolder

## Fields

- protected StringArrayValidator stringArrayValidator
- protected List<BiConsumer<ExecutionContext, String[]>> relationValidators

## Methods

- public StringArrayHolder()
- public void validate(ExecutionContext context)
- public void readJSON( @Nonnull JsonElement requiredJsonElement, int minLength, int maxLength, StringArrayValidator validator, String name, @Nonnull BuilderParameters builderParameters )
- public void readJSON( JsonElement optionalJsonElement, int minLength, int maxLength, String[] defaultValue, StringArrayValidator validator, String name, @Nonnull BuilderParameters builderParameters )
- public String[] get(ExecutionContext executionContext)
- public String[] rawGet(ExecutionContext executionContext)
- public void validate(@Nullable String[] value)
- public void addRelationValidator(BiConsumer<ExecutionContext, String[]> validator)
- protected void validateRelations(ExecutionContext executionContext, String[] value)

Known subclasses: AssetArrayHolder, TemporalArrayHolder

Also in this package: ArrayHolder, AssetArrayHolder, AssetHolder, BooleanArrayHolder, BooleanHolder, DeferEvaluateAssetHolder, DoubleHolder, DoubleHolderBase, EnumArrayHolder, EnumHolder, EnumSetHolder, FloatHolder, IntHolder, NumberArrayHolder, StringHolder, StringHolderBase, TemporalArrayHolder, ValueHolder

Complete API:
  public void validate(ExecutionContext context)
  public void readJSON(JsonElement requiredJsonElement, int minLength, int maxLength, StringArrayValidator validator, String name, BuilderParameters builderParameters)
  public void readJSON(JsonElement optionalJsonElement, int minLength, int maxLength, String[] defaultValue, StringArrayValidator validator, String name, BuilderParameters builderParameters)
  public String[] get(ExecutionContext executionContext)
  public String[] rawGet(ExecutionContext executionContext)
  public void validate(String[] value)
  public void addRelationValidator(BiConsumer<ExecutionContext,String[]> validator)
  protected void validateRelations(ExecutionContext executionContext, String[] value)

Fields:
protected StringArrayValidator stringArrayValidator
protected List<BiConsumer<ExecutionContext,String[]>> relationValidators
