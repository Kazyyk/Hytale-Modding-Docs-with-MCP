# ConditionalBlockSound

Type: class | Package: com.hypixel.hytale.server.core.asset.type.blocktype.config | Extends: java.lang.Object | Implements: NetworkSerializable

public class ConditionalBlockSound implements NetworkSerializable<com.hypixel.hytale.protocol.ConditionalBlockSound>

Associates a sound event with an ambience FX condition for block types. When the condition is met, the referenced sound event plays. Configured via JSON with validated asset references for both the sound event and ambience FX.

## Fields

- soundEventId | String | Asset key of the sound event to play
- ambienceFXId | String | Asset key of the ambience FX condition

## Methods


@Nonnull
public com.hypixel.hytale.protocol.ConditionalBlockSound toPacket()

Converts this asset to its protocol representation using resolved asset indices.


public String getSoundEventId()

Returns the sound event asset key.


public String getAmbienceFXId()

Returns the ambience FX asset key.

## Related Types

- BlockType -- uses this for conditional block sounds
- `SoundEvent` -- the referenced sound event asset
