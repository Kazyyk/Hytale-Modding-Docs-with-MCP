# BooleanHolder

Type: class | Package: com.hypixel.hytale.server.npc.asset.builder.holder | Extends: ValueHolder

public class BooleanHolder extends ValueHolder

## Fields

- protected List<BiConsumer<ExecutionContext, Boolean>> relationValidators

## Methods

- public BooleanHolder()
- public void readJSON(@Nonnull JsonElement requiredJsonElement, String name, @Nonnull BuilderParameters builderParameters)
- public void validate(ExecutionContext context)
- public void readJSON(JsonElement optionalJsonElement, boolean defaultValue, String name, @Nonnull BuilderParameters builderParameters)
- public boolean get(ExecutionContext executionContext)
- public boolean rawGet(ExecutionContext executionContext)
- public void addRelationValidator(BiConsumer<ExecutionContext, Boolean> validator)
- protected void validateRelations(ExecutionContext executionContext, boolean value)
