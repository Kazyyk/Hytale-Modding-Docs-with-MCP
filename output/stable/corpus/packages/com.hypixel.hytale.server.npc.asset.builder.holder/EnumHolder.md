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
