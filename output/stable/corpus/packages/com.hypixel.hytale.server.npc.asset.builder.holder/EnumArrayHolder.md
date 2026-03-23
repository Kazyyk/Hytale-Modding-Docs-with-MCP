# EnumArrayHolder

Type: class | Package: com.hypixel.hytale.server.npc.asset.builder.holder | Extends: Enum

public class EnumArrayHolder<E extends Enum<E>> extends ArrayHolder

## Fields

- private Class<E> clazz
- private E[] enumConstants
- private EnumArrayValidator validator
- private E[] value

## Methods

- public EnumArrayHolder()
- public void validate(ExecutionContext context)
- public void readJSON( @Nonnull JsonElement requiredJsonElement, Class<E> clazz, EnumArrayValidator validator, String name, @Nonnull BuilderParameters builderParameters )
- public E[] get(ExecutionContext executionContext)
- public E[] rawGet(ExecutionContext executionContext)
- public void resolve(String[] value)

Also in this package: ArrayHolder, AssetArrayHolder, AssetHolder, BooleanArrayHolder, BooleanHolder, DeferEvaluateAssetHolder, DoubleHolder, DoubleHolderBase, EnumHolder, EnumSetHolder, FloatHolder, IntHolder, NumberArrayHolder, StringArrayHolder, StringHolder, StringHolderBase, TemporalArrayHolder, ValueHolder

Complete API:
  public void validate(ExecutionContext context)
  public void readJSON(JsonElement requiredJsonElement, Class<E> clazz, EnumArrayValidator validator, String name, BuilderParameters builderParameters)
  public E[] get(ExecutionContext executionContext)
  public E[] rawGet(ExecutionContext executionContext)
  public void resolve(String[] value)

Fields:
private Class<E> clazz
private E[] enumConstants
private EnumArrayValidator validator
private E[] value
