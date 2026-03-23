# TriggerCooldownInteraction

Type: class | Package: com.hypixel.hytale.server.core.modules.interaction.interaction.config.client | Extends: SimpleInstantInteraction

public class TriggerCooldownInteraction extends SimpleInstantInteraction

Triggers a cooldown as if it was triggered normally (deducts a charge). If no explicit `Cooldown` is provided, defaults to the root interaction's cooldown. Unlike `ResetCooldownInteraction`, this calls `deductCharge()` instead of `resetCharges()`.

## Codec

`TriggerCooldownInteraction.CODEC` -- `BuilderCodec<TriggerCooldownInteraction>` for JSON deserialization from interaction asset files.

## Related Types

- Parent hierarchy types are in package `com.hypixel.hytale.server.core.modules.interaction.interaction.config`
