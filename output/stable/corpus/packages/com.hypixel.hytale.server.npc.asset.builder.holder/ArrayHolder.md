# ArrayHolder

Type: class | Package: com.hypixel.hytale.server.npc.asset.builder.holder | Extends: ValueHolder

public abstract class ArrayHolder extends ValueHolder

## Fields

- protected int minLength
- protected int maxLength

## Methods

- public ArrayHolder(ValueType valueType)
- protected void readJSON(@Nonnull JsonElement requiredJsonElement, int minLength, int maxLength, String name, @Nonnull BuilderParameters builderParameters)
- protected void readJSON( JsonElement optionalJsonElement, int minLength, int maxLength, double[] defaultValue, String name, @Nonnull BuilderParameters builderParameters )
- protected void readJSON( JsonElement optionalJsonElement, int minLength, int maxLength, String[] defaultValue, String name, @Nonnull BuilderParameters builderParameters )
- protected void readJSON( JsonElement optionalJsonElement, int minLength, int maxLength, boolean[] defaultValue, String name, @Nonnull BuilderParameters builderParameters )
- protected void validateLength(int length)
- protected void setLength(int minLength, int maxLength)
- protected void setLength(int length)
