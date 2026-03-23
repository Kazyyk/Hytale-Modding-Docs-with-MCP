# PlaceFluidInteraction

Type: class | Package: com.hypixel.hytale.server.core.modules.interaction.interaction.config.client | Extends: SimpleBlockInteraction

public class PlaceFluidInteraction extends SimpleBlockInteraction

Places a specified fluid at the target position. Configured via the `FluidToPlace` codec field. Validates the fluid type and placement position, checks world config permissions, and triggers fluid ticking after placement.

## Codec

`PlaceFluidInteraction.CODEC` -- `BuilderCodec<PlaceFluidInteraction>` for JSON deserialization from interaction asset files.

## Related Types

- Parent hierarchy types are in package `com.hypixel.hytale.server.core.modules.interaction.interaction.config`
