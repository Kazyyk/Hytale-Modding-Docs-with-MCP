# ValueHolder

Type: class | Package: com.hypixel.hytale.server.npc.asset.builder.holder

public abstract class ValueHolder

## Constants

- protected static final boolean LOG_VALUES
- protected static final HytaleLogger LOGGER

## Fields

- protected static final boolean LOG_VALUES
- protected ValueType valueType
- protected String name
- protected BuilderExpression expression

## Methods

- protected ValueHolder(ValueType valueType)
- public abstract void validate(ExecutionContext var1)
- protected void readJSON(@Nonnull JsonElement requiredJsonElement, String name, @Nonnull BuilderParameters builderParameters)
- protected void readJSON( @Nullable JsonElement optionalJsonElement, @Nonnull Supplier<BuilderExpression> defaultValue, String name, @Nonnull BuilderParameters builderParameters )
- public String getName()
- public void setName(String name)
- public boolean isStatic()
- public String getExpressionString()

Known subclasses: ArrayHolder, BooleanHolder, DoubleHolderBase, IntHolder, StringHolderBase

Also in this package: ArrayHolder, AssetArrayHolder, AssetHolder, BooleanArrayHolder, BooleanHolder, DeferEvaluateAssetHolder, DoubleHolder, DoubleHolderBase, EnumArrayHolder, EnumHolder, EnumSetHolder, FloatHolder, IntHolder, NumberArrayHolder, StringArrayHolder, StringHolder, StringHolderBase, TemporalArrayHolder

Complete API:
  public abstract void validate(ExecutionContext var1)
  protected void readJSON(JsonElement requiredJsonElement, String name, BuilderParameters builderParameters)
  protected void readJSON(JsonElement optionalJsonElement, Supplier<BuilderExpression> defaultValue, String name, BuilderParameters builderParameters)
  public String getName()
  public void setName(String name)
  public boolean isStatic()
  public String getExpressionString()

Fields:
protected static final boolean LOG_VALUES
protected static final HytaleLogger LOGGER
protected ValueType valueType
protected String name
protected BuilderExpression expression
