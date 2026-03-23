# BreakBlockInteraction

Type: class | Package: com.hypixel.hytale.server.core.modules.interaction.interaction.config.client | Extends: SimpleBlockInteraction

public class BreakBlockInteraction extends SimpleBlockInteraction

Attempts to break the target block. Supports a `Harvest` mode for gather-style pickup versus standard break. Can specify a `Tool` ID and `MatchTool` flag to require a specific tool. Behavior varies by game mode: Creative mode performs an instant block break, while other modes apply block damage. The `interactWithBlock` method body could not be fully decompiled due to a Vineflower limitation with switch expressions over `GameMode`.

## Codec

`BreakBlockInteraction.CODEC` -- `BuilderCodec<BreakBlockInteraction>` for JSON deserialization from interaction asset files.

## Related Types

- Parent hierarchy types are in package `com.hypixel.hytale.server.core.modules.interaction.interaction.config`
