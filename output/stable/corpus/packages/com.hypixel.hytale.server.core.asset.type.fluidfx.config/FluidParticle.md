# FluidParticle

Type: class | Package: com.hypixel.hytale.server.core.asset.type.fluidfx.config | Implements: NetworkSerializable<com.hypixel.hytale.protocol.FluidParticle>

public class FluidParticle implements NetworkSerializable<com.hypixel.hytale.protocol.FluidParticle>

## Fields

- public static final BuilderCodec<FluidParticle> CODEC
- protected String systemId
- protected Color color
- protected float scale
- private SoftReference<com.hypixel.hytale.protocol.FluidParticle> cachedPacket

## Constructors

- public FluidParticle(String systemId, Color color, float scale)
- protected FluidParticle()

## Methods

- public String getSystemId()
- public Color getColor()
- public float getScale()
- @Nonnull public com.hypixel.hytale.protocol.FluidParticle toPacket()
- @Nonnull @Override public String toString()
