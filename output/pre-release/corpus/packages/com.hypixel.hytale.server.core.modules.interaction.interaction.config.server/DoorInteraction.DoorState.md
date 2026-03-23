# DoorInteraction.DoorState

Type: enum | Package: com.hypixel.hytale.server.core.modules.interaction.interaction.config.server

private static enum DoorInteraction.DoorState

Represents the open/closed state of a door block within DoorInteraction.

## Enum Constants

- CLOSED | The door is closed.
- OPENED_IN | The door is opened inward.
- OPENED_OUT | The door is opened outward.

## Methods


@Nonnull
public static DoorInteraction.DoorState fromBlockState(@Nullable String state)

Converts a block state string to a `DoorState`. Maps `"OpenDoorOut"` to `OPENED_IN`, `"OpenDoorIn"` to `OPENED_OUT`, and all other values (including `null`) to `CLOSED`.

## See Also

- DoorInteraction
