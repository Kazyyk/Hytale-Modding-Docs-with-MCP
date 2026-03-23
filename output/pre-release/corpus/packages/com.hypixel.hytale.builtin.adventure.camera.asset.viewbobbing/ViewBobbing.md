# ViewBobbing

Type: class | Package: com.hypixel.hytale.builtin.adventure.camera.asset.viewbobbing | Implements: NetworkSerializable, JsonAssetWithMap

public class ViewBobbing implements NetworkSerializable, JsonAssetWithMap

## Fields

- public static final Codec<MovementType> MOVEMENT_TYPE_CODEC
- public static final AssetBuilderCodec<MovementType,ViewBobbing> CODEC
- protected MovementType id
- protected AssetExtraInfo.Data data
- protected CameraShakeConfig firstPerson

## Methods

- public MovementType getId()
- @Nonnull public com.hypixel.hytale.protocol.ViewBobbing toPacket()
- @Nonnull @Override public String toString()

Also in this package: ViewBobbingPacketGenerator

Complete API:
  public MovementType getId()
  public com.hypixel.hytale.protocol.ViewBobbing toPacket()
  public String toString()

Fields:
public static final Codec<MovementType> MOVEMENT_TYPE_CODEC
public static final AssetBuilderCodec<MovementType,ViewBobbing> CODEC
protected MovementType id
protected AssetExtraInfo.Data data
protected CameraShakeConfig firstPerson
