# CameraShakeConfig

Type: class | Package: com.hypixel.hytale.builtin.adventure.camera.asset | Implements: NetworkSerializable<com.hypixel.hytale.protocol.CameraShakeConfig>

public class CameraShakeConfig implements NetworkSerializable<com.hypixel.hytale.protocol.CameraShakeConfig>

## Fields

- protected float duration
- protected Float startTime
- protected EasingConfig easeIn
- protected EasingConfig easeOut
- protected CameraShakeConfig.OffsetNoise offset
- protected CameraShakeConfig.RotationNoise rotation
- public static final CameraShakeConfig.OffsetNoise NONE
- protected NoiseConfig[] x
- protected NoiseConfig[] y
- protected NoiseConfig[] z
- public static final CameraShakeConfig.RotationNoise NONE
- protected NoiseConfig[] pitch
- protected NoiseConfig[] yaw
- protected NoiseConfig[] roll

## Methods

- @Nonnull public com.hypixel.hytale.protocol.CameraShakeConfig toPacket()
- @Override @Nonnull public String toString()
- @Nonnull public com.hypixel.hytale.protocol.OffsetNoise toPacket()
- @Nonnull public com.hypixel.hytale.protocol.RotationNoise toPacket()

## Inner Types

- `CameraShakeConfig.OffsetNoise`
- `CameraShakeConfig.RotationNoise`
