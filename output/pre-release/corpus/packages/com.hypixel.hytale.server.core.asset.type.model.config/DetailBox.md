# DetailBox

Type: class | Package: com.hypixel.hytale.server.core.asset.type.model.config | Implements: com.hypixel.hytale.server.core.io.NetworkSerializable

public class DetailBox implements NetworkSerializable<com.hypixel.hytale.protocol.DetailBox>

A named bounding box region with a positional offset, used for detail hitbox areas on entity models (e.g., head, body segments). Supports scaling and network serialization.

## Fields

- protected Vector3d offset
- protected Box box

## Constructors


public DetailBox()
public DetailBox(Vector3d offset, Box box)
public DetailBox(DetailBox other)

## Methods

- public Vector3d getOffset()
- public Box getBox()
- public DetailBox scaled(float scale)
- @Nonnull public com.hypixel.hytale.protocol.DetailBox toPacket()

Also in this package: Animation, AnimationSet, Model, ModelAsset, ModelAttachment, ModelParticle, ModelReference

Complete API:
  public Vector3d getOffset()
  public Box getBox()
  public DetailBox scaled(float scale)
  public com.hypixel.hytale.protocol.DetailBox toPacket()

Fields:
public static final BuilderCodec<DetailBox> CODEC
protected Vector3d offset
protected Box box
