# ModelAttachment

Type: class | Package: com.hypixel.hytale.server.core.asset.type.model.config | Implements: com.hypixel.hytale.server.core.io.NetworkSerializable

public class ModelAttachment implements NetworkSerializable<com.hypixel.hytale.protocol.ModelAttachment>

Sub-model attachment defining a model path, texture path, gradient set/ID, and a selection weight for random attachment sets. Used for overlaying additional geometry on a base model (e.g., hair, armor, accessories).

## Fields

- protected String model
- protected String texture
- protected String gradientSet
- protected String gradientId
- protected double weight

## Methods

- public String getModel()
- public String getTexture()
- public String getGradientId()
- public String getGradientSet()
- public double getWeight()
- @Nonnull public com.hypixel.hytale.protocol.ModelAttachment toPacket()
