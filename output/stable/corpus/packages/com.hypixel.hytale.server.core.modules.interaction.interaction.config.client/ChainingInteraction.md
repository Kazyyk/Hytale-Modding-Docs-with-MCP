# ChainingInteraction

Type: class | Package: com.hypixel.hytale.server.core.modules.interaction.interaction.config.client | Extends: Interaction

public class ChainingInteraction extends Interaction

Runs one of several interactions in `Next` based on how many times this interaction has been invoked within the `ChainingAllowance` time window. Tracks chain state per-entity via the `ChainingInteraction.Data` ECS component. Supports named chain IDs via `ChainId` and additional flag-based branching via `Flags`. Requires client-side synchronization.

## Codec

`ChainingInteraction.CODEC` -- `BuilderCodec<ChainingInteraction>` for JSON deserialization from interaction asset files.

## Related Types

- Parent hierarchy types are in package `com.hypixel.hytale.server.core.modules.interaction.interaction.config`
