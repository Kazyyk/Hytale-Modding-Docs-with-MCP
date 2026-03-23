# StringHolderBase

Type: class | Package: com.hypixel.hytale.server.npc.asset.builder.holder | Extends: ValueHolder

public abstract class StringHolderBase extends ValueHolder

## Fields

- protected List<BiConsumer<ExecutionContext, String>> relationValidators

## Methods

- protected StringHolderBase()
- public void addRelationValidator(BiConsumer<ExecutionContext, String> validator)
- protected void validateRelations(ExecutionContext executionContext, String value)

Known subclasses: AssetHolder, EnumHolder, StringHolder

Also in this package: ArrayHolder, AssetArrayHolder, AssetHolder, BooleanArrayHolder, BooleanHolder, DeferEvaluateAssetHolder, DoubleHolder, DoubleHolderBase, EnumArrayHolder, EnumHolder, EnumSetHolder, FloatHolder, IntHolder, NumberArrayHolder, StringArrayHolder, StringHolder, TemporalArrayHolder, ValueHolder

Complete API:
  public void addRelationValidator(BiConsumer<ExecutionContext,String> validator)
  protected void validateRelations(ExecutionContext executionContext, String value)

Fields:
protected List<BiConsumer<ExecutionContext,String>> relationValidators
