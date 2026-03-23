# SimpleBlockInteraction

Type: class | Package: com.hypixel.hytale.server.core.modules.interaction.interaction.config.client | Extends: SimpleInteraction

public abstract class SimpleBlockInteraction extends SimpleInteraction

Abstract base class for all block-targeted interactions. Provides the `UseLatestTarget` codec field that controls whether the client's most recent target block position is used. Subclasses implement `interactWithBlock()` for server-side logic and `simulateInteractWithBlock()` for client-side prediction. Handles target block resolution, chunk lookup, and block face determination.

## Codec

`SimpleBlockInteraction.CODEC` -- `BuilderCodec<SimpleBlockInteraction>` for JSON deserialization from interaction asset files.

## Related Types

- Parent hierarchy types are in package `com.hypixel.hytale.server.core.modules.interaction.interaction.config`
