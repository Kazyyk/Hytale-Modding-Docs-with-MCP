# FirstClickInteraction

Type: class | Package: com.hypixel.hytale.server.core.modules.interaction.interaction.config.client | Extends: Interaction

public class FirstClickInteraction extends Interaction

Routes to different interactions based on whether the input was a single click or a held press. The `Click` branch runs when the input was released quickly; the `Held` branch runs when the input is being held down. Determined client-side via `IInteractionSimulationHandler.isCharging()`. Requires client-side synchronization.

## Codec

`FirstClickInteraction.CODEC` -- `BuilderCodec<FirstClickInteraction>` for JSON deserialization from interaction asset files.

## Related Types

- Parent hierarchy types are in package `com.hypixel.hytale.server.core.modules.interaction.interaction.config`
