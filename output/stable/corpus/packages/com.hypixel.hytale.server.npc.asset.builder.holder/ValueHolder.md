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
