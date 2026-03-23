# EasingConfig

Type: class | Package: com.hypixel.hytale.builtin.adventure.camera.asset | Implements: NetworkSerializable<com.hypixel.hytale.protocol.EasingConfig>

public class EasingConfig implements NetworkSerializable<com.hypixel.hytale.protocol.EasingConfig>

## Fields

- public static final EasingConfig NONE
- protected float time
- protected EasingType type

## Methods

- @Nonnull public com.hypixel.hytale.protocol.EasingConfig toPacket()
- @Override @Nonnull public String toString()

Also in this package: CameraShakeConfig, ClampConfig, NoiseConfig, OffsetNoise, RotationNoise

Complete API:
  public com.hypixel.hytale.protocol.EasingConfig toPacket()
  public String toString()

Fields:
public static final BuilderCodec<EasingConfig> CODEC
public static final EasingConfig NONE
protected float time
protected EasingType type
