# SelectorType

Type: class | Package: com.hypixel.hytale.server.core.modules.interaction.interaction.config.selector | Implements: NetworkSerializable>

public abstract class SelectorType implements NetworkSerializable<com.hypixel.hytale.protocol.Selector>

Abstract base class for interaction target selector configurations. Implements `NetworkSerializable` for packet serialization. Concrete subclasses define specific selection geometries (circle, cylinder, raycast, etc.) and produce `Selector` runtime instances.

## Key Methods

- public static final CodecMapCodec<SelectorType> CODEC = new CodecMapCodec<>()
- public static final BuilderCodec<SelectorType> BASE_CODEC = BuilderCodec.abstractBuilder(SelectorType.class).build()
- public abstract Selector newSelector()
