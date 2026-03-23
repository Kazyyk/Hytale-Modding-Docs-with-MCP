# StringHolder

Type: class | Package: com.hypixel.hytale.server.npc.asset.builder.holder | Extends: StringHolderBase

public class StringHolder extends StringHolderBase

## Fields

- protected StringValidator stringValidator

## Methods

- public void validate(ExecutionContext context)
- public void readJSON(@Nonnull JsonElement requiredJsonElement, StringValidator validator, String name, @Nonnull BuilderParameters builderParameters)
- public void readJSON( JsonElement optionalJsonElement, String defaultValue, StringValidator validator, String name, @Nonnull BuilderParameters builderParameters )
- public String get(ExecutionContext executionContext)
- public String rawGet(ExecutionContext executionContext)
- public void validate(String value)
