# AssetHolder

Type: class | Package: com.hypixel.hytale.server.npc.asset.builder.holder | Extends: StringHolderBase

public class AssetHolder extends StringHolderBase

## Fields

- protected AssetValidator assetValidator

## Methods

- public void validate(ExecutionContext context)
- public void readJSON(@Nonnull JsonElement requiredJsonElement, AssetValidator validator, String name, @Nonnull BuilderParameters builderParameters)
- public void readJSON( JsonElement optionalJsonElement, String defaultValue, AssetValidator validator, String name, @Nonnull BuilderParameters builderParameters )
- public String get(ExecutionContext executionContext)
- public String rawGet(ExecutionContext executionContext)
- public void staticValidate()
