# NoiseConfig

Type: class | Package: com.hypixel.hytale.builtin.adventure.camera.asset | Implements: NetworkSerializable<com.hypixel.hytale.protocol.NoiseConfig>

public class NoiseConfig implements NetworkSerializable<com.hypixel.hytale.protocol.NoiseConfig>

## Fields

- public static final com.hypixel.hytale.protocol.NoiseConfig[] NOISE_CONFIGS
- protected int seed
- protected NoiseType type
- protected NoiseConfig.ClampConfig clamp
- protected float frequency
- protected float amplitude
- public static final NoiseConfig.ClampConfig NONE
- protected float min
- protected float max
- protected boolean normalize

## Methods

- @Nonnull public com.hypixel.hytale.protocol.NoiseConfig toPacket()
- @Override @Nonnull public String toString()
- @Nonnull public static com.hypixel.hytale.protocol.NoiseConfig[] toPacket(@Nullable NoiseConfig[] configs)
- @Nonnull public com.hypixel.hytale.protocol.ClampConfig toPacket()

## Inner Types

- `NoiseConfig.ClampConfig`
