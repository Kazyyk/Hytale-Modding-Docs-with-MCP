# ObjectiveExistsValidator

Type: class | Package: com.hypixel.hytale.builtin.adventure.npcobjectives.npc.validators | Extends: AssetValidator

public class ObjectiveExistsValidator extends AssetValidator

Utility type in the `validators` subsystem.

## Static Methods

- required() | ObjectiveExistsValidator | Static utility method.
- withConfig(EnumSet<AssetValidator.Config> config) | ObjectiveExistsValidator | Static utility method.

## Accessors

- getDomain() | String | Accessor method.
- getAssetName() | String | Accessor method.

## Methods

- test(String objective) | boolean | Instance method.
- errorMessage(String objective, String attributeName) | String | Instance method.
