# EnumSetHolder

Type: class | Package: com.hypixel.hytale.server.npc.asset.builder.holder | Extends: Enum

public class EnumSetHolder<E extends Enum<E>> extends ArrayHolder

## Fields

- private Class<E> clazz
- private E[] enumConstants
- private EnumSet<E> value

## Methods

- public EnumSetHolder()
- public void validate(ExecutionContext context)
- public void readJSON(@Nonnull JsonElement requiredJsonElement, Class<E> clazz, String name, @Nonnull BuilderParameters builderParameters)
- public void readJSON( JsonElement optionalJsonElement, @Nonnull EnumSet<E> defaultValue, Class<E> clazz, String name, @Nonnull BuilderParameters builderParameters )
- public EnumSet<E> get(ExecutionContext executionContext)
- public EnumSet<E> rawGet(ExecutionContext executionContext)
