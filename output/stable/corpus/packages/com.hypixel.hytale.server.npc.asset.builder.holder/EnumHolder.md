# EnumHolder

Type: class | Package: com.hypixel.hytale.server.npc.asset.builder.holder | Extends: Enum

public class EnumHolder<E extends Enum<E>> extends StringHolderBase

## Fields

- protected List<BiConsumer<ExecutionContext, E>> enumRelationValidators
- private E[] enumConstants
- private E value

## Methods

- public void validate(ExecutionContext context)
- public void readJSON(@Nonnull JsonElement requiredJsonElement, Class<E> clazz, String name, @Nonnull BuilderParameters builderParameters)
- public void readJSON(JsonElement optionalJsonElement, Class<E> clazz, @Nonnull E defaultValue, String name, @Nonnull BuilderParameters builderParameters)
- public E get(ExecutionContext executionContext)
- public void addEnumRelationValidator(BiConsumer<ExecutionContext, E> validator)
- public E rawGet(ExecutionContext executionContext)
- private void validateEnumRelations(ExecutionContext context, E value)

Also in this package: ArrayHolder, AssetArrayHolder, AssetHolder, BooleanArrayHolder, BooleanHolder, DeferEvaluateAssetHolder, DoubleHolder, DoubleHolderBase, EnumArrayHolder, EnumSetHolder, FloatHolder, IntHolder, NumberArrayHolder, StringArrayHolder, StringHolder, StringHolderBase, TemporalArrayHolder, ValueHolder

Complete API:
  public void validate(ExecutionContext context)
  public void readJSON(JsonElement requiredJsonElement, Class<E> clazz, String name, BuilderParameters builderParameters)
  public void readJSON(JsonElement optionalJsonElement, Class<E> clazz, E defaultValue, String name, BuilderParameters builderParameters)
  public E get(ExecutionContext executionContext)
  public void addEnumRelationValidator(BiConsumer<ExecutionContext,E> validator)
  public E rawGet(ExecutionContext executionContext)
  private void validateEnumRelations(ExecutionContext context, E value)

Fields:
protected List<BiConsumer<ExecutionContext,E>> enumRelationValidators
private E[] enumConstants
private E value
