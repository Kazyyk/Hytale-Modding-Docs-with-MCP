# IntHolder

Type: class | Package: com.hypixel.hytale.server.npc.asset.builder.holder | Extends: ValueHolder

public class IntHolder extends ValueHolder

## Fields

- protected List<ObjIntConsumer<ExecutionContext>> relationValidators
- protected IntValidator intValidator

## Methods

- public IntHolder()
- public void validate(ExecutionContext context)
- public void readJSON(@Nonnull JsonElement requiredJsonElement, IntValidator validator, String name, @Nonnull BuilderParameters builderParameters)
- public void readJSON(JsonElement optionalJsonElement, int defaultValue, IntValidator validator, String name, @Nonnull BuilderParameters builderParameters)
- public int get(ExecutionContext executionContext)
- public int rawGet(ExecutionContext executionContext)
- public void validate(int value)
- public void addRelationValidator(ObjIntConsumer<ExecutionContext> validator)
- protected void validateRelations(ExecutionContext executionContext, int value)

Also in this package: ArrayHolder, AssetArrayHolder, AssetHolder, BooleanArrayHolder, BooleanHolder, DeferEvaluateAssetHolder, DoubleHolder, DoubleHolderBase, EnumArrayHolder, EnumHolder, EnumSetHolder, FloatHolder, NumberArrayHolder, StringArrayHolder, StringHolder, StringHolderBase, TemporalArrayHolder, ValueHolder

Complete API:
  public void validate(ExecutionContext context)
  public void readJSON(JsonElement requiredJsonElement, IntValidator validator, String name, BuilderParameters builderParameters)
  public void readJSON(JsonElement optionalJsonElement, int defaultValue, IntValidator validator, String name, BuilderParameters builderParameters)
  public int get(ExecutionContext executionContext)
  public int rawGet(ExecutionContext executionContext)
  public void validate(int value)
  public void addRelationValidator(ObjIntConsumer<ExecutionContext> validator)
  protected void validateRelations(ExecutionContext executionContext, int value)

Fields:
protected List<ObjIntConsumer<ExecutionContext>> relationValidators
protected IntValidator intValidator
