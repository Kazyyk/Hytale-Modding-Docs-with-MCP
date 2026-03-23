# VelocityConfig

Type: class | Package: com.hypixel.hytale.server.core.modules.splitvelocity | Implements: NetworkSerializable

public class VelocityConfig implements NetworkSerializable

## Fields

- public static BuilderCodec<VelocityConfig> CODEC
- private float groundResistance
- private float groundResistanceMax
- private float airResistance
- private float airResistanceMax
- private float threshold
- private VelocityThresholdStyle style

## Methods

- public float getGroundResistance()
- public float getAirResistance()
- public float getGroundResistanceMax()
- public float getAirResistanceMax()
- public float getThreshold()
- public VelocityThresholdStyle getStyle()
- @Nonnull public com.hypixel.hytale.protocol.VelocityConfig toPacket()
